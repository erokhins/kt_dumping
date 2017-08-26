'MavenImportingTestCase' @ [40:52] ==> public constructor MavenImportingTestCase() defined in org.jetbrains.kotlin.idea.maven.MavenImportingTestCase[JavaClassConstructorDescriptor]

'super' @ [43:9] ==> <this> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [43:15] ==> @Override protected/*protected and package*/ open fun setUp(): Unit defined in org.jetbrains.kotlin.idea.maven.MavenImportingTestCase[JavaMethodDescriptor]

'repositoryPath' @ [44:9] ==> protected/*protected and package*/ for synthetic extension final var AbstractKotlinMavenInspectionTest.repositoryPath: (String..String?)[MyPropertyDescriptor]

'File' @ [44:26] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'myDir' @ [44:31] ==> protected/*protected and package*/ final var myDir: (File..File?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'path' @ [44:46] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'createStdProjectFolders' @ [45:9] ==> protected/*protected and package*/ open fun createStdProjectFolders(): Unit defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaMethodDescriptor]

'File' @ [49:23] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'fileName' @ [49:28] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[ValueParameterDescriptorImpl]

'pomFile' @ [50:23] ==> val pomFile: File defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'readText' @ [50:31] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'createPomFile' @ [52:9] ==> private final fun createPomFile(fileName: String): Unit defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[SimpleFunctionDescriptorImpl]

'fileName' @ [52:23] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[ValueParameterDescriptorImpl]

'importProject' @ [53:9] ==> protected/*protected and package*/ open fun importProject(): Unit defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaMethodDescriptor]

'myProject' @ [54:9] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'allModules' @ [54:19] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[DeserializedSimpleFunctionDescriptor]

'forEach' @ [54:32] ==> @HidesMembers public inline fun <T> Iterable<(Module..Module?)>.forEach(action: ((Module..Module?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'setupJdkForModule' @ [55:13] ==> protected/*protected and package*/ open fun setupJdkForModule(moduleName: (String..String?)): (Sdk..Sdk?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaMethodDescriptor]

'it' @ [55:31] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [55:34] ==> public final val Module.name: String[MyPropertyDescriptor]

'pomText' @ [58:13] ==> val pomText: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'contains' @ [58:21] ==> @InlineOnly public operator inline fun CharSequence.contains(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [58:54] ==> @InlineOnly public inline fun String.toRegex(option: RegexOption): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'MULTILINE' @ [58:74] ==> enum entry MULTILINE defined in kotlin.text.RegexOption[FakeCallableDescriptorForObject]

'mkJavaFile' @ [59:13] ==> private final fun mkJavaFile(): Unit defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[SimpleFunctionDescriptorImpl]

'?:' @ [62:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'toRegex' @ [62:75] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'find' @ [62:85] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'pomText' @ [62:90] ==> val pomText: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'groups' @ [62:100] ==> public abstract val groups: MatchGroupCollection defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'get' @ [62:108] ==> public abstract operator fun get(index: Int): MatchGroup? defined in kotlin.text.MatchGroupCollection[DeserializedSimpleFunctionDescriptor]

'value' @ [62:116] ==> public final val value: String defined in kotlin.text.MatchGroup[DeserializedPropertyDescriptor]

'KotlinMavenPluginPhaseInspection' @ [62:125] ==> public constructor KotlinMavenPluginPhaseInspection() defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenPluginPhaseInspection[DeserializedClassConstructorDescriptor]

'qualifiedName' @ [62:165] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'forName' @ [63:37] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'inspectionClassName' @ [63:45] ==> val inspectionClassName: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'toRegex' @ [65:84] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pomText' @ [66:24] ==> val pomText: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'lines' @ [66:32] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [66:40] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> MatchResult?): List<MatchResult> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> MatchResult

'matcher' @ [66:53] ==> val matcher: Regex defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'find' @ [66:61] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'it' @ [66:66] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [66:72] ==> public inline fun <T, R> Iterable<MatchResult>.map(transform: (MatchResult) -> AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription): List<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MatchResult
    <R> -> SimplifiedProblemDescription

'SimplifiedProblemDescription' @ [66:78] ==> public constructor SimplifiedProblemDescription(text: String, elementText: String) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription[ClassConstructorDescriptorImpl]

'it' @ [66:107] ==> value-parameter it: MatchResult defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'groups' @ [66:110] ==> public abstract val groups: MatchGroupCollection defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'value' @ [66:122] ==> public final val value: String defined in kotlin.text.MatchGroup[DeserializedPropertyDescriptor]

'trim' @ [66:128] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [66:136] ==> value-parameter it: MatchResult defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'groups' @ [66:139] ==> public abstract val groups: MatchGroupCollection defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'value' @ [66:151] ==> public final val value: String defined in kotlin.text.MatchGroup[DeserializedPropertyDescriptor]

'trim' @ [66:157] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'runInspection' @ [67:22] ==> public fun runInspection(inspectionClass: Class<*>, project: Project, files: List<VirtualFile>? = ..., withTestDir: String? = ...): InspectionToolPresentation defined in org.jetbrains.kotlin.idea.inspections in file InspectionUtils.kt[SimpleFunctionDescriptorImpl]

'inspectionClass' @ [67:36] ==> val inspectionClass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'myProject' @ [67:53] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'problemElements' @ [68:18] ==> public final val InspectionToolPresentation.problemElements: (MutableMap<(RefEntity..RefEntity?), (Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?)>..Map<(RefEntity..RefEntity?), (Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?)>)[MyPropertyDescriptor]

'filter' @ [69:18] ==> public inline fun <K, V> Map<out (RefEntity..RefEntity?), (Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?)>.filter(predicate: (Map.Entry<(RefEntity..RefEntity?), (Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?)>) -> Boolean): Map<(RefEntity..RefEntity?), (Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.codeInspection.reference.RefEntity..com.intellij.codeInspection.reference.RefEntity?)
    <V> -> (kotlin.Array<(com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)>..kotlin.Array<out (com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)>?)

'it' @ [69:27] ==> value-parameter it: Map.Entry<(RefEntity..RefEntity?), (Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?)> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [69:30] ==> public abstract val key: (RefEntity..RefEntity?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'name' @ [69:34] ==> public final val RefEntity.name: String[MyPropertyDescriptor]

'values' @ [70:18] ==> public abstract val values: Collection<(Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?)> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'flatMap' @ [71:18] ==> public inline fun <T, R> Iterable<(Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?)>.flatMap(transform: ((Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?)) -> Iterable<(CommonProblemDescriptor..CommonProblemDescriptor?)>): List<(CommonProblemDescriptor..CommonProblemDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Array<(com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)>..kotlin.Array<out (com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)>?)
    <R> -> (com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)

'it' @ [71:28] ==> value-parameter it: (Array<(CommonProblemDescriptor..CommonProblemDescriptor?)>..Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [71:31] ==> public fun <T> Array<out (CommonProblemDescriptor..CommonProblemDescriptor?)>.toList(): List<(CommonProblemDescriptor..CommonProblemDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)

'mapNotNull' @ [72:18] ==> public inline fun <T, R : Any> Iterable<(CommonProblemDescriptor..CommonProblemDescriptor?)>.mapNotNull(transform: ((CommonProblemDescriptor..CommonProblemDescriptor?)) -> ProblemDescriptorBase?): List<ProblemDescriptorBase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)
    <R : Any> -> ProblemDescriptorBase

'it' @ [72:31] ==> value-parameter it: (CommonProblemDescriptor..CommonProblemDescriptor?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [73:18] ==> public inline fun <T, R> Iterable<ProblemDescriptorBase>.map(transform: (ProblemDescriptorBase) -> Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>): List<Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProblemDescriptorBase
    <R> -> Pair<SimplifiedProblemDescription, ProblemDescriptorBase>

'SimplifiedProblemDescription' @ [73:24] ==> public constructor SimplifiedProblemDescription(text: String, elementText: String) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription[ClassConstructorDescriptorImpl]

'it' @ [73:53] ==> value-parameter it: ProblemDescriptorBase defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'descriptionTemplate' @ [73:56] ==> public final val ProblemDescriptorBase.descriptionTemplate: String[MyPropertyDescriptor]

'it' @ [73:77] ==> value-parameter it: ProblemDescriptorBase defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'psiElement' @ [73:80] ==> public final val ProblemDescriptorBase.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'text' @ [73:91] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'replace' @ [73:96] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [73:111] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [73:130] ==> value-parameter it: ProblemDescriptorBase defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'sortedBy' @ [74:18] ==> public inline fun <T, R : Comparable<String>> Iterable<Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>>.sortedBy(crossinline selector: (Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>) -> String?): List<Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SimplifiedProblemDescription, ProblemDescriptorBase>
    <R : Comparable<R>> -> String

'it' @ [74:29] ==> value-parameter it: Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [74:32] ==> public final val first: AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription defined in kotlin.Pair[DeserializedPropertyDescriptor]

'text' @ [74:38] ==> public final val text: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription[PropertyDescriptorImpl]

'assertEquals' @ [76:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.idea.maven.MavenImportingTestCase[JavaMethodDescriptor]

'expected' @ [76:22] ==> val expected: List<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'sortedBy' @ [76:31] ==> public inline fun <T, R : Comparable<String>> Iterable<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription>.sortedBy(crossinline selector: (AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription) -> String?): List<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimplifiedProblemDescription
    <R : Comparable<R>> -> String

'it' @ [76:42] ==> value-parameter it: AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [76:45] ==> public final val text: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription[PropertyDescriptorImpl]

'actual' @ [76:53] ==> val actual: List<Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'map' @ [76:60] ==> public inline fun <T, R> Iterable<Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>>.map(transform: (Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>) -> AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription): List<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SimplifiedProblemDescription, ProblemDescriptorBase>
    <R> -> SimplifiedProblemDescription

'it' @ [76:66] ==> value-parameter it: Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [76:69] ==> public final val first: AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription defined in kotlin.Pair[DeserializedPropertyDescriptor]

'actual' @ [78:30] ==> val actual: List<Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'flatMap' @ [78:37] ==> public inline fun <T, R> Iterable<Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>>.flatMap(transform: (Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase>) -> Iterable<Pair<ProblemDescriptorBase, raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>>): List<Pair<ProblemDescriptorBase, raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SimplifiedProblemDescription, ProblemDescriptorBase>
    <R> -> Pair<ProblemDescriptorBase, raw (com.intellij.codeInspection.QuickFix<(com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)>..com.intellij.codeInspection.QuickFix<*>?)>

'p' @ [78:52] ==> value-parameter p: Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [78:54] ==> public final val second: ProblemDescriptorBase defined in kotlin.Pair[DeserializedPropertyDescriptor]

'fixes' @ [78:61] ==> public final val ProblemDescriptorBase.fixes: (Array<raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>?..Array<out raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>?)[MyPropertyDescriptor]

'sortedBy' @ [78:68] ==> public inline fun <T, R : Comparable<String>> Array<out raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>.sortedBy(crossinline selector: (raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)) -> String?): List<raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> raw (com.intellij.codeInspection.QuickFix<(com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)>..com.intellij.codeInspection.QuickFix<*>?)
    <R : Comparable<R>> -> String

'it' @ [78:79] ==> value-parameter it: raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'familyName' @ [78:82] ==> public final val <D : (CommonProblemDescriptor..CommonProblemDescriptor?)> QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>.familyName: String[MyPropertyDescriptor]
Inferred types:
    <D : (CommonProblemDescriptor..CommonProblemDescriptor?)> -> (com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)

'map' @ [78:96] ==> public inline fun <T, R> Iterable<raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>.map(transform: (raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)) -> Pair<ProblemDescriptorBase, raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>): List<Pair<ProblemDescriptorBase, raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> raw (com.intellij.codeInspection.QuickFix<(com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)>..com.intellij.codeInspection.QuickFix<*>?)
    <R> -> Pair<ProblemDescriptorBase, raw (com.intellij.codeInspection.QuickFix<(com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)>..com.intellij.codeInspection.QuickFix<*>?)>

'p' @ [78:102] ==> value-parameter p: Pair<AbstractKotlinMavenInspectionTest.SimplifiedProblemDescription, ProblemDescriptorBase> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [78:104] ==> public final val second: ProblemDescriptorBase defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [78:114] ==> value-parameter it: raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [78:122] ==> public fun <T> emptyList(): List<Pair<ProblemDescriptorBase, raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ProblemDescriptorBase, raw (com.intellij.codeInspection.QuickFix<(com.intellij.codeInspection.CommonProblemDescriptor..com.intellij.codeInspection.CommonProblemDescriptor?)>..com.intellij.codeInspection.QuickFix<*>?)>

'pomFile' @ [80:30] ==> val pomFile: File defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'nameWithoutExtension' @ [80:38] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'pomFile' @ [81:24] ==> val pomFile: File defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'parentFile' @ [81:32] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'listFiles' @ [81:43] ==> public final fun listFiles(p0: (((File..File?), (String..String?)) -> Boolean..(((File..File?), (String..String?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'name' @ [81:66] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [81:71] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filenamePrefix' @ [81:82] ==> val filenamePrefix: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'name' @ [81:101] ==> value-parameter name: (String..String?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [81:106] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sortedBy' @ [81:125] ==> public inline fun <T, R : Comparable<String>> Array<out (File..File?)>.sortedBy(crossinline selector: ((File..File?)) -> String?): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R : Comparable<R>> -> String

'it' @ [81:136] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [81:139] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'fixFiles' @ [83:13] ==> val fixFiles: List<(File..File?)> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'size' @ [83:22] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'suggestedFixes' @ [83:29] ==> val suggestedFixes: List<Pair<ProblemDescriptorBase, raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'size' @ [83:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'fail' @ [84:13] ==> public open fun fail(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.maven.MavenImportingTestCase[JavaMethodDescriptor]

'fixFiles' @ [84:85] ==> val fixFiles: List<(File..File?)> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'size' @ [84:94] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'suggestedFixes' @ [84:123] ==> val suggestedFixes: List<Pair<ProblemDescriptorBase, raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'size' @ [84:138] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'fixFiles' @ [86:13] ==> val fixFiles: List<(File..File?)> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'size' @ [86:22] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'suggestedFixes' @ [86:29] ==> val suggestedFixes: List<Pair<ProblemDescriptorBase, raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'size' @ [86:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'fail' @ [87:13] ==> public open fun fail(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.maven.MavenImportingTestCase[JavaMethodDescriptor]

'getInstance' @ [90:50] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'myProject' @ [90:62] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'documentManager' @ [91:24] ==> val documentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'getDocument' @ [91:40] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'!!' @ [91:52] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiFile?): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiFile

'getInstance' @ [91:63] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'myProject' @ [91:75] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'findFile' @ [91:86] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'myProjectPom' @ [91:95] ==> protected/*protected and package*/ final var myProjectPom: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'document' @ [92:28] ==> val document: Document defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'text' @ [92:37] ==> public final val Document.text: String[MyPropertyDescriptor]

'fixFiles' @ [94:9] ==> val fixFiles: List<(File..File?)> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'forEachIndexed' @ [94:18] ==> public inline fun <T> Iterable<(File..File?)>.forEachIndexed(action: (index: Int, (File..File?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'component1' @ [95:18] ==> public final operator fun component1(): ProblemDescriptorBase defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [95:27] ==> public final operator fun component2(): raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'suggestedFixes' @ [95:39] ==> val suggestedFixes: List<Pair<ProblemDescriptorBase, raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?)>> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'index' @ [95:54] ==> value-parameter index: Int defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'quickfix' @ [97:13] ==> val quickfix: raw (QuickFix<(CommonProblemDescriptor..CommonProblemDescriptor?)>..QuickFix<*>?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[LocalVariableDescriptor]

'applyFix' @ [97:22] ==> private final fun QuickFix<CommonProblemDescriptor>.applyFix(desc: ProblemDescriptorBase): Unit defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[SimpleFunctionDescriptorImpl]

'problem' @ [97:31] ==> val problem: ProblemDescriptorBase defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [99:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.maven.MavenImportingTestCase[JavaMethodDescriptor]

'loadFile' @ [99:35] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'file' @ [99:44] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [99:56] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'document' @ [99:64] ==> val document: Document defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'text' @ [99:73] ==> public final val Document.text: String[MyPropertyDescriptor]

'trim' @ [99:78] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [101:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runWriteAction' @ [101:49] ==> public final fun runWriteAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'document' @ [102:17] ==> val document: Document defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'setText' @ [102:26] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'originalText' @ [102:34] ==> val originalText: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'documentManager' @ [103:17] ==> val documentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'commitDocument' @ [103:33] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [103:48] ==> val document: Document defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.doTest[LocalVariableDescriptor]

'myProjectPom' @ [109:9] ==> protected/*protected and package*/ final var myProjectPom: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'myProjectRoot' @ [109:24] ==> protected/*protected and package*/ final var myProjectRoot: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'findChild' @ [109:38] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'myProjectPom' @ [110:13] ==> protected/*protected and package*/ final var myProjectPom: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'myProjectPom' @ [111:13] ==> protected/*protected and package*/ final var myProjectPom: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'WriteAction<VirtualFile>' @ [111:37] ==> public constructor WriteAction<T : (Any..Any?)>() defined in com.intellij.openapi.application.WriteAction[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VirtualFile

'myProjectRoot' @ [113:31] ==> protected/*protected and package*/ final var myProjectRoot: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'createChildData' @ [113:45] ==> @NotNull public open fun createChildData(p0: (Any..Any?), @NotNull p1: String): VirtualFile defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'result' @ [114:21] ==> value-parameter result: Result<VirtualFile> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.createPomFile.<no name provided>.run[ValueParameterDescriptorImpl]

'setResult' @ [114:28] ==> public final fun setResult(p0: (VirtualFile..VirtualFile?)): Unit defined in com.intellij.openapi.application.Result[JavaMethodDescriptor]

'res' @ [114:38] ==> val res: VirtualFile defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.createPomFile.<no name provided>.run[LocalVariableDescriptor]

'execute' @ [116:15] ==> @NotNull public open fun execute(): RunResult<(VirtualFile..VirtualFile?)> defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.createPomFile.<no name provided>[JavaMethodDescriptor]

'resultObject' @ [116:25] ==> public final val <T : (Any..Any?)> RunResult<(VirtualFile..VirtualFile?)>.resultObject: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'myAllPoms' @ [118:9] ==> protected/*protected and package*/ final var myAllPoms: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'add' @ [118:19] ==> public abstract fun add(element: (VirtualFile..VirtualFile?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'myProjectPom' @ [118:23] ==> protected/*protected and package*/ final var myProjectPom: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'getApplication' @ [120:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runWriteAction' @ [120:45] ==> public final fun runWriteAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'myProjectPom' @ [121:13] ==> protected/*protected and package*/ final var myProjectPom: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'setBinaryContent' @ [121:28] ==> public final fun setBinaryContent(@NotNull p0: ByteArray): Unit defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'File' @ [121:45] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'fileName' @ [121:50] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.createPomFile[ValueParameterDescriptorImpl]

'readBytes' @ [121:60] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [126:26] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'executeCommand' @ [126:40] ==> public final fun executeCommand(@Nullable p0: Project?, @NotNull p1: () -> Unit, @Nullable p2: String?, @Nullable p3: Any?): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'myProject' @ [126:55] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'getApplication' @ [127:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runWriteAction' @ [127:49] ==> public final fun runWriteAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'applyFix' @ [128:17] ==> public abstract fun applyFix(@NotNull p0: Project, @NotNull p1: CommonProblemDescriptor): Unit defined in com.intellij.codeInspection.QuickFix[JavaMethodDescriptor]

'myProject' @ [128:26] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'desc' @ [128:37] ==> value-parameter desc: ProblemDescriptorBase defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.applyFix[ValueParameterDescriptorImpl]

'getInstance' @ [130:50] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'myProject' @ [130:62] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'manager' @ [131:32] ==> val manager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.applyFix.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getDocument' @ [131:40] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'!!' @ [131:52] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiFile?): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiFile

'getInstance' @ [131:63] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'myProject' @ [131:75] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'findFile' @ [131:86] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'myProjectPom' @ [131:95] ==> protected/*protected and package*/ final var myProjectPom: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'manager' @ [132:17] ==> val manager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.applyFix.<anonymous>.<anonymous>[LocalVariableDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [132:25] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [132:65] ==> val document: Document defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.applyFix.<anonymous>.<anonymous>[LocalVariableDescriptor]

'manager' @ [133:17] ==> val manager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.applyFix.<anonymous>.<anonymous>[LocalVariableDescriptor]

'commitDocument' @ [133:25] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [133:40] ==> val document: Document defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.applyFix.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [134:37] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'saveDocument' @ [134:51] ==> public abstract fun saveDocument(@NotNull p0: Document): Unit defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'document' @ [134:64] ==> val document: Document defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.applyFix.<anonymous>.<anonymous>[LocalVariableDescriptor]

'println' @ [138:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'myProjectPom' @ [138:21] ==> protected/*protected and package*/ final var myProjectPom: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'contentsToByteArray' @ [138:34] ==> @NotNull public abstract fun contentsToByteArray(): ByteArray defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'toString' @ [138:56] ==> @InlineOnly public inline fun ByteArray.toString(charset: Charset): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'UTF_8' @ [138:74] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'name' @ [139:24] ==> public final val <D : (CommonProblemDescriptor..CommonProblemDescriptor?)> QuickFix<CommonProblemDescriptor>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (CommonProblemDescriptor..CommonProblemDescriptor?)> -> CommonProblemDescriptor

'getContentRoots' @ [143:28] ==> public open fun getContentRoots(moduleName: (String..String?)): (Array<(ContentEntry..ContentEntry?)>..Array<out (ContentEntry..ContentEntry?)>?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaMethodDescriptor]

'myProject' @ [143:44] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'allModules' @ [143:54] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[DeserializedSimpleFunctionDescriptor]

'single' @ [143:67] ==> public fun <T> List<(Module..Module?)>.single(): (Module..Module?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'name' @ [143:76] ==> public final val Module.name: String[MyPropertyDescriptor]

'single' @ [143:82] ==> public fun <T> Array<out (ContentEntry..ContentEntry?)>.single(): (ContentEntry..ContentEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.ContentEntry..com.intellij.openapi.roots.ContentEntry?)

'getSourceFolders' @ [143:91] ==> @NotNull public abstract fun getSourceFolders(@NotNull p0: JpsModuleSourceRootType<*>): (MutableList<(SourceFolder..SourceFolder?)>..List<(SourceFolder..SourceFolder?)>) defined in com.intellij.openapi.roots.ContentEntry[JavaMethodDescriptor]

'SOURCE' @ [143:127] ==> public final val SOURCE: (JavaSourceRootType..JavaSourceRootType?) defined in org.jetbrains.jps.model.java.JavaSourceRootType[JavaPropertyDescriptor]

'single' @ [143:135] ==> public fun <T> List<(SourceFolder..SourceFolder?)>.single(): (SourceFolder..SourceFolder?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.SourceFolder..com.intellij.openapi.roots.SourceFolder?)

'getApplication' @ [144:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runWriteAction' @ [144:45] ==> public final fun runWriteAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'sourceFolder' @ [145:28] ==> val sourceFolder: (SourceFolder..SourceFolder?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.mkJavaFile[LocalVariableDescriptor]

'file' @ [145:41] ==> public final val SourceFolder.file: VirtualFile?[MyPropertyDescriptor]

'toPsiDirectory' @ [145:47] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'myProject' @ [145:62] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'createFile' @ [145:74] ==> @NotNull public abstract fun createFile(@NotNull @NonNls p0: String): PsiFile defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'IllegalStateException' @ [145:107] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'javaFile' @ [146:13] ==> val javaFile: PsiFile defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest.mkJavaFile.<anonymous>[LocalVariableDescriptor]

'viewProvider' @ [146:22] ==> public final val PsiFile.viewProvider: FileViewProvider[MyPropertyDescriptor]

'document' @ [146:35] ==> public final val FileViewProvider.document: Document?[MyPropertyDescriptor]

'setText' @ [146:46] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'assertTrue' @ [149:9] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.jetbrains.kotlin.idea.maven.MavenImportingTestCase[JavaMethodDescriptor]

'containsFileOfType' @ [149:34] ==> public open fun containsFileOfType(@NotNull p0: FileType, @NotNull p1: GlobalSearchScope): Boolean defined in com.intellij.psi.search.FileTypeIndex[JavaMethodDescriptor]

'INSTANCE' @ [149:66] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'myProject' @ [149:76] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.maven.AbstractKotlinMavenInspectionTest[JavaPropertyDescriptor]

'allModules' @ [149:86] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[DeserializedSimpleFunctionDescriptor]

'single' @ [149:99] ==> public fun <T> List<(Module..Module?)>.single(): (Module..Module?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'moduleScope' @ [149:108] ==> public final val Module.moduleScope: GlobalSearchScope[MyPropertyDescriptor]

