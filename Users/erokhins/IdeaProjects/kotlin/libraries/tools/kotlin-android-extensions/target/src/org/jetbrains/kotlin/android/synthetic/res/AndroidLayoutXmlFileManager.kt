'AndroidModuleData' @ [36:21] ==> public constructor AndroidModuleData(module: AndroidModule, variants: List<AndroidVariantData>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData[ClassConstructorDescriptorImpl]

'AndroidModule' @ [36:39] ==> public constructor AndroidModule(applicationPackage: String, variants: List<AndroidVariant>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModule[ClassConstructorDescriptorImpl]

'listOf' @ [36:64] ==> @InlineOnly public inline fun <T> listOf(): List<AndroidVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariant

'listOf' @ [36:75] ==> @InlineOnly public inline fun <T> listOf(): List<AndroidVariantData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariantData

'listOf' @ [45:98] ==> @InlineOnly public inline fun <T> listOf(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'androidModule' @ [48:29] ==> public abstract val androidModule: AndroidModule? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[PropertyDescriptorImpl]

'AndroidModuleData' @ [48:53] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData[FakeCallableDescriptorForObject]

'EMPTY' @ [48:71] ==> public final val EMPTY: AndroidModuleData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData.Companion[PropertyDescriptorImpl]

'AndroidModuleData' @ [49:16] ==> public constructor AndroidModuleData(module: AndroidModule, variants: List<AndroidVariantData>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData[ClassConstructorDescriptorImpl]

'androidModule' @ [49:34] ==> val androidModule: AndroidModule defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getModuleData[LocalVariableDescriptor]

'androidModule' @ [49:49] ==> val androidModule: AndroidModule defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getModuleData[LocalVariableDescriptor]

'variants' @ [49:63] ==> public final val variants: List<AndroidVariant> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModule[PropertyDescriptorImpl]

'map' @ [49:72] ==> public inline fun <T, R> Iterable<AndroidVariant>.map(transform: (AndroidVariant) -> AndroidVariantData): List<AndroidVariantData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidVariant
    <R> -> AndroidVariantData

'getVariantData' @ [49:78] ==> private final fun getVariantData(variant: AndroidVariant): AndroidVariantData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'it' @ [49:93] ==> value-parameter it: AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getModuleData.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [53:37] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in org.jetbrains.kotlin.com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [53:49] ==> public final val project: Project defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[PropertyDescriptorImpl]

'getInstance' @ [54:46] ==> @NotNull public open fun getInstance(): VirtualFileManager defined in org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'arrayListOf' @ [57:31] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<VirtualFile> /* = ArrayList<VirtualFile> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'children' @ [58:35] ==> public final val VirtualFile.children: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)[MyPropertyDescriptor]

'emptyArray' @ [58:47] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<(VirtualFile..VirtualFile?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile..org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile?)

'currentChildren' @ [59:27] ==> val currentChildren: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.getAllChildren[LocalVariableDescriptor]

'if (child.isDirectory) {
                    allChildren.addAll(child.getAllChildren())
                }
                else {
                    allChildren.add(child)
                }' @ [60:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'child' @ [60:21] ==> val child: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.getAllChildren[LocalVariableDescriptor]

'isDirectory' @ [60:27] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'allChildren' @ [61:21] ==> val allChildren: ArrayList<VirtualFile> /* = ArrayList<VirtualFile> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.getAllChildren[LocalVariableDescriptor]

'addAll' @ [61:33] ==> public open fun addAll(elements: Collection<VirtualFile>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'child' @ [61:40] ==> val child: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.getAllChildren[LocalVariableDescriptor]

'getAllChildren' @ [61:46] ==> local final fun VirtualFile.getAllChildren(): List<VirtualFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[SimpleFunctionDescriptorImpl]

'allChildren' @ [64:21] ==> val allChildren: ArrayList<VirtualFile> /* = ArrayList<VirtualFile> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.getAllChildren[LocalVariableDescriptor]

'add' @ [64:33] ==> public open fun add(element: VirtualFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'child' @ [64:37] ==> val child: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.getAllChildren[LocalVariableDescriptor]

'allChildren' @ [67:20] ==> val allChildren: ArrayList<VirtualFile> /* = ArrayList<VirtualFile> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.getAllChildren[LocalVariableDescriptor]

'variant' @ [70:30] ==> value-parameter variant: AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[ValueParameterDescriptorImpl]

'resDirectories' @ [70:38] ==> public final val resDirectories: List<String> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariant[PropertyDescriptorImpl]

'map' @ [70:53] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> VirtualFile?): List<VirtualFile?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> VirtualFile?

'fileManager' @ [70:59] ==> val fileManager: VirtualFileManager defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[LocalVariableDescriptor]

'findFileByUrl' @ [70:71] ==> @Nullable public abstract fun findFileByUrl(@NonNls @NotNull p0: String): VirtualFile? defined in org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'it' @ [70:94] ==> value-parameter it: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[ValueParameterDescriptorImpl]

'resDirectories' @ [71:27] ==> val resDirectories: List<VirtualFile?> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[LocalVariableDescriptor]

'flatMap' @ [71:42] ==> public inline fun <T, R> Iterable<VirtualFile?>.flatMap(transform: (VirtualFile?) -> Iterable<VirtualFile>): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile?
    <R> -> VirtualFile

'it' @ [71:52] ==> value-parameter it: VirtualFile? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[ValueParameterDescriptorImpl]

'getAllChildren' @ [71:56] ==> local final fun VirtualFile.getAllChildren(): List<VirtualFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[SimpleFunctionDescriptorImpl]

'listOf' @ [71:76] ==> @InlineOnly public inline fun <T> listOf(): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'allChildren' @ [73:30] ==> val allChildren: List<VirtualFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[LocalVariableDescriptor]

'filter' @ [73:42] ==> public inline fun <T> Iterable<VirtualFile>.filter(predicate: (VirtualFile) -> Boolean): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'it' @ [73:51] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [73:54] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'name' @ [73:61] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'startsWith' @ [73:66] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [73:90] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [73:93] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'toLowerCase' @ [73:98] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [73:112] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'allLayoutFiles' @ [74:33] ==> val allLayoutFiles: List<VirtualFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[LocalVariableDescriptor]

'fold' @ [74:48] ==> public inline fun <T, R> Iterable<VirtualFile>.fold(initial: ArrayList<PsiFile>, operation: (ArrayList<PsiFile>, VirtualFile) -> ArrayList<PsiFile>): ArrayList<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> ArrayList<PsiFile>

'ArrayList' @ [74:53] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiFile

'allLayoutFiles' @ [74:72] ==> val allLayoutFiles: List<VirtualFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[LocalVariableDescriptor]

'size' @ [74:87] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'psiManager' @ [75:27] ==> val psiManager: PsiManager defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[LocalVariableDescriptor]

'findFile' @ [75:38] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in org.jetbrains.kotlin.com.intellij.psi.PsiManager[JavaMethodDescriptor]

'file' @ [75:47] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[ValueParameterDescriptorImpl]

'psiFile' @ [76:17] ==> val psiFile: PsiFile? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[LocalVariableDescriptor]

'parent' @ [76:26] ==> public final val PsiFile.parent: PsiDirectory?[MyPropertyDescriptor]

'list' @ [77:17] ==> value-parameter list: ArrayList<PsiFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[ValueParameterDescriptorImpl]

'psiFile' @ [77:25] ==> val psiFile: PsiFile? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[LocalVariableDescriptor]

'list' @ [79:13] ==> value-parameter list: ArrayList<PsiFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[ValueParameterDescriptorImpl]

'allLayoutPsiFiles' @ [82:36] ==> val allLayoutPsiFiles: ArrayList<PsiFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[LocalVariableDescriptor]

'groupBy' @ [83:18] ==> public inline fun <T, K> Iterable<PsiFile>.groupBy(keySelector: (PsiFile) -> String): Map<String, List<PsiFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile
    <K> -> String

'it' @ [83:28] ==> value-parameter it: PsiFile defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [83:31] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'substringBeforeLast' @ [83:36] ==> public fun String.substringBeforeLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mapValues' @ [84:18] ==> public inline fun <K, V, R> Map<out String, List<PsiFile>>.mapValues(transform: (Map.Entry<String, List<PsiFile>>) -> List<PsiFile>): Map<String, List<PsiFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<PsiFile>
    <R> -> List<PsiFile>

'it' @ [84:30] ==> value-parameter it: Map.Entry<String, List<PsiFile>> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [84:33] ==> public abstract val value: List<PsiFile> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'sortedBy' @ [84:39] ==> public inline fun <T, R : Comparable<Int>> Iterable<PsiFile>.sortedBy(crossinline selector: (PsiFile) -> Int?): List<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile
    <R : Comparable<R>> -> Int

'it' @ [84:50] ==> value-parameter it: PsiFile defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [84:53] ==> public final val PsiFile.parent: PsiDirectory?[MyPropertyDescriptor]

'name' @ [84:62] ==> public final var PsiDirectory.name: String[MyPropertyDescriptor]

'length' @ [84:67] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'AndroidVariantData' @ [86:16] ==> public constructor AndroidVariantData(variant: AndroidVariant, layouts: Map<String, List<PsiFile>>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariantData[ClassConstructorDescriptorImpl]

'variant' @ [86:35] ==> value-parameter variant: AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[ValueParameterDescriptorImpl]

'layoutNameToXmlFiles' @ [86:44] ==> val layoutNameToXmlFiles: Map<String, List<PsiFile>> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.getVariantData[LocalVariableDescriptor]

'filterDuplicates' @ [90:16] ==> private final fun filterDuplicates(layoutGroup: AndroidLayoutGroup): List<AndroidResource> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'doExtractResources' @ [90:33] ==> protected abstract fun doExtractResources(layoutGroup: AndroidLayoutGroupData, module: ModuleDescriptor): AndroidLayoutGroup defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'layoutGroupFiles' @ [90:52] ==> value-parameter layoutGroupFiles: AndroidLayoutGroupData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.extractResources[ValueParameterDescriptorImpl]

'module' @ [90:70] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.extractResources[ValueParameterDescriptorImpl]

'when (tag) {
            "fragment" -> AndroidResource.Fragment(id, sourceElement)
            "include" -> AndroidResource.Widget(id, AndroidConst.VIEW_FQNAME, sourceElement)
            else -> AndroidResource.Widget(id, tag, sourceElement)
        }' @ [96:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AndroidResource, entry1: AndroidResource, entry2: AndroidResource): AndroidResource[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AndroidResource

'tag' @ [96:22] ==> value-parameter tag: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.parseAndroidResource[ValueParameterDescriptorImpl]

'Fragment' @ [97:43] ==> public constructor Fragment(id: ResourceIdentifier, sourceElement: PsiElement?, partiallyDefined: Boolean = ...) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource.Fragment[ClassConstructorDescriptorImpl]

'id' @ [97:52] ==> value-parameter id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.parseAndroidResource[ValueParameterDescriptorImpl]

'sourceElement' @ [97:56] ==> value-parameter sourceElement: PsiElement? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.parseAndroidResource[ValueParameterDescriptorImpl]

'Widget' @ [98:42] ==> public constructor Widget(id: ResourceIdentifier, xmlType: String, sourceElement: PsiElement?, partiallyDefined: Boolean = ...) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource.Widget[ClassConstructorDescriptorImpl]

'id' @ [98:49] ==> value-parameter id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.parseAndroidResource[ValueParameterDescriptorImpl]

'AndroidConst' @ [98:53] ==> public object AndroidConst defined in org.jetbrains.kotlin.android.synthetic in file AndroidConst.kt[FakeCallableDescriptorForObject]

'VIEW_FQNAME' @ [98:66] ==> public final val VIEW_FQNAME: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'sourceElement' @ [98:79] ==> value-parameter sourceElement: PsiElement? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.parseAndroidResource[ValueParameterDescriptorImpl]

'Widget' @ [99:37] ==> public constructor Widget(id: ResourceIdentifier, xmlType: String, sourceElement: PsiElement?, partiallyDefined: Boolean = ...) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource.Widget[ClassConstructorDescriptorImpl]

'id' @ [99:44] ==> value-parameter id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.parseAndroidResource[ValueParameterDescriptorImpl]

'tag' @ [99:48] ==> value-parameter tag: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.parseAndroidResource[ValueParameterDescriptorImpl]

'sourceElement' @ [99:53] ==> value-parameter sourceElement: PsiElement? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.parseAndroidResource[ValueParameterDescriptorImpl]

'linkedMapOf' @ [104:27] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<String, AndroidResource> /* = LinkedHashMap<String, AndroidResource> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> AndroidResource

'hashSetOf' @ [105:34] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'layoutGroup' @ [107:31] ==> value-parameter layoutGroup: AndroidLayoutGroup defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[ValueParameterDescriptorImpl]

'layouts' @ [107:43] ==> public final val layouts: List<AndroidLayout> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutGroup[PropertyDescriptorImpl]

'flatMap' @ [107:51] ==> public inline fun <T, R> Iterable<AndroidLayout>.flatMap(transform: (AndroidLayout) -> Iterable<AndroidResource>): List<AndroidResource> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidLayout
    <R> -> AndroidResource

'it' @ [107:61] ==> value-parameter it: AndroidLayout defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'resources' @ [107:64] ==> public final val resources: List<AndroidResource> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayout[PropertyDescriptorImpl]

'groupBy' @ [107:76] ==> public inline fun <T, K> Iterable<AndroidResource>.groupBy(keySelector: (AndroidResource) -> String): Map<String, List<AndroidResource>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidResource
    <K> -> String

'it' @ [108:22] ==> value-parameter it: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [108:25] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'if (id.packageName == null) id.name else id.packageName + "/" + id.name' @ [109:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'id' @ [109:17] ==> val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates.<anonymous>[LocalVariableDescriptor]

'packageName' @ [109:20] ==> public final val packageName: String? defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'id' @ [109:41] ==> val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates.<anonymous>[LocalVariableDescriptor]

'name' @ [109:44] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'id' @ [109:54] ==> val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates.<anonymous>[LocalVariableDescriptor]

'packageName' @ [109:57] ==> public final val packageName: String? defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'id' @ [109:77] ==> val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates.<anonymous>[LocalVariableDescriptor]

'name' @ [109:80] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'resourcesByName' @ [112:27] ==> val resourcesByName: Map<String, List<AndroidResource>> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'values' @ [112:43] ==> public abstract val values: Collection<List<AndroidResource>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'resources' @ [113:38] ==> val resources: List<AndroidResource> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'size' @ [113:48] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'layoutGroup' @ [113:55] ==> value-parameter layoutGroup: AndroidLayoutGroup defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[ValueParameterDescriptorImpl]

'layouts' @ [113:67] ==> public final val layouts: List<AndroidLayout> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutGroup[PropertyDescriptorImpl]

'size' @ [113:75] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'resources' @ [115:25] ==> val resources: List<AndroidResource> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'if (res.id.name in resourceMap) {
                    val existing = resourceMap[res.id.name]!!

                    if (!res.sameClass(existing) || res.id.packageName != existing.id.packageName) {
                        resourcesToExclude.add(res.id.name)
                    }
                    else if (res is AndroidResource.Widget && existing is AndroidResource.Widget) {
                        // Widgets with the same id but different types exist.
                        if (res.xmlType != existing.xmlType && existing.xmlType != AndroidConst.VIEW_FQNAME) {
                            val mergedWidget = AndroidResource.Widget(
                                    res.id, AndroidConst.VIEW_FQNAME, res.sourceElement, isPartiallyDefined)
                            resourceMap.put(res.id.name, mergedWidget)
                        }
                    }
                }
                else if (isPartiallyDefined) {
                    resourceMap.put(res.id.name, res.partiallyDefined())
                }
                else {
                    resourceMap.put(res.id.name, res)
                }' @ [116:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'res' @ [116:21] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'id' @ [116:25] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'name' @ [116:28] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'resourceMap' @ [116:36] ==> val resourceMap: LinkedHashMap<String, AndroidResource> /* = LinkedHashMap<String, AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'resourceMap' @ [117:36] ==> val resourceMap: LinkedHashMap<String, AndroidResource> /* = LinkedHashMap<String, AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'res' @ [117:48] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'id' @ [117:52] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'name' @ [117:55] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'if (!res.sameClass(existing) || res.id.packageName != existing.id.packageName) {
                        resourcesToExclude.add(res.id.name)
                    }
                    else if (res is AndroidResource.Widget && existing is AndroidResource.Widget) {
                        // Widgets with the same id but different types exist.
                        if (res.xmlType != existing.xmlType && existing.xmlType != AndroidConst.VIEW_FQNAME) {
                            val mergedWidget = AndroidResource.Widget(
                                    res.id, AndroidConst.VIEW_FQNAME, res.sourceElement, isPartiallyDefined)
                            resourceMap.put(res.id.name, mergedWidget)
                        }
                    }' @ [119:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [119:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'res' @ [119:26] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'sameClass' @ [119:30] ==> public open fun sameClass(other: AndroidResource): Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[SimpleFunctionDescriptorImpl]

'existing' @ [119:40] ==> val existing: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'res' @ [119:53] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'id' @ [119:57] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'packageName' @ [119:60] ==> public final val packageName: String? defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'existing' @ [119:75] ==> val existing: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'id' @ [119:84] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'packageName' @ [119:87] ==> public final val packageName: String? defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'resourcesToExclude' @ [120:25] ==> val resourcesToExclude: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'add' @ [120:44] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'res' @ [120:48] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'id' @ [120:52] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'name' @ [120:55] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'res' @ [122:30] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'existing' @ [122:63] ==> val existing: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'res' @ [124:29] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'xmlType' @ [124:33] ==> public final val xmlType: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource.Widget[PropertyDescriptorImpl]

'existing' @ [124:44] ==> val existing: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'xmlType' @ [124:53] ==> public final val xmlType: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource.Widget[PropertyDescriptorImpl]

'existing' @ [124:64] ==> val existing: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'xmlType' @ [124:73] ==> public final val xmlType: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource.Widget[PropertyDescriptorImpl]

'AndroidConst' @ [124:84] ==> public object AndroidConst defined in org.jetbrains.kotlin.android.synthetic in file AndroidConst.kt[FakeCallableDescriptorForObject]

'VIEW_FQNAME' @ [124:97] ==> public final val VIEW_FQNAME: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'Widget' @ [125:64] ==> public constructor Widget(id: ResourceIdentifier, xmlType: String, sourceElement: PsiElement?, partiallyDefined: Boolean = ...) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource.Widget[ClassConstructorDescriptorImpl]

'res' @ [126:37] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'id' @ [126:41] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'AndroidConst' @ [126:45] ==> public object AndroidConst defined in org.jetbrains.kotlin.android.synthetic in file AndroidConst.kt[FakeCallableDescriptorForObject]

'VIEW_FQNAME' @ [126:58] ==> public final val VIEW_FQNAME: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'res' @ [126:71] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'sourceElement' @ [126:75] ==> public final val sourceElement: PsiElement? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'isPartiallyDefined' @ [126:90] ==> val isPartiallyDefined: Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'resourceMap' @ [127:29] ==> val resourceMap: LinkedHashMap<String, AndroidResource> /* = LinkedHashMap<String, AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'put' @ [127:41] ==> public open fun put(key: String, value: AndroidResource): AndroidResource? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'res' @ [127:45] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'id' @ [127:49] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'name' @ [127:52] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'mergedWidget' @ [127:58] ==> val mergedWidget: AndroidResource.Widget defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'if (isPartiallyDefined) {
                    resourceMap.put(res.id.name, res.partiallyDefined())
                }
                else {
                    resourceMap.put(res.id.name, res)
                }' @ [131:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AndroidResource?, elseBranch: AndroidResource?): AndroidResource?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AndroidResource?

'isPartiallyDefined' @ [131:26] ==> val isPartiallyDefined: Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'resourceMap' @ [132:21] ==> val resourceMap: LinkedHashMap<String, AndroidResource> /* = LinkedHashMap<String, AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'put' @ [132:33] ==> public open fun put(key: String, value: AndroidResource): AndroidResource? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'res' @ [132:37] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'id' @ [132:41] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'name' @ [132:44] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'res' @ [132:50] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'partiallyDefined' @ [132:54] ==> public open fun partiallyDefined(): AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[SimpleFunctionDescriptorImpl]

'resourceMap' @ [135:21] ==> val resourceMap: LinkedHashMap<String, AndroidResource> /* = LinkedHashMap<String, AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'put' @ [135:33] ==> public open fun put(key: String, value: AndroidResource): AndroidResource? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'res' @ [135:37] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'id' @ [135:41] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'name' @ [135:44] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'res' @ [135:50] ==> val res: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'resourceMap' @ [140:9] ==> val resourceMap: LinkedHashMap<String, AndroidResource> /* = LinkedHashMap<String, AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'keys' @ [140:21] ==> public open val keys: MutableSet<String> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'removeAll' @ [140:26] ==> public abstract fun removeAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'resourcesToExclude' @ [140:36] ==> val resourcesToExclude: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'resourceMap' @ [141:16] ==> val resourceMap: LinkedHashMap<String, AndroidResource> /* = LinkedHashMap<String, AndroidResource> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.filterDuplicates[LocalVariableDescriptor]

'values' @ [141:28] ==> public open val values: MutableCollection<AndroidResource> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'toList' @ [141:35] ==> public fun <T> Iterable<AndroidResource>.toList(): List<AndroidResource> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AndroidResource

'getService' @ [146:48] ==> @Nullable public open fun <T : (Any..Any?)> getService(@NotNull p0: Module, @NotNull p1: Class<(AndroidLayoutXmlFileManager..AndroidLayoutXmlFileManager?)>): AndroidLayoutXmlFileManager? defined in org.jetbrains.kotlin.com.intellij.openapi.module.ModuleServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AndroidLayoutXmlFileManager

'module' @ [146:59] ==> value-parameter module: Module defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.Companion.getInstance[ValueParameterDescriptorImpl]

'AndroidLayoutXmlFileManager' @ [146:67] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[FakeCallableDescriptorForObject]

'java' @ [146:102] ==> public val <T> KClass<AndroidLayoutXmlFileManager>.java: Class<AndroidLayoutXmlFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AndroidLayoutXmlFileManager

'service' @ [147:20] ==> val service: AndroidLayoutXmlFileManager? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.Companion.getInstance[LocalVariableDescriptor]

'module' @ [147:31] ==> value-parameter module: Module defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager.Companion.getInstance[ValueParameterDescriptorImpl]

'getComponent' @ [147:38] ==> public abstract fun <T : (Any..Any?)> getComponent(@NotNull p0: Class<(AndroidLayoutXmlFileManager..AndroidLayoutXmlFileManager?)>): (AndroidLayoutXmlFileManager..AndroidLayoutXmlFileManager?) defined in org.jetbrains.kotlin.com.intellij.openapi.module.Module[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AndroidLayoutXmlFileManager

'AndroidLayoutXmlFileManager' @ [147:51] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[FakeCallableDescriptorForObject]

'java' @ [147:86] ==> public val <T> KClass<AndroidLayoutXmlFileManager>.java: Class<AndroidLayoutXmlFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AndroidLayoutXmlFileManager

