'when (callTypeAndReceiver) {
                is CallTypeAndReceiver.DEFAULT -> null
                is CallTypeAndReceiver.DOT -> callTypeAndReceiver.receiver
                is CallTypeAndReceiver.SAFE -> callTypeAndReceiver.receiver
                is CallTypeAndReceiver.SUPER_MEMBERS -> callTypeAndReceiver.receiver
                is CallTypeAndReceiver.INFIX -> callTypeAndReceiver.receiver
                is CallTypeAndReceiver.TYPE, is CallTypeAndReceiver.ANNOTATION -> null // need filtering of classes with the same FQ-name
                else -> return null // TODO: support shadowed declarations filtering for callable references
            }' @ [54:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?, entry3: KtExpression?, entry4: KtExpression?, entry5: KtExpression?, entry6: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'callTypeAndReceiver' @ [54:44] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [56:47] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'receiver' @ [56:67] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.DOT[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [57:48] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'receiver' @ [57:68] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.SAFE[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [58:57] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'receiver' @ [58:77] ==> public final val receiver: KtSuperExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.SUPER_MEMBERS[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [59:49] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'receiver' @ [59:69] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.INFIX[PropertyDescriptorImpl]

'receiverExpression' @ [64:41] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[LocalVariableDescriptor]

'let' @ [64:61] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> ExpressionReceiver): ExpressionReceiver defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> ExpressionReceiver

'bindingContext' @ [65:28] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'getType' @ [65:43] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [65:51] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'ExpressionReceiver' @ [66:17] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[FakeCallableDescriptorForObject]

'create' @ [66:36] ==> public final fun create(expression: KtExpression, type: KotlinType, bindingContext: BindingContext): ExpressionReceiver defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [66:43] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [66:47] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [66:53] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'ShadowedDeclarationsFilter' @ [68:20] ==> public constructor ShadowedDeclarationsFilter(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, context: PsiElement, explicitReceiverValue: ReceiverValue?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[ClassConstructorDescriptorImpl]

'bindingContext' @ [68:47] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'resolutionFacade' @ [68:63] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'context' @ [68:81] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[ValueParameterDescriptorImpl]

'explicitReceiverValue' @ [68:90] ==> val explicitReceiverValue: ExpressionReceiver? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.Companion.create[LocalVariableDescriptor]

'KtPsiFactory' @ [72:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [72:43] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'project' @ [72:60] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[PropertyDescriptorImpl]

'DummyExpressionFactory' @ [73:42] ==> public constructor DummyExpressionFactory(factory: KtPsiFactory) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.DummyExpressionFactory[ClassConstructorDescriptorImpl]

'psiFactory' @ [73:65] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'declarations' @ [76:16] ==> value-parameter declarations: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filter[ValueParameterDescriptorImpl]

'groupBy' @ [77:18] ==> public inline fun <T, K> Iterable<TDescriptor>.groupBy(keySelector: (TDescriptor) -> Any): Map<Any, List<TDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor
    <K> -> Any

'signature' @ [77:28] ==> private final fun signature(descriptor: DeclarationDescriptor): Any defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[SimpleFunctionDescriptorImpl]

'it' @ [77:38] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filter.<anonymous>[ValueParameterDescriptorImpl]

'values' @ [78:18] ==> public abstract val values: Collection<List<TDescriptor>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'flatMap' @ [79:18] ==> public inline fun <T, R> Iterable<List<TDescriptor>>.flatMap(transform: (List<TDescriptor>) -> Iterable<TDescriptor>): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TDescriptor>
    <R> -> TDescriptor

'filterEqualSignatureGroup' @ [79:37] ==> private final fun <TDescriptor : DeclarationDescriptor> filterEqualSignatureGroup(descriptors: Collection<TDescriptor>, descriptorsToImport: Collection<TDescriptor> = ...): Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> TDescriptor

'group' @ [79:63] ==> value-parameter group: List<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filter.<anonymous>[ValueParameterDescriptorImpl]

'importedDeclarations' @ [85:39] ==> value-parameter importedDeclarations: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter[ValueParameterDescriptorImpl]

'toSet' @ [85:60] ==> public fun <T> Iterable<DeclarationDescriptor>.toSet(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'importedDeclarationsSet' @ [86:47] ==> val importedDeclarationsSet: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter[LocalVariableDescriptor]

'groupBy' @ [86:71] ==> public inline fun <T, K> Iterable<DeclarationDescriptor>.groupBy(keySelector: (DeclarationDescriptor) -> Any): Map<Any, List<DeclarationDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <K> -> Any

'signature' @ [86:81] ==> private final fun signature(descriptor: DeclarationDescriptor): Any defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[SimpleFunctionDescriptorImpl]

'it' @ [86:91] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [90:17] ==> value-parameter declarations: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [90:30] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'importedDeclarationsBySignature' @ [90:43] ==> val importedDeclarationsBySignature: Map<Any, List<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter[LocalVariableDescriptor]

'signature' @ [90:75] ==> private final fun signature(descriptor: DeclarationDescriptor): Any defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[SimpleFunctionDescriptorImpl]

'declarations' @ [90:85] ==> value-parameter declarations: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[ValueParameterDescriptorImpl]

'single' @ [90:98] ==> public fun <T> Iterable<TDescriptor>.single(): TDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'declarations' @ [90:132] ==> value-parameter declarations: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [92:43] ==> value-parameter declarations: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [92:56] ==> public inline fun <T> Iterable<TDescriptor>.filter(predicate: (TDescriptor) -> Boolean): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'it' @ [92:65] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'importedDeclarationsSet' @ [92:72] ==> val importedDeclarationsSet: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter[LocalVariableDescriptor]

'HashSet' @ [94:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'component1' @ [96:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<Any, FqName?>, List<TDescriptor>>.component1(): Pair<Any, FqName?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<Any, FqName?>
    <V> -> List<TDescriptor>

'component2' @ [96:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<Any, FqName?>, List<TDescriptor>>.component2(): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<Any, FqName?>
    <V> -> List<TDescriptor>

'nonImportedDeclarations' @ [96:35] ==> val nonImportedDeclarations: List<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'groupBy' @ [96:59] ==> public inline fun <T, K> Iterable<TDescriptor>.groupBy(keySelector: (TDescriptor) -> Pair<Any, FqName?>): Map<Pair<Any, FqName?>, List<TDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor
    <K> -> Pair<Any, FqName?>

'signature' @ [96:69] ==> private final fun signature(descriptor: DeclarationDescriptor): Any defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[SimpleFunctionDescriptorImpl]

'it' @ [96:79] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'packageName' @ [96:86] ==> private final fun packageName(descriptor: DeclarationDescriptor): FqName? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[SimpleFunctionDescriptorImpl]

'it' @ [96:98] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'importedDeclarationsBySignature' @ [97:32] ==> val importedDeclarationsBySignature: Map<Any, List<DeclarationDescriptor>> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter[LocalVariableDescriptor]

'pair' @ [97:64] ==> val pair: Pair<Any, FqName?> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'first' @ [97:69] ==> public final val first: Any defined in kotlin.Pair[DeserializedPropertyDescriptor]

'if (imported != null) group + imported else group' @ [98:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<DeclarationDescriptor>, elseBranch: List<DeclarationDescriptor>): List<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<DeclarationDescriptor>

'imported' @ [98:31] ==> val imported: List<DeclarationDescriptor>? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'group' @ [98:49] ==> val group: List<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'imported' @ [98:57] ==> val imported: List<DeclarationDescriptor>? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'group' @ [98:71] ==> val group: List<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'notShadowed' @ [99:17] ==> val notShadowed: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'addAll' @ [99:29] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'filterEqualSignatureGroup' @ [99:36] ==> private final fun <TDescriptor : DeclarationDescriptor> filterEqualSignatureGroup(descriptors: Collection<DeclarationDescriptor>, descriptorsToImport: Collection<DeclarationDescriptor> = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> DeclarationDescriptor

'all' @ [99:62] ==> val all: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'group' @ [99:89] ==> val group: List<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'declarations' @ [101:13] ==> value-parameter declarations: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [101:26] ==> public inline fun <T> Iterable<TDescriptor>.filter(predicate: (TDescriptor) -> Boolean): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'it' @ [101:35] ==> value-parameter it: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'notShadowed' @ [101:41] ==> val notShadowed: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.createNonImportedDeclarationsFilter.<anonymous>[LocalVariableDescriptor]

'when (descriptor) {
            is SimpleFunctionDescriptor -> FunctionSignature(descriptor)
            is VariableDescriptor -> descriptor.name
            is ClassDescriptor -> descriptor.importableFqName ?: descriptor
            else -> descriptor
        }' @ [106:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'descriptor' @ [106:22] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.signature[ValueParameterDescriptorImpl]

'FunctionSignature' @ [107:44] ==> public constructor FunctionSignature(function: FunctionDescriptor) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature[ClassConstructorDescriptorImpl]

'descriptor' @ [107:62] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.signature[ValueParameterDescriptorImpl]

'descriptor' @ [108:38] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.signature[ValueParameterDescriptorImpl]

'name' @ [108:49] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'descriptor' @ [109:35] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.signature[ValueParameterDescriptorImpl]

'importableFqName' @ [109:46] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'descriptor' @ [109:66] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.signature[ValueParameterDescriptorImpl]

'descriptor' @ [110:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.signature[ValueParameterDescriptorImpl]

'descriptor' @ [114:66] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.packageName[ValueParameterDescriptorImpl]

'importableFqName' @ [114:77] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[PropertyDescriptorImpl]

'parent' @ [114:95] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'emptyList' @ [118:60] ==> public fun <T> emptyList(): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'descriptors' @ [120:13] ==> value-parameter descriptors: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[ValueParameterDescriptorImpl]

'size' @ [120:25] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'descriptors' @ [120:43] ==> value-parameter descriptors: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[ValueParameterDescriptorImpl]

'descriptors' @ [122:21] ==> value-parameter descriptors: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[ValueParameterDescriptorImpl]

'first' @ [122:33] ==> public fun <T> Iterable<TDescriptor>.first(): TDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'first' @ [124:13] ==> val first: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'listOf' @ [125:20] ==> public fun <T> listOf(element: TDescriptor): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'first' @ [125:40] ==> val first: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'first' @ [128:26] ==> val first: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'first' @ [129:20] ==> val first: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'name' @ [129:26] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'first' @ [130:27] ==> val first: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'valueParameters' @ [130:56] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'dummyExpressionFactory' @ [132:40] ==> private final val dummyExpressionFactory: ShadowedDeclarationsFilter.DummyExpressionFactory defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'createDummyExpressions' @ [132:63] ==> public final fun createDummyExpressions(count: Int): List<KtExpression> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.DummyExpressionFactory[SimpleFunctionDescriptorImpl]

'parameters' @ [132:86] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'size' @ [132:97] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'DelegatingBindingTrace' @ [134:28] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, name: String, withParentDiagnostics: Boolean = ..., filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedClassConstructorDescriptor]

'bindingContext' @ [134:51] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'component1' @ [135:15] ==> public final operator fun component1(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [135:27] ==> public final operator fun component2(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'dummyArgumentExpressions' @ [135:41] ==> val dummyArgumentExpressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'zip' @ [135:66] ==> public infix fun <T, R> Iterable<KtExpression>.zip(other: Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>): List<Pair<KtExpression, (ValueParameterDescriptor..ValueParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'parameters' @ [135:70] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'bindingTrace' @ [136:13] ==> val bindingTrace: DelegatingBindingTrace defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'recordType' @ [136:26] ==> public open fun recordType(expression: KtExpression, type: KotlinType?): Unit defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedSimpleFunctionDescriptor]

'expression' @ [136:37] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'parameter' @ [136:49] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'varargElementType' @ [136:59] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameter' @ [136:80] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'type' @ [136:90] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'bindingTrace' @ [137:13] ==> val bindingTrace: DelegatingBindingTrace defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'record' @ [137:26] ==> public open fun <K, V> record(slice: WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>, key: (KtExpression..KtExpression?), value: (Boolean..Boolean?)): Unit defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V> -> (kotlin.Boolean..kotlin.Boolean?)

'PROCESSED' @ [137:48] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [137:59] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'parameters' @ [140:32] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'withIndex' @ [140:43] ==> public fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.withIndex(): Iterable<IndexedValue<(ValueParameterDescriptor..ValueParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'firstOrNull' @ [140:55] ==> public inline fun <T> Iterable<IndexedValue<(ValueParameterDescriptor..ValueParameterDescriptor?)>>.firstOrNull(predicate: (IndexedValue<(ValueParameterDescriptor..ValueParameterDescriptor?)>) -> Boolean): IndexedValue<(ValueParameterDescriptor..ValueParameterDescriptor?)>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)>

'it' @ [140:69] ==> value-parameter it: IndexedValue<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [140:72] ==> public final val value: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'varargElementType' @ [140:78] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'index' @ [140:107] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'if (firstVarargIndex != null && firstVarargIndex != parameters.lastIndex) firstVarargIndex else parameters.size' @ [141:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'firstVarargIndex' @ [141:37] ==> val firstVarargIndex: Int? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'firstVarargIndex' @ [141:65] ==> val firstVarargIndex: Int? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'parameters' @ [141:85] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'lastIndex' @ [141:96] ==> public val <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'firstVarargIndex' @ [141:107] ==> val firstVarargIndex: Int? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'parameters' @ [141:129] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'size' @ [141:140] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'dummyArgumentExpressions' @ [144:38] ==> val dummyArgumentExpressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'index' @ [144:63] ==> public final val index: Int defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.DummyArgument[PropertyDescriptorImpl]

'if (isNamed()) {
                object : ValueArgumentName {
                    override val asName = parameters[index].name
                    override val referenceExpression = null
                }
            }
            else {
                null
            }' @ [146:60] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ValueArgumentName?, elseBranch: ValueArgumentName?): ValueArgumentName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ValueArgumentName?

'isNamed' @ [146:64] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.DummyArgument[SimpleFunctionDescriptorImpl]

'parameters' @ [148:43] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'index' @ [148:54] ==> public final val index: Int defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.DummyArgument[PropertyDescriptorImpl]

'name' @ [148:61] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'expression' @ [156:52] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.DummyArgument[PropertyDescriptorImpl]

'index' @ [157:38] ==> public final val index: Int defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.DummyArgument[PropertyDescriptorImpl]

'useNamedFromIndex' @ [157:47] ==> val useNamedFromIndex: Int defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'argumentName' @ [158:46] ==> private final val argumentName: ValueArgumentName? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.DummyArgument[PropertyDescriptorImpl]

'expression' @ [159:40] ==> private final val expression: KtExpression defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.DummyArgument[PropertyDescriptorImpl]

'ArrayList' @ [164:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DummyArgument<TDescriptor>

'parameters' @ [165:19] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'indices' @ [165:30] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'arguments' @ [166:13] ==> val arguments: ArrayList<DummyArgument<TDescriptor>> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'add' @ [166:23] ==> public open fun add(element: DummyArgument<TDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'DummyArgument' @ [166:27] ==> public constructor DummyArgument(index: Int) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.DummyArgument[ClassConstructorDescriptorImpl]

'i' @ [166:41] ==> val i: Int defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'psiFactory' @ [172:26] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'createExpressionByPattern' @ [172:37] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'name' @ [172:69] ==> val name: Name defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'callee' @ [174:50] ==> public final val callee: KtExpression defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.<no name provided>[PropertyDescriptorImpl]

'arguments' @ [178:48] ==> val arguments: ArrayList<DummyArgument<TDescriptor>> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'emptyList' @ [180:58] ==> public fun <T> emptyList(): List<LambdaArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaArgument

'emptyList' @ [182:47] ==> public fun <T> emptyList(): List<KtTypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeProjection

'explicitReceiverValue' @ [190:50] ==> private final val explicitReceiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'callee' @ [192:45] ==> public final val callee: KtExpression defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.<no name provided>[PropertyDescriptorImpl]

'DEFAULT' @ [194:56] ==> enum entry DEFAULT defined in org.jetbrains.kotlin.psi.Call.CallType[FakeCallableDescriptorForObject]

'context' @ [197:21] ==> private final val context: PsiElement defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'getResolutionScope' @ [197:29] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util in file scopeUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [197:48] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'resolutionFacade' @ [197:64] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'descriptorsToImport' @ [199:13] ==> value-parameter descriptorsToImport: Collection<TDescriptor> = ... defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[ValueParameterDescriptorImpl]

'isNotEmpty' @ [199:33] ==> @InlineOnly public inline fun <T> Collection<TDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'scope' @ [200:13] ==> var scope: LexicalScope defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'scope' @ [200:21] ==> var scope: LexicalScope defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'addImportingScope' @ [200:27] ==> public fun LexicalScope.addImportingScope(importScope: ImportingScope): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'ExplicitImportsScope' @ [200:45] ==> public constructor ExplicitImportsScope(descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.resolve.scopes.ExplicitImportsScope[ClassConstructorDescriptorImpl]

'descriptorsToImport' @ [200:66] ==> value-parameter descriptorsToImport: Collection<TDescriptor> = ... defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[ValueParameterDescriptorImpl]

'bindingContext' @ [203:28] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'getDataFlowInfoBefore' @ [203:43] ==> public fun BindingContext.getDataFlowInfoBefore(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [203:65] ==> private final val context: PsiElement defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'create' @ [204:50] ==> @NotNull public open fun create(@NotNull p0: BindingTrace, @NotNull p1: LexicalScope, @NotNull p2: Call, @NotNull p3: KotlinType, @NotNull p4: DataFlowInfo, @NotNull p5: ContextDependency, @NotNull p6: CheckArgumentTypesMode, p7: Boolean): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'bindingTrace' @ [204:57] ==> val bindingTrace: DelegatingBindingTrace defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'scope' @ [204:71] ==> var scope: LexicalScope defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'newCall' @ [204:78] ==> val newCall: <no name provided><TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'NO_EXPECTED_TYPE' @ [204:97] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'dataFlowInfo' @ [204:115] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'INDEPENDENT' @ [205:75] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'CHECK_VALUE_ARGUMENTS' @ [205:111] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'resolutionFacade' @ [207:28] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[PropertyDescriptorImpl]

'frontendService' @ [207:45] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): CallResolver defined in org.jetbrains.kotlin.idea.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> CallResolver

'if (isFunction) callResolver.resolveFunctionCall(context) else callResolver.resolveSimpleProperty(context)' @ [208:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: OverloadResolutionResults<out (CallableDescriptor..CallableDescriptor?)>, elseBranch: OverloadResolutionResults<out (CallableDescriptor..CallableDescriptor?)>): OverloadResolutionResults<out (CallableDescriptor..CallableDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> OverloadResolutionResults<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>

'isFunction' @ [208:27] ==> val isFunction: Boolean defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'callResolver' @ [208:39] ==> val callResolver: CallResolver defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'resolveFunctionCall' @ [208:52] ==> @NotNull public open fun resolveFunctionCall(@NotNull p0: BasicCallResolutionContext): OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'context' @ [208:72] ==> val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'callResolver' @ [208:86] ==> val callResolver: CallResolver defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'resolveSimpleProperty' @ [208:99] ==> @NotNull public open fun resolveSimpleProperty(@NotNull p0: BasicCallResolutionContext): OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'context' @ [208:121] ==> val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'results' @ [209:36] ==> val results: OverloadResolutionResults<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'resultingCalls' @ [209:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<out (CallableDescriptor..CallableDescriptor?)>.resultingCalls: (MutableCollection<out (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>..Collection<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'map' @ [209:59] ==> public inline fun <T, R> Iterable<(ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)>.map(transform: ((ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?)) -> (CallableDescriptor..CallableDescriptor?)): List<(CallableDescriptor..CallableDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?)
    <R> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'it' @ [209:65] ==> value-parameter it: (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>..ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [209:68] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resultingDescriptors' @ [210:34] ==> val resultingDescriptors: List<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'mapTo' @ [210:55] ==> public inline fun <T, R, C : MutableCollection<in CallableDescriptor>> Iterable<(CallableDescriptor..CallableDescriptor?)>.mapTo(destination: HashSet<DeclarationDescriptor>, transform: ((CallableDescriptor..CallableDescriptor?)) -> CallableDescriptor): HashSet<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)
    <R> -> CallableDescriptor
    <C : MutableCollection<in R>> -> HashSet<DeclarationDescriptor>

'HashSet' @ [210:61] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'it' @ [210:97] ==> value-parameter it: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [210:100] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'descriptors' @ [211:24] ==> value-parameter descriptors: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[ValueParameterDescriptorImpl]

'filter' @ [211:36] ==> public inline fun <T> Iterable<TDescriptor>.filter(predicate: (TDescriptor) -> Boolean): List<TDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'candidateDescriptor' @ [212:13] ==> value-parameter candidateDescriptor: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [212:33] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'resultingOriginals' @ [212:45] ==> val resultingOriginals: HashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'resultingDescriptors' @ [213:16] ==> val resultingDescriptors: List<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'any' @ [213:37] ==> public inline fun <T> Iterable<(CallableDescriptor..CallableDescriptor?)>.any(predicate: ((CallableDescriptor..CallableDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'descriptorsEqualWithSubstitution' @ [213:43] ==> public fun descriptorsEqualWithSubstitution(descriptor1: DeclarationDescriptor?, descriptor2: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.util in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [213:76] ==> value-parameter it: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [213:80] ==> value-parameter candidateDescriptor: TDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup.<anonymous>[ValueParameterDescriptorImpl]

'if (filtered.isNotEmpty()) filtered else descriptors' @ [215:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<TDescriptor>, elseBranch: Collection<TDescriptor>): Collection<TDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<TDescriptor>

'filtered' @ [215:20] ==> val filtered: List<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'isNotEmpty' @ [215:29] ==> @InlineOnly public inline fun <T> Collection<TDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TDescriptor

'filtered' @ [215:43] ==> val filtered: List<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[LocalVariableDescriptor]

'descriptors' @ [215:57] ==> value-parameter descriptors: Collection<TDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.filterEqualSignatureGroup[ValueParameterDescriptorImpl]

'ArrayList' @ [219:35] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'expressions' @ [222:20] ==> private final val expressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.DummyExpressionFactory[PropertyDescriptorImpl]

'size' @ [222:32] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'count' @ [222:39] ==> value-parameter count: Int defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.DummyExpressionFactory.createDummyExpressions[ValueParameterDescriptorImpl]

'expressions' @ [223:17] ==> private final val expressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.DummyExpressionFactory[PropertyDescriptorImpl]

'add' @ [223:29] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'factory' @ [223:33] ==> public final val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.DummyExpressionFactory[PropertyDescriptorImpl]

'createExpression' @ [223:41] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expressions' @ [225:20] ==> private final val expressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.DummyExpressionFactory[PropertyDescriptorImpl]

'take' @ [225:32] ==> public fun <T> Iterable<KtExpression>.take(n: Int): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'count' @ [225:37] ==> value-parameter count: Int defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.DummyExpressionFactory.createDummyExpressions[ValueParameterDescriptorImpl]

'other' @ [231:17] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[ValueParameterDescriptorImpl]

'this' @ [231:27] ==> <this> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature[LazyClassReceiverParameterDescriptor]

'other' @ [232:17] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[ValueParameterDescriptorImpl]

'function' @ [233:17] ==> public final val function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature[PropertyDescriptorImpl]

'name' @ [233:26] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'other' @ [233:34] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[ValueParameterDescriptorImpl]

'function' @ [233:40] ==> public final val function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature[PropertyDescriptorImpl]

'name' @ [233:49] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'function' @ [234:31] ==> public final val function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature[PropertyDescriptorImpl]

'valueParameters' @ [234:40] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'other' @ [235:31] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[ValueParameterDescriptorImpl]

'function' @ [235:37] ==> public final val function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature[PropertyDescriptorImpl]

'valueParameters' @ [235:46] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameters1' @ [236:17] ==> val parameters1: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'size' @ [236:29] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameters2' @ [236:37] ==> val parameters2: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'size' @ [236:49] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameters1' @ [237:23] ==> val parameters1: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'indices' @ [237:35] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'parameters1' @ [238:26] ==> val parameters1: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'i' @ [238:38] ==> val i: Int defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'parameters2' @ [239:26] ==> val parameters2: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'i' @ [239:38] ==> val i: Int defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'p1' @ [240:21] ==> val p1: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'varargElementType' @ [240:24] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'p2' @ [240:45] ==> val p2: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'varargElementType' @ [240:48] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'p1' @ [241:21] ==> val p1: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'type' @ [241:24] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'p2' @ [241:32] ==> val p2: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature.equals[LocalVariableDescriptor]

'type' @ [241:35] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'function' @ [246:35] ==> public final val function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature[PropertyDescriptorImpl]

'name' @ [246:44] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'hashCode' @ [246:49] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'function' @ [246:67] ==> public final val function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter.FunctionSignature[PropertyDescriptorImpl]

'valueParameters' @ [246:76] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [246:92] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

