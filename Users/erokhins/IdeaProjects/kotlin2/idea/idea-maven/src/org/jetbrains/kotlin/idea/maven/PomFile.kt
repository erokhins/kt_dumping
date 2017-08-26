'MavenId' @ [44:40] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'GROUP_ID' @ [44:72] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_PLUGIN_ID' @ [44:106] ==> public final val MAVEN_PLUGIN_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'version' @ [44:123] ==> value-parameter version: String? defined in org.jetbrains.kotlin.idea.maven.kotlinPluginId[ValueParameterDescriptorImpl]

'this' @ [48:37] ==> private constructor PomFile(xmlFile: XmlFile, domModel: MavenDomProjectModel) defined in org.jetbrains.kotlin.idea.maven.PomFile[ClassConstructorDescriptorImpl]

'xmlFile' @ [48:42] ==> value-parameter xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>[ValueParameterDescriptorImpl]

'?:' @ [48:51] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: MavenDomProjectModel?, right: MavenDomProjectModel): MavenDomProjectModel[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> MavenDomProjectModel

'getMavenDomProjectModel' @ [48:64] ==> @Nullable public open fun getMavenDomProjectModel(@NotNull p0: Project, @NotNull p1: VirtualFile): MavenDomProjectModel? defined in org.jetbrains.idea.maven.dom.MavenDomUtil[JavaMethodDescriptor]

'xmlFile' @ [48:88] ==> value-parameter xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>[ValueParameterDescriptorImpl]

'project' @ [48:96] ==> public final val XmlFile.project: Project[MyPropertyDescriptor]

'xmlFile' @ [48:105] ==> value-parameter xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>[ValueParameterDescriptorImpl]

'virtualFile' @ [48:113] ==> public final val XmlFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'IllegalStateException' @ [48:135] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'xmlFile' @ [48:187] ==> value-parameter xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>[ValueParameterDescriptorImpl]

'name' @ [48:195] ==> public final var XmlFile.name: String[MyPropertyDescriptor]

'HashMap' @ [50:31] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> XmlTag

'xmlFile' @ [56:9] ==> public final val xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'document' @ [56:17] ==> public final val XmlFile.document: XmlDocument?[MyPropertyDescriptor]

'accept' @ [56:27] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.xml.XmlDocument[JavaMethodDescriptor]

'PsiElementVisitor' @ [56:43] ==> public constructor PsiElementVisitor() defined in com.intellij.psi.PsiElementVisitor[JavaClassConstructorDescriptor]

'super' @ [58:17] ==> <this> defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [58:23] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiElementVisitor[JavaMethodDescriptor]

'element' @ [58:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'if (element is XmlTag && element.localName in recommendedElementsOrder && element.parent === projectElement) {
                    nodesByName[element.localName] = element
                }
                else if (element is XmlTag && element.localName == "project") {
                    projectElement = element
                    element.acceptChildren(this)
                }
                else {
                    element.acceptChildren(this)
                }' @ [60:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [60:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'element' @ [60:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'localName' @ [60:50] ==> public final val XmlTag.localName: String[MyPropertyDescriptor]

'recommendedElementsOrder' @ [60:63] ==> public final val recommendedElementsOrder: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[PropertyDescriptorImpl]

'element' @ [60:91] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'parent' @ [60:99] ==> public final val XmlTag.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'projectElement' @ [60:110] ==> var projectElement: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>[LocalVariableDescriptor]

'nodesByName' @ [61:21] ==> private final val nodesByName: HashMap<String, XmlTag> defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'element' @ [61:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'localName' @ [61:41] ==> public final val XmlTag.localName: String[MyPropertyDescriptor]

'element' @ [61:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'if (element is XmlTag && element.localName == "project") {
                    projectElement = element
                    element.acceptChildren(this)
                }
                else {
                    element.acceptChildren(this)
                }' @ [63:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [63:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'element' @ [63:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'localName' @ [63:55] ==> public final val XmlTag.localName: String[MyPropertyDescriptor]

'projectElement' @ [64:21] ==> var projectElement: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>[LocalVariableDescriptor]

'element' @ [64:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'element' @ [65:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [65:29] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'this' @ [65:44] ==> <this> defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>[LazyClassReceiverParameterDescriptor]

'element' @ [68:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [68:29] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'this' @ [68:44] ==> <this> defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>.<no name provided>[LazyClassReceiverParameterDescriptor]

'require' @ [73:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'projectElement' @ [73:17] ==> var projectElement: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>[LocalVariableDescriptor]

'this' @ [74:9] ==> <this> defined in org.jetbrains.kotlin.idea.maven.PomFile[LazyClassReceiverParameterDescriptor]

'projectElement' @ [74:14] ==> private final val projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'projectElement' @ [74:31] ==> var projectElement: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.<init>[LocalVariableDescriptor]

'ensureElement' @ [78:26] ==> private final fun ensureElement(projectElement: XmlTag, localName: String): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'projectElement' @ [78:40] ==> private final val projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'properties' @ [79:24] ==> val properties: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[LocalVariableDescriptor]

'children' @ [79:35] ==> public final val XmlTag.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [79:44] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<XmlTag> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> XmlTag

'filter' @ [79:71] ==> public inline fun <T> Iterable<XmlTag>.filter(predicate: (XmlTag) -> Boolean): List<XmlTag> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XmlTag

'it' @ [79:80] ==> value-parameter it: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty.<anonymous>[ValueParameterDescriptorImpl]

'localName' @ [79:83] ==> public final val XmlTag.localName: String[MyPropertyDescriptor]

'name' @ [79:96] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[ValueParameterDescriptorImpl]

'if (existing.isNotEmpty()) {
            for (tag in existing) {
                val textNode = tag.children.filterIsInstance<XmlText>().firstOrNull()
                if (textNode != null) {
                    textNode.value = value
                }
                else {
                    tag.replace(projectElement.createChildTag(name, value))
                }
            }
        }
        else {
            properties.add(projectElement.createChildTag(name, value))
        }' @ [81:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'existing' @ [81:13] ==> val existing: List<XmlTag> defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[LocalVariableDescriptor]

'isNotEmpty' @ [81:22] ==> @InlineOnly public inline fun <T> Collection<XmlTag>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XmlTag

'existing' @ [82:25] ==> val existing: List<XmlTag> defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[LocalVariableDescriptor]

'tag' @ [83:32] ==> val tag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[LocalVariableDescriptor]

'children' @ [83:36] ==> public final val XmlTag.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [83:45] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<XmlText> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> XmlText

'firstOrNull' @ [83:73] ==> public fun <T> List<XmlText>.firstOrNull(): XmlText? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XmlText

'if (textNode != null) {
                    textNode.value = value
                }
                else {
                    tag.replace(projectElement.createChildTag(name, value))
                }' @ [84:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'textNode' @ [84:21] ==> val textNode: XmlText? defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[LocalVariableDescriptor]

'textNode' @ [85:21] ==> val textNode: XmlText? defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[LocalVariableDescriptor]

'value' @ [85:30] ==> public final var XmlText.value: (String..String?)[MyPropertyDescriptor]

'value' @ [85:38] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[ValueParameterDescriptorImpl]

'tag' @ [88:21] ==> val tag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[LocalVariableDescriptor]

'replace' @ [88:25] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'projectElement' @ [88:33] ==> private final val projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'createChildTag' @ [88:48] ==> private final fun XmlTag.createChildTag(name: String, value: String? = ...): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'name' @ [88:63] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[ValueParameterDescriptorImpl]

'value' @ [88:69] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[ValueParameterDescriptorImpl]

'properties' @ [93:13] ==> val properties: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[LocalVariableDescriptor]

'add' @ [93:24] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'projectElement' @ [93:28] ==> private final val projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'createChildTag' @ [93:43] ==> private final fun XmlTag.createChildTag(name: String, value: String? = ...): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'name' @ [93:58] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[ValueParameterDescriptorImpl]

'value' @ [93:64] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addProperty[ValueParameterDescriptorImpl]

'nodesByName' @ [98:30] ==> private final val nodesByName: HashMap<String, XmlTag> defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'propertiesNode' @ [99:16] ==> val propertiesNode: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.findProperty[LocalVariableDescriptor]

'findFirstSubTag' @ [99:31] ==> @Nullable public abstract fun findFirstSubTag(@NonNls p0: (String..String?)): XmlTag? defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'name' @ [99:47] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.findProperty[ValueParameterDescriptorImpl]

'require' @ [103:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'systemPath' @ [103:17] ==> value-parameter systemPath: String? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'scope' @ [103:39] ==> value-parameter scope: MavenArtifactScope? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'SYSTEM' @ [103:67] ==> enum entry SYSTEM defined in org.jetbrains.idea.maven.utils.MavenArtifactScope[FakeCallableDescriptorForObject]

'require' @ [104:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'artifact' @ [104:17] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'groupId' @ [104:26] ==> public final val MavenId.groupId: String?[MyPropertyDescriptor]

'require' @ [105:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'artifact' @ [105:17] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'artifactId' @ [105:26] ==> public final val MavenId.artifactId: String?[MyPropertyDescriptor]

'ensureDependencies' @ [107:9] ==> public final fun ensureDependencies(): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'artifact' @ [108:27] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'withNoVersion' @ [108:36] ==> private final fun MavenId.withNoVersion(): MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'withoutJreSuffix' @ [108:52] ==> private final fun MavenId.withoutJreSuffix(): MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'domModel' @ [109:26] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'dependencies' @ [109:35] ==> public final val MavenDomProjectModel.dependencies: MavenDomDependencies[MyPropertyDescriptor]

'dependencies' @ [109:48] ==> public final val MavenDomDependencies.dependencies: (MutableList<(MavenDomDependency..MavenDomDependency?)>..List<(MavenDomDependency..MavenDomDependency?)>)[MyPropertyDescriptor]

'firstOrNull' @ [109:61] ==> public inline fun <T> Iterable<(MavenDomDependency..MavenDomDependency?)>.firstOrNull(predicate: ((MavenDomDependency..MavenDomDependency?)) -> Boolean): MavenDomDependency? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'it' @ [109:75] ==> value-parameter it: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [109:78] ==> private final fun MavenDomArtifactCoordinates.matches(artifact: MavenId): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'versionless' @ [109:86] ==> val versionless: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'domModel' @ [109:104] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'dependencies' @ [109:113] ==> public final val MavenDomProjectModel.dependencies: MavenDomDependencies[MyPropertyDescriptor]

'addDependency' @ [109:126] ==> public abstract fun addDependency(): (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.idea.maven.dom.model.MavenDomDependencies[JavaMethodDescriptor]

'dependency' @ [110:9] ==> val dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'groupId' @ [110:20] ==> public final val MavenDomDependency.groupId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [110:28] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [110:42] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'groupId' @ [110:51] ==> public final val MavenId.groupId: String?[MyPropertyDescriptor]

'dependency' @ [111:9] ==> val dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'artifactId' @ [111:20] ==> public final val MavenDomDependency.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [111:31] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [111:45] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'artifactId' @ [111:54] ==> public final val MavenId.artifactId: String?[MyPropertyDescriptor]

'dependency' @ [112:9] ==> val dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'version' @ [112:20] ==> public final val MavenDomDependency.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [112:28] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [112:42] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'version' @ [112:51] ==> public final val MavenId.version: String?[MyPropertyDescriptor]

'dependency' @ [113:9] ==> val dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'classifier' @ [113:20] ==> public final val MavenDomDependency.classifier: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [113:31] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'classifier' @ [113:45] ==> value-parameter classifier: String? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'scope' @ [115:13] ==> value-parameter scope: MavenArtifactScope? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'scope' @ [115:30] ==> value-parameter scope: MavenArtifactScope? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'COMPILE' @ [115:58] ==> enum entry COMPILE defined in org.jetbrains.idea.maven.utils.MavenArtifactScope[FakeCallableDescriptorForObject]

'dependency' @ [116:13] ==> val dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'scope' @ [116:24] ==> public final val MavenDomDependency.scope: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [116:30] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'scope' @ [116:44] ==> value-parameter scope: MavenArtifactScope? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'name' @ [116:50] ==> public final val name: String defined in org.jetbrains.idea.maven.utils.MavenArtifactScope[DeserializedPropertyDescriptor]

'toLowerCase' @ [116:55] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'optional' @ [119:13] ==> value-parameter optional: Boolean = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'dependency' @ [120:13] ==> val dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'optional' @ [120:24] ==> public final val MavenDomDependency.optional: GenericDomValue<(Boolean..Boolean?)>[MyPropertyDescriptor]

'value' @ [120:33] ==> public final var <T : (Any..Any?)> GenericDomValue<(Boolean..Boolean?)>.value: Boolean?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'optional' @ [120:41] ==> value-parameter optional: Boolean = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'dependency' @ [123:9] ==> val dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'systemPath' @ [123:20] ==> public final val MavenDomDependency.systemPath: GenericDomValue<(PsiFile..PsiFile?)>[MyPropertyDescriptor]

'stringValue' @ [123:31] ==> public final var <T : (Any..Any?)> GenericDomValue<(PsiFile..PsiFile?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiFile..com.intellij.psi.PsiFile?)

'systemPath' @ [123:45] ==> value-parameter systemPath: String? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[ValueParameterDescriptorImpl]

'dependency' @ [124:9] ==> val dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'ensureTagExists' @ [124:20] ==> public abstract fun ensureTagExists(): (XmlTag..XmlTag?) defined in org.jetbrains.idea.maven.dom.model.MavenDomDependency[JavaMethodDescriptor]

'dependency' @ [126:16] ==> val dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addDependency[LocalVariableDescriptor]

'addPlugin' @ [129:45] ==> public final fun addPlugin(artifact: MavenId): MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'kotlinPluginId' @ [129:55] ==> public fun kotlinPluginId(version: String?): MavenId defined in org.jetbrains.kotlin.idea.maven in file PomFile.kt[SimpleFunctionDescriptorImpl]

'version' @ [129:70] ==> value-parameter version: String? defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinPlugin[ValueParameterDescriptorImpl]

'ensureBuild' @ [132:9] ==> public final fun ensureBuild(): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'artifact' @ [134:29] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[ValueParameterDescriptorImpl]

'withNoVersion' @ [134:38] ==> private final fun MavenId.withNoVersion(): MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'findPlugin' @ [135:22] ==> public final fun findPlugin(groupArtifact: MavenId): MavenDomPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'groupArtifact' @ [135:33] ==> val groupArtifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[LocalVariableDescriptor]

'domModel' @ [135:51] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'build' @ [135:60] ==> public final val MavenDomProjectModel.build: MavenDomBuild[MyPropertyDescriptor]

'plugins' @ [135:66] ==> public final val MavenDomBuild.plugins: MavenDomPlugins[MyPropertyDescriptor]

'addPlugin' @ [135:74] ==> public abstract fun addPlugin(): (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.idea.maven.dom.model.MavenDomPlugins[JavaMethodDescriptor]

'plugin' @ [136:9] ==> val plugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[LocalVariableDescriptor]

'groupId' @ [136:16] ==> public final val MavenDomPlugin.groupId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [136:24] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [136:38] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[ValueParameterDescriptorImpl]

'groupId' @ [136:47] ==> public final val MavenId.groupId: String?[MyPropertyDescriptor]

'plugin' @ [137:9] ==> val plugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[LocalVariableDescriptor]

'artifactId' @ [137:16] ==> public final val MavenDomPlugin.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [137:27] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [137:41] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[ValueParameterDescriptorImpl]

'artifactId' @ [137:50] ==> public final val MavenId.artifactId: String?[MyPropertyDescriptor]

'artifact' @ [138:13] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[ValueParameterDescriptorImpl]

'version' @ [138:22] ==> public final val MavenId.version: String?[MyPropertyDescriptor]

'plugin' @ [139:13] ==> val plugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[LocalVariableDescriptor]

'version' @ [139:20] ==> public final val MavenDomPlugin.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [139:28] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [139:42] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[ValueParameterDescriptorImpl]

'version' @ [139:51] ==> public final val MavenId.version: String?[MyPropertyDescriptor]

'plugin' @ [141:9] ==> val plugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[LocalVariableDescriptor]

'ensureTagExists' @ [141:16] ==> public abstract fun ensureTagExists(): (XmlTag..XmlTag?) defined in org.jetbrains.idea.maven.dom.model.MavenDomPlugin[JavaMethodDescriptor]

'plugin' @ [143:16] ==> val plugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addPlugin[LocalVariableDescriptor]

'domModel' @ [146:46] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'build' @ [146:55] ==> public final val MavenDomProjectModel.build: MavenDomBuild[MyPropertyDescriptor]

'plugins' @ [146:61] ==> public final val MavenDomBuild.plugins: MavenDomPlugins[MyPropertyDescriptor]

'plugins' @ [146:69] ==> public final val MavenDomPlugins.plugins: (MutableList<(MavenDomPlugin..MavenDomPlugin?)>..List<(MavenDomPlugin..MavenDomPlugin?)>)[MyPropertyDescriptor]

'firstOrNull' @ [146:77] ==> public inline fun <T> Iterable<(MavenDomPlugin..MavenDomPlugin?)>.firstOrNull(predicate: ((MavenDomPlugin..MavenDomPlugin?)) -> Boolean): MavenDomPlugin? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPlugin..org.jetbrains.idea.maven.dom.model.MavenDomPlugin?)

'it' @ [146:91] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.findPlugin.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [146:94] ==> private final fun MavenDomArtifactCoordinates.matches(artifact: MavenId): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'groupArtifact' @ [146:102] ==> value-parameter groupArtifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.findPlugin[ValueParameterDescriptorImpl]

'require' @ [149:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'plugin' @ [149:17] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[ValueParameterDescriptorImpl]

'parent' @ [149:24] ==> public final val MavenDomPlugin.parent: (DomElement..DomElement?)[MyPropertyDescriptor]

'referencePlugin' @ [149:35] ==> value-parameter referencePlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[ValueParameterDescriptorImpl]

'parent' @ [149:51] ==> public final val MavenDomPlugin.parent: (DomElement..DomElement?)[MyPropertyDescriptor]

'require' @ [150:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'plugin' @ [150:17] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[ValueParameterDescriptorImpl]

'referencePlugin' @ [150:28] ==> value-parameter referencePlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[ValueParameterDescriptorImpl]

'referencePlugin' @ [152:32] ==> value-parameter referencePlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[ValueParameterDescriptorImpl]

'xmlElement' @ [152:48] ==> public final val MavenDomPlugin.xmlElement: XmlElement?[MyPropertyDescriptor]

'plugin' @ [153:29] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[ValueParameterDescriptorImpl]

'xmlElement' @ [153:36] ==> public final val MavenDomPlugin.xmlElement: XmlElement?[MyPropertyDescriptor]

'e' @ [155:16] ==> var e: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[LocalVariableDescriptor]

'referenceElement' @ [155:22] ==> val referenceElement: XmlElement defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[LocalVariableDescriptor]

'e' @ [156:24] ==> var e: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[LocalVariableDescriptor]

'prevSibling' @ [156:26] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'e' @ [157:13] ==> var e: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[LocalVariableDescriptor]

'prev' @ [157:17] ==> val prev: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginAfter[LocalVariableDescriptor]

'!' @ [164:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPluginAfter' @ [164:14] ==> public final fun isPluginAfter(plugin: MavenDomPlugin, referencePlugin: MavenDomPlugin): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'plugin' @ [164:28] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter[ValueParameterDescriptorImpl]

'referencePlugin' @ [164:36] ==> value-parameter referencePlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter[ValueParameterDescriptorImpl]

'referencePlugin' @ [166:36] ==> value-parameter referencePlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter[ValueParameterDescriptorImpl]

'xmlElement' @ [166:52] ==> public final val MavenDomPlugin.xmlElement: XmlElement?[MyPropertyDescriptor]

'referenceElement' @ [167:30] ==> val referenceElement: XmlElement defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter[LocalVariableDescriptor]

'parent' @ [167:47] ==> public final val XmlElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [167:54] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'plugin' @ [167:63] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter[ValueParameterDescriptorImpl]

'xmlElement' @ [167:70] ==> public final val MavenDomPlugin.xmlElement: XmlElement?[MyPropertyDescriptor]

'referenceElement' @ [167:84] ==> val referenceElement: XmlElement defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter[LocalVariableDescriptor]

'plugin' @ [168:13] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter[ValueParameterDescriptorImpl]

'xmlTag' @ [168:20] ==> public final val MavenDomPlugin.xmlTag: (XmlTag..XmlTag?)[MyPropertyDescriptor]

'delete' @ [168:27] ==> public abstract fun delete(): Unit defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'domModel' @ [170:20] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'build' @ [170:29] ==> public final val MavenDomProjectModel.build: MavenDomBuild[MyPropertyDescriptor]

'plugins' @ [170:35] ==> public final val MavenDomBuild.plugins: MavenDomPlugins[MyPropertyDescriptor]

'plugins' @ [170:43] ==> public final val MavenDomPlugins.plugins: (MutableList<(MavenDomPlugin..MavenDomPlugin?)>..List<(MavenDomPlugin..MavenDomPlugin?)>)[MyPropertyDescriptor]

'single' @ [170:51] ==> public inline fun <T> Iterable<(MavenDomPlugin..MavenDomPlugin?)>.single(predicate: ((MavenDomPlugin..MavenDomPlugin?)) -> Boolean): (MavenDomPlugin..MavenDomPlugin?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPlugin..org.jetbrains.idea.maven.dom.model.MavenDomPlugin?)

'it' @ [170:60] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter.<anonymous>[ValueParameterDescriptorImpl]

'xmlElement' @ [170:63] ==> public final val MavenDomPlugin.xmlElement: XmlElement?[MyPropertyDescriptor]

'newElement' @ [170:77] ==> val newElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter[LocalVariableDescriptor]

'plugin' @ [173:16] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.ensurePluginAfter[ValueParameterDescriptorImpl]

'domModel' @ [176:31] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'build' @ [176:40] ==> public final val MavenDomProjectModel.build: MavenDomBuild[MyPropertyDescriptor]

'plugins' @ [176:46] ==> public final val MavenDomBuild.plugins: MavenDomPlugins[MyPropertyDescriptor]

'plugins' @ [176:54] ==> public final val MavenDomPlugins.plugins: (MutableList<(MavenDomPlugin..MavenDomPlugin?)>..List<(MavenDomPlugin..MavenDomPlugin?)>)[MyPropertyDescriptor]

'filter' @ [176:62] ==> public inline fun <T> Iterable<(MavenDomPlugin..MavenDomPlugin?)>.filter(predicate: ((MavenDomPlugin..MavenDomPlugin?)) -> Boolean): List<(MavenDomPlugin..MavenDomPlugin?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPlugin..org.jetbrains.idea.maven.dom.model.MavenDomPlugin?)

'it' @ [176:71] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.findKotlinPlugins.<anonymous>[ValueParameterDescriptorImpl]

'isKotlinMavenPlugin' @ [176:74] ==> private final fun MavenDomPlugin.isKotlinMavenPlugin(): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'findKotlinExecutions' @ [177:54] ==> public final fun findKotlinExecutions(): List<(MavenDomPluginExecution..MavenDomPluginExecution?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'filter' @ [177:77] ==> public inline fun <T> Iterable<(MavenDomPluginExecution..MavenDomPluginExecution?)>.filter(predicate: ((MavenDomPluginExecution..MavenDomPluginExecution?)) -> Boolean): List<(MavenDomPluginExecution..MavenDomPluginExecution?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution..org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution?)

'it' @ [177:86] ==> value-parameter it: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.findKotlinExecutions.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [177:89] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'goals' @ [177:95] ==> public final val MavenDomGoals.goals: (MutableList<(MavenDomGoal..MavenDomGoal?)>..List<(MavenDomGoal..MavenDomGoal?)>?)[MyPropertyDescriptor]

'any' @ [177:101] ==> public inline fun <T> Iterable<(MavenDomGoal..MavenDomGoal?)>.any(predicate: ((MavenDomGoal..MavenDomGoal?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomGoal..org.jetbrains.idea.maven.dom.model.MavenDomGoal?)

'it' @ [177:107] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.PomFile.findKotlinExecutions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rawText' @ [177:110] ==> public final val MavenDomGoal.rawText: (String..String?)[MyPropertyDescriptor]

'goals' @ [177:121] ==> value-parameter vararg goals: String defined in org.jetbrains.kotlin.idea.maven.PomFile.findKotlinExecutions[ValueParameterDescriptorImpl]

'findKotlinPlugins' @ [178:34] ==> public final fun findKotlinPlugins(): List<(MavenDomPlugin..MavenDomPlugin?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'flatMap' @ [178:54] ==> public inline fun <T, R> Iterable<(MavenDomPlugin..MavenDomPlugin?)>.flatMap(transform: ((MavenDomPlugin..MavenDomPlugin?)) -> Iterable<(MavenDomPluginExecution..MavenDomPluginExecution?)>): List<(MavenDomPluginExecution..MavenDomPluginExecution?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPlugin..org.jetbrains.idea.maven.dom.model.MavenDomPlugin?)
    <R> -> (org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution..org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution?)

'it' @ [178:64] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.findKotlinExecutions.<anonymous>[ValueParameterDescriptorImpl]

'executions' @ [178:67] ==> public final val MavenDomPlugin.executions: MavenDomExecutions[MyPropertyDescriptor]

'executions' @ [178:78] ==> public final val MavenDomExecutions.executions: (MutableList<(MavenDomPluginExecution..MavenDomPluginExecution?)>..List<(MavenDomPluginExecution..MavenDomPluginExecution?)>)[MyPropertyDescriptor]

'plugin' @ [180:50] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.findExecutions[ValueParameterDescriptorImpl]

'executions' @ [180:57] ==> public final val MavenDomPlugin.executions: MavenDomExecutions[MyPropertyDescriptor]

'executions' @ [180:68] ==> public final val MavenDomExecutions.executions: (MutableList<(MavenDomPluginExecution..MavenDomPluginExecution?)>..List<(MavenDomPluginExecution..MavenDomPluginExecution?)>)[MyPropertyDescriptor]

'findExecutions' @ [181:72] ==> public final fun findExecutions(plugin: MavenDomPlugin): (MutableList<(MavenDomPluginExecution..MavenDomPluginExecution?)>..List<(MavenDomPluginExecution..MavenDomPluginExecution?)>) defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'plugin' @ [181:87] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.findExecutions[ValueParameterDescriptorImpl]

'filter' @ [181:95] ==> public inline fun <T> Iterable<(MavenDomPluginExecution..MavenDomPluginExecution?)>.filter(predicate: ((MavenDomPluginExecution..MavenDomPluginExecution?)) -> Boolean): List<(MavenDomPluginExecution..MavenDomPluginExecution?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution..org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution?)

'it' @ [181:104] ==> value-parameter it: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.findExecutions.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [181:107] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'goals' @ [181:113] ==> public final val MavenDomGoals.goals: (MutableList<(MavenDomGoal..MavenDomGoal?)>..List<(MavenDomGoal..MavenDomGoal?)>?)[MyPropertyDescriptor]

'any' @ [181:119] ==> public inline fun <T> Iterable<(MavenDomGoal..MavenDomGoal?)>.any(predicate: ((MavenDomGoal..MavenDomGoal?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomGoal..org.jetbrains.idea.maven.dom.model.MavenDomGoal?)

'it' @ [181:125] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.PomFile.findExecutions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rawText' @ [181:128] ==> public final val MavenDomGoal.rawText: (String..String?)[MyPropertyDescriptor]

'goals' @ [181:139] ==> value-parameter vararg goals: String defined in org.jetbrains.kotlin.idea.maven.PomFile.findExecutions[ValueParameterDescriptorImpl]

'require' @ [184:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'executionId' @ [184:17] ==> value-parameter executionId: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[ValueParameterDescriptorImpl]

'isNotEmpty' @ [184:29] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'require' @ [185:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'phase' @ [185:17] ==> value-parameter phase: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[ValueParameterDescriptorImpl]

'isNotEmpty' @ [185:23] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'plugin' @ [187:25] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[ValueParameterDescriptorImpl]

'executions' @ [187:32] ==> public final val MavenDomPlugin.executions: MavenDomExecutions[MyPropertyDescriptor]

'executions' @ [187:43] ==> public final val MavenDomExecutions.executions: (MutableList<(MavenDomPluginExecution..MavenDomPluginExecution?)>..List<(MavenDomPluginExecution..MavenDomPluginExecution?)>)[MyPropertyDescriptor]

'firstOrNull' @ [187:54] ==> public inline fun <T> Iterable<(MavenDomPluginExecution..MavenDomPluginExecution?)>.firstOrNull(predicate: ((MavenDomPluginExecution..MavenDomPluginExecution?)) -> Boolean): MavenDomPluginExecution? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution..org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution?)

'it' @ [187:68] ==> value-parameter it: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [187:71] ==> public final val MavenDomPluginExecution.id: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [187:74] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'executionId' @ [187:89] ==> value-parameter executionId: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[ValueParameterDescriptorImpl]

'plugin' @ [187:106] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[ValueParameterDescriptorImpl]

'executions' @ [187:113] ==> public final val MavenDomPlugin.executions: MavenDomExecutions[MyPropertyDescriptor]

'addExecution' @ [187:124] ==> public abstract fun addExecution(): (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.idea.maven.dom.model.MavenDomExecutions[JavaMethodDescriptor]

'execution' @ [188:9] ==> val execution: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[LocalVariableDescriptor]

'id' @ [188:19] ==> public final val MavenDomPluginExecution.id: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [188:22] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'executionId' @ [188:36] ==> value-parameter executionId: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[ValueParameterDescriptorImpl]

'execution' @ [189:9] ==> val execution: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[LocalVariableDescriptor]

'phase' @ [189:19] ==> public final val MavenDomPluginExecution.phase: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [189:25] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'phase' @ [189:39] ==> value-parameter phase: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[ValueParameterDescriptorImpl]

'execution' @ [191:29] ==> val execution: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[LocalVariableDescriptor]

'goals' @ [191:39] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'goals' @ [191:45] ==> public final val MavenDomGoals.goals: (MutableList<(MavenDomGoal..MavenDomGoal?)>..List<(MavenDomGoal..MavenDomGoal?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [191:51] ==> public inline fun <T, R : Any> Iterable<(MavenDomGoal..MavenDomGoal?)>.mapNotNull(transform: ((MavenDomGoal..MavenDomGoal?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomGoal..org.jetbrains.idea.maven.dom.model.MavenDomGoal?)
    <R : Any> -> String

'it' @ [191:64] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution.<anonymous>[ValueParameterDescriptorImpl]

'rawText' @ [191:67] ==> public final val MavenDomGoal.rawText: (String..String?)[MyPropertyDescriptor]

'goals' @ [192:22] ==> value-parameter goals: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[ValueParameterDescriptorImpl]

'filter' @ [192:28] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [192:37] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution.<anonymous>[ValueParameterDescriptorImpl]

'existingGoals' @ [192:44] ==> val existingGoals: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[LocalVariableDescriptor]

'execution' @ [193:27] ==> val execution: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[LocalVariableDescriptor]

'goals' @ [193:37] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'ensureTagExists' @ [193:43] ==> public abstract fun ensureTagExists(): (XmlTag..XmlTag?) defined in org.jetbrains.idea.maven.dom.model.MavenDomGoals[JavaMethodDescriptor]

'createChildTag' @ [193:61] ==> private final fun XmlTag.createChildTag(name: String, value: String? = ...): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'goal' @ [193:84] ==> val goal: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[LocalVariableDescriptor]

'execution' @ [194:13] ==> val execution: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[LocalVariableDescriptor]

'goals' @ [194:23] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'xmlTag' @ [194:29] ==> public final val MavenDomGoals.xmlTag: (XmlTag..XmlTag?)[MyPropertyDescriptor]

'add' @ [194:36] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'goalTag' @ [194:40] ==> val goalTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[LocalVariableDescriptor]

'execution' @ [197:16] ==> val execution: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addExecution[LocalVariableDescriptor]

'addExecution' @ [201:25] ==> public final fun addExecution(plugin: MavenDomPlugin, executionId: String, phase: String, goals: List<String>): MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'plugin' @ [201:38] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution[ValueParameterDescriptorImpl]

'executionId' @ [201:46] ==> value-parameter executionId: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution[ValueParameterDescriptorImpl]

'phase' @ [201:59] ==> value-parameter phase: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution[ValueParameterDescriptorImpl]

'goals' @ [201:66] ==> value-parameter goals: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution[ValueParameterDescriptorImpl]

'getInstance' @ [203:44] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [203:56] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution[ValueParameterDescriptorImpl]

'contentEntries' @ [204:18] ==> public final val ModuleRootManager.contentEntries: (Array<(ContentEntry..ContentEntry?)>..Array<out (ContentEntry..ContentEntry?)>)[MyPropertyDescriptor]

'flatMap' @ [205:18] ==> public inline fun <T, R> Array<out (ContentEntry..ContentEntry?)>.flatMap(transform: ((ContentEntry..ContentEntry?)) -> Iterable<(SourceFolder..SourceFolder?)>): List<(SourceFolder..SourceFolder?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.ContentEntry..com.intellij.openapi.roots.ContentEntry?)
    <R> -> (com.intellij.openapi.roots.SourceFolder..com.intellij.openapi.roots.SourceFolder?)

'it' @ [205:28] ==> value-parameter it: (ContentEntry..ContentEntry?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution.<anonymous>[ValueParameterDescriptorImpl]

'sourceFolders' @ [205:31] ==> public final val ContentEntry.sourceFolders: (Array<(SourceFolder..SourceFolder?)>..Array<out (SourceFolder..SourceFolder?)>)[MyPropertyDescriptor]

'filter' @ [205:45] ==> public inline fun <T> Array<out (SourceFolder..SourceFolder?)>.filter(predicate: ((SourceFolder..SourceFolder?)) -> Boolean): List<(SourceFolder..SourceFolder?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.SourceFolder..com.intellij.openapi.roots.SourceFolder?)

'it' @ [205:54] ==> value-parameter it: (SourceFolder..SourceFolder?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isRelatedSourceRoot' @ [205:57] ==> private final fun SourceFolder.isRelatedSourceRoot(isTest: Boolean): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'isTest' @ [205:77] ==> value-parameter isTest: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution[ValueParameterDescriptorImpl]

'mapNotNull' @ [206:18] ==> public inline fun <T, R : Any> Iterable<(SourceFolder..SourceFolder?)>.mapNotNull(transform: ((SourceFolder..SourceFolder?)) -> VirtualFile?): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.SourceFolder..com.intellij.openapi.roots.SourceFolder?)
    <R : Any> -> VirtualFile

'it' @ [206:31] ==> value-parameter it: (SourceFolder..SourceFolder?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [206:34] ==> public final val SourceFolder.file: VirtualFile?[MyPropertyDescriptor]

'mapNotNull' @ [207:18] ==> public inline fun <T, R : Any> Iterable<VirtualFile>.mapNotNull(transform: (VirtualFile) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R : Any> -> String

'getRelativePath' @ [207:43] ==> @Nullable public open fun getRelativePath(@NotNull p0: VirtualFile, @NotNull p1: VirtualFile, p2: Char): String? defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'it' @ [207:59] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution.<anonymous>[ValueParameterDescriptorImpl]

'xmlFile' @ [207:63] ==> public final val xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'virtualFile' @ [207:71] ==> public final val XmlFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'parent' @ [207:83] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'executionSourceDirs' @ [209:9] ==> public final fun executionSourceDirs(execution: MavenDomPluginExecution, sourceDirs: List<String>, forceSingleSource: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'execution' @ [209:29] ==> val execution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution[LocalVariableDescriptor]

'sourceDirs' @ [209:40] ==> val sourceDirs: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.addKotlinExecution[LocalVariableDescriptor]

'plugin' @ [212:101] ==> value-parameter plugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginExecutionMissing[ValueParameterDescriptorImpl]

'plugin' @ [212:119] ==> value-parameter plugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginExecutionMissing[ValueParameterDescriptorImpl]

'executions' @ [212:126] ==> public final val MavenPlugin.executions: (MutableList<(MavenPlugin.Execution..MavenPlugin.Execution?)>..List<(MavenPlugin.Execution..MavenPlugin.Execution?)>?)[MyPropertyDescriptor]

'none' @ [212:137] ==> public inline fun <T> Iterable<(MavenPlugin.Execution..MavenPlugin.Execution?)>.none(predicate: ((MavenPlugin.Execution..MavenPlugin.Execution?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?)

'it' @ [212:144] ==> value-parameter it: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginExecutionMissing.<anonymous>[ValueParameterDescriptorImpl]

'executionId' @ [212:147] ==> public final val MavenPlugin.Execution.executionId: (String..String?)[MyPropertyDescriptor]

'excludedExecutionId' @ [212:162] ==> value-parameter excludedExecutionId: String defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginExecutionMissing[ValueParameterDescriptorImpl]

'goal' @ [212:185] ==> value-parameter goal: String defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginExecutionMissing[ValueParameterDescriptorImpl]

'it' @ [212:193] ==> value-parameter it: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isPluginExecutionMissing.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [212:196] ==> public final val MavenPlugin.Execution.goals: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'ensurePluginAfter' @ [215:27] ==> public final fun ensurePluginAfter(plugin: MavenDomPlugin, referencePlugin: MavenDomPlugin): MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'addPlugin' @ [215:45] ==> public final fun addPlugin(artifact: MavenId): MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'MavenId' @ [215:55] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'kotlinPlugin' @ [215:124] ==> value-parameter kotlinPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[ValueParameterDescriptorImpl]

'!!' @ [217:23] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: MavenProject?): MavenProject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> MavenProject

'getInstance' @ [217:44] ==> public open fun getInstance(p0: (Project..Project?)): (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [217:56] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[ValueParameterDescriptorImpl]

'project' @ [217:63] ==> public final val Module.project: Project[MyPropertyDescriptor]

'findProject' @ [217:72] ==> @Nullable public open fun findProject(@NotNull p0: Module): MavenProject? defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [217:84] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[ValueParameterDescriptorImpl]

'project' @ [218:22] ==> val project: MavenProject defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[LocalVariableDescriptor]

'findPlugin' @ [218:30] ==> @Nullable public open fun findPlugin(@Nullable p0: String?, @Nullable p1: String?): MavenPlugin? defined in org.jetbrains.idea.maven.project.MavenProject[JavaMethodDescriptor]

'isExecutionEnabled' @ [220:13] ==> public final fun isExecutionEnabled(plugin: MavenPlugin?, executionId: String): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'plugin' @ [220:32] ==> val plugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[LocalVariableDescriptor]

'addExecution' @ [221:13] ==> public final fun addExecution(plugin: MavenDomPlugin, executionId: String, phase: String, goals: List<String>): MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'javacPlugin' @ [221:26] ==> val javacPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[LocalVariableDescriptor]

'emptyList' @ [221:66] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'isExecutionEnabled' @ [224:13] ==> public final fun isExecutionEnabled(plugin: MavenPlugin?, executionId: String): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'plugin' @ [224:32] ==> val plugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[LocalVariableDescriptor]

'addExecution' @ [225:13] ==> public final fun addExecution(plugin: MavenDomPlugin, executionId: String, phase: String, goals: List<String>): MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'javacPlugin' @ [225:26] ==> val javacPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[LocalVariableDescriptor]

'emptyList' @ [225:70] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'isPluginExecutionMissing' @ [228:13] ==> public final fun isPluginExecutionMissing(plugin: MavenPlugin?, excludedExecutionId: String, goal: String): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'plugin' @ [228:38] ==> val plugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[LocalVariableDescriptor]

'addExecution' @ [229:13] ==> public final fun addExecution(plugin: MavenDomPlugin, executionId: String, phase: String, goals: List<String>): MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'javacPlugin' @ [229:26] ==> val javacPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[LocalVariableDescriptor]

'Compile' @ [229:72] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'listOf' @ [229:81] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'isPluginExecutionMissing' @ [232:13] ==> public final fun isPluginExecutionMissing(plugin: MavenPlugin?, excludedExecutionId: String, goal: String): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'plugin' @ [232:38] ==> val plugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[LocalVariableDescriptor]

'addExecution' @ [233:13] ==> public final fun addExecution(plugin: MavenDomPlugin, executionId: String, phase: String, goals: List<String>): MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'javacPlugin' @ [233:26] ==> val javacPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.addJavacExecutions[LocalVariableDescriptor]

'TestCompile' @ [233:76] ==> public final val TestCompile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'listOf' @ [233:89] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'plugin' @ [238:13] ==> value-parameter plugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled[ValueParameterDescriptorImpl]

'domModel' @ [242:13] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'build' @ [242:22] ==> public final val MavenDomProjectModel.build: MavenDomBuild[MyPropertyDescriptor]

'plugins' @ [242:28] ==> public final val MavenDomBuild.plugins: MavenDomPlugins[MyPropertyDescriptor]

'plugins' @ [242:36] ==> public final val MavenDomPlugins.plugins: (MutableList<(MavenDomPlugin..MavenDomPlugin?)>..List<(MavenDomPlugin..MavenDomPlugin?)>)[MyPropertyDescriptor]

'any' @ [242:44] ==> public inline fun <T> Iterable<(MavenDomPlugin..MavenDomPlugin?)>.any(predicate: ((MavenDomPlugin..MavenDomPlugin?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPlugin..org.jetbrains.idea.maven.dom.model.MavenDomPlugin?)

'it' @ [243:13] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>[ValueParameterDescriptorImpl]

'groupId' @ [243:16] ==> public final val MavenDomPlugin.groupId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [243:24] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'it' @ [244:16] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [244:19] ==> public final val MavenDomPlugin.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [244:30] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'it' @ [245:16] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>[ValueParameterDescriptorImpl]

'executions' @ [245:19] ==> public final val MavenDomPlugin.executions: MavenDomExecutions[MyPropertyDescriptor]

'executions' @ [245:30] ==> public final val MavenDomExecutions.executions: (MutableList<(MavenDomPluginExecution..MavenDomPluginExecution?)>..List<(MavenDomPluginExecution..MavenDomPluginExecution?)>)[MyPropertyDescriptor]

'any' @ [245:41] ==> public inline fun <T> Iterable<(MavenDomPluginExecution..MavenDomPluginExecution?)>.any(predicate: ((MavenDomPluginExecution..MavenDomPluginExecution?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution..org.jetbrains.idea.maven.dom.model.MavenDomPluginExecution?)

'it' @ [245:47] ==> value-parameter it: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [245:50] ==> public final val MavenDomPluginExecution.id: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [245:53] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'executionId' @ [245:68] ==> value-parameter executionId: String defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled[ValueParameterDescriptorImpl]

'it' @ [245:83] ==> value-parameter it: (MavenDomPluginExecution..MavenDomPluginExecution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'phase' @ [245:86] ==> public final val MavenDomPluginExecution.phase: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [245:92] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'None' @ [245:121] ==> public final val None: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'plugin' @ [251:16] ==> value-parameter plugin: MavenPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled[ValueParameterDescriptorImpl]

'executions' @ [251:23] ==> public final val MavenPlugin.executions: (MutableList<(MavenPlugin.Execution..MavenPlugin.Execution?)>..List<(MavenPlugin.Execution..MavenPlugin.Execution?)>?)[MyPropertyDescriptor]

'filter' @ [251:34] ==> public inline fun <T> Iterable<(MavenPlugin.Execution..MavenPlugin.Execution?)>.filter(predicate: ((MavenPlugin.Execution..MavenPlugin.Execution?)) -> Boolean): List<(MavenPlugin.Execution..MavenPlugin.Execution?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?)

'it' @ [251:43] ==> value-parameter it: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>[ValueParameterDescriptorImpl]

'executionId' @ [251:46] ==> public final val MavenPlugin.Execution.executionId: (String..String?)[MyPropertyDescriptor]

'executionId' @ [251:61] ==> value-parameter executionId: String defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled[ValueParameterDescriptorImpl]

'all' @ [251:75] ==> public inline fun <T> Iterable<(MavenPlugin.Execution..MavenPlugin.Execution?)>.all(predicate: ((MavenPlugin.Execution..MavenPlugin.Execution?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?)

'execution' @ [252:13] ==> value-parameter execution: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [252:30] ==> public val <T> KClass<out (MavenPlugin.Execution..MavenPlugin.Execution?)>.java: Class<out (MavenPlugin.Execution..MavenPlugin.Execution?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?))

'methods' @ [252:35] ==> public final val <T : (Any..Any?)> Class<out (MavenPlugin.Execution..MavenPlugin.Execution?)>.methods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?))

'filter' @ [252:43] ==> public inline fun <T> Array<out (Method..Method?)>.filter(predicate: ((Method..Method?)) -> Boolean): List<(Method..Method?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'it' @ [252:52] ==> value-parameter it: (Method..Method?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [252:55] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'it' @ [252:77] ==> value-parameter it: (Method..Method?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameterTypes' @ [252:80] ==> public final val Method.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]

'isEmpty' @ [252:95] ==> @InlineOnly public inline fun <T> Array<out (Class<*>..Class<*>?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.Class<*>..java.lang.Class<*>?)

'all' @ [252:107] ==> public inline fun <T> Iterable<(Method..Method?)>.all(predicate: ((Method..Method?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'it' @ [252:113] ==> value-parameter it: (Method..Method?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [252:116] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'execution' @ [252:123] ==> value-parameter execution: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isExecutionEnabled.<anonymous>[ValueParameterDescriptorImpl]

'None' @ [252:151] ==> public final val None: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'ensureBuild' @ [257:9] ==> public final fun ensureBuild(): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'execution' @ [259:22] ==> value-parameter execution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'goals' @ [259:32] ==> public final val MavenDomPluginExecution.goals: MavenDomGoals[MyPropertyDescriptor]

'goals' @ [259:38] ==> public final val MavenDomGoals.goals: (MutableList<(MavenDomGoal..MavenDomGoal?)>..List<(MavenDomGoal..MavenDomGoal?)>?)[MyPropertyDescriptor]

'any' @ [259:44] ==> public inline fun <T> Iterable<(MavenDomGoal..MavenDomGoal?)>.any(predicate: ((MavenDomGoal..MavenDomGoal?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomGoal..org.jetbrains.idea.maven.dom.model.MavenDomGoal?)

'it' @ [259:50] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs.<anonymous>[ValueParameterDescriptorImpl]

'stringValue' @ [259:53] ==> public final var MavenDomGoal.stringValue: String?[MyPropertyDescriptor]

'TestCompile' @ [259:80] ==> public final val TestCompile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'it' @ [259:95] ==> value-parameter it: (MavenDomGoal..MavenDomGoal?) defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs.<anonymous>[ValueParameterDescriptorImpl]

'stringValue' @ [259:98] ==> public final var MavenDomGoal.stringValue: String?[MyPropertyDescriptor]

'TestJs' @ [259:125] ==> public final val TestJs: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'if (isTest) "test" else "main"' @ [260:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isTest' @ [260:30] ==> val isTest: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'if (isTest) {
            domModel.build.testSourceDirectory
        }
        else {
            domModel.build.sourceDirectory
        }' @ [261:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: GenericDomValue<(PathReference..PathReference?)>, elseBranch: GenericDomValue<(PathReference..PathReference?)>): GenericDomValue<(PathReference..PathReference?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> GenericDomValue<(com.intellij.openapi.paths.PathReference..com.intellij.openapi.paths.PathReference?)>

'isTest' @ [261:42] ==> val isTest: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'domModel' @ [262:13] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'build' @ [262:22] ==> public final val MavenDomProjectModel.build: MavenDomBuild[MyPropertyDescriptor]

'testSourceDirectory' @ [262:28] ==> public final val MavenDomBuild.testSourceDirectory: GenericDomValue<(PathReference..PathReference?)>[MyPropertyDescriptor]

'domModel' @ [265:13] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'build' @ [265:22] ==> public final val MavenDomProjectModel.build: MavenDomBuild[MyPropertyDescriptor]

'sourceDirectory' @ [265:28] ==> public final val MavenDomBuild.sourceDirectory: GenericDomValue<(PathReference..PathReference?)>[MyPropertyDescriptor]

'if (sourceDirs.isEmpty() || sourceDirs.singleOrNull() == "src/$defaultDir/java") {
            execution.configuration.xmlTag?.findSubTags("sourceDirs")?.forEach { it.deleteCascade() }
            singleDirectoryElement.undefine()
        }
        else if (sourceDirs.size == 1 && !forceSingleSource) {
            singleDirectoryElement.stringValue = sourceDirs.single()
            execution.configuration.xmlTag?.findSubTags("sourceDirs")?.forEach { it.deleteCascade() }
        }
        else {
            val sourceDirsTag = executionConfiguration(execution, "sourceDirs")
            val newSourceDirsTag = execution.configuration.createChildTag("sourceDirs")
            for (dir in sourceDirs) {
                newSourceDirsTag.add(newSourceDirsTag.createChildTag("source", dir))
            }
            sourceDirsTag.replace(newSourceDirsTag)
        }' @ [268:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'sourceDirs' @ [268:13] ==> value-parameter sourceDirs: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'isEmpty' @ [268:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'sourceDirs' @ [268:37] ==> value-parameter sourceDirs: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'singleOrNull' @ [268:48] ==> public fun <T> List<String>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'defaultDir' @ [268:72] ==> val defaultDir: String defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'execution' @ [269:13] ==> value-parameter execution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'configuration' @ [269:23] ==> public final val MavenDomPluginExecution.configuration: MavenDomConfiguration[MyPropertyDescriptor]

'xmlTag' @ [269:37] ==> public final val MavenDomConfiguration.xmlTag: (XmlTag..XmlTag?)[MyPropertyDescriptor]

'findSubTags' @ [269:45] ==> @NotNull public abstract fun findSubTags(@NonNls p0: (String..String?)): (Array<(XmlTag..XmlTag?)>..Array<out (XmlTag..XmlTag?)>) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'forEach' @ [269:72] ==> public inline fun <T> Array<out (XmlTag..XmlTag?)>.forEach(action: ((XmlTag..XmlTag?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.xml.XmlTag..com.intellij.psi.xml.XmlTag?)

'it' @ [269:82] ==> value-parameter it: (XmlTag..XmlTag?) defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs.<anonymous>[ValueParameterDescriptorImpl]

'deleteCascade' @ [269:85] ==> private final tailrec fun XmlTag.deleteCascade(): Unit defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'singleDirectoryElement' @ [270:13] ==> val singleDirectoryElement: GenericDomValue<(PathReference..PathReference?)> defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'undefine' @ [270:36] ==> public abstract fun undefine(): Unit defined in com.intellij.util.xml.GenericDomValue[JavaMethodDescriptor]

'if (sourceDirs.size == 1 && !forceSingleSource) {
            singleDirectoryElement.stringValue = sourceDirs.single()
            execution.configuration.xmlTag?.findSubTags("sourceDirs")?.forEach { it.deleteCascade() }
        }
        else {
            val sourceDirsTag = executionConfiguration(execution, "sourceDirs")
            val newSourceDirsTag = execution.configuration.createChildTag("sourceDirs")
            for (dir in sourceDirs) {
                newSourceDirsTag.add(newSourceDirsTag.createChildTag("source", dir))
            }
            sourceDirsTag.replace(newSourceDirsTag)
        }' @ [272:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'sourceDirs' @ [272:18] ==> value-parameter sourceDirs: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'size' @ [272:29] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'!' @ [272:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'forceSingleSource' @ [272:43] ==> value-parameter forceSingleSource: Boolean = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'singleDirectoryElement' @ [273:13] ==> val singleDirectoryElement: GenericDomValue<(PathReference..PathReference?)> defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'stringValue' @ [273:36] ==> public final var <T : (Any..Any?)> GenericDomValue<(PathReference..PathReference?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.paths.PathReference..com.intellij.openapi.paths.PathReference?)

'sourceDirs' @ [273:50] ==> value-parameter sourceDirs: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'single' @ [273:61] ==> public fun <T> List<String>.single(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'execution' @ [274:13] ==> value-parameter execution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'configuration' @ [274:23] ==> public final val MavenDomPluginExecution.configuration: MavenDomConfiguration[MyPropertyDescriptor]

'xmlTag' @ [274:37] ==> public final val MavenDomConfiguration.xmlTag: (XmlTag..XmlTag?)[MyPropertyDescriptor]

'findSubTags' @ [274:45] ==> @NotNull public abstract fun findSubTags(@NonNls p0: (String..String?)): (Array<(XmlTag..XmlTag?)>..Array<out (XmlTag..XmlTag?)>) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'forEach' @ [274:72] ==> public inline fun <T> Array<out (XmlTag..XmlTag?)>.forEach(action: ((XmlTag..XmlTag?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.xml.XmlTag..com.intellij.psi.xml.XmlTag?)

'it' @ [274:82] ==> value-parameter it: (XmlTag..XmlTag?) defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs.<anonymous>[ValueParameterDescriptorImpl]

'deleteCascade' @ [274:85] ==> private final tailrec fun XmlTag.deleteCascade(): Unit defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'executionConfiguration' @ [277:33] ==> public final fun executionConfiguration(execution: MavenDomPluginExecution, name: String): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'execution' @ [277:56] ==> value-parameter execution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'execution' @ [278:36] ==> value-parameter execution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'configuration' @ [278:46] ==> public final val MavenDomPluginExecution.configuration: MavenDomConfiguration[MyPropertyDescriptor]

'createChildTag' @ [278:60] ==> private final fun MavenDomElement.createChildTag(name: String, value: String? = ...): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'sourceDirs' @ [279:25] ==> value-parameter sourceDirs: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'newSourceDirsTag' @ [280:17] ==> val newSourceDirsTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'add' @ [280:34] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'newSourceDirsTag' @ [280:38] ==> val newSourceDirsTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'createChildTag' @ [280:55] ==> private final fun XmlTag.createChildTag(name: String, value: String? = ...): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'dir' @ [280:80] ==> val dir: String defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'sourceDirsTag' @ [282:13] ==> val sourceDirsTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'replace' @ [282:27] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'newSourceDirsTag' @ [282:35] ==> val newSourceDirsTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[LocalVariableDescriptor]

'execution' @ [287:16] ==> value-parameter execution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs[ValueParameterDescriptorImpl]

'configuration' @ [287:26] ==> public final val MavenDomPluginExecution.configuration: MavenDomConfiguration[MyPropertyDescriptor]

'xmlTag' @ [287:40] ==> public final val MavenDomConfiguration.xmlTag: (XmlTag..XmlTag?)[MyPropertyDescriptor]

'getChildrenOfType' @ [288:25] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<XmlTag> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> XmlTag

'firstOrNull' @ [288:53] ==> public inline fun <T> Array<out XmlTag>.firstOrNull(predicate: (XmlTag) -> Boolean): XmlTag? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XmlTag

'it' @ [288:67] ==> value-parameter it: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs.<anonymous>[ValueParameterDescriptorImpl]

'localName' @ [288:70] ==> public final val XmlTag.localName: String[MyPropertyDescriptor]

'getChildrenOfType' @ [289:26] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<XmlTag> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> XmlTag

'map' @ [290:26] ==> public inline fun <T, R> Array<out XmlTag>.map(transform: (XmlTag) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XmlTag
    <R> -> String

'it' @ [290:32] ==> value-parameter it: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs.<anonymous>[ValueParameterDescriptorImpl]

'getChildrenOfType' @ [290:35] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<XmlText> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> XmlText

'joinToString' @ [290:64] ==> public fun <T> Array<out XmlText>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((XmlText) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XmlText

'it' @ [290:83] ==> value-parameter it: XmlText defined in org.jetbrains.kotlin.idea.maven.PomFile.executionSourceDirs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [290:86] ==> public final val XmlText.text: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [291:19] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'execution' @ [295:32] ==> value-parameter execution: MavenDomPluginExecution defined in org.jetbrains.kotlin.idea.maven.PomFile.executionConfiguration[ValueParameterDescriptorImpl]

'configuration' @ [295:42] ==> public final val MavenDomPluginExecution.configuration: MavenDomConfiguration[MyPropertyDescriptor]

'ensureTagExists' @ [295:56] ==> public abstract fun ensureTagExists(): (XmlTag..XmlTag?) defined in org.jetbrains.idea.maven.dom.model.MavenDomConfiguration[JavaMethodDescriptor]

'configurationTag' @ [297:27] ==> val configurationTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionConfiguration[LocalVariableDescriptor]

'findSubTags' @ [297:44] ==> @NotNull public abstract fun findSubTags(@NonNls p0: (String..String?)): (Array<(XmlTag..XmlTag?)>..Array<out (XmlTag..XmlTag?)>) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'name' @ [297:56] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.executionConfiguration[ValueParameterDescriptorImpl]

'firstOrNull' @ [297:62] ==> public fun <T> Array<out (XmlTag..XmlTag?)>.firstOrNull(): XmlTag? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.xml.XmlTag..com.intellij.psi.xml.XmlTag?)

'existingTag' @ [298:13] ==> val existingTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.executionConfiguration[LocalVariableDescriptor]

'existingTag' @ [299:20] ==> val existingTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.executionConfiguration[LocalVariableDescriptor]

'configurationTag' @ [302:22] ==> val configurationTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionConfiguration[LocalVariableDescriptor]

'createChildTag' @ [302:39] ==> private final fun XmlTag.createChildTag(name: String, value: String? = ...): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'name' @ [302:54] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.executionConfiguration[ValueParameterDescriptorImpl]

'configurationTag' @ [303:16] ==> val configurationTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionConfiguration[LocalVariableDescriptor]

'add' @ [303:33] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'newTag' @ [303:37] ==> val newTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.executionConfiguration[LocalVariableDescriptor]

'plugin' @ [307:32] ==> value-parameter plugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[ValueParameterDescriptorImpl]

'configuration' @ [307:39] ==> public final val MavenDomPlugin.configuration: MavenDomConfiguration[MyPropertyDescriptor]

'ensureTagExists' @ [307:53] ==> public abstract fun ensureTagExists(): (XmlTag..XmlTag?) defined in org.jetbrains.idea.maven.dom.model.MavenDomConfiguration[JavaMethodDescriptor]

'configurationTag' @ [308:27] ==> val configurationTag: (XmlTag..XmlTag?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[LocalVariableDescriptor]

'findFirstSubTag' @ [308:44] ==> @Nullable public abstract fun findFirstSubTag(@NonNls p0: (String..String?)): XmlTag? defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'optionName' @ [308:60] ==> value-parameter optionName: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[ValueParameterDescriptorImpl]

'if (existingTag != null) {
            existingTag.value.text = optionValue
        }
        else {
            configurationTag.add(configurationTag.createChildTag(optionName, optionValue))
        }' @ [309:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'existingTag' @ [309:13] ==> val existingTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[LocalVariableDescriptor]

'existingTag' @ [310:13] ==> val existingTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[LocalVariableDescriptor]

'value' @ [310:25] ==> public final val XmlTag.value: XmlTagValue[MyPropertyDescriptor]

'text' @ [310:31] ==> public final var XmlTagValue.text: String[MyPropertyDescriptor]

'optionValue' @ [310:38] ==> value-parameter optionValue: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[ValueParameterDescriptorImpl]

'configurationTag' @ [313:13] ==> val configurationTag: (XmlTag..XmlTag?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[LocalVariableDescriptor]

'add' @ [313:30] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'configurationTag' @ [313:34] ==> val configurationTag: (XmlTag..XmlTag?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[LocalVariableDescriptor]

'createChildTag' @ [313:51] ==> private final fun XmlTag.createChildTag(name: String, value: String? = ...): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'optionName' @ [313:66] ==> value-parameter optionName: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[ValueParameterDescriptorImpl]

'optionValue' @ [313:78] ==> value-parameter optionValue: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[ValueParameterDescriptorImpl]

'configurationTag' @ [315:16] ==> val configurationTag: (XmlTag..XmlTag?) defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginConfiguration[LocalVariableDescriptor]

'ensurePluginRepositories' @ [319:9] ==> public final fun ensurePluginRepositories(): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'addRepository' @ [321:16] ==> private final fun addRepository(id: String, name: String, url: String, snapshots: Boolean, releases: Boolean, existing: () -> List<MavenDomRepository>, create: () -> MavenDomRepository): MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'id' @ [321:30] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginRepository[ValueParameterDescriptorImpl]

'name' @ [321:34] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginRepository[ValueParameterDescriptorImpl]

'url' @ [321:40] ==> value-parameter url: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginRepository[ValueParameterDescriptorImpl]

'snapshots' @ [321:45] ==> value-parameter snapshots: Boolean = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginRepository[ValueParameterDescriptorImpl]

'releases' @ [321:56] ==> value-parameter releases: Boolean = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginRepository[ValueParameterDescriptorImpl]

'domModel' @ [321:68] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'pluginRepositories' @ [321:77] ==> public final val MavenDomProjectModel.pluginRepositories: MavenDomPluginRepositories[MyPropertyDescriptor]

'pluginRepositories' @ [321:96] ==> public final val MavenDomPluginRepositories.pluginRepositories: (MutableList<(MavenDomRepository..MavenDomRepository?)>..List<(MavenDomRepository..MavenDomRepository?)>)[MyPropertyDescriptor]

'domModel' @ [321:120] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'pluginRepositories' @ [321:129] ==> public final val MavenDomProjectModel.pluginRepositories: MavenDomPluginRepositories[MyPropertyDescriptor]

'addPluginRepository' @ [321:148] ==> public abstract fun addPluginRepository(): (MavenDomRepository..MavenDomRepository?) defined in org.jetbrains.idea.maven.dom.model.MavenDomPluginRepositories[JavaMethodDescriptor]

'addPluginRepository' @ [325:9] ==> public final fun addPluginRepository(id: String, name: String, url: String, snapshots: Boolean = ..., releases: Boolean = ...): MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'description' @ [325:29] ==> value-parameter description: RepositoryDescription defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginRepository[ValueParameterDescriptorImpl]

'id' @ [325:41] ==> public final val id: String defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'description' @ [325:45] ==> value-parameter description: RepositoryDescription defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginRepository[ValueParameterDescriptorImpl]

'name' @ [325:57] ==> public final val name: String defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'description' @ [325:63] ==> value-parameter description: RepositoryDescription defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginRepository[ValueParameterDescriptorImpl]

'url' @ [325:75] ==> public final val url: String defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'description' @ [325:80] ==> value-parameter description: RepositoryDescription defined in org.jetbrains.kotlin.idea.maven.PomFile.addPluginRepository[ValueParameterDescriptorImpl]

'isSnapshot' @ [325:92] ==> public final val isSnapshot: Boolean defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'ensureRepositories' @ [329:9] ==> public final fun ensureRepositories(): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'addRepository' @ [331:16] ==> private final fun addRepository(id: String, name: String, url: String, snapshots: Boolean, releases: Boolean, existing: () -> List<MavenDomRepository>, create: () -> MavenDomRepository): MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'id' @ [331:30] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addLibraryRepository[ValueParameterDescriptorImpl]

'name' @ [331:34] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addLibraryRepository[ValueParameterDescriptorImpl]

'url' @ [331:40] ==> value-parameter url: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addLibraryRepository[ValueParameterDescriptorImpl]

'snapshots' @ [331:45] ==> value-parameter snapshots: Boolean = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addLibraryRepository[ValueParameterDescriptorImpl]

'releases' @ [331:56] ==> value-parameter releases: Boolean = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.addLibraryRepository[ValueParameterDescriptorImpl]

'domModel' @ [331:68] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'repositories' @ [331:77] ==> public final val MavenDomProjectModel.repositories: MavenDomRepositories[MyPropertyDescriptor]

'repositories' @ [331:90] ==> public final val MavenDomRepositories.repositories: (MutableList<(MavenDomRepository..MavenDomRepository?)>..List<(MavenDomRepository..MavenDomRepository?)>)[MyPropertyDescriptor]

'domModel' @ [331:108] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'repositories' @ [331:117] ==> public final val MavenDomProjectModel.repositories: MavenDomRepositories[MyPropertyDescriptor]

'addRepository' @ [331:130] ==> public abstract fun addRepository(): (MavenDomRepository..MavenDomRepository?) defined in org.jetbrains.idea.maven.dom.model.MavenDomRepositories[JavaMethodDescriptor]

'addLibraryRepository' @ [335:9] ==> public final fun addLibraryRepository(id: String, name: String, url: String, snapshots: Boolean = ..., releases: Boolean = ...): MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'description' @ [335:30] ==> value-parameter description: RepositoryDescription defined in org.jetbrains.kotlin.idea.maven.PomFile.addLibraryRepository[ValueParameterDescriptorImpl]

'id' @ [335:42] ==> public final val id: String defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'description' @ [335:46] ==> value-parameter description: RepositoryDescription defined in org.jetbrains.kotlin.idea.maven.PomFile.addLibraryRepository[ValueParameterDescriptorImpl]

'name' @ [335:58] ==> public final val name: String defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'description' @ [335:64] ==> value-parameter description: RepositoryDescription defined in org.jetbrains.kotlin.idea.maven.PomFile.addLibraryRepository[ValueParameterDescriptorImpl]

'url' @ [335:76] ==> public final val url: String defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'description' @ [335:81] ==> value-parameter description: RepositoryDescription defined in org.jetbrains.kotlin.idea.maven.PomFile.addLibraryRepository[ValueParameterDescriptorImpl]

'isSnapshot' @ [335:93] ==> public final val isSnapshot: Boolean defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'invoke' @ [341:17] ==> public abstract operator fun invoke(): List<MavenDomRepository> defined in kotlin.Function0[FunctionInvokeDescriptor]

'firstOrNull' @ [341:28] ==> public inline fun <T> Iterable<MavenDomRepository>.firstOrNull(predicate: (MavenDomRepository) -> Boolean): MavenDomRepository? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenDomRepository

'it' @ [341:42] ==> value-parameter it: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [341:45] ==> public final val MavenDomRepository.id: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [341:48] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'id' @ [341:63] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[ValueParameterDescriptorImpl]

'invoke' @ [342:17] ==> public abstract operator fun invoke(): List<MavenDomRepository> defined in kotlin.Function0[FunctionInvokeDescriptor]

'firstOrNull' @ [342:28] ==> public inline fun <T> Iterable<MavenDomRepository>.firstOrNull(predicate: (MavenDomRepository) -> Boolean): MavenDomRepository? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenDomRepository

'it' @ [342:42] ==> value-parameter it: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository.<anonymous>[ValueParameterDescriptorImpl]

'url' @ [342:45] ==> public final val MavenDomRepository.url: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [342:49] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'url' @ [342:64] ==> value-parameter url: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[ValueParameterDescriptorImpl]

'invoke' @ [343:17] ==> public abstract operator fun invoke(): MavenDomRepository defined in kotlin.Function0[FunctionInvokeDescriptor]

'repository' @ [345:13] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'id' @ [345:24] ==> public final val MavenDomRepository.id: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'isEmpty' @ [345:27] ==> private final fun GenericDomValue<String>.isEmpty(): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'repository' @ [346:13] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'id' @ [346:24] ==> public final val MavenDomRepository.id: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [346:27] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'id' @ [346:41] ==> value-parameter id: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[ValueParameterDescriptorImpl]

'repository' @ [348:13] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'name' @ [348:24] ==> public final val MavenDomRepository.name: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'isEmpty' @ [348:29] ==> private final fun GenericDomValue<String>.isEmpty(): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'repository' @ [349:13] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'name' @ [349:24] ==> public final val MavenDomRepository.name: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [349:29] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'name' @ [349:43] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[ValueParameterDescriptorImpl]

'repository' @ [351:13] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'url' @ [351:24] ==> public final val MavenDomRepository.url: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'isEmpty' @ [351:28] ==> private final fun GenericDomValue<String>.isEmpty(): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'repository' @ [352:13] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'url' @ [352:24] ==> public final val MavenDomRepository.url: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [352:28] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'url' @ [352:42] ==> value-parameter url: String defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[ValueParameterDescriptorImpl]

'repository' @ [354:9] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'releases' @ [354:20] ==> public final val MavenDomRepository.releases: MavenDomRepositoryPolicy[MyPropertyDescriptor]

'enabled' @ [354:29] ==> public final val MavenDomRepositoryPolicy.enabled: GenericDomValue<(Boolean..Boolean?)>[MyPropertyDescriptor]

'value' @ [354:37] ==> public final var <T : (Any..Any?)> GenericDomValue<(Boolean..Boolean?)>.value: Boolean?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'repository' @ [354:45] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'releases' @ [354:56] ==> public final val MavenDomRepository.releases: MavenDomRepositoryPolicy[MyPropertyDescriptor]

'enabled' @ [354:65] ==> public final val MavenDomRepositoryPolicy.enabled: GenericDomValue<(Boolean..Boolean?)>[MyPropertyDescriptor]

'value' @ [354:73] ==> public final var <T : (Any..Any?)> GenericDomValue<(Boolean..Boolean?)>.value: Boolean?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'let' @ [354:80] ==> @InlineOnly public inline fun <T, R> Boolean.let(block: (Boolean) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Boolean

'it' @ [354:86] ==> value-parameter it: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository.<anonymous>[ValueParameterDescriptorImpl]

'releases' @ [354:92] ==> value-parameter releases: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[ValueParameterDescriptorImpl]

'releases' @ [354:106] ==> value-parameter releases: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[ValueParameterDescriptorImpl]

'repository' @ [355:9] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'snapshots' @ [355:20] ==> public final val MavenDomRepository.snapshots: MavenDomRepositoryPolicy[MyPropertyDescriptor]

'enabled' @ [355:30] ==> public final val MavenDomRepositoryPolicy.enabled: GenericDomValue<(Boolean..Boolean?)>[MyPropertyDescriptor]

'value' @ [355:38] ==> public final var <T : (Any..Any?)> GenericDomValue<(Boolean..Boolean?)>.value: Boolean?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'repository' @ [355:46] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'snapshots' @ [355:57] ==> public final val MavenDomRepository.snapshots: MavenDomRepositoryPolicy[MyPropertyDescriptor]

'enabled' @ [355:67] ==> public final val MavenDomRepositoryPolicy.enabled: GenericDomValue<(Boolean..Boolean?)>[MyPropertyDescriptor]

'value' @ [355:75] ==> public final var <T : (Any..Any?)> GenericDomValue<(Boolean..Boolean?)>.value: Boolean?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'let' @ [355:82] ==> @InlineOnly public inline fun <T, R> Boolean.let(block: (Boolean) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Boolean

'it' @ [355:88] ==> value-parameter it: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository.<anonymous>[ValueParameterDescriptorImpl]

'snapshots' @ [355:94] ==> value-parameter snapshots: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[ValueParameterDescriptorImpl]

'snapshots' @ [355:109] ==> value-parameter snapshots: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[ValueParameterDescriptorImpl]

'repository' @ [357:9] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'ensureTagExists' @ [357:20] ==> public abstract fun ensureTagExists(): (XmlTag..XmlTag?) defined in org.jetbrains.idea.maven.dom.model.MavenDomRepository[JavaMethodDescriptor]

'repository' @ [359:16] ==> val repository: MavenDomRepository defined in org.jetbrains.kotlin.idea.maven.PomFile.addRepository[LocalVariableDescriptor]

'domModel' @ [362:40] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'build' @ [362:49] ==> public final val MavenDomProjectModel.build: MavenDomBuild[MyPropertyDescriptor]

'plugins' @ [362:55] ==> public final val MavenDomBuild.plugins: MavenDomPlugins[MyPropertyDescriptor]

'plugins' @ [362:63] ==> public final val MavenDomPlugins.plugins: (MutableList<(MavenDomPlugin..MavenDomPlugin?)>..List<(MavenDomPlugin..MavenDomPlugin?)>)[MyPropertyDescriptor]

'any' @ [362:71] ==> public inline fun <T> Iterable<(MavenDomPlugin..MavenDomPlugin?)>.any(predicate: ((MavenDomPlugin..MavenDomPlugin?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPlugin..org.jetbrains.idea.maven.dom.model.MavenDomPlugin?)

'it' @ [362:77] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.PomFile.hasPlugin.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [362:80] ==> private final fun MavenDomArtifactCoordinates.matches(artifact: MavenId): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'artifact' @ [362:88] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.hasPlugin[ValueParameterDescriptorImpl]

'domModel' @ [365:13] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'dependencies' @ [365:22] ==> public final val MavenDomProjectModel.dependencies: MavenDomDependencies[MyPropertyDescriptor]

'dependencies' @ [365:35] ==> public final val MavenDomDependencies.dependencies: (MutableList<(MavenDomDependency..MavenDomDependency?)>..List<(MavenDomDependency..MavenDomDependency?)>)[MyPropertyDescriptor]

'any' @ [365:48] ==> public inline fun <T> Iterable<(MavenDomDependency..MavenDomDependency?)>.any(predicate: ((MavenDomDependency..MavenDomDependency?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'it' @ [365:54] ==> value-parameter it: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.hasDependency.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [365:57] ==> private final fun MavenDomDependency.matches(artifact: MavenId, scope: MavenArtifactScope?): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'artifact' @ [365:65] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.hasDependency[ValueParameterDescriptorImpl]

'scope' @ [365:75] ==> value-parameter scope: MavenArtifactScope? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.hasDependency[ValueParameterDescriptorImpl]

'domModel' @ [368:13] ==> public final val domModel: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'dependencies' @ [368:22] ==> public final val MavenDomProjectModel.dependencies: MavenDomDependencies[MyPropertyDescriptor]

'dependencies' @ [368:35] ==> public final val MavenDomDependencies.dependencies: (MutableList<(MavenDomDependency..MavenDomDependency?)>..List<(MavenDomDependency..MavenDomDependency?)>)[MyPropertyDescriptor]

'filter' @ [368:48] ==> public inline fun <T> Iterable<(MavenDomDependency..MavenDomDependency?)>.filter(predicate: ((MavenDomDependency..MavenDomDependency?)) -> Boolean): List<(MavenDomDependency..MavenDomDependency?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'it' @ [368:57] ==> value-parameter it: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.PomFile.findDependencies.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [368:60] ==> private final fun MavenDomDependency.matches(artifact: MavenId, scope: MavenArtifactScope?): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'artifact' @ [368:68] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.findDependencies[ValueParameterDescriptorImpl]

'scope' @ [368:78] ==> value-parameter scope: MavenArtifactScope? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.findDependencies[ValueParameterDescriptorImpl]

'ensureElement' @ [370:33] ==> private final fun ensureElement(projectElement: XmlTag, localName: String): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'projectElement' @ [370:47] ==> private final val projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'ensureElement' @ [372:40] ==> private final fun ensureElement(projectElement: XmlTag, localName: String): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'projectElement' @ [372:54] ==> private final val projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'ensureElement' @ [373:46] ==> private final fun ensureElement(projectElement: XmlTag, localName: String): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'projectElement' @ [373:60] ==> private final val projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'ensureElement' @ [374:40] ==> private final fun ensureElement(projectElement: XmlTag, localName: String): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'projectElement' @ [374:54] ==> private final val projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'groupId' @ [376:56] ==> public final val MavenDomPlugin.groupId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [376:64] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'GROUP_ID' @ [376:103] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'artifactId' @ [377:59] ==> public final val MavenDomPlugin.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [377:70] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'MAVEN_PLUGIN_ID' @ [377:109] ==> public final val MAVEN_PLUGIN_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'this' @ [380:13] ==> <this> defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ReceiverParameterDescriptorImpl]

'matches' @ [380:18] ==> private final fun MavenDomArtifactCoordinates.matches(artifact: MavenId): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'artifact' @ [380:26] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ValueParameterDescriptorImpl]

'this' @ [380:40] ==> <this> defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ReceiverParameterDescriptorImpl]

'scope' @ [380:45] ==> public final val MavenDomDependency.scope: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [380:51] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'scope' @ [380:66] ==> value-parameter scope: MavenArtifactScope? defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ValueParameterDescriptorImpl]

'name' @ [380:73] ==> public final val name: String defined in org.jetbrains.idea.maven.utils.MavenArtifactScope[DeserializedPropertyDescriptor]

'toLowerCase' @ [380:79] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'scope' @ [380:96] ==> value-parameter scope: MavenArtifactScope? defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ValueParameterDescriptorImpl]

'this' @ [380:113] ==> <this> defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ReceiverParameterDescriptorImpl]

'scope' @ [380:118] ==> public final val MavenDomDependency.scope: GenericDomValue<(String..String?)>[MyPropertyDescriptor]

'stringValue' @ [380:124] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [383:14] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ValueParameterDescriptorImpl]

'groupId' @ [383:23] ==> public final val MavenId.groupId: String?[MyPropertyDescriptor]

'groupId' @ [383:42] ==> public final val MavenDomArtifactCoordinates.groupId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [383:50] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [383:65] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ValueParameterDescriptorImpl]

'groupId' @ [383:74] ==> public final val MavenId.groupId: String?[MyPropertyDescriptor]

'artifact' @ [384:17] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ValueParameterDescriptorImpl]

'artifactId' @ [384:26] ==> public final val MavenId.artifactId: String?[MyPropertyDescriptor]

'artifactId' @ [384:48] ==> public final val MavenDomArtifactCoordinates.artifactId: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [384:59] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [384:74] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ValueParameterDescriptorImpl]

'artifactId' @ [384:83] ==> public final val MavenId.artifactId: String?[MyPropertyDescriptor]

'artifact' @ [385:17] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ValueParameterDescriptorImpl]

'version' @ [385:26] ==> public final val MavenId.version: String?[MyPropertyDescriptor]

'version' @ [385:45] ==> public final val MavenDomArtifactCoordinates.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [385:53] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'artifact' @ [385:68] ==> value-parameter artifact: MavenId defined in org.jetbrains.kotlin.idea.maven.PomFile.matches[ValueParameterDescriptorImpl]

'version' @ [385:77] ==> public final val MavenId.version: String?[MyPropertyDescriptor]

'MavenId' @ [387:43] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'groupId' @ [387:51] ==> public final val MavenId.groupId: String?[MyPropertyDescriptor]

'artifactId' @ [387:60] ==> public final val MavenId.artifactId: String?[MyPropertyDescriptor]

'MavenId' @ [388:46] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'groupId' @ [388:54] ==> public final val MavenId.groupId: String?[MyPropertyDescriptor]

'artifactId' @ [388:63] ==> public final val MavenId.artifactId: String?[MyPropertyDescriptor]

'substringBeforeLast' @ [388:75] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'xmlTag' @ [390:87] ==> public final val MavenDomElement.xmlTag: (XmlTag..XmlTag?)[MyPropertyDescriptor]

'createChildTag' @ [390:94] ==> private final fun XmlTag.createChildTag(name: String, value: String? = ...): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'name' @ [390:109] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.createChildTag[ValueParameterDescriptorImpl]

'value' @ [390:115] ==> value-parameter value: String? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.createChildTag[ValueParameterDescriptorImpl]

'createChildTag' @ [391:78] ==> public abstract fun createChildTag(@NonNls p0: (String..String?), @NonNls p1: (String..String?), @Nullable @NonNls p2: String?, p3: Boolean): (XmlTag..XmlTag?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'name' @ [391:93] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.maven.PomFile.createChildTag[ValueParameterDescriptorImpl]

'namespace' @ [391:99] ==> public final val XmlTag.namespace: String[MyPropertyDescriptor]

'value' @ [391:110] ==> value-parameter value: String? = ... defined in org.jetbrains.kotlin.idea.maven.PomFile.createChildTag[ValueParameterDescriptorImpl]

'this' @ [395:25] ==> <this> defined in org.jetbrains.kotlin.idea.maven.PomFile.deleteCascade[ReceiverParameterDescriptorImpl]

'parentTag' @ [395:30] ==> public final val XmlTag.parentTag: XmlTag?[MyPropertyDescriptor]

'delete' @ [396:9] ==> public abstract fun delete(): Unit defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'oldParent' @ [398:13] ==> val oldParent: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.deleteCascade[LocalVariableDescriptor]

'oldParent' @ [398:34] ==> val oldParent: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.deleteCascade[LocalVariableDescriptor]

'subTags' @ [398:44] ==> public final val XmlTag.subTags: (Array<(XmlTag..XmlTag?)>..Array<out (XmlTag..XmlTag?)>)[MyPropertyDescriptor]

'isEmpty' @ [398:52] ==> @InlineOnly public inline fun <T> Array<out (XmlTag..XmlTag?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.xml.XmlTag..com.intellij.psi.xml.XmlTag?)

'oldParent' @ [399:13] ==> val oldParent: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.deleteCascade[LocalVariableDescriptor]

'deleteCascade' @ [399:23] ==> private final tailrec fun XmlTag.deleteCascade(): Unit defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'require' @ [404:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'localName' @ [404:17] ==> value-parameter localName: String defined in org.jetbrains.kotlin.idea.maven.PomFile.ensureElement[ValueParameterDescriptorImpl]

'recommendedElementsOrder' @ [404:30] ==> public final val recommendedElementsOrder: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[PropertyDescriptorImpl]

'nodesByName' @ [406:16] ==> private final val nodesByName: HashMap<String, XmlTag> defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'getOrPut' @ [406:28] ==> public inline fun <K, V> MutableMap<String, XmlTag>.getOrPut(key: String, defaultValue: () -> XmlTag): XmlTag defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> XmlTag

'localName' @ [406:37] ==> value-parameter localName: String defined in org.jetbrains.kotlin.idea.maven.PomFile.ensureElement[ValueParameterDescriptorImpl]

'projectElement' @ [407:23] ==> value-parameter projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.ensureElement[ValueParameterDescriptorImpl]

'createChildTag' @ [407:38] ==> public abstract fun createChildTag(@NonNls p0: (String..String?), @NonNls p1: (String..String?), @Nullable @NonNls p2: String?, p3: Boolean): (XmlTag..XmlTag?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'localName' @ [407:53] ==> value-parameter localName: String defined in org.jetbrains.kotlin.idea.maven.PomFile.ensureElement[ValueParameterDescriptorImpl]

'projectElement' @ [407:64] ==> value-parameter projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.ensureElement[ValueParameterDescriptorImpl]

'namespace' @ [407:79] ==> public final val XmlTag.namespace: String[MyPropertyDescriptor]

'insertTagImpl' @ [408:26] ==> private final fun insertTagImpl(projectElement: XmlTag, tag: XmlTag): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'projectElement' @ [408:40] ==> value-parameter projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.ensureElement[ValueParameterDescriptorImpl]

'tag' @ [408:56] ==> val tag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.ensureElement.<anonymous>[LocalVariableDescriptor]

'insertEmptyLines' @ [410:13] ==> private final fun insertEmptyLines(node: XmlTag): Unit defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'newTag' @ [410:30] ==> val newTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.ensureElement.<anonymous>[LocalVariableDescriptor]

'newTag' @ [412:13] ==> val newTag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.ensureElement.<anonymous>[LocalVariableDescriptor]

'recommendedOrderAsList' @ [417:22] ==> public final val recommendedOrderAsList: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[PropertyDescriptorImpl]

'indexOf' @ [417:45] ==> public abstract fun indexOf(element: String): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'tag' @ [417:53] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[ValueParameterDescriptorImpl]

'localName' @ [417:57] ==> public final val XmlTag.localName: String[MyPropertyDescriptor]

'require' @ [418:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'middle' @ [418:17] ==> val middle: Int defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[LocalVariableDescriptor]

'-' @ [418:27] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'middle' @ [420:21] ==> val middle: Int defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[LocalVariableDescriptor]

'nodesByName' @ [421:29] ==> private final val nodesByName: HashMap<String, XmlTag> defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'recommendedOrderAsList' @ [421:41] ==> public final val recommendedOrderAsList: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[PropertyDescriptorImpl]

'idx' @ [421:64] ==> val idx: Int defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[LocalVariableDescriptor]

'reference' @ [422:17] ==> val reference: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[LocalVariableDescriptor]

'projectElement' @ [423:24] ==> value-parameter projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[ValueParameterDescriptorImpl]

'addAfter' @ [423:39] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'tag' @ [423:48] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[ValueParameterDescriptorImpl]

'reference' @ [423:53] ==> val reference: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[LocalVariableDescriptor]

'middle' @ [427:21] ==> val middle: Int defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[LocalVariableDescriptor]

'recommendedOrderAsList' @ [427:33] ==> public final val recommendedOrderAsList: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[PropertyDescriptorImpl]

'lastIndex' @ [427:56] ==> public val <T> List<String>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'nodesByName' @ [428:29] ==> private final val nodesByName: HashMap<String, XmlTag> defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'recommendedOrderAsList' @ [428:41] ==> public final val recommendedOrderAsList: List<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[PropertyDescriptorImpl]

'idx' @ [428:64] ==> val idx: Int defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[LocalVariableDescriptor]

'reference' @ [429:17] ==> val reference: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[LocalVariableDescriptor]

'projectElement' @ [430:24] ==> value-parameter projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[ValueParameterDescriptorImpl]

'addBefore' @ [430:39] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'tag' @ [430:49] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[ValueParameterDescriptorImpl]

'reference' @ [430:54] ==> val reference: XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[LocalVariableDescriptor]

'projectElement' @ [434:16] ==> value-parameter projectElement: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[ValueParameterDescriptorImpl]

'add' @ [434:31] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'tag' @ [434:35] ==> value-parameter tag: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertTagImpl[ValueParameterDescriptorImpl]

'node' @ [438:9] ==> value-parameter node: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines[ValueParameterDescriptorImpl]

'prevSibling' @ [438:14] ==> public final val XmlTag.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [438:27] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'!' @ [439:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'before' @ [439:19] ==> value-parameter before: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines.<anonymous>[ValueParameterDescriptorImpl]

'hasEmptyLine' @ [439:26] ==> private final fun PsiElement.hasEmptyLine(): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'before' @ [439:44] ==> value-parameter before: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines.<anonymous>[ValueParameterDescriptorImpl]

'lastChild' @ [439:51] ==> public final val PsiElement.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'hasEmptyLine' @ [439:62] ==> private final fun PsiElement.hasEmptyLine(): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'node' @ [440:17] ==> value-parameter node: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines[ValueParameterDescriptorImpl]

'parent' @ [440:22] ==> public final val XmlTag.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [440:29] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'createEmptyLine' @ [440:39] ==> private final fun createEmptyLine(): XmlText defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'node' @ [440:58] ==> value-parameter node: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines[ValueParameterDescriptorImpl]

'node' @ [443:9] ==> value-parameter node: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines[ValueParameterDescriptorImpl]

'nextSibling' @ [443:14] ==> public final val XmlTag.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [443:27] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'!' @ [444:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'after' @ [444:19] ==> value-parameter after: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines.<anonymous>[ValueParameterDescriptorImpl]

'hasEmptyLine' @ [444:25] ==> private final fun PsiElement.hasEmptyLine(): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'after' @ [444:43] ==> value-parameter after: PsiElement defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines.<anonymous>[ValueParameterDescriptorImpl]

'firstChild' @ [444:49] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'hasEmptyLine' @ [444:61] ==> private final fun PsiElement.hasEmptyLine(): Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'node' @ [445:17] ==> value-parameter node: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines[ValueParameterDescriptorImpl]

'parent' @ [445:22] ==> public final val XmlTag.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [445:29] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'createEmptyLine' @ [445:38] ==> private final fun createEmptyLine(): XmlText defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'node' @ [445:57] ==> value-parameter node: XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile.insertEmptyLines[ValueParameterDescriptorImpl]

'this' @ [450:45] ==> <this> defined in org.jetbrains.kotlin.idea.maven.PomFile.hasEmptyLine[ReceiverParameterDescriptorImpl]

'text' @ [450:70] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'count' @ [450:75] ==> public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [450:83] ==> value-parameter it: Char defined in org.jetbrains.kotlin.idea.maven.PomFile.hasEmptyLine.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [453:34] ==> public open fun getInstance(p0: (Project..Project?)): (XmlElementFactory..XmlElementFactory?) defined in com.intellij.psi.XmlElementFactory[JavaMethodDescriptor]

'xmlFile' @ [453:46] ==> public final val xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile[PropertyDescriptorImpl]

'project' @ [453:54] ==> public final val XmlFile.project: Project[MyPropertyDescriptor]

'createTagFromText' @ [453:63] ==> @NotNull public abstract fun createTagFromText(@NotNull @NonNls p0: CharSequence): XmlTag defined in com.intellij.psi.XmlElementFactory[JavaMethodDescriptor]

'children' @ [453:96] ==> public final val XmlTag.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'first' @ [453:105] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.first(predicate: ((PsiElement..PsiElement?)) -> Boolean): (PsiElement..PsiElement?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [453:113] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.maven.PomFile.createEmptyLine.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [456:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exists' @ [456:54] ==> public abstract fun exists(): Boolean defined in com.intellij.util.xml.GenericDomValue[JavaMethodDescriptor]

'stringValue' @ [456:66] ==> public final var <T : (Any..Any?)> GenericDomValue<String>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'isNullOrEmpty' @ [456:78] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when {
            isTest -> JavaSourceRootType.TEST_SOURCE
            else -> JavaSourceRootType.SOURCE
        }' @ [459:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (JavaSourceRootType..JavaSourceRootType?), entry1: (JavaSourceRootType..JavaSourceRootType?)): (JavaSourceRootType..JavaSourceRootType?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.jps.model.java.JavaSourceRootType..org.jetbrains.jps.model.java.JavaSourceRootType?)

'isTest' @ [460:13] ==> value-parameter isTest: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.isRelatedSourceRoot[ValueParameterDescriptorImpl]

'TEST_SOURCE' @ [460:42] ==> public final val TEST_SOURCE: (JavaSourceRootType..JavaSourceRootType?) defined in org.jetbrains.jps.model.java.JavaSourceRootType[JavaPropertyDescriptor]

'SOURCE' @ [461:40] ==> public final val SOURCE: (JavaSourceRootType..JavaSourceRootType?) defined in org.jetbrains.jps.model.java.JavaSourceRootType[JavaPropertyDescriptor]

'rootType' @ [464:16] ==> public final val SourceFolder.rootType: JpsModuleSourceRootType<*>[MyPropertyDescriptor]

'relevantRootType' @ [464:29] ==> val relevantRootType: (JavaSourceRootType..JavaSourceRootType?) defined in org.jetbrains.kotlin.idea.maven.PomFile.isRelatedSourceRoot[LocalVariableDescriptor]

'Suppress' @ [467:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'getMavenDomProjectModel' @ [504:70] ==> @Nullable public open fun getMavenDomProjectModel(@NotNull p0: Project, @NotNull p1: VirtualFile): MavenDomProjectModel? defined in org.jetbrains.idea.maven.dom.MavenDomUtil[JavaMethodDescriptor]

'xmlFile' @ [504:94] ==> value-parameter xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion.forFileOrNull[ValueParameterDescriptorImpl]

'project' @ [504:102] ==> public final val XmlFile.project: Project[MyPropertyDescriptor]

'xmlFile' @ [504:111] ==> value-parameter xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion.forFileOrNull[ValueParameterDescriptorImpl]

'virtualFile' @ [504:119] ==> public final val XmlFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'let' @ [504:133] ==> @InlineOnly public inline fun <T, R> MavenDomProjectModel.let(block: (MavenDomProjectModel) -> PomFile): PomFile defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenDomProjectModel
    <R> -> PomFile

'PomFile' @ [504:139] ==> private constructor PomFile(xmlFile: XmlFile, domModel: MavenDomProjectModel) defined in org.jetbrains.kotlin.idea.maven.PomFile[ClassConstructorDescriptorImpl]

'xmlFile' @ [504:147] ==> value-parameter xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion.forFileOrNull[ValueParameterDescriptorImpl]

'it' @ [504:156] ==> value-parameter it: MavenDomProjectModel defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion.forFileOrNull.<anonymous>[ValueParameterDescriptorImpl]

'Deprecated' @ [506:9] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'when {
            hasJavaFiles -> when {
                isTest -> DefaultPhases.ProcessTestSources
                else -> DefaultPhases.ProcessSources
            }
            else -> when {
                isTest -> DefaultPhases.TestCompile
                else -> DefaultPhases.Compile
            }
        }' @ [507:64] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'hasJavaFiles' @ [508:13] ==> value-parameter hasJavaFiles: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion.getPhase[ValueParameterDescriptorImpl]

'when {
                isTest -> DefaultPhases.ProcessTestSources
                else -> DefaultPhases.ProcessSources
            }' @ [508:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'isTest' @ [509:17] ==> value-parameter isTest: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion.getPhase[ValueParameterDescriptorImpl]

'ProcessTestSources' @ [509:41] ==> public final val ProcessTestSources: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'ProcessSources' @ [510:39] ==> public final val ProcessSources: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'when {
                isTest -> DefaultPhases.TestCompile
                else -> DefaultPhases.Compile
            }' @ [512:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'isTest' @ [513:17] ==> value-parameter isTest: Boolean defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion.getPhase[ValueParameterDescriptorImpl]

'TestCompile' @ [513:41] ==> public final val TestCompile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'Compile' @ [514:39] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.DefaultPhases[PropertyDescriptorImpl]

'lines' @ [562:13] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [563:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [563:24] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion.recommendedElementsOrder.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [563:27] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'removePrefix' @ [563:34] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'removeSuffix' @ [563:52] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [563:71] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filter' @ [564:18] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [564:25] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'isNotEmpty' @ [564:33] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toCollection' @ [565:18] ==> public fun <T, C : MutableCollection<in String>> Iterable<String>.toCollection(destination: LinkedHashSet<String>): LinkedHashSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <C : MutableCollection<in T>> -> LinkedHashSet<String>

'LinkedHashSet' @ [565:31] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'recommendedElementsOrder' @ [567:38] ==> public final val recommendedElementsOrder: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[PropertyDescriptorImpl]

'toList' @ [567:63] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'findPlugin' @ [572:24] ==> public final fun findPlugin(groupArtifact: MavenId): MavenDomPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'MavenId' @ [572:35] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'GROUP_ID' @ [572:67] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_PLUGIN_ID' @ [573:67] ==> public final val MAVEN_PLUGIN_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'languageVersion' @ [575:27] ==> value-parameter languageVersion: String? defined in org.jetbrains.kotlin.idea.maven.changeLanguageVersion[ValueParameterDescriptorImpl]

'let' @ [575:44] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> XmlTag?): XmlTag? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> XmlTag?

'changeConfigurationOrProperty' @ [576:9] ==> private fun PomFile.changeConfigurationOrProperty(kotlinPlugin: MavenDomPlugin, configurationTagName: String, propertyName: String, value: String): XmlTag? defined in org.jetbrains.kotlin.idea.maven in file PomFile.kt[SimpleFunctionDescriptorImpl]

'kotlinPlugin' @ [576:39] ==> val kotlinPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.changeLanguageVersion[LocalVariableDescriptor]

'it' @ [576:107] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.changeLanguageVersion.<anonymous>[ValueParameterDescriptorImpl]

'apiVersion' @ [578:22] ==> value-parameter apiVersion: String? defined in org.jetbrains.kotlin.idea.maven.changeLanguageVersion[ValueParameterDescriptorImpl]

'let' @ [578:34] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> XmlTag?): XmlTag? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> XmlTag?

'changeConfigurationOrProperty' @ [579:9] ==> private fun PomFile.changeConfigurationOrProperty(kotlinPlugin: MavenDomPlugin, configurationTagName: String, propertyName: String, value: String): XmlTag? defined in org.jetbrains.kotlin.idea.maven in file PomFile.kt[SimpleFunctionDescriptorImpl]

'kotlinPlugin' @ [579:39] ==> val kotlinPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.changeLanguageVersion[LocalVariableDescriptor]

'it' @ [579:97] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.changeLanguageVersion.<anonymous>[ValueParameterDescriptorImpl]

'languageElement' @ [581:12] ==> val languageElement: XmlTag? defined in org.jetbrains.kotlin.idea.maven.changeLanguageVersion[LocalVariableDescriptor]

'apiElement' @ [581:31] ==> val apiElement: XmlTag? defined in org.jetbrains.kotlin.idea.maven.changeLanguageVersion[LocalVariableDescriptor]

'kotlinPlugin' @ [587:25] ==> value-parameter kotlinPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[ValueParameterDescriptorImpl]

'configuration' @ [587:38] ==> public final val MavenDomPlugin.configuration: MavenDomConfiguration[MyPropertyDescriptor]

'configuration' @ [588:9] ==> val configuration: MavenDomConfiguration defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'exists' @ [588:23] ==> public abstract fun exists(): Boolean defined in org.jetbrains.idea.maven.dom.model.MavenDomConfiguration[JavaMethodDescriptor]

'configuration' @ [589:22] ==> val configuration: MavenDomConfiguration defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'xmlTag' @ [589:36] ==> public final val MavenDomConfiguration.xmlTag: (XmlTag..XmlTag?)[MyPropertyDescriptor]

'findFirstSubTag' @ [589:43] ==> @Nullable public abstract fun findFirstSubTag(@NonNls p0: (String..String?)): XmlTag? defined in com.intellij.psi.xml.XmlTag[JavaMethodDescriptor]

'configurationTagName' @ [589:59] ==> value-parameter configurationTagName: String defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[ValueParameterDescriptorImpl]

'subTag' @ [590:13] ==> val subTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'subTag' @ [591:13] ==> val subTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'value' @ [591:20] ==> public final val XmlTag.value: XmlTagValue[MyPropertyDescriptor]

'text' @ [591:26] ==> public final var XmlTagValue.text: String[MyPropertyDescriptor]

'value' @ [591:33] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[ValueParameterDescriptorImpl]

'subTag' @ [592:20] ==> val subTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'findProperty' @ [596:23] ==> public final fun findProperty(name: String): XmlTag? defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'propertyName' @ [596:36] ==> value-parameter propertyName: String defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[ValueParameterDescriptorImpl]

'propertyTag' @ [597:9] ==> val propertyTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'propertyTag' @ [598:24] ==> val propertyTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'children' @ [598:36] ==> public final val XmlTag.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [598:45] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<XmlText> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> XmlText

'firstOrNull' @ [598:73] ==> public fun <T> List<XmlText>.firstOrNull(): XmlText? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XmlText

'textNode' @ [599:13] ==> val textNode: XmlText? defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'textNode' @ [600:13] ==> val textNode: XmlText? defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'value' @ [600:22] ==> public final var XmlText.value: (String..String?)[MyPropertyDescriptor]

'value' @ [600:30] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[ValueParameterDescriptorImpl]

'propertyTag' @ [601:20] ==> val propertyTag: XmlTag? defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[LocalVariableDescriptor]

'addPluginConfiguration' @ [605:12] ==> public final fun addPluginConfiguration(plugin: MavenDomPlugin, optionName: String, optionValue: String): XmlTag defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'kotlinPlugin' @ [605:35] ==> value-parameter kotlinPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[ValueParameterDescriptorImpl]

'configurationTagName' @ [605:49] ==> value-parameter configurationTagName: String defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[ValueParameterDescriptorImpl]

'value' @ [605:71] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.maven.changeConfigurationOrProperty[ValueParameterDescriptorImpl]

'findPlugin' @ [609:24] ==> public final fun findPlugin(groupArtifact: MavenId): MavenDomPlugin? defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'MavenId' @ [609:35] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'GROUP_ID' @ [609:67] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_PLUGIN_ID' @ [610:67] ==> public final val MAVEN_PLUGIN_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'changeConfigurationOrProperty' @ [612:12] ==> private fun PomFile.changeConfigurationOrProperty(kotlinPlugin: MavenDomPlugin, configurationTagName: String, propertyName: String, value: String): XmlTag? defined in org.jetbrains.kotlin.idea.maven in file PomFile.kt[SimpleFunctionDescriptorImpl]

'kotlinPlugin' @ [612:42] ==> val kotlinPlugin: MavenDomPlugin defined in org.jetbrains.kotlin.idea.maven.changeCoroutineConfiguration[LocalVariableDescriptor]

'value' @ [612:125] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.maven.changeCoroutineConfiguration[ValueParameterDescriptorImpl]

