'DomElementsInspection<MavenDomProjectModel>' @ [32:35] ==> public constructor DomElementsInspection<T : (DomElement..DomElement?)>(p0: (Class<out (MavenDomProjectModel..MavenDomProjectModel?)>..Class<out (MavenDomProjectModel..MavenDomProjectModel?)>?), @NotNull vararg p1: (Class<out (MavenDomProjectModel..MavenDomProjectModel?)>..Class<out (MavenDomProjectModel..MavenDomProjectModel?)>?)) defined in com.intellij.util.xml.highlighting.DomElementsInspection[JavaClassConstructorDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'java' @ [32:107] ==> public val <T> KClass<MavenDomProjectModel>.java: Class<MavenDomProjectModel> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MavenDomProjectModel

'domFileElement' @ [34:13] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[ValueParameterDescriptorImpl]

'holder' @ [34:39] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[ValueParameterDescriptorImpl]

'domFileElement' @ [38:22] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[ValueParameterDescriptorImpl]

'module' @ [38:37] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.module: Module?[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'?:' @ [39:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: MavenProjectsManager?, right: MavenProjectsManager): MavenProjectsManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> MavenProjectsManager

'getInstance' @ [39:44] ==> public open fun getInstance(p0: (Project..Project?)): (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [39:56] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[LocalVariableDescriptor]

'project' @ [39:63] ==> public final val Module.project: Project[MyPropertyDescriptor]

'manager' @ [40:28] ==> val manager: MavenProjectsManager defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[LocalVariableDescriptor]

'findProject' @ [40:36] ==> @Nullable public open fun findProject(@NotNull p0: Module): MavenProject? defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [40:48] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[LocalVariableDescriptor]

'mavenProject' @ [42:24] ==> val mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[LocalVariableDescriptor]

'dependencies' @ [42:37] ==> public final val MavenProject.dependencies: (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>)[MyPropertyDescriptor]

'any' @ [42:50] ==> public inline fun <T> Iterable<(MavenArtifact..MavenArtifact?)>.any(predicate: ((MavenArtifact..MavenArtifact?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)

'it' @ [42:56] ==> value-parameter it: (MavenArtifact..MavenArtifact?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'groupId' @ [42:59] ==> public final val MavenArtifact.groupId: (String..String?)[MyPropertyDescriptor]

'it' @ [42:81] ==> value-parameter it: (MavenArtifact..MavenArtifact?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [42:84] ==> public final val MavenArtifact.artifactId: (String..String?)[MyPropertyDescriptor]

'!' @ [43:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasJunit' @ [43:14] ==> val hasJunit: Boolean defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[LocalVariableDescriptor]

'domFileElement' @ [47:38] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[ValueParameterDescriptorImpl]

'rootElement' @ [47:53] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.rootElement: MavenDomProjectModel[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'dependencies' @ [47:65] ==> public final val MavenDomProjectModel.dependencies: MavenDomDependencies[MyPropertyDescriptor]

'dependencies' @ [48:18] ==> public final val MavenDomDependencies.dependencies: (MutableList<(MavenDomDependency..MavenDomDependency?)>..List<(MavenDomDependency..MavenDomDependency?)>)[MyPropertyDescriptor]

'filter' @ [48:31] ==> public inline fun <T> Iterable<(MavenDomDependency..MavenDomDependency?)>.filter(predicate: ((MavenDomDependency..MavenDomDependency?)) -> Boolean): List<(MavenDomDependency..MavenDomDependency?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'it' @ [48:40] ==> value-parameter it: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'groupId' @ [48:43] ==> public final val MavenDomDependency.groupId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'rawText' @ [48:51] ==> public final val <T : (Any..Any?)> GenericDomValue<(String..String?)>.rawText: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'GROUP_ID' @ [48:86] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'it' @ [48:98] ==> value-parameter it: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [48:101] ==> public final val MavenDomDependency.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'rawText' @ [48:112] ==> public final val <T : (Any..Any?)> GenericDomValue<(String..String?)>.rawText: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'TEST_LIB_ID' @ [48:151] ==> public final val TEST_LIB_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinJavaMavenConfigurator.Companion[PropertyDescriptorImpl]

'kotlinTestDependencies' @ [50:9] ==> val kotlinTestDependencies: List<(MavenDomDependency..MavenDomDependency?)> defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[LocalVariableDescriptor]

'forEach' @ [50:32] ==> @HidesMembers public inline fun <T> Iterable<(MavenDomDependency..MavenDomDependency?)>.forEach(action: ((MavenDomDependency..MavenDomDependency?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'holder' @ [51:13] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [51:20] ==> public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?), vararg p3: (LocalQuickFix..LocalQuickFix?)): (DomElementProblemDescriptor..DomElementProblemDescriptor?) defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'it' @ [51:34] ==> value-parameter it: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [51:37] ==> public final val MavenDomDependency.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'WEAK_WARNING' @ [52:52] ==> public final val WEAK_WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'ReplaceToKotlinTest' @ [54:34] ==> public constructor ReplaceToKotlinTest(dependency: MavenDomDependency) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.ReplaceToKotlinTest[ClassConstructorDescriptorImpl]

'it' @ [54:54] ==> value-parameter it: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [61:40] ==> public final val KotlinTestJUnitInspection.ReplaceToKotlinTest.name: String[MyPropertyDescriptor]

'dependency' @ [64:17] ==> public final val dependency: MavenDomDependency defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.ReplaceToKotlinTest[PropertyDescriptorImpl]

'isValid' @ [64:28] ==> public final val MavenDomDependency.isValid: Boolean[MyPropertyDescriptor]

'dependency' @ [65:17] ==> public final val dependency: MavenDomDependency defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinTestJUnitInspection.ReplaceToKotlinTest[PropertyDescriptorImpl]

'artifactId' @ [65:28] ==> public final val MavenDomDependency.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [65:39] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

