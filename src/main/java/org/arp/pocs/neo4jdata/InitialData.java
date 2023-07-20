// package org.arp.pocs.neo4jdata;

// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.Reader;

// import org.apache.commons.csv.CSVFormat;
// import org.apache.commons.csv.CSVRecord;
// import org.arp.pocs.neo4jdata.entities.Category;
// import org.arp.pocs.neo4jdata.entities.ComponentStatus;
// import org.arp.pocs.neo4jdata.entities.Provider;
// import org.arp.pocs.neo4jdata.entities.Subcategory;
// import org.arp.pocs.neo4jdata.repositories.CategoryRepository;
// import org.arp.pocs.neo4jdata.repositories.ComponentStatusRepository;
// import org.arp.pocs.neo4jdata.repositories.ProviderRepository;
// import org.arp.pocs.neo4jdata.repositories.SubcategoryRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;

// import jakarta.annotation.PostConstruct;

// @Component
// public class InitialData {
//         private final ProviderRepository providerRepository;
//         private final ComponentStatusRepository componentStatusRepository;
//         private final CategoryRepository categoryRepository;
//         private final SubcategoryRepository subcategoryRepository;

//         @Autowired
//         public InitialData(ProviderRepository providerRepository, ComponentStatusRepository componentStatusRepository,
//                         CategoryRepository categoryRepository, SubcategoryRepository subcategoryRepository) {
//                 this.providerRepository = providerRepository;
//                 this.componentStatusRepository = componentStatusRepository;
//                 this.categoryRepository = categoryRepository;
//                 this.subcategoryRepository = subcategoryRepository;
//         }

//         @PostConstruct
//         public void initData() {
//                 // clean up
//                 providerRepository.deleteAll();
//                 componentStatusRepository.deleteAll();
//                 categoryRepository.deleteAll();
//                 subcategoryRepository.deleteAll();

//                 String[] providersCsvHeader = { "name", "description", "imageSrc" };
//                 String[] componentStatusCsvHeader = { "name", "description", "color" };
//                 String[] categoriesCsvHeader = { "name", "description", "imageSrc", "displayOrder" };
//                 String[] subcategoriesCsvHeader = { "subject", "description", "imageSrc", "displayOrder",
//                                 "categoryName" };

//                 // read the CSV files from the resources folder
//                 try {
//                         Reader providersInReader = new FileReader("src/main/resources/static/providers.csv");
//                         Reader componentStatusInReader = new FileReader(
//                                         "src/main/resources/static/component-status.csv");
//                         Reader categoriesInReader = new FileReader("src/main/resources/static/categories.csv");
//                         Reader subcategoriesInReader = new FileReader("src/main/resources/static/subcategories.csv");

//                         Iterable<CSVRecord> providerRecords = getRecordsFromCsv(providersCsvHeader, providersInReader);
//                         Iterable<CSVRecord> componentStatusRecords = getRecordsFromCsv(componentStatusCsvHeader,
//                                         componentStatusInReader);
//                         Iterable<CSVRecord> categoryRecords = getRecordsFromCsv(categoriesCsvHeader,
//                                         categoriesInReader);
//                         Iterable<CSVRecord> subcategoryRecords = getRecordsFromCsv(subcategoriesCsvHeader,
//                                         subcategoriesInReader);

//                         for (CSVRecord record : providerRecords) {
//                                 providerRepository.save(new Provider(record.get("name"), record.get("description"),
//                                                 record.get("imageSrc")));
//                         }

//                         for (CSVRecord record : componentStatusRecords) {
//                                 componentStatusRepository.save(new ComponentStatus(record.get("name"),
//                                                 record.get("description"), record.get("color")));
//                         }

//                         for (CSVRecord record : categoryRecords) {
//                                 categoryRepository.save(new Category(record.get("name"), record.get("description"),
//                                                 record.get("imageSrc"), Integer.parseInt(record.get("displayOrder"))));
//                         }

//                         for (CSVRecord record : subcategoryRecords) {
//                                 Subcategory subcategory = new Subcategory(record.get("subject"),
//                                                 record.get("description"), record.get("imageSrc"),
//                                                 Integer.parseInt(record.get("displayOrder")),
//                                                 categoryRepository.findByName(record.get("categoryName")).get());
//                                 subcategoryRepository.save(subcategory);
//                         }

//                 } catch (FileNotFoundException e) {
//                         e.printStackTrace();
//                 } catch (IOException e) {
//                         e.printStackTrace();
//                 }
//         }

//         public Iterable<CSVRecord> getRecordsFromCsv(String[] csvHeader, Reader in) throws IOException {
//                 CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
//                                 .setHeader(csvHeader)
//                                 .setSkipHeaderRecord(true)
//                                 .build();

//                 Iterable<CSVRecord> records = csvFormat.parse(in);

//                 return records;
//         }
// }
