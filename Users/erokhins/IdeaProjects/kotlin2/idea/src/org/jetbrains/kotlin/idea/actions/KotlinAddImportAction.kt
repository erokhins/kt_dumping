'element' @ [62:16] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction[ValueParameterDescriptorImpl]

'containingKtFile' @ [62:24] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'Prioritizer' @ [63:23] ==> public constructor Prioritizer(file: KtFile, compareNames: Boolean = ...) defined in org.jetbrains.kotlin.idea.actions.Prioritizer[ClassConstructorDescriptorImpl]

'element' @ [63:35] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction[ValueParameterDescriptorImpl]

'containingKtFile' @ [63:43] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'fqNames' @ [64:20] ==> value-parameter fqNames: Collection<FqName> defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction[ValueParameterDescriptorImpl]

'mapNotNull' @ [64:28] ==> public inline fun <T, R : Any> Iterable<FqName>.mapNotNull(transform: (FqName) -> Prioritizer.VariantWithPriority?): List<Prioritizer.VariantWithPriority> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R : Any> -> VariantWithPriority

'file' @ [65:37] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction[LocalVariableDescriptor]

'resolveImportReference' @ [65:42] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'fqName' @ [65:65] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction.<anonymous>[ValueParameterDescriptorImpl]

'sameFqNameDescriptors' @ [66:24] ==> val sameFqNameDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction.<anonymous>[LocalVariableDescriptor]

'map' @ [66:46] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> Prioritizer.Priority): List<Prioritizer.Priority> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Priority

'prioritizer' @ [66:52] ==> val prioritizer: Prioritizer defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction[LocalVariableDescriptor]

'priority' @ [66:64] ==> public final fun priority(descriptor: DeclarationDescriptor): Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.Prioritizer[SimpleFunctionDescriptorImpl]

'it' @ [66:73] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'min' @ [66:79] ==> public fun <T : Comparable<Prioritizer.Priority>> Iterable<Prioritizer.Priority>.min(): Prioritizer.Priority? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Priority

'VariantWithPriority' @ [67:21] ==> public constructor VariantWithPriority(variant: AutoImportVariant, priority: Prioritizer.Priority) defined in org.jetbrains.kotlin.idea.actions.Prioritizer.VariantWithPriority[ClassConstructorDescriptorImpl]

'SingleImportVariant' @ [67:41] ==> public constructor SingleImportVariant(excludeFqNameCheck: FqName, descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.actions.SingleImportVariant[ClassConstructorDescriptorImpl]

'fqName' @ [67:61] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction.<anonymous>[ValueParameterDescriptorImpl]

'sameFqNameDescriptors' @ [67:69] ==> val sameFqNameDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction.<anonymous>[LocalVariableDescriptor]

'priority' @ [67:93] ==> val priority: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction.<anonymous>[LocalVariableDescriptor]

'sortedBy' @ [68:7] ==> public inline fun <T, R : Comparable<Prioritizer.Priority>> Iterable<Prioritizer.VariantWithPriority>.sortedBy(crossinline selector: (Prioritizer.VariantWithPriority) -> Prioritizer.Priority?): List<Prioritizer.VariantWithPriority> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariantWithPriority
    <R : Comparable<R>> -> Priority

'it' @ [68:18] ==> value-parameter it: Prioritizer.VariantWithPriority defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction.<anonymous>[ValueParameterDescriptorImpl]

'priority' @ [68:21] ==> public final val priority: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.Prioritizer.VariantWithPriority[PropertyDescriptorImpl]

'map' @ [68:32] ==> public inline fun <T, R> Iterable<Prioritizer.VariantWithPriority>.map(transform: (Prioritizer.VariantWithPriority) -> AutoImportVariant): List<AutoImportVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariantWithPriority
    <R> -> AutoImportVariant

'it' @ [68:38] ==> value-parameter it: Prioritizer.VariantWithPriority defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction.<anonymous>[ValueParameterDescriptorImpl]

'variant' @ [68:41] ==> public final val variant: AutoImportVariant defined in org.jetbrains.kotlin.idea.actions.Prioritizer.VariantWithPriority[PropertyDescriptorImpl]

'KotlinAddImportAction' @ [70:12] ==> internal constructor KotlinAddImportAction(project: Project, editor: Editor, element: KtElement, variants: List<AutoImportVariant>) defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[ClassConstructorDescriptorImpl]

'project' @ [70:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction[ValueParameterDescriptorImpl]

'editor' @ [70:43] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction[ValueParameterDescriptorImpl]

'element' @ [70:51] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction[ValueParameterDescriptorImpl]

'variants' @ [70:60] ==> val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.createSingleImportAction[LocalVariableDescriptor]

'element' @ [79:16] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor[ValueParameterDescriptorImpl]

'containingKtFile' @ [79:24] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'Prioritizer' @ [80:23] ==> public constructor Prioritizer(file: KtFile, compareNames: Boolean = ...) defined in org.jetbrains.kotlin.idea.actions.Prioritizer[ClassConstructorDescriptorImpl]

'element' @ [80:35] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor[ValueParameterDescriptorImpl]

'containingKtFile' @ [80:43] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'fqNames' @ [81:20] ==> value-parameter fqNames: Collection<FqName> defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor[ValueParameterDescriptorImpl]

'mapNotNull' @ [81:28] ==> public inline fun <T, R : Any> Iterable<FqName>.mapNotNull(transform: (FqName) -> Prioritizer.VariantWithPriority?): List<Prioritizer.VariantWithPriority> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R : Any> -> VariantWithPriority

'file' @ [82:37] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor[LocalVariableDescriptor]

'resolveImportReference' @ [82:42] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'fqName' @ [82:65] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [82:72] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'filterIsInstance' @ [83:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassDescriptor

'flatMap' @ [84:18] ==> public inline fun <T, R> Iterable<ClassDescriptor>.flatMap(transform: (ClassDescriptor) -> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [84:28] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructors' @ [84:31] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'sameFqNameDescriptors' @ [86:24] ==> val sameFqNameDescriptors: List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor.<anonymous>[LocalVariableDescriptor]

'map' @ [86:46] ==> public inline fun <T, R> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.map(transform: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Prioritizer.Priority): List<Prioritizer.Priority> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)
    <R> -> Priority

'prioritizer' @ [86:52] ==> val prioritizer: Prioritizer defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor[LocalVariableDescriptor]

'priority' @ [86:64] ==> public final fun priority(descriptor: DeclarationDescriptor): Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.Prioritizer[SimpleFunctionDescriptorImpl]

'it' @ [86:73] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'min' @ [86:79] ==> public fun <T : Comparable<Prioritizer.Priority>> Iterable<Prioritizer.Priority>.min(): Prioritizer.Priority? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Priority

'VariantWithPriority' @ [87:21] ==> public constructor VariantWithPriority(variant: AutoImportVariant, priority: Prioritizer.Priority) defined in org.jetbrains.kotlin.idea.actions.Prioritizer.VariantWithPriority[ClassConstructorDescriptorImpl]

'SingleImportVariant' @ [87:41] ==> public constructor SingleImportVariant(excludeFqNameCheck: FqName, descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.actions.SingleImportVariant[ClassConstructorDescriptorImpl]

'fqName' @ [87:61] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor.<anonymous>[ValueParameterDescriptorImpl]

'sameFqNameDescriptors' @ [87:69] ==> val sameFqNameDescriptors: List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor.<anonymous>[LocalVariableDescriptor]

'priority' @ [87:93] ==> val priority: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor.<anonymous>[LocalVariableDescriptor]

'sortedBy' @ [88:7] ==> public inline fun <T, R : Comparable<Prioritizer.Priority>> Iterable<Prioritizer.VariantWithPriority>.sortedBy(crossinline selector: (Prioritizer.VariantWithPriority) -> Prioritizer.Priority?): List<Prioritizer.VariantWithPriority> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariantWithPriority
    <R : Comparable<R>> -> Priority

'it' @ [88:18] ==> value-parameter it: Prioritizer.VariantWithPriority defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor.<anonymous>[ValueParameterDescriptorImpl]

'priority' @ [88:21] ==> public final val priority: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.Prioritizer.VariantWithPriority[PropertyDescriptorImpl]

'map' @ [88:32] ==> public inline fun <T, R> Iterable<Prioritizer.VariantWithPriority>.map(transform: (Prioritizer.VariantWithPriority) -> AutoImportVariant): List<AutoImportVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariantWithPriority
    <R> -> AutoImportVariant

'it' @ [88:38] ==> value-parameter it: Prioritizer.VariantWithPriority defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor.<anonymous>[ValueParameterDescriptorImpl]

'variant' @ [88:41] ==> public final val variant: AutoImportVariant defined in org.jetbrains.kotlin.idea.actions.Prioritizer.VariantWithPriority[PropertyDescriptorImpl]

'KotlinAddImportAction' @ [89:12] ==> internal constructor KotlinAddImportAction(project: Project, editor: Editor, element: KtElement, variants: List<AutoImportVariant>) defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[ClassConstructorDescriptorImpl]

'project' @ [89:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor[ValueParameterDescriptorImpl]

'editor' @ [89:43] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor[ValueParameterDescriptorImpl]

'element' @ [89:51] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor[ValueParameterDescriptorImpl]

'variants' @ [89:60] ==> val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.createSingleImportActionForConstructor[LocalVariableDescriptor]

'DescriptorGroupPrioritizer' @ [99:23] ==> public constructor DescriptorGroupPrioritizer(file: KtFile) defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer[ClassConstructorDescriptorImpl]

'element' @ [99:50] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[ValueParameterDescriptorImpl]

'containingKtFile' @ [99:58] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'element' @ [101:16] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[ValueParameterDescriptorImpl]

'containingKtFile' @ [101:24] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'fqNames' @ [102:20] ==> value-parameter fqNames: Collection<FqName> defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[ValueParameterDescriptorImpl]

'groupBy' @ [103:14] ==> public inline fun <T, K> Iterable<FqName>.groupBy(keySelector: (FqName) -> (FqName..FqName?)): Map<(FqName..FqName?), List<FqName>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <K> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'it' @ [103:24] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[ValueParameterDescriptorImpl]

'parentOrNull' @ [103:27] ==> public fun FqName.parentOrNull(): FqName? defined in org.jetbrains.kotlin.name[DeserializedSimpleFunctionDescriptor]

'ROOT' @ [103:52] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'map' @ [104:14] ==> public inline fun <K, V, R> Map<out (FqName..FqName?), List<FqName>>.map(transform: (Map.Entry<(FqName..FqName?), List<FqName>>) -> DescriptorGroupPrioritizer.VariantWithPriority): List<DescriptorGroupPrioritizer.VariantWithPriority> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V> -> List<FqName>
    <R> -> VariantWithPriority

'it' @ [105:42] ==> value-parameter it: Map.Entry<(FqName..FqName?), List<FqName>> defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [105:45] ==> public abstract val value: List<FqName> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'samePackageFqNames' @ [106:35] ==> val samePackageFqNames: List<FqName> defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [106:54] ==> public inline fun <T, R> Iterable<FqName>.flatMap(transform: (FqName) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> DeclarationDescriptor

'file' @ [106:64] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[LocalVariableDescriptor]

'resolveImportReference' @ [106:69] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'it' @ [106:92] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (samePackageFqNames.size > 1) {
                    GroupedImportVariant(autoImportDescription, descriptors)
                }
                else {
                    SingleImportVariant(samePackageFqNames.first(), descriptors)
                }' @ [107:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AutoImportVariant, elseBranch: AutoImportVariant): AutoImportVariant[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AutoImportVariant

'samePackageFqNames' @ [107:35] ==> val samePackageFqNames: List<FqName> defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[LocalVariableDescriptor]

'size' @ [107:54] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'GroupedImportVariant' @ [108:21] ==> public constructor GroupedImportVariant(autoImportDescription: String, descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.actions.GroupedImportVariant[ClassConstructorDescriptorImpl]

'autoImportDescription' @ [108:42] ==> value-parameter autoImportDescription: String defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[ValueParameterDescriptorImpl]

'descriptors' @ [108:65] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[LocalVariableDescriptor]

'SingleImportVariant' @ [111:21] ==> public constructor SingleImportVariant(excludeFqNameCheck: FqName, descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.actions.SingleImportVariant[ClassConstructorDescriptorImpl]

'samePackageFqNames' @ [111:41] ==> val samePackageFqNames: List<FqName> defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[LocalVariableDescriptor]

'first' @ [111:60] ==> public fun <T> List<FqName>.first(): FqName defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'descriptors' @ [111:69] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[LocalVariableDescriptor]

'prioritizer' @ [114:32] ==> val prioritizer: DescriptorGroupPrioritizer defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[LocalVariableDescriptor]

'priority' @ [114:44] ==> public final fun priority(descriptors: List<DeclarationDescriptor>): DescriptorGroupPrioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer[SimpleFunctionDescriptorImpl]

'descriptors' @ [114:53] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[LocalVariableDescriptor]

'VariantWithPriority' @ [115:44] ==> public constructor VariantWithPriority(variant: AutoImportVariant, priority: DescriptorGroupPrioritizer.Priority) defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.VariantWithPriority[ClassConstructorDescriptorImpl]

'variant' @ [115:64] ==> val variant: AutoImportVariant defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[LocalVariableDescriptor]

'priority' @ [115:73] ==> val priority: DescriptorGroupPrioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[LocalVariableDescriptor]

'sortedBy' @ [117:14] ==> public inline fun <T, R : Comparable<DescriptorGroupPrioritizer.Priority>> Iterable<DescriptorGroupPrioritizer.VariantWithPriority>.sortedBy(crossinline selector: (DescriptorGroupPrioritizer.VariantWithPriority) -> DescriptorGroupPrioritizer.Priority?): List<DescriptorGroupPrioritizer.VariantWithPriority> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariantWithPriority
    <R : Comparable<R>> -> Priority

'it' @ [118:17] ==> value-parameter it: DescriptorGroupPrioritizer.VariantWithPriority defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[ValueParameterDescriptorImpl]

'priority' @ [118:20] ==> public final val priority: DescriptorGroupPrioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.VariantWithPriority[PropertyDescriptorImpl]

'map' @ [120:14] ==> public inline fun <T, R> Iterable<DescriptorGroupPrioritizer.VariantWithPriority>.map(transform: (DescriptorGroupPrioritizer.VariantWithPriority) -> AutoImportVariant): List<AutoImportVariant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariantWithPriority
    <R> -> AutoImportVariant

'it' @ [120:20] ==> value-parameter it: DescriptorGroupPrioritizer.VariantWithPriority defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction.<anonymous>[ValueParameterDescriptorImpl]

'variant' @ [120:23] ==> public final val variant: AutoImportVariant defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.VariantWithPriority[PropertyDescriptorImpl]

'KotlinAddImportAction' @ [122:12] ==> internal constructor KotlinAddImportAction(project: Project, editor: Editor, element: KtElement, variants: List<AutoImportVariant>) defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[ClassConstructorDescriptorImpl]

'project' @ [122:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[ValueParameterDescriptorImpl]

'editor' @ [122:43] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[ValueParameterDescriptorImpl]

'element' @ [122:51] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[ValueParameterDescriptorImpl]

'variants' @ [122:60] ==> val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.createGroupedImportsAction[LocalVariableDescriptor]

'variants' @ [135:13] ==> private final val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'isEmpty' @ [135:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'getMessage' @ [137:43] ==> public open fun getMessage(p0: Boolean, p1: (String..String?)): (String..String?) defined in com.intellij.codeInsight.daemon.impl.ShowAutoImportPass[JavaMethodDescriptor]

'variants' @ [137:54] ==> private final val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'size' @ [137:63] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'variants' @ [137:73] ==> private final val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'first' @ [137:82] ==> public fun <T> List<AutoImportVariant>.first(): AutoImportVariant defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AutoImportVariant

'hint' @ [137:90] ==> public abstract val hint: String defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant[PropertyDescriptorImpl]

'getInstance' @ [138:21] ==> public open fun getInstance(): (HintManager..HintManager?) defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'showQuestionHint' @ [138:35] ==> public abstract fun showQuestionHint(@NotNull p0: Editor, @NotNull p1: String, p2: Int, p3: Int, @NotNull p4: QuestionAction): Unit defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'editor' @ [138:52] ==> private final val editor: Editor defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'hintText' @ [138:60] ==> val hintText: (String..String?) defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.showHint[LocalVariableDescriptor]

'element' @ [138:70] ==> private final val element: KtElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'textOffset' @ [138:78] ==> public final val KtElement.textOffset: Int[MyPropertyDescriptor]

'element' @ [138:90] ==> private final val element: KtElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'textRange' @ [138:98] ==> public final val KtElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [138:110] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'this' @ [138:121] ==> <this> defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[LazyClassReceiverParameterDescriptor]

'getInstance' @ [144:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [144:40] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'commitAllDocuments' @ [144:49] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'!' @ [145:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [145:14] ==> private final val element: KtElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'isValid' @ [145:22] ==> public final val KtElement.isValid: Boolean[MyPropertyDescriptor]

'variants' @ [146:13] ==> private final val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'isEmpty' @ [146:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'variants' @ [148:13] ==> private final val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'size' @ [148:22] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getApplication' @ [148:54] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [148:71] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'addImport' @ [149:13] ==> private final fun addImport(variant: AutoImportVariant): Unit defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[SimpleFunctionDescriptorImpl]

'variants' @ [149:23] ==> private final val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'first' @ [149:32] ==> public fun <T> List<AutoImportVariant>.first(): AutoImportVariant defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AutoImportVariant

'getInstance' @ [153:24] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopup' @ [153:38] ==> @NotNull public abstract fun createListPopup(@NotNull p0: raw (ListPopupStep<(Any..Any?)>..ListPopupStep<*>)): ListPopup defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'getVariantSelectionPopup' @ [153:54] ==> private final fun getVariantSelectionPopup(): BaseListPopupStep<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[SimpleFunctionDescriptorImpl]

'showInBestPositionFor' @ [153:82] ==> public abstract fun showInBestPositionFor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.ui.popup.ListPopup[JavaMethodDescriptor]

'editor' @ [153:104] ==> private final val editor: Editor defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'BaseListPopupStep<AutoImportVariant>' @ [158:25] ==> public constructor BaseListPopupStep<T : (Any..Any?)>(@Nullable p0: String?, p1: (MutableList<out (AutoImportVariant..AutoImportVariant?)>..List<(AutoImportVariant..AutoImportVariant?)>?)) defined in com.intellij.openapi.ui.popup.util.BaseListPopupStep[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AutoImportVariant

'message' @ [158:75] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'variants' @ [158:109] ==> private final val variants: List<AutoImportVariant> defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'selectedValue' @ [164:21] ==> value-parameter selectedValue: AutoImportVariant? defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'project' @ [164:46] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'isDisposed' @ [164:54] ==> public final val Project.isDisposed: Boolean[MyPropertyDescriptor]

'finalChoice' @ [166:21] ==> value-parameter finalChoice: Boolean defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'addImport' @ [167:21] ==> private final fun addImport(variant: AutoImportVariant): Unit defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[SimpleFunctionDescriptorImpl]

'selectedValue' @ [167:31] ==> value-parameter selectedValue: AutoImportVariant? defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'getAllExcludableStrings' @ [171:49] ==> public open fun getAllExcludableStrings(@NotNull p0: String): (MutableList<(String..String?)>..List<(String..String?)>?) defined in com.intellij.codeInsight.daemon.impl.actions.AddImportAction[JavaMethodDescriptor]

'selectedValue' @ [171:73] ==> value-parameter selectedValue: AutoImportVariant? defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'excludeFqNameCheck' @ [171:87] ==> public abstract val excludeFqNameCheck: FqName defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant[PropertyDescriptorImpl]

'asString' @ [171:106] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'BaseListPopupStep<String>' @ [173:33] ==> public constructor BaseListPopupStep<T : (Any..Any?)>(@Nullable p0: String?, p1: (MutableList<out (String..String?)>..List<(String..String?)>?)) defined in com.intellij.openapi.ui.popup.util.BaseListPopupStep[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'toExclude' @ [173:65] ==> val toExclude: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.onChosen[LocalVariableDescriptor]

'value' @ [175:43] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.onChosen.<no name provided>.getTextFor[ValueParameterDescriptorImpl]

'finalChoice' @ [179:29] ==> value-parameter finalChoice: Boolean defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.onChosen.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'!' @ [179:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'project' @ [179:45] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'isDisposed' @ [179:53] ==> public final val Project.isDisposed: Boolean[MyPropertyDescriptor]

'excludeFromImport' @ [180:45] ==> public open fun excludeFromImport(p0: (Project..Project?), p1: (String..String?)): Unit defined in com.intellij.codeInsight.daemon.impl.actions.AddImportAction[JavaMethodDescriptor]

'project' @ [180:63] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'selectedValue' @ [180:72] ==> value-parameter selectedValue: String? defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.onChosen.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'value' @ [188:65] ==> value-parameter value: AutoImportVariant defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.getTextFor[ValueParameterDescriptorImpl]

'hint' @ [188:71] ==> public abstract val hint: String defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant[PropertyDescriptorImpl]

'value' @ [189:65] ==> value-parameter value: AutoImportVariant defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.getVariantSelectionPopup.<no name provided>.getIconFor[ValueParameterDescriptorImpl]

'icon' @ [189:71] ==> public open fun icon(project: Project): Icon? defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant[SimpleFunctionDescriptorImpl]

'project' @ [189:76] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'getInstance' @ [194:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [194:40] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'commitAllDocuments' @ [194:49] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [196:9] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'executeWriteCommand' @ [196:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'message' @ [196:52] ==> public open fun message(@NotNull @NonNls @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.daemon.QuickFixBundle[JavaMethodDescriptor]

'!' @ [197:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [197:18] ==> private final val element: KtElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'isValid' @ [197:26] ==> public final val KtElement.isValid: Boolean[MyPropertyDescriptor]

'element' @ [199:24] ==> private final val element: KtElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'containingKtFile' @ [199:32] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'variant' @ [201:13] ==> value-parameter variant: AutoImportVariant defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.addImport[ValueParameterDescriptorImpl]

'declarationToImport' @ [201:21] ==> public open fun declarationToImport(project: Project): PsiElement? defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant[SimpleFunctionDescriptorImpl]

'project' @ [201:41] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'let' @ [201:51] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'ProximityLocation' @ [202:32] ==> public constructor ProximityLocation(@Nullable p0: PsiElement?, p1: (Module..Module?)) defined in com.intellij.psi.util.ProximityLocation[JavaClassConstructorDescriptor]

'element' @ [202:50] ==> private final val element: KtElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'findModuleForPsiElement' @ [202:74] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'element' @ [202:98] ==> private final val element: KtElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'getInstance' @ [203:35] ==> public open fun getInstance(): (StatisticsManager..StatisticsManager?) defined in com.intellij.psi.statistics.StatisticsManager[JavaMethodDescriptor]

'incUseCount' @ [203:49] ==> public open fun <T : (Any..Any?), Loc : (Any..Any?)> incUseCount(p0: (Key<out (Statistician<(PsiElement..PsiElement?), (ProximityLocation..ProximityLocation?)>..Statistician<(PsiElement..PsiElement?), (ProximityLocation..ProximityLocation?)>?)>..Key<out (Statistician<(PsiElement..PsiElement?), (ProximityLocation..ProximityLocation?)>..Statistician<(PsiElement..PsiElement?), (ProximityLocation..ProximityLocation?)>?)>?), p1: (PsiElement..PsiElement?), p2: (ProximityLocation..ProximityLocation?)): Unit defined in com.intellij.psi.statistics.StatisticsManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElement
    <Loc : (Any..Any?)> -> ProximityLocation

'STATISTICS_KEY' @ [203:84] ==> public final val STATISTICS_KEY: (Key<(ProximityStatistician..ProximityStatistician?)>..Key<(ProximityStatistician..ProximityStatistician?)>?) defined in com.intellij.psi.util.proximity.PsiProximityComparator[JavaPropertyDescriptor]

'it' @ [203:100] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.addImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'location' @ [203:104] ==> val location: ProximityLocation defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.addImport.<anonymous>.<anonymous>[LocalVariableDescriptor]

'variant' @ [206:32] ==> value-parameter variant: AutoImportVariant defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.addImport[ValueParameterDescriptorImpl]

'descriptorsToImport' @ [206:40] ==> public abstract val descriptorsToImport: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant[PropertyDescriptorImpl]

'if (descriptor is ClassDescriptor || descriptor is PackageViewDescriptor) {
                    if (element is KtSimpleNameExpression) {
                        element.mainReference.bindToFqName(descriptor.importableFqName!!, KtSimpleNameReference.ShorteningMode.FORCED_SHORTENING)
                    }
                } else {
                    ImportInsertHelper.getInstance(project).importDescriptor(file, descriptor)
                }' @ [209:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'descriptor' @ [209:21] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.addImport.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [209:54] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.addImport.<anonymous>[LocalVariableDescriptor]

'element' @ [210:25] ==> private final val element: KtElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'element' @ [211:25] ==> private final val element: KtElement defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'mainReference' @ [211:33] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'bindToFqName' @ [211:47] ==> public final fun bindToFqName(fqName: FqName, shorteningMode: KtSimpleNameReference.ShorteningMode = ...): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [211:60] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.addImport.<anonymous>[LocalVariableDescriptor]

'importableFqName' @ [211:71] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'FORCED_SHORTENING' @ [211:128] ==> enum entry FORCED_SHORTENING defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference.ShorteningMode[FakeCallableDescriptorForObject]

'ImportInsertHelper' @ [214:21] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [214:40] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [214:52] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[PropertyDescriptorImpl]

'importDescriptor' @ [214:61] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'file' @ [214:78] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.addImport.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [214:84] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction.addImport.<anonymous>[LocalVariableDescriptor]

'ImportableFqNameClassifier' @ [222:30] ==> public constructor ImportableFqNameClassifier(file: KtFile) defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[DeserializedClassConstructorDescriptor]

'file' @ [222:57] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.actions.Prioritizer[PropertyDescriptorImpl]

'PsiProximityComparator' @ [223:39] ==> public constructor PsiProximityComparator(@Nullable p0: PsiElement?) defined in com.intellij.psi.util.proximity.PsiProximityComparator[JavaClassConstructorDescriptor]

'file' @ [223:62] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.actions.Prioritizer[PropertyDescriptorImpl]

'isDeprecated' @ [226:51] ==> public open fun isDeprecated(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'descriptor' @ [226:64] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [227:30] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.<init>[ValueParameterDescriptorImpl]

'importableFqName' @ [227:41] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'classifier' @ [228:38] ==> private final val classifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.actions.Prioritizer[PropertyDescriptorImpl]

'classify' @ [228:49] ==> public final fun classify(fqName: FqName, isPackage: Boolean): ImportableFqNameClassifier.Classification defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[DeserializedSimpleFunctionDescriptor]

'fqName' @ [228:58] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'DescriptorToSourceUtilsIde' @ [229:35] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [229:62] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'file' @ [229:80] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.actions.Prioritizer[PropertyDescriptorImpl]

'project' @ [229:85] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'descriptor' @ [229:94] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.<init>[ValueParameterDescriptorImpl]

'isDeprecated' @ [232:17] ==> private final val isDeprecated: Boolean defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'other' @ [232:33] ==> value-parameter other: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.compareTo[ValueParameterDescriptorImpl]

'isDeprecated' @ [232:39] ==> private final val isDeprecated: Boolean defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'if (isDeprecated) +1 else -1' @ [233:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isDeprecated' @ [233:28] ==> private final val isDeprecated: Boolean defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'+' @ [233:42] ==> public final operator fun unaryPlus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [233:50] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'classification' @ [236:22] ==> private final val classification: ImportableFqNameClassifier.Classification defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'compareTo' @ [236:37] ==> public final fun compareTo(other: ImportableFqNameClassifier.Classification): Int defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[DeserializedSimpleFunctionDescriptor]

'other' @ [236:47] ==> value-parameter other: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.compareTo[ValueParameterDescriptorImpl]

'classification' @ [236:53] ==> private final val classification: ImportableFqNameClassifier.Classification defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'c1' @ [237:17] ==> val c1: Int defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.compareTo[LocalVariableDescriptor]

'c1' @ [237:33] ==> val c1: Int defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.compareTo[LocalVariableDescriptor]

'proximityComparator' @ [239:22] ==> private final val proximityComparator: PsiProximityComparator defined in org.jetbrains.kotlin.idea.actions.Prioritizer[PropertyDescriptorImpl]

'compare' @ [239:42] ==> public open fun compare(p0: (Any..Any?), p1: (Any..Any?)): Int defined in com.intellij.psi.util.proximity.PsiProximityComparator[JavaMethodDescriptor]

'declaration' @ [239:50] ==> private final val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'other' @ [239:63] ==> value-parameter other: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.compareTo[ValueParameterDescriptorImpl]

'declaration' @ [239:69] ==> private final val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'c2' @ [240:17] ==> val c2: Int defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.compareTo[LocalVariableDescriptor]

'c2' @ [240:33] ==> val c2: Int defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.compareTo[LocalVariableDescriptor]

'compareNames' @ [242:17] ==> private final val compareNames: Boolean defined in org.jetbrains.kotlin.idea.actions.Prioritizer[PropertyDescriptorImpl]

'fqName' @ [243:24] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'asString' @ [243:31] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'compareTo' @ [243:42] ==> public open fun compareTo(other: String): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'other' @ [243:52] ==> value-parameter other: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority.compareTo[ValueParameterDescriptorImpl]

'fqName' @ [243:58] ==> private final val fqName: FqName defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[PropertyDescriptorImpl]

'asString' @ [243:65] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'Priority' @ [250:55] ==> public constructor Priority(descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[ClassConstructorDescriptorImpl]

'descriptor' @ [250:64] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.Prioritizer.priority[ValueParameterDescriptorImpl]

'Prioritizer' @ [256:31] ==> public constructor Prioritizer(file: KtFile, compareNames: Boolean = ...) defined in org.jetbrains.kotlin.idea.actions.Prioritizer[ClassConstructorDescriptorImpl]

'file' @ [256:43] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.<init>[ValueParameterDescriptorImpl]

'descriptors' @ [259:38] ==> public final val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority[PropertyDescriptorImpl]

'map' @ [259:50] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> Prioritizer.Priority): List<Prioritizer.Priority> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Priority

'prioritizer' @ [259:56] ==> private final val prioritizer: Prioritizer defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer[PropertyDescriptorImpl]

'priority' @ [259:68] ==> public final fun priority(descriptor: DeclarationDescriptor): Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.Prioritizer[SimpleFunctionDescriptorImpl]

'it' @ [259:77] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority.ownDescriptorsPriority.<anonymous>[ValueParameterDescriptorImpl]

'max' @ [259:83] ==> public fun <T : Comparable<Prioritizer.Priority>> Iterable<Prioritizer.Priority>.max(): Prioritizer.Priority? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Priority

'ownDescriptorsPriority' @ [262:22] ==> public final val ownDescriptorsPriority: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority[PropertyDescriptorImpl]

'compareTo' @ [262:45] ==> public open fun compareTo(other: Prioritizer.Priority): Int defined in org.jetbrains.kotlin.idea.actions.Prioritizer.Priority[SimpleFunctionDescriptorImpl]

'other' @ [262:55] ==> value-parameter other: DescriptorGroupPrioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority.compareTo[ValueParameterDescriptorImpl]

'ownDescriptorsPriority' @ [262:61] ==> public final val ownDescriptorsPriority: Prioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority[PropertyDescriptorImpl]

'c1' @ [263:17] ==> val c1: Int defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority.compareTo[LocalVariableDescriptor]

'c1' @ [263:33] ==> val c1: Int defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority.compareTo[LocalVariableDescriptor]

'other' @ [265:20] ==> value-parameter other: DescriptorGroupPrioritizer.Priority defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority.compareTo[ValueParameterDescriptorImpl]

'descriptors' @ [265:26] ==> public final val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority[PropertyDescriptorImpl]

'size' @ [265:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'descriptors' @ [265:45] ==> public final val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority[PropertyDescriptorImpl]

'size' @ [265:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Priority' @ [269:62] ==> public constructor Priority(descriptors: List<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.Priority[ClassConstructorDescriptorImpl]

'descriptors' @ [269:71] ==> value-parameter descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.DescriptorGroupPrioritizer.priority[ValueParameterDescriptorImpl]

'getIcon' @ [279:63] ==> @Nullable public open fun getIcon(@NotNull p0: DeclarationDescriptor, @Nullable p1: PsiElement?, @Iconable.IconFlags p2: Int): Icon? defined in org.jetbrains.kotlin.idea.KotlinDescriptorIconProvider[JavaMethodDescriptor]

'descriptorsToImport' @ [279:71] ==> public abstract val descriptorsToImport: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant[PropertyDescriptorImpl]

'first' @ [279:91] ==> public fun <T> Iterable<DeclarationDescriptor>.first(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'declarationToImport' @ [279:100] ==> public open fun declarationToImport(project: Project): PsiElement? defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant[SimpleFunctionDescriptorImpl]

'project' @ [279:120] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant.icon[ValueParameterDescriptorImpl]

'DescriptorToSourceUtilsIde' @ [282:13] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [282:40] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [282:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant.declarationToImport[ValueParameterDescriptorImpl]

'descriptorsToImport' @ [282:67] ==> public abstract val descriptorsToImport: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.AutoImportVariant[PropertyDescriptorImpl]

'first' @ [282:87] ==> public fun <T> Iterable<DeclarationDescriptor>.first(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptors' @ [286:47] ==> public final val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.GroupedImportVariant[PropertyDescriptorImpl]

'first' @ [286:59] ==> public fun <T> Iterable<DeclarationDescriptor>.first(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'importableFqName' @ [286:67] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'parent' @ [286:86] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'descriptors' @ [287:81] ==> public final val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.GroupedImportVariant[PropertyDescriptorImpl]

'autoImportDescription' @ [288:41] ==> public final val autoImportDescription: String defined in org.jetbrains.kotlin.idea.actions.GroupedImportVariant[PropertyDescriptorImpl]

'excludeFqNameCheck' @ [288:69] ==> public open val excludeFqNameCheck: FqName defined in org.jetbrains.kotlin.idea.actions.GroupedImportVariant[PropertyDescriptorImpl]

'listOf' @ [296:13] ==> public fun <T> listOf(element: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptors' @ [296:20] ==> public final val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.SingleImportVariant[PropertyDescriptorImpl]

'singleOrNull' @ [296:32] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptors' @ [296:50] ==> public final val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.actions.SingleImportVariant[PropertyDescriptorImpl]

'sortedBy' @ [296:62] ==> public inline fun <T, R : Comparable<{Long & Comparable<Nothing> & Comparable<{Long & Any & Byte & Short & Int}> & Int}>> Iterable<DeclarationDescriptor>.sortedBy(crossinline selector: (DeclarationDescriptor) -> {Long & Comparable<Nothing> & Comparable<{Long & Any & Byte & Short & Int}> & Int}?): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Comparable<R>> -> {Long & Comparable<Nothing> & Comparable<{Long & Any & Byte & Short & Int}> & Int}

'if (it is ClassDescriptor) 0 else 1' @ [296:73] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'it' @ [296:77] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.SingleImportVariant.<get-descriptorsToImport>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [296:111] ==> public fun <T> List<DeclarationDescriptor>.first(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'excludeFqNameCheck' @ [298:39] ==> public open val excludeFqNameCheck: FqName defined in org.jetbrains.kotlin.idea.actions.SingleImportVariant[PropertyDescriptorImpl]

'asString' @ [298:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

