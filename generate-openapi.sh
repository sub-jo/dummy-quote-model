#!/bin/sh

# TMF 672 Roles and Permissions API generator
# Run the docker image to generate the code from the OpenAPI specification
# The generated code will be placed in the generated folder

# create the output folder if it does not exist and make it writable
mkdir -p generated/out/spring
chmod 777 generated

echo "# openapi generator ignore file" > generated/out/spring/.openapi-generator-ignore

# Environment variable JAVA_POST_PROCESS_FILE not defined so the Java code may not be properly formatted.
export JAVA_POST_PROCESS_FILE="/usr/local/bin/clang-format -i"

# default values:
#     --additionalEnumTypeAnnotations null \ # Additional annotations for enum type (class level annotations).
  #    --additionalModelTypeAnnotations null \ # Additional annotations for model type (class level annotations).
  #    --additionalOneOfTypeAnnotations null \ # Additional annotations for oneOf interfaces (class level annotations).
  #    --allowUnicodeIdentifiers false \ # Toggles whether unicode identifiers are allowed in names or not, default is false.
  #    --annotationLibrary none \ # Select the complementary documentation annotation library.
  #    --apiFirst false \ # Generate the API from the OAI spec at server compile time (API first approach).
  #    --apiPackage org.openapitools.api \ # Package for generated API classes.
  #    --artifactDescription "OpenAPI Java" \ # Artifact description in the generated pom.xml.
  #    --artifactId openapi-spring \ # ArtifactId in generated pom.xml. This also becomes part of the generated library's filename.
  #    --artifactUrl "https://github.com/openapitools/openapi-generator" \ # Artifact URL in generated pom.xml.
  #    --artifactVersion 1.0.0 \ # Artifact version in generated pom.xml. This also becomes part of the generated library's filename.
  #    --async false \ # Use async Callable controllers.
  #    --basePackage org.openapitools \ # Base package (invokerPackage) for generated code.
  #    --bigDecimalAsString false \ # Treat BigDecimal values as Strings to avoid precision loss.
  #    --booleanGetterPrefix get \ # Set booleanGetterPrefix.
  #    --camelCaseDollarSign false \ # Fix camelCase when starting with $ sign.
  #    --configPackage org.openapitools.configuration \ # Configuration package for generated code.
  #    --containerDefaultToNull false \ # Set containers (array, set, map) default to null.
  #    --dateLibrary joda \ # Date library to use.
  #    --delegatePattern false \ # Generate the server files using the delegate pattern.
  #    --developerEmail team@openapitools.org \ # Developer email in generated pom.xml.
  #    --developerName "OpenAPI-Generator Contributors" \ # Developer name in generated pom.xml.
  #    --developerOrganization "OpenAPITools.org" \ # Developer organization in generated pom.xml.
  #    --developerOrganizationUrl "http://openapitools.org" \ # Developer organization URL in generated pom.xml.
  #    --disableHtmlEscaping false \ # Disable HTML escaping of JSON strings when using gson (needed to avoid problems with byte[] fields).
  #    --disallowAdditionalPropertiesIfNotPresent false \ # If false, the 'additionalProperties' implementation (set to true by default) is compliant with the OAS and JSON schema specifications.
  #    --discriminatorCaseSensitive true \ # Whether the discriminator value lookup should be case-sensitive or not. This option only works for Java API client.
  #    --documentationProvider none \ # Select the OpenAPI documentation provider.
  #    --ensureUniqueParams true \ # Whether to ensure parameter names are unique in an operation (rename parameters that are not).
  #    --enumUnknownDefaultCase false \ # If the server adds new enum cases that are unknown by an old spec/client, the client will fail to parse the network response.
  #    --generatedConstructorWithRequiredArgs true \ # Whether to generate constructors with required args for models.
  #    --groupId org.openapitools \ # groupId in generated pom.xml.
  #    --hateoas false \ # Use Spring HATEOAS library to allow adding HATEOAS links.
  #    --hideGenerationTimestamp false \ # Hides the generation timestamp when files are generated.
  #    --ignoreAnyOfInEnum false \ # Ignore anyOf keyword in enum.
  #    --implicitHeaders false \ # Skip header parameters in the generated API methods using @ApiImplicitParams annotation.
  #    --implicitHeadersRegex null \ # Skip header parameters that match a given regex in the generated API methods using @ApiImplicitParams annotation. Note: this parameter is ignored when implicitHeaders=true.
  #    --interfaceOnly false \ # Whether to generate only API interface stubs without the server files.
  #    --invokerPackage org.openapitools.api \ # Root package for generated code.
  #    --legacyDiscriminatorBehavior true \ # Set to false for generators with better support for discriminators.
  #    --library spring-boot \ # Library template (sub-template).
  #    --licenseName "Unlicense" \ # The name of the license.
  #    --licenseUrl "http://unlicense.org" \ # The URL of the license.
  #    --modelPackage org.openapitools.model \ # Package for generated models.
  #    --openApiNullable true \ # Enable OpenAPI Jackson Nullable library.
  #    --parentArtifactId null \ # parent artifactId in generated pom.xml.
  #    --parentGroupId null \ # parent groupId in generated pom.xml.
  #    --parentVersion null \ # parent version in generated

# export volume generated code to the generated folder

# export volume openapi.yaml file


docker run --rm \
    -e JAVA_POST_PROCESS_FILE="/usr/local/bin/clang-format -i" \
    -v "${PWD}/generated:/local" \
    -v "${PWD}:/workspace" \
    openapitools/openapi-generator-cli:v7.4.0 \
    generate \
    -g spring \
    -i /workspace/TMF648-Quote_Management-v4.0.0.oas.yaml \
    -o /local/out/quote-management-model \
    --additional-properties="artifactDescription=TMF648 Quote Management API Model" \
    --additional-properties="artifactId=quote-management" \
    --additional-properties="artifactVersion=4.0.0" \
    --additional-properties="basePackage=com.pia.orbitant.quote" \
    --additional-properties="groupId=com.pia.orbitant.quote" \
    --additional-properties="developerEmail=yusuf.vodafone.com" \
    --additional-properties="developerName=sub-jo" \
    --additional-properties="developerOrganization=PiA Team" \
    --additional-properties="developerOrganizationUrl=https://pia-team.com" \
    --additional-properties="hideGenerationTimestamp=true" \
    --additional-properties="invokerPackage=com.pia.orbitant.quote.api" \
    --additional-properties="library=spring-boot" \
    --additional-properties="licenseName=GNU AGPLv3" \
    --additional-properties="licenseUrl=https://www.gnu.org/licenses/agpl-3.0.en.html" \
    --additional-properties="modelPackage=com.pia.orbitant.quote.model" \
    --additional-properties="resourceFolder=src/main/resources" \
    --additional-properties="scmConnection=scm:git:git@github.com:dnext-technology/roles-and-permissions-model.git" \
    --additional-properties="scmDeveloperConnection=scm:git:git@github.com:sub-jo/dummy-quote-model.git" \
    --additional-properties="scmUrl=https://github.com/dnext-technology/roles-and-permissions-model" \
    --additional-properties="resourceFolder=src/main/resources" \
    --additional-properties="serializableModel=true" \
    --additional-properties="sourceFolder=src/main/java" \
    --additional-properties="testOutput=src/test/generated-test-sources/openapi" \
    --additional-properties="title=TMF648 Quote Management API Model" \
    --additional-properties="useSwaggerUI=true" \
    --additional-properties="useBeanValidation=true" \
    --additional-properties="disallowAdditionalPropertiesIfNotPresent=true" \
    --additional-properties="ignoreAnyOfInEnum=true" \
    --additional-properties="useSpringController=false" \
    --additional-properties="useOneOfInterfaces=true" \
    --additional-properties="requestMappingMode=api_interface" \
    --additional-properties="snapshotVersion=false" \
    --additional-properties="legacyDiscriminatorBehavior=false" \
    --additional-properties="interfaceOnly=true" \
    --additional-properties="documentationProvider=springdoc" \
    --additional-properties="useJakartaEe=true" \
    --additional-properties="useSpringBoot3=true"

