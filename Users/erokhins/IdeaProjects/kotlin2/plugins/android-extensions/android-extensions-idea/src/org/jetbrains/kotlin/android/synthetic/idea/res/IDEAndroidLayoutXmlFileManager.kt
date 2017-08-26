'AndroidLayoutXmlFileManager' @ [38:60] ==> public constructor AndroidLayoutXmlFileManager(project: Project) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[DeserializedClassConstructorDescriptor]

'module' @ [38:88] ==> value-parameter module: Module defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.<init>[ValueParameterDescriptorImpl]

'project' @ [38:95] ==> public final val Module.project: Project[MyPropertyDescriptor]

'getInstance' @ [40:30] ==> @Nullable public open fun getInstance(@NotNull p0: Module): AndroidFacet? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'module' @ [40:42] ==> public final val module: Module defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[PropertyDescriptorImpl]

'let' @ [40:51] ==> @InlineOnly public inline fun <T, R> AndroidFacet.let(block: (AndroidFacet) -> AndroidModule?): AndroidModule? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidFacet
    <R> -> AndroidModule?

'getAndroidModuleInfo' @ [40:57] ==> private final fun getAndroidModuleInfo(androidFacet: AndroidFacet): AndroidModule? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'it' @ [40:78] ==> value-parameter it: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.<get-androidModule>.<anonymous>[ValueParameterDescriptorImpl]

'Volatile' @ [42:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'if (androidModule == null) {
            _moduleData = null
        }
        else {
            if (_moduleData == null) {
                _moduleData = cachedValue(project) {
                    CachedValueProvider.Result.create(
                            super.getModuleData(),
                            getPsiTreeChangePreprocessor(), ProjectRootModificationTracker.getInstance(project))
                }
            }
        }' @ [46:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'androidModule' @ [46:13] ==> public open val androidModule: AndroidModule? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[PropertyDescriptorImpl]

'_moduleData' @ [47:13] ==> @Volatile private final var _moduleData: CachedValue<AndroidModuleData>? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[PropertyDescriptorImpl]

'_moduleData' @ [50:17] ==> @Volatile private final var _moduleData: CachedValue<AndroidModuleData>? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[PropertyDescriptorImpl]

'_moduleData' @ [51:17] ==> @Volatile private final var _moduleData: CachedValue<AndroidModuleData>? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[PropertyDescriptorImpl]

'cachedValue' @ [51:31] ==> public fun <T> cachedValue(project: Project, result: () -> CachedValueProvider.Result<(AndroidModuleData..AndroidModuleData?)>): CachedValue<(AndroidModuleData..AndroidModuleData?)> defined in org.jetbrains.kotlin.android.synthetic.res[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData..org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData?)

'project' @ [51:43] ==> public final val project: Project defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[DeserializedPropertyDescriptor]

'create' @ [52:48] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: AndroidModuleData?, @NotNull vararg p1: (Any..Any?)): (CachedValueProvider.Result<(AndroidModuleData..AndroidModuleData?)>..CachedValueProvider.Result<(AndroidModuleData..AndroidModuleData?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AndroidModuleData

'super' @ [53:29] ==> <this> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[LazyClassReceiverParameterDescriptor]

'getModuleData' @ [53:35] ==> public open fun getModuleData(): AndroidModuleData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[DeserializedSimpleFunctionDescriptor]

'getPsiTreeChangePreprocessor' @ [54:29] ==> private final fun getPsiTreeChangePreprocessor(): PsiTreeChangePreprocessor defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'getInstance' @ [54:92] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [54:104] ==> public final val project: Project defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[DeserializedPropertyDescriptor]

'_moduleData' @ [58:16] ==> @Volatile private final var _moduleData: CachedValue<AndroidModuleData>? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[PropertyDescriptorImpl]

'value' @ [58:29] ==> public final val <T : (Any..Any?)> CachedValue<AndroidModuleData>.value: (AndroidModuleData..AndroidModuleData?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AndroidModuleData

'EMPTY' @ [58:56] ==> public final val EMPTY: AndroidModuleData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData.Companion[DeserializedPropertyDescriptor]

'project' @ [62:16] ==> public final val project: Project defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[DeserializedPropertyDescriptor]

'getExtensions' @ [62:24] ==> @NotNull public abstract fun <T : (Any..Any?)> getExtensions(@NotNull p0: ExtensionPointName<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>): (Array<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>..Array<out (PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>) defined in com.intellij.openapi.project.Project[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.impl.PsiTreeChangePreprocessor..com.intellij.psi.impl.PsiTreeChangePreprocessor?)

'EP_NAME' @ [62:64] ==> public final val EP_NAME: (ExtensionPointName<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>..ExtensionPointName<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>?) defined in com.intellij.psi.impl.PsiTreeChangePreprocessor[JavaPropertyDescriptor]

'firstIsInstance' @ [62:73] ==> public inline fun <reified T> Array<*>.firstIsInstance(): AndroidPsiTreeChangePreprocessor defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> AndroidPsiTreeChangePreprocessor

'layoutGroup' @ [66:23] ==> value-parameter layoutGroup: AndroidLayoutGroupData defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.doExtractResources[ValueParameterDescriptorImpl]

'layouts' @ [66:35] ==> public final val layouts: List<PsiFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutGroupData[DeserializedPropertyDescriptor]

'map' @ [66:43] ==> public inline fun <T, R> Iterable<PsiFile>.map(transform: (PsiFile) -> AndroidLayout): List<AndroidLayout> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile
    <R> -> AndroidLayout

'arrayListOf' @ [67:29] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<AndroidResource> /* = ArrayList<AndroidResource> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidResource

'layout' @ [68:13] ==> value-parameter layout: PsiFile defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.doExtractResources.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [68:20] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'AndroidXmlVisitor' @ [68:27] ==> public constructor AndroidXmlVisitor(elementCallback: (ResourceIdentifier, String, XmlAttribute) -> Unit) defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidXmlVisitor[ClassConstructorDescriptorImpl]

'resources' @ [69:17] ==> val resources: ArrayList<AndroidResource> /* = ArrayList<AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.doExtractResources.<anonymous>[LocalVariableDescriptor]

'parseAndroidResource' @ [69:30] ==> protected final fun parseAndroidResource(id: ResourceIdentifier, tag: String, sourceElement: PsiElement?): AndroidResource defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[DeserializedSimpleFunctionDescriptor]

'id' @ [69:51] ==> value-parameter id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.doExtractResources.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'widgetType' @ [69:55] ==> value-parameter widgetType: String defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.doExtractResources.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'attribute' @ [69:67] ==> value-parameter attribute: XmlAttribute defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.doExtractResources.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valueElement' @ [69:77] ==> public final val XmlAttribute.valueElement: XmlAttributeValue?[MyPropertyDescriptor]

'AndroidLayout' @ [71:13] ==> public constructor AndroidLayout(resources: List<AndroidResource>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayout[DeserializedClassConstructorDescriptor]

'resources' @ [71:27] ==> val resources: ArrayList<AndroidResource> /* = ArrayList<AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.doExtractResources.<anonymous>[LocalVariableDescriptor]

'AndroidLayoutGroup' @ [74:16] ==> public constructor AndroidLayoutGroup(name: String, layouts: List<AndroidLayout>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutGroup[DeserializedClassConstructorDescriptor]

'layoutGroup' @ [74:35] ==> value-parameter layoutGroup: AndroidLayoutGroupData defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.doExtractResources[ValueParameterDescriptorImpl]

'name' @ [74:47] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutGroupData[DeserializedPropertyDescriptor]

'layouts' @ [74:53] ==> val layouts: List<AndroidLayout> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.doExtractResources[LocalVariableDescriptor]

'propertyDescriptor' @ [78:22] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [78:41] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'pathSegments' @ [78:54] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'fqPath' @ [79:13] ==> val fqPath: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[LocalVariableDescriptor]

'size' @ [79:20] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'SYNTHETIC_PACKAGE_PATH_LENGTH' @ [79:28] ==> public final val SYNTHETIC_PACKAGE_PATH_LENGTH: Int defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyImportedFromObject]

'listOf' @ [79:66] ==> @InlineOnly public inline fun <T> listOf(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'SYNTHETIC_PACKAGE_PATH_LENGTH' @ [82:38] ==> public final val SYNTHETIC_PACKAGE_PATH_LENGTH: Int defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyImportedFromObject]

'if (defaultVariant) 0 else 1' @ [82:71] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'defaultVariant' @ [82:75] ==> value-parameter defaultVariant: Boolean = ... defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[ValueParameterDescriptorImpl]

'fqPath' @ [83:30] ==> val fqPath: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[LocalVariableDescriptor]

'layoutNamePosition' @ [83:37] ==> val layoutNamePosition: Int defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[LocalVariableDescriptor]

'asString' @ [83:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'variantData' @ [85:31] ==> value-parameter variantData: AndroidVariantData defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[ValueParameterDescriptorImpl]

'layouts' @ [85:43] ==> public final val layouts: Map<String, List<PsiFile>> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariantData[DeserializedPropertyDescriptor]

'layoutName' @ [85:51] ==> val layoutName: String defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[LocalVariableDescriptor]

'layoutFiles' @ [86:17] ==> val layoutFiles: List<PsiFile> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[LocalVariableDescriptor]

'isEmpty' @ [86:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [88:32] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[ValueParameterDescriptorImpl]

'name' @ [88:51] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [88:56] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'arrayListOf' @ [90:30] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<PsiElement> /* = ArrayList<PsiElement> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'AndroidXmlVisitor' @ [91:27] ==> public constructor AndroidXmlVisitor(elementCallback: (ResourceIdentifier, String, XmlAttribute) -> Unit) defined in org.jetbrains.kotlin.android.synthetic.idea.AndroidXmlVisitor[ClassConstructorDescriptorImpl]

'retId' @ [92:21] ==> value-parameter retId: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [92:27] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[DeserializedPropertyDescriptor]

'propertyName' @ [92:35] ==> val propertyName: String defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[LocalVariableDescriptor]

'attributes' @ [92:49] ==> val attributes: ArrayList<PsiElement> /* = ArrayList<PsiElement> */ defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[LocalVariableDescriptor]

'add' @ [92:60] ==> public open fun add(element: PsiElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'valueElement' @ [92:64] ==> value-parameter valueElement: XmlAttribute defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle.<anonymous>[ValueParameterDescriptorImpl]

'layoutFiles' @ [95:13] ==> val layoutFiles: List<PsiFile> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[LocalVariableDescriptor]

'forEach' @ [95:25] ==> @HidesMembers public inline fun <T> Iterable<PsiFile>.forEach(action: (PsiFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile

'it' @ [95:35] ==> value-parameter it: PsiFile defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [95:38] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'visitor' @ [95:45] ==> val visitor: AndroidXmlVisitor defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[LocalVariableDescriptor]

'attributes' @ [96:20] ==> val attributes: ArrayList<PsiElement> /* = ArrayList<PsiElement> */ defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.handle[LocalVariableDescriptor]

'getModuleData' @ [99:29] ==> public open fun getModuleData(): AndroidModuleData defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'variants' @ [99:45] ==> public final val variants: List<AndroidVariantData> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData[DeserializedPropertyDescriptor]

'if (variantData.variant.isMainVariant && fqPath.size == SYNTHETIC_PACKAGE_PATH_LENGTH + 2) {
                handle(variantData, true)?.let { return it }
            }
            else if (fqPath[SYNTHETIC_PACKAGE_PATH_LENGTH].asString() == variantData.variant.name) {
                handle(variantData)?.let { return it }
            }' @ [100:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'variantData' @ [100:17] ==> val variantData: AndroidVariantData defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[LocalVariableDescriptor]

'variant' @ [100:29] ==> public final val variant: AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariantData[DeserializedPropertyDescriptor]

'isMainVariant' @ [100:37] ==> public final val isMainVariant: Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariant[DeserializedPropertyDescriptor]

'fqPath' @ [100:54] ==> val fqPath: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[LocalVariableDescriptor]

'size' @ [100:61] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'SYNTHETIC_PACKAGE_PATH_LENGTH' @ [100:69] ==> public final val SYNTHETIC_PACKAGE_PATH_LENGTH: Int defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyImportedFromObject]

'handle' @ [101:17] ==> local final fun handle(variantData: AndroidVariantData, defaultVariant: Boolean = ...): List<PsiElement>? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[SimpleFunctionDescriptorImpl]

'variantData' @ [101:24] ==> val variantData: AndroidVariantData defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[LocalVariableDescriptor]

'let' @ [101:44] ==> @InlineOnly public inline fun <T, R> List<PsiElement>.let(block: (List<PsiElement>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<PsiElement>
    <R> -> Nothing

'it' @ [101:57] ==> value-parameter it: List<PsiElement> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.<anonymous>[ValueParameterDescriptorImpl]

'fqPath' @ [103:22] ==> val fqPath: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[LocalVariableDescriptor]

'SYNTHETIC_PACKAGE_PATH_LENGTH' @ [103:29] ==> public final val SYNTHETIC_PACKAGE_PATH_LENGTH: Int defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyImportedFromObject]

'asString' @ [103:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'variantData' @ [103:74] ==> val variantData: AndroidVariantData defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[LocalVariableDescriptor]

'variant' @ [103:86] ==> public final val variant: AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariantData[DeserializedPropertyDescriptor]

'name' @ [103:94] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariant[DeserializedPropertyDescriptor]

'handle' @ [104:17] ==> local final fun handle(variantData: AndroidVariantData, defaultVariant: Boolean = ...): List<PsiElement>? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[SimpleFunctionDescriptorImpl]

'variantData' @ [104:24] ==> val variantData: AndroidVariantData defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes[LocalVariableDescriptor]

'let' @ [104:38] ==> @InlineOnly public inline fun <T, R> List<PsiElement>.let(block: (List<PsiElement>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<PsiElement>
    <R> -> Nothing

'it' @ [104:51] ==> value-parameter it: List<PsiElement> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.propertyToXmlAttributes.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [108:16] ==> @InlineOnly public inline fun <T> listOf(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'AndroidVariant' @ [111:46] ==> public constructor AndroidVariant(name: String, resDirectories: List<String>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariant[DeserializedClassConstructorDescriptor]

'name' @ [111:61] ==> public final val SourceProvider.name: (String..String?)[MyPropertyDescriptor]

'resDirectories' @ [111:67] ==> public final val SourceProvider.resDirectories: (MutableCollection<(File..File?)>..Collection<(File..File?)>?)[MyPropertyDescriptor]

'map' @ [111:82] ==> public inline fun <T, R> Iterable<(File..File?)>.map(transform: ((File..File?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [111:88] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.toVariant.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [111:91] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'androidFacet' @ [114:13] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[ValueParameterDescriptorImpl]

'module' @ [114:26] ==> public final val AndroidFacet.module: Module[MyPropertyDescriptor]

'androidExtensionsIsExperimental' @ [114:33] ==> internal val Module.androidExtensionsIsExperimental: Boolean defined in org.jetbrains.kotlin.android.synthetic.idea in file ExperimentalUtils.kt[PropertyDescriptorImpl]

'getAndroidModuleInfoExperimental' @ [115:20] ==> private final fun getAndroidModuleInfoExperimental(androidFacet: AndroidFacet): AndroidModule? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'androidFacet' @ [115:53] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[ValueParameterDescriptorImpl]

'androidFacet' @ [118:34] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[ValueParameterDescriptorImpl]

'manifest' @ [118:47] ==> public final val AndroidFacet.manifest: Manifest?[MyPropertyDescriptor]

'`package`' @ [118:57] ==> public final val Manifest.`package`: (GenericAttributeValue<(String..String?)>..GenericAttributeValue<(String..String?)>?)[MyPropertyDescriptor]

'toString' @ [118:68] ==> public open fun toString(): String defined in com.intellij.util.xml.GenericAttributeValue[DeserializedSimpleFunctionDescriptor]

'applicationPackage' @ [120:13] ==> val applicationPackage: String? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[LocalVariableDescriptor]

'androidFacet' @ [121:31] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[ValueParameterDescriptorImpl]

'mainSourceProvider' @ [121:44] ==> public final val AndroidFacet.mainSourceProvider: SourceProvider[MyPropertyDescriptor]

'toVariant' @ [121:63] ==> private final fun SourceProvider.toVariant(): AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'androidFacet' @ [123:32] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[ValueParameterDescriptorImpl]

'java' @ [123:52] ==> public val <T> KClass<out AndroidFacet>.java: Class<out AndroidFacet> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out AndroidFacet)

'getMethod' @ [123:57] ==> @CallerSensitive public open fun getMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'if (method != null) {
                val sourceProviders = method.invoke(androidFacet) as List<SourceProvider>?
                sourceProviders?.map { it.toVariant() } ?: listOf()
            }
            else {
                val model = AndroidModuleModel.get(androidFacet.module)
                model?.flavorSourceProviders?.map { it.toVariant() } ?: listOf(androidFacet.mainSourceProvider.toVariant())
            }' @ [124:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<AndroidVariant>?, elseBranch: List<AndroidVariant>?): List<AndroidVariant>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<AndroidVariant>?

'method' @ [124:55] ==> val method: Method? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[LocalVariableDescriptor]

'method' @ [125:39] ==> val method: Method? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[LocalVariableDescriptor]

'invoke' @ [125:46] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'androidFacet' @ [125:53] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[ValueParameterDescriptorImpl]

'sourceProviders' @ [126:17] ==> val sourceProviders: List<SourceProvider>? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[LocalVariableDescriptor]

'map' @ [126:34] ==> public inline fun <T, R> Iterable<SourceProvider>.map(transform: (SourceProvider) -> AndroidVariant): List<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceProvider
    <R> -> AndroidVariant

'it' @ [126:40] ==> value-parameter it: SourceProvider defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo.<anonymous>[ValueParameterDescriptorImpl]

'toVariant' @ [126:43] ==> private final fun SourceProvider.toVariant(): AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'listOf' @ [126:60] ==> @InlineOnly public inline fun <T> listOf(): List<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariant

'get' @ [129:48] ==> @Nullable public open fun get(@NotNull p0: Module): AndroidModuleModel? defined in com.android.tools.idea.gradle.project.model.AndroidModuleModel[JavaMethodDescriptor]

'androidFacet' @ [129:52] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[ValueParameterDescriptorImpl]

'module' @ [129:65] ==> public final val AndroidFacet.module: Module[MyPropertyDescriptor]

'model' @ [130:17] ==> val model: AndroidModuleModel? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[LocalVariableDescriptor]

'flavorSourceProviders' @ [130:24] ==> public final val AndroidModuleModel.flavorSourceProviders: (MutableList<(SourceProvider..SourceProvider?)>..List<(SourceProvider..SourceProvider?)>)[MyPropertyDescriptor]

'map' @ [130:47] ==> public inline fun <T, R> Iterable<(SourceProvider..SourceProvider?)>.map(transform: ((SourceProvider..SourceProvider?)) -> AndroidVariant): List<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.android.builder.model.SourceProvider..com.android.builder.model.SourceProvider?)
    <R> -> AndroidVariant

'it' @ [130:53] ==> value-parameter it: (SourceProvider..SourceProvider?) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo.<anonymous>[ValueParameterDescriptorImpl]

'toVariant' @ [130:56] ==> private final fun SourceProvider.toVariant(): AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'listOf' @ [130:73] ==> public fun <T> listOf(element: AndroidVariant): List<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariant

'androidFacet' @ [130:80] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[ValueParameterDescriptorImpl]

'mainSourceProvider' @ [130:93] ==> public final val AndroidFacet.mainSourceProvider: SourceProvider[MyPropertyDescriptor]

'toVariant' @ [130:112] ==> private final fun SourceProvider.toVariant(): AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'variants' @ [133:17] ==> val variants: List<AndroidVariant>? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[LocalVariableDescriptor]

'AndroidModule' @ [134:24] ==> public constructor AndroidModule(applicationPackage: String, variants: List<AndroidVariant>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModule[DeserializedClassConstructorDescriptor]

'applicationPackage' @ [134:38] ==> val applicationPackage: String? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[LocalVariableDescriptor]

'listOf' @ [134:58] ==> public fun <T> listOf(element: AndroidVariant): List<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariant

'mainVariant' @ [134:65] ==> val mainVariant: AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[LocalVariableDescriptor]

'variants' @ [134:80] ==> val variants: List<AndroidVariant>? defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfo[LocalVariableDescriptor]

'androidFacet' @ [141:34] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental[ValueParameterDescriptorImpl]

'manifest' @ [141:47] ==> public final val AndroidFacet.manifest: Manifest?[MyPropertyDescriptor]

'`package`' @ [141:57] ==> public final val Manifest.`package`: (GenericAttributeValue<(String..String?)>..GenericAttributeValue<(String..String?)>?)[MyPropertyDescriptor]

'toString' @ [141:68] ==> public open fun toString(): String defined in com.intellij.util.xml.GenericAttributeValue[DeserializedSimpleFunctionDescriptor]

'androidFacet' @ [143:33] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental[ValueParameterDescriptorImpl]

'getAppResources' @ [143:46] ==> @Contract @Nullable public open fun getAppResources(p0: Boolean): AppResourceRepository? defined in org.jetbrains.android.facet.AndroidFacet[JavaMethodDescriptor]

'resourceDirs' @ [143:69] ==> public final val AppResourceRepository.resourceDirs: (MutableSet<(VirtualFile..VirtualFile?)>..Set<(VirtualFile..VirtualFile?)>)[MyPropertyDescriptor]

'orEmpty' @ [143:82] ==> @InlineOnly public inline fun <T> Set<(VirtualFile..VirtualFile?)>?.orEmpty(): Set<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'mapNotNull' @ [143:92] ==> public inline fun <T, R : Any> Iterable<(VirtualFile..VirtualFile?)>.mapNotNull(transform: ((VirtualFile..VirtualFile?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)
    <R : Any> -> String

'it' @ [143:105] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [143:108] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'androidFacet' @ [145:44] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental[ValueParameterDescriptorImpl]

'run' @ [145:57] ==> @InlineOnly public inline fun <T, R> AndroidFacet.run(block: AndroidFacet.() -> List<(String..String?)>): List<(String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidFacet
    <R> -> List<(kotlin.String..kotlin.String?)>

'get' @ [146:65] ==> @Nullable public open fun get(@NotNull p0: Module): AndroidModuleModel? defined in com.android.tools.idea.gradle.project.model.AndroidModuleModel[JavaMethodDescriptor]

'this' @ [146:69] ==> <this> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental.<anonymous>[ReceiverParameterDescriptorImpl]

'module' @ [146:74] ==> public final val AndroidFacet.module: Module[MyPropertyDescriptor]

'allSourceProviders' @ [146:83] ==> public final val AndroidModuleModel.allSourceProviders: (MutableList<(SourceProvider..SourceProvider?)>..List<(SourceProvider..SourceProvider?)>)[MyPropertyDescriptor]

'orEmpty' @ [146:102] ==> @InlineOnly public inline fun <T> List<(SourceProvider..SourceProvider?)>?.orEmpty(): List<(SourceProvider..SourceProvider?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.android.builder.model.SourceProvider..com.android.builder.model.SourceProvider?)

'filter' @ [147:22] ==> public inline fun <T> Iterable<(SourceProvider..SourceProvider?)>.filter(predicate: ((SourceProvider..SourceProvider?)) -> Boolean): List<(SourceProvider..SourceProvider?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.android.builder.model.SourceProvider..com.android.builder.model.SourceProvider?)

'it' @ [147:31] ==> value-parameter it: (SourceProvider..SourceProvider?) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [147:34] ==> public final val SourceProvider.name: (String..String?)[MyPropertyDescriptor]

'flatMap' @ [148:22] ==> public inline fun <T, R> Iterable<(SourceProvider..SourceProvider?)>.flatMap(transform: ((SourceProvider..SourceProvider?)) -> Iterable<(File..File?)>): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.android.builder.model.SourceProvider..com.android.builder.model.SourceProvider?)
    <R> -> (java.io.File..java.io.File?)

'it' @ [148:32] ==> value-parameter it: (SourceProvider..SourceProvider?) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resDirectories' @ [148:35] ==> public final val SourceProvider.resDirectories: (MutableCollection<(File..File?)>..Collection<(File..File?)>?)[MyPropertyDescriptor]

'map' @ [149:22] ==> public inline fun <T, R> Iterable<(File..File?)>.map(transform: ((File..File?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [149:28] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [149:31] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'allResDirectories' @ [151:13] ==> val allResDirectories: List<String> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental[LocalVariableDescriptor]

'resDirsFromSourceProviders' @ [151:33] ==> val resDirsFromSourceProviders: List<(String..String?)> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental.<anonymous>[LocalVariableDescriptor]

'mutableListOf' @ [154:24] ==> public fun <T> mutableListOf(vararg elements: AndroidVariant): MutableList<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariant

'AndroidVariant' @ [154:38] ==> public constructor AndroidVariant(name: String, resDirectories: List<String>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariant[DeserializedClassConstructorDescriptor]

'resDirectoriesForMainVariant' @ [154:61] ==> val resDirectoriesForMainVariant: List<(String..String?)> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental[LocalVariableDescriptor]

'get' @ [156:28] ==> @Nullable public open fun get(@NotNull p0: Module): AndroidModuleModel? defined in com.android.tools.idea.gradle.project.model.AndroidModuleModel[JavaMethodDescriptor]

'androidFacet' @ [156:32] ==> value-parameter androidFacet: AndroidFacet defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental[ValueParameterDescriptorImpl]

'module' @ [156:45] ==> public final val AndroidFacet.module: Module[MyPropertyDescriptor]

'let' @ [156:54] ==> @InlineOnly public inline fun <T, R> AndroidModuleModel.let(block: (AndroidModuleModel) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidModuleModel
    <R> -> Unit

'androidGradleModel' @ [157:13] ==> value-parameter androidGradleModel: AndroidModuleModel defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental.<anonymous>[ValueParameterDescriptorImpl]

'activeSourceProviders' @ [157:32] ==> public final val AndroidModuleModel.activeSourceProviders: (MutableList<(SourceProvider..SourceProvider?)>..List<(SourceProvider..SourceProvider?)>)[MyPropertyDescriptor]

'filter' @ [157:54] ==> public inline fun <T> Iterable<(SourceProvider..SourceProvider?)>.filter(predicate: ((SourceProvider..SourceProvider?)) -> Boolean): List<(SourceProvider..SourceProvider?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.android.builder.model.SourceProvider..com.android.builder.model.SourceProvider?)

'it' @ [157:63] ==> value-parameter it: (SourceProvider..SourceProvider?) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [157:66] ==> public final val SourceProvider.name: (String..String?)[MyPropertyDescriptor]

'forEach' @ [157:83] ==> @HidesMembers public inline fun <T> Iterable<(SourceProvider..SourceProvider?)>.forEach(action: ((SourceProvider..SourceProvider?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.android.builder.model.SourceProvider..com.android.builder.model.SourceProvider?)

'variants' @ [158:17] ==> val variants: MutableList<AndroidVariant> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental[LocalVariableDescriptor]

'sourceProvider' @ [158:29] ==> value-parameter sourceProvider: (SourceProvider..SourceProvider?) defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toVariant' @ [158:44] ==> private final fun SourceProvider.toVariant(): AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'AndroidModule' @ [162:16] ==> public constructor AndroidModule(applicationPackage: String, variants: List<AndroidVariant>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModule[DeserializedClassConstructorDescriptor]

'applicationPackage' @ [162:30] ==> val applicationPackage: String defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental[LocalVariableDescriptor]

'variants' @ [162:50] ==> val variants: MutableList<AndroidVariant> defined in org.jetbrains.kotlin.android.synthetic.idea.res.IDEAndroidLayoutXmlFileManager.getAndroidModuleInfoExperimental[LocalVariableDescriptor]

