## Configuration

dengan adanya @EnableAutoConfiguration, spring boot menjadi lebih mudah untuk konfigurasi codingannya, sehingga bisa saling terhubung satu sama lain.

- sebelum
    ```java
    @SpringBootApplication
    ```
- uji coba
    ```java
    @EnableAutoConfiguration
    @ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
            @ComponentScan.Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
    ```

sebelumnya kita bisa menggunakan @SpringBootApplication, kemudian ketika anotasi tsb dikomen dan kita ganti dengan anotasi uji coba, maka ketika di run hasil nya akan sama.