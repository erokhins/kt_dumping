'AbstractDiagnosticsTest' @ [30:49] ==> public constructor AbstractDiagnosticsTest() defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[DeserializedClassConstructorDescriptor]

'listOf' @ [34:34] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'MockLibraryUtil' @ [34:41] ==> public object MockLibraryUtil defined in org.jetbrains.kotlin.test[FakeCallableDescriptorForObject]

'compileJvmLibraryToJar' @ [34:57] ==> @JvmStatic @JvmOverloads public final fun compileJvmLibraryToJar(sourcesPath: String, jarName: String, addSources: Boolean = ..., allowKotlinSources: Boolean = ..., extraOptions: List<String> = ..., extraClasspath: List<String> = ..., useJava9: Boolean = ...): File defined in org.jetbrains.kotlin.test.MockLibraryUtil[DeserializedSimpleFunctionDescriptor]

'annotationsPath' @ [34:80] ==> protected open val annotationsPath: String defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest[PropertyDescriptorImpl]

'foreignAnnotations' @ [35:16] ==> val foreignAnnotations: List<File> defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest.getExtraClasspath[LocalVariableDescriptor]

'compileTestAnnotations' @ [35:37] ==> protected final fun compileTestAnnotations(extraClassPath: List<File>): List<File> defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest[SimpleFunctionDescriptorImpl]

'foreignAnnotations' @ [35:60] ==> val foreignAnnotations: List<File> defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest.getExtraClasspath[LocalVariableDescriptor]

'listOf' @ [39:13] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'MockLibraryUtil' @ [39:20] ==> public object MockLibraryUtil defined in org.jetbrains.kotlin.test[FakeCallableDescriptorForObject]

'compileJvmLibraryToJar' @ [39:36] ==> @JvmStatic @JvmOverloads public final fun compileJvmLibraryToJar(sourcesPath: String, jarName: String, addSources: Boolean = ..., allowKotlinSources: Boolean = ..., extraOptions: List<String> = ..., extraClasspath: List<String> = ..., useJava9: Boolean = ...): File defined in org.jetbrains.kotlin.test.MockLibraryUtil[DeserializedSimpleFunctionDescriptor]

'TEST_ANNOTATIONS_SOURCE_PATH' @ [40:17] ==> public val TEST_ANNOTATIONS_SOURCE_PATH: String defined in org.jetbrains.kotlin.checkers in file AbstractForeignAnnotationsTest.kt[PropertyDescriptorImpl]

'extraClassPath' @ [42:34] ==> value-parameter extraClassPath: List<File> defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest.compileTestAnnotations[ValueParameterDescriptorImpl]

'map' @ [42:49] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [42:55] ==> value-parameter it: File defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest.compileTestAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [42:58] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'ALL' @ [45:80] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [47:72] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'FOREIGN_ANNOTATIONS_SOURCES_PATH' @ [50:17] ==> public val FOREIGN_ANNOTATIONS_SOURCES_PATH: String defined in org.jetbrains.kotlin.checkers in file AbstractForeignAnnotationsTest.kt[PropertyDescriptorImpl]

'module' @ [53:35] ==> value-parameter module: List<BaseDiagnosticsTest.TestFile> defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest.loadLanguageVersionSettings[ValueParameterDescriptorImpl]

'any' @ [53:42] ==> public inline fun <T> Iterable<BaseDiagnosticsTest.TestFile>.any(predicate: (BaseDiagnosticsTest.TestFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'isDirectiveDefined' @ [54:35] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'it' @ [54:54] ==> value-parameter it: BaseDiagnosticsTest.TestFile defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest.loadLanguageVersionSettings.<anonymous>[ValueParameterDescriptorImpl]

'expectedText' @ [54:57] ==> public final val expectedText: String defined in org.jetbrains.kotlin.checkers.BaseDiagnosticsTest.TestFile[DeserializedPropertyDescriptor]

'WARNING_FOR_JSR305_ANNOTATIONS_DIRECTIVE' @ [54:71] ==> private final val WARNING_FOR_JSR305_ANNOTATIONS_DIRECTIVE: String defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest[PropertyDescriptorImpl]

'if (hasWarningDirective) Jsr305State.WARN else Jsr305State.ENABLE' @ [57:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Jsr305State, elseBranch: Jsr305State): Jsr305State[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Jsr305State

'hasWarningDirective' @ [57:31] ==> val hasWarningDirective: Boolean defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

'Jsr305State' @ [57:52] ==> public companion object defined in org.jetbrains.kotlin.utils.Jsr305State[FakeCallableDescriptorForObject]

'WARN' @ [57:64] ==> enum entry WARN defined in org.jetbrains.kotlin.utils.Jsr305State[FakeCallableDescriptorForObject]

'Jsr305State' @ [57:74] ==> public companion object defined in org.jetbrains.kotlin.utils.Jsr305State[FakeCallableDescriptorForObject]

'ENABLE' @ [57:86] ==> enum entry ENABLE defined in org.jetbrains.kotlin.utils.Jsr305State[FakeCallableDescriptorForObject]

'LanguageVersionSettingsImpl' @ [58:16] ==> @JvmOverloads public constructor LanguageVersionSettingsImpl(languageVersion: LanguageVersion, apiVersion: ApiVersion, analysisFlags: Map<AnalysisFlag<*>, Any?> = ..., specificFeatures: Map<LanguageFeature, LanguageFeature.State> = ...) defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedClassConstructorDescriptor]

'LanguageVersion' @ [58:44] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [58:60] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'ApiVersion' @ [58:75] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [58:86] ==> @field:JvmField public final val LATEST_STABLE: ApiVersion defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedPropertyDescriptor]

'mapOf' @ [59:44] ==> public fun <K, V> mapOf(pair: Pair<AnalysisFlag<*>, Jsr305State>): Map<AnalysisFlag<*>, Jsr305State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AnalysisFlag<*>
    <V> -> Jsr305State

'AnalysisFlag' @ [59:50] ==> public companion object Flags defined in org.jetbrains.kotlin.config.AnalysisFlag[FakeCallableDescriptorForObject]

'jsr305GlobalState' @ [59:63] ==> @JvmStatic public final val jsr305GlobalState: AnalysisFlag<Jsr305State> defined in org.jetbrains.kotlin.config.AnalysisFlag.Flags[DeserializedPropertyDescriptor]

'jsr305State' @ [59:84] ==> val jsr305State: Jsr305State defined in org.jetbrains.kotlin.checkers.AbstractForeignAnnotationsTest.loadLanguageVersionSettings[LocalVariableDescriptor]

