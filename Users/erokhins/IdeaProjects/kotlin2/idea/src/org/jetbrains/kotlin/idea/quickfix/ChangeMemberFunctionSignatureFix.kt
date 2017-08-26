'KotlinQuickFixAction<KtNamedFunction>' @ [60:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtNamedFunction) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtNamedFunction

'element' @ [60:43] ==> value-parameter element: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.<init>[ValueParameterDescriptorImpl]

'assert' @ [63:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'signatures' @ [63:16] ==> private final val signatures: List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix[PropertyDescriptorImpl]

'isNotEmpty' @ [63:27] ==> @InlineOnly public inline fun <T> Collection<ChangeMemberFunctionSignatureFix.Signature>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature

'SIGNATURE_SOURCE_RENDERER' @ [67:26] ==> private final val SIGNATURE_SOURCE_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature.Companion[PropertyDescriptorImpl]

'render' @ [67:52] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'function' @ [67:59] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature.<init>[ValueParameterDescriptorImpl]

'SIGNATURE_PREVIEW_RENDERER' @ [68:23] ==> private final val SIGNATURE_PREVIEW_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature.Companion[PropertyDescriptorImpl]

'render' @ [68:50] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'function' @ [68:57] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature.<init>[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [71:53] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [71:76] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'withOptions' @ [71:88] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'defaultParameterValueRenderer' @ [72:17] ==> public abstract var defaultParameterValueRenderer: ((ValueParameterDescriptor) -> String)? defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'DescriptorRenderer' @ [75:54] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [75:73] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'typeNormalizer' @ [76:17] ==> public abstract var typeNormalizer: (KotlinType) -> KotlinType defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'IdeDescriptorRenderers' @ [76:34] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'APPROXIMATE_FLEXIBLE_TYPES' @ [76:57] ==> @field:JvmField public final val APPROXIMATE_FLEXIBLE_TYPES: (KotlinType) -> KotlinType defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'withDefinedIn' @ [77:17] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'modifiers' @ [78:17] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [78:29] ==> public fun <T> emptySet(): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'classifierNamePolicy' @ [79:17] ==> public abstract var classifierNamePolicy: ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'SHORT' @ [79:61] ==> public object SHORT : ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy[FakeCallableDescriptorForObject]

'unitReturnType' @ [80:17] ==> public abstract var unitReturnType: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'defaultParameterValueRenderer' @ [81:17] ==> public abstract var defaultParameterValueRenderer: ((ValueParameterDescriptor) -> String)? defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [86:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [88:28] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [88:39] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'computePossibleSignatures' @ [89:30] ==> private final fun computePossibleSignatures(functionElement: KtNamedFunction): List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion[SimpleFunctionDescriptorImpl]

'function' @ [89:56] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.createAction[LocalVariableDescriptor]

'signatures' @ [90:17] ==> val signatures: List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.createAction[LocalVariableDescriptor]

'isEmpty' @ [90:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ChangeMemberFunctionSignatureFix' @ [91:20] ==> private constructor ChangeMemberFunctionSignatureFix(element: KtNamedFunction, signatures: List<ChangeMemberFunctionSignatureFix.Signature>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix[ClassConstructorDescriptorImpl]

'function' @ [91:53] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.createAction[LocalVariableDescriptor]

'signatures' @ [91:63] ==> val signatures: List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.createAction[LocalVariableDescriptor]

'functionElement' @ [98:17] ==> value-parameter functionElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.computePossibleSignatures[ValueParameterDescriptorImpl]

'valueParameterList' @ [98:33] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'emptyList' @ [100:24] ==> public fun <T> emptyList(): List<ChangeMemberFunctionSignatureFix.Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature

'functionElement' @ [103:38] ==> value-parameter functionElement: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.computePossibleSignatures[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [103:54] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [103:95] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'emptyList' @ [104:48] ==> public fun <T> emptyList(): List<ChangeMemberFunctionSignatureFix.Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature

'getPossibleSuperFunctionsDescriptors' @ [105:34] ==> private final fun getPossibleSuperFunctionsDescriptors(functionDescriptor: FunctionDescriptor): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [105:71] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.computePossibleSignatures[LocalVariableDescriptor]

'superFunctions' @ [107:20] ==> val superFunctions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.computePossibleSignatures[LocalVariableDescriptor]

'filter' @ [108:22] ==> public inline fun <T> Iterable<FunctionDescriptor>.filter(predicate: (FunctionDescriptor) -> Boolean): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [108:31] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.computePossibleSignatures.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [108:34] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [108:39] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'map' @ [109:22] ==> public inline fun <T, R> Iterable<FunctionDescriptor>.map(transform: (FunctionDescriptor) -> ChangeMemberFunctionSignatureFix.Signature): List<ChangeMemberFunctionSignatureFix.Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> Signature

'signatureToMatch' @ [109:28] ==> private final fun signatureToMatch(function: FunctionDescriptor, superFunction: FunctionDescriptor): ChangeMemberFunctionSignatureFix.Signature defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [109:45] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.computePossibleSignatures[LocalVariableDescriptor]

'it' @ [109:65] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.computePossibleSignatures.<anonymous>[ValueParameterDescriptorImpl]

'distinctBy' @ [110:22] ==> public inline fun <T, K> Iterable<ChangeMemberFunctionSignatureFix.Signature>.distinctBy(selector: (ChangeMemberFunctionSignatureFix.Signature) -> String): List<ChangeMemberFunctionSignatureFix.Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature
    <K> -> String

'it' @ [110:35] ==> value-parameter it: ChangeMemberFunctionSignatureFix.Signature defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.computePossibleSignatures.<anonymous>[ValueParameterDescriptorImpl]

'sourceCode' @ [110:38] ==> public final val sourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature[PropertyDescriptorImpl]

'sortedBy' @ [111:22] ==> public inline fun <T, R : Comparable<String>> Iterable<ChangeMemberFunctionSignatureFix.Signature>.sortedBy(crossinline selector: (ChangeMemberFunctionSignatureFix.Signature) -> String?): List<ChangeMemberFunctionSignatureFix.Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature
    <R : Comparable<R>> -> String

'it' @ [111:33] ==> value-parameter it: ChangeMemberFunctionSignatureFix.Signature defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.computePossibleSignatures.<anonymous>[ValueParameterDescriptorImpl]

'preview' @ [111:36] ==> public final val preview: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature[PropertyDescriptorImpl]

'superFunction' @ [118:35] ==> value-parameter superFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[ValueParameterDescriptorImpl]

'valueParameters' @ [118:49] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'function' @ [119:30] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[ValueParameterDescriptorImpl]

'valueParameters' @ [119:39] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'newArrayList' @ [120:39] ==> @CanIgnoreReturnValue @GwtCompatible public open fun <E : (Any..Any?)> newArrayList(p0: (MutableIterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>..Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>?)): (ArrayList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..ArrayList<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in com.google.common.collect.Lists[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'superParameters' @ [120:52] ==> val superParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'BitSet' @ [123:27] ==> public constructor BitSet(p0: Int) defined in java.util.BitSet[JavaClassConstructorDescriptor]

'superParameters' @ [123:34] ==> val superParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'size' @ [123:50] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'BitSet' @ [125:24] ==> public constructor BitSet(p0: Int) defined in java.util.BitSet[JavaClassConstructorDescriptor]

'superParameters' @ [125:31] ==> val superParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'size' @ [125:47] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'matchParameters' @ [127:13] ==> private final fun matchParameters(parameterChooser: ChangeMemberFunctionSignatureFix.ParameterChooser, superParameters: List<ValueParameterDescriptor>, parameters: List<ValueParameterDescriptor>, newParameters: MutableList<ValueParameterDescriptor>, matched: BitSet, used: BitSet): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion[SimpleFunctionDescriptorImpl]

'MatchNames' @ [127:46] ==> public object MatchNames : ChangeMemberFunctionSignatureFix.ParameterChooser defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser[FakeCallableDescriptorForObject]

'superParameters' @ [127:58] ==> val superParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'parameters' @ [127:75] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'newParameters' @ [127:87] ==> val newParameters: (ArrayList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..ArrayList<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'matched' @ [127:102] ==> val matched: BitSet defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'used' @ [127:111] ==> val used: BitSet defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'matchParameters' @ [128:13] ==> private final fun matchParameters(parameterChooser: ChangeMemberFunctionSignatureFix.ParameterChooser, superParameters: List<ValueParameterDescriptor>, parameters: List<ValueParameterDescriptor>, newParameters: MutableList<ValueParameterDescriptor>, matched: BitSet, used: BitSet): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion[SimpleFunctionDescriptorImpl]

'MatchTypes' @ [128:46] ==> public object MatchTypes : ChangeMemberFunctionSignatureFix.ParameterChooser defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser[FakeCallableDescriptorForObject]

'superParameters' @ [128:58] ==> val superParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'parameters' @ [128:75] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'newParameters' @ [128:87] ==> val newParameters: (ArrayList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..ArrayList<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'matched' @ [128:102] ==> val matched: BitSet defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'used' @ [128:111] ==> val used: BitSet defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'replaceFunctionParameters' @ [130:31] ==> private final fun replaceFunctionParameters(function: FunctionDescriptor, newParameters: List<ValueParameterDescriptor>): FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion[SimpleFunctionDescriptorImpl]

'superFunction' @ [131:21] ==> value-parameter superFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[ValueParameterDescriptorImpl]

'copy' @ [131:35] ==> @NotNull public abstract fun copy(p0: (DeclarationDescriptor..DeclarationDescriptor?), p1: (Modality..Modality?), p2: (Visibility..Visibility?), p3: (CallableMemberDescriptor.Kind..CallableMemberDescriptor.Kind?), p4: Boolean): FunctionDescriptor defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'function' @ [132:29] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[ValueParameterDescriptorImpl]

'containingDeclaration' @ [132:38] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'OPEN' @ [133:38] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'findMemberWithMaxVisibility' @ [134:29] ==> public fun findMemberWithMaxVisibility(descriptors: Collection<CallableMemberDescriptor>): CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'listOf' @ [134:57] ==> public fun <T> listOf(vararg elements: FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'superFunction' @ [134:64] ==> value-parameter superFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[ValueParameterDescriptorImpl]

'function' @ [134:79] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[ValueParameterDescriptorImpl]

'visibility' @ [134:90] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'DELEGATION' @ [135:59] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'newParameters' @ [137:21] ==> val newParameters: (ArrayList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..ArrayList<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'newFunction' @ [138:13] ==> val newFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'setSingleOverridden' @ [138:25] ==> public fun CallableMemberDescriptor.setSingleOverridden(overridden: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'superFunction' @ [138:45] ==> value-parameter superFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[ValueParameterDescriptorImpl]

'Signature' @ [140:20] ==> public constructor Signature(function: FunctionDescriptor) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature[ClassConstructorDescriptorImpl]

'newFunction' @ [140:30] ==> val newFunction: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.signatureToMatch[LocalVariableDescriptor]

'superParameters' @ [164:36] ==> value-parameter superParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[ValueParameterDescriptorImpl]

'!' @ [165:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matched' @ [165:22] ==> value-parameter matched: BitSet defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[ValueParameterDescriptorImpl]

'superParameter' @ [165:30] ==> val superParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[LocalVariableDescriptor]

'index' @ [165:45] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameters' @ [166:39] ==> value-parameter parameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[ValueParameterDescriptorImpl]

'parameterChooser' @ [167:38] ==> value-parameter parameterChooser: ChangeMemberFunctionSignatureFix.ParameterChooser defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[ValueParameterDescriptorImpl]

'choose' @ [167:55] ==> public abstract fun choose(parameter: ValueParameterDescriptor, superParameter: ValueParameterDescriptor): ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser[SimpleFunctionDescriptorImpl]

'parameter' @ [167:62] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[LocalVariableDescriptor]

'superParameter' @ [167:73] ==> val superParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[LocalVariableDescriptor]

'choice' @ [168:29] ==> val choice: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[LocalVariableDescriptor]

'!' @ [168:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'used' @ [168:48] ==> value-parameter used: BitSet defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[ValueParameterDescriptorImpl]

'parameter' @ [168:53] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[LocalVariableDescriptor]

'index' @ [168:63] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'used' @ [169:29] ==> value-parameter used: BitSet defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[ValueParameterDescriptorImpl]

'parameter' @ [169:34] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[LocalVariableDescriptor]

'index' @ [169:44] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'matched' @ [170:29] ==> value-parameter matched: BitSet defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[ValueParameterDescriptorImpl]

'superParameter' @ [170:37] ==> val superParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[LocalVariableDescriptor]

'index' @ [170:52] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'newParameters' @ [171:29] ==> value-parameter newParameters: MutableList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[ValueParameterDescriptorImpl]

'superParameter' @ [171:43] ==> val superParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[LocalVariableDescriptor]

'index' @ [171:58] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'choice' @ [171:67] ==> val choice: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.matchParameters[LocalVariableDescriptor]

'functionDescriptor' @ [184:35] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.getPossibleSuperFunctionsDescriptors[ValueParameterDescriptorImpl]

'containingDeclaration' @ [184:54] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'emptyList' @ [184:106] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'functionDescriptor' @ [186:24] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.getPossibleSuperFunctionsDescriptors[ValueParameterDescriptorImpl]

'name' @ [186:43] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'containingClass' @ [187:20] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.getPossibleSuperFunctionsDescriptors[LocalVariableDescriptor]

'defaultType' @ [187:36] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'supertypes' @ [187:48] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'flatMap' @ [188:22] ==> public inline fun <T, R> Iterable<KotlinType>.flatMap(transform: (KotlinType) -> Iterable<SimpleFunctionDescriptor>): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> SimpleFunctionDescriptor

'supertype' @ [188:45] ==> value-parameter supertype: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.getPossibleSuperFunctionsDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'memberScope' @ [188:55] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [188:67] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [188:91] ==> val name: Name defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.getPossibleSuperFunctionsDescriptors[LocalVariableDescriptor]

'FROM_IDE' @ [188:114] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'filter' @ [189:22] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.filter(predicate: (SimpleFunctionDescriptor) -> Boolean): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [189:31] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.getPossibleSuperFunctionsDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [189:34] ==> public final val SimpleFunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [189:39] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'it' @ [189:49] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.getPossibleSuperFunctionsDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'isOverridable' @ [189:52] ==> public val CallableMemberDescriptor.isOverridable: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'create' @ [200:59] ==> @NotNull public open fun create(@NotNull p0: DeclarationDescriptor, @NotNull p1: Annotations, @NotNull p2: Name, @NotNull p3: CallableMemberDescriptor.Kind, @NotNull p4: SourceElement): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'function' @ [201:21] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'containingDeclaration' @ [201:30] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'function' @ [202:21] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'annotations' @ [202:30] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedPropertyDescriptor]

'function' @ [203:21] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'name' @ [203:30] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'function' @ [204:21] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'kind' @ [204:30] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'NO_SOURCE' @ [205:35] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'newParameters' @ [208:30] ==> value-parameter newParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'withIndex' @ [208:44] ==> public fun <T> Iterable<ValueParameterDescriptor>.withIndex(): Iterable<IndexedValue<ValueParameterDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'map' @ [208:56] ==> public inline fun <T, R> Iterable<IndexedValue<ValueParameterDescriptor>>.map(transform: (IndexedValue<ValueParameterDescriptor>) -> ValueParameterDescriptorImpl): List<ValueParameterDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<ValueParameterDescriptor>
    <R> -> ValueParameterDescriptorImpl

'component1' @ [208:63] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [208:70] ==> public final operator fun component2(): ValueParameterDescriptor defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'ValueParameterDescriptorImpl' @ [209:17] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[DeserializedClassConstructorDescriptor]

'descriptor' @ [210:25] ==> val descriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[LocalVariableDescriptor]

'index' @ [210:43] ==> val index: Int defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters.<anonymous>[LocalVariableDescriptor]

'parameter' @ [211:25] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters.<anonymous>[LocalVariableDescriptor]

'annotations' @ [211:35] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameter' @ [211:48] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters.<anonymous>[LocalVariableDescriptor]

'name' @ [211:58] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'parameter' @ [211:64] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters.<anonymous>[LocalVariableDescriptor]

'returnType' @ [211:74] ==> public final val ValueParameterDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'parameter' @ [211:88] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters.<anonymous>[LocalVariableDescriptor]

'declaresDefaultValue' @ [211:98] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'parameter' @ [212:25] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters.<anonymous>[LocalVariableDescriptor]

'isCrossinline' @ [212:35] ==> public abstract val isCrossinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameter' @ [212:50] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters.<anonymous>[LocalVariableDescriptor]

'isNoinline' @ [212:60] ==> public abstract val isNoinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameter' @ [212:72] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters.<anonymous>[LocalVariableDescriptor]

'varargElementType' @ [212:82] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'NO_SOURCE' @ [212:115] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'descriptor' @ [216:20] ==> val descriptor: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[LocalVariableDescriptor]

'apply' @ [216:31] ==> @InlineOnly public inline fun <T> SimpleFunctionDescriptorImpl.apply(block: (SimpleFunctionDescriptorImpl).() -> Unit): SimpleFunctionDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptorImpl

'initialize' @ [217:17] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'function' @ [218:25] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [218:34] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [218:62] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'function' @ [218:68] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [218:77] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'function' @ [219:25] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'typeParameters' @ [219:34] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'parameters' @ [219:50] ==> val parameters: List<ValueParameterDescriptorImpl> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[LocalVariableDescriptor]

'function' @ [219:62] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'returnType' @ [219:71] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'function' @ [219:83] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'modality' @ [219:92] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'function' @ [219:102] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'visibility' @ [219:111] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'isOperator' @ [221:17] ==> public final var SimpleFunctionDescriptorImpl.isOperator: Boolean[MyPropertyDescriptor]

'function' @ [221:30] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'isOperator' @ [221:39] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'isInfix' @ [222:17] ==> public final var SimpleFunctionDescriptorImpl.isInfix: Boolean[MyPropertyDescriptor]

'function' @ [222:27] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'isInfix' @ [222:36] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'isExternal' @ [223:17] ==> public final var SimpleFunctionDescriptorImpl.isExternal: Boolean[MyPropertyDescriptor]

'function' @ [223:30] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'isExternal' @ [223:39] ==> public final val FunctionDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'isInline' @ [224:17] ==> public final var SimpleFunctionDescriptorImpl.isInline: Boolean[MyPropertyDescriptor]

'function' @ [224:28] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'isInline' @ [224:37] ==> public final val FunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'isTailrec' @ [225:17] ==> public final var SimpleFunctionDescriptorImpl.isTailrec: Boolean[MyPropertyDescriptor]

'function' @ [225:29] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Companion.replaceFunctionParameters[ValueParameterDescriptorImpl]

'isTailrec' @ [225:38] ==> public final val FunctionDescriptor.isTailrec: Boolean[MyPropertyDescriptor]

'signatures' @ [231:22] ==> private final val signatures: List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix[PropertyDescriptorImpl]

'singleOrNull' @ [231:33] ==> public fun <T> List<ChangeMemberFunctionSignatureFix.Signature>.singleOrNull(): ChangeMemberFunctionSignatureFix.Signature? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature

'if (single != null)
            "Change function signature to '${single.preview}'"
        else
            "Change function signature..."' @ [232:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'single' @ [232:20] ==> val single: ChangeMemberFunctionSignatureFix.Signature? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.getText[LocalVariableDescriptor]

'single' @ [233:46] ==> val single: ChangeMemberFunctionSignatureFix.Signature? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.getText[LocalVariableDescriptor]

'preview' @ [233:53] ==> public final val preview: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature[PropertyDescriptorImpl]

'element' @ [241:23] ==> protected final val element: KtNamedFunction? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix[PropertyDescriptorImpl]

'getInstance' @ [242:26] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'runUndoTransparentAction' @ [242:40] ==> public final fun runUndoTransparentAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'MyAction' @ [243:13] ==> public constructor MyAction(project: Project, editor: Editor?, function: KtNamedFunction, signatures: List<ChangeMemberFunctionSignatureFix.Signature>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[ClassConstructorDescriptorImpl]

'project' @ [243:22] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.invoke[ValueParameterDescriptorImpl]

'editor' @ [243:31] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.invoke[ValueParameterDescriptorImpl]

'element' @ [243:39] ==> val element: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.invoke[LocalVariableDescriptor]

'signatures' @ [243:48] ==> private final val signatures: List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix[PropertyDescriptorImpl]

'execute' @ [243:60] ==> public final fun execute(): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[SimpleFunctionDescriptorImpl]

'superParameter' @ [258:24] ==> value-parameter superParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser.MatchNames.choose[ValueParameterDescriptorImpl]

'takeIf' @ [258:39] ==> @InlineOnly @SinceKotlin public inline fun <T> ValueParameterDescriptor.takeIf(predicate: (ValueParameterDescriptor) -> Boolean): ValueParameterDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'parameter' @ [258:48] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser.MatchNames.choose[ValueParameterDescriptorImpl]

'name' @ [258:58] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'superParameter' @ [258:66] ==> value-parameter superParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser.MatchNames.choose[ValueParameterDescriptorImpl]

'name' @ [258:81] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'if (KotlinTypeChecker.DEFAULT.equalTypes(parameter.type, superParameter.type)) {
                    superParameter.copy(parameter.containingDeclaration, parameter.name, parameter.index)
                }
                else {
                    null
                }' @ [265:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ValueParameterDescriptor?, elseBranch: ValueParameterDescriptor?): ValueParameterDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ValueParameterDescriptor?

'DEFAULT' @ [265:46] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [265:54] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'parameter' @ [265:65] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser.MatchTypes.choose[ValueParameterDescriptorImpl]

'type' @ [265:75] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'superParameter' @ [265:81] ==> value-parameter superParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser.MatchTypes.choose[ValueParameterDescriptorImpl]

'type' @ [265:96] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'superParameter' @ [266:21] ==> value-parameter superParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser.MatchTypes.choose[ValueParameterDescriptorImpl]

'copy' @ [266:36] ==> public abstract fun copy(newOwner: CallableDescriptor, newName: Name, newIndex: Int): ValueParameterDescriptor defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'parameter' @ [266:41] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser.MatchTypes.choose[ValueParameterDescriptorImpl]

'containingDeclaration' @ [266:51] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'parameter' @ [266:74] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser.MatchTypes.choose[ValueParameterDescriptorImpl]

'name' @ [266:84] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'parameter' @ [266:90] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.ParameterChooser.MatchTypes.choose[ValueParameterDescriptorImpl]

'index' @ [266:100] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'getInstance' @ [283:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [283:44] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'commitAllDocuments' @ [283:53] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'!' @ [285:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [285:18] ==> private final val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'isValid' @ [285:27] ==> public final val KtNamedFunction.isValid: Boolean[MyPropertyDescriptor]

'signatures' @ [285:38] ==> private final val signatures: List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'isEmpty' @ [285:49] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'if (signatures.size == 1 || editor == null || !editor.component.isShowing) {
                changeSignature(signatures.first())
            }
            else {
                chooseSignatureAndChange()
            }' @ [287:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'signatures' @ [287:17] ==> private final val signatures: List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'size' @ [287:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'editor' @ [287:41] ==> private final val editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'!' @ [287:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'editor' @ [287:60] ==> private final val editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'component' @ [287:67] ==> public final val Editor.component: JComponent[MyPropertyDescriptor]

'isShowing' @ [287:77] ==> public final val JComponent.isShowing: Boolean[MyPropertyDescriptor]

'changeSignature' @ [288:17] ==> private final fun changeSignature(signature: ChangeMemberFunctionSignatureFix.Signature): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[SimpleFunctionDescriptorImpl]

'signatures' @ [288:33] ==> private final val signatures: List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'first' @ [288:44] ==> public fun <T> List<ChangeMemberFunctionSignatureFix.Signature>.first(): ChangeMemberFunctionSignatureFix.Signature defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature

'chooseSignatureAndChange' @ [291:17] ==> private final fun chooseSignatureAndChange(): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[SimpleFunctionDescriptorImpl]

'BaseListPopupStep<Signature>' @ [297:33] ==> public constructor BaseListPopupStep<T : (Any..Any?)>(@Nullable p0: String?, p1: (MutableList<out (ChangeMemberFunctionSignatureFix.Signature..ChangeMemberFunctionSignatureFix.Signature?)>..List<(ChangeMemberFunctionSignatureFix.Signature..ChangeMemberFunctionSignatureFix.Signature?)>?)) defined in com.intellij.openapi.ui.popup.util.BaseListPopupStep[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Signature

'signatures' @ [297:82] ==> private final val signatures: List<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'finalChoice' @ [301:29] ==> value-parameter finalChoice: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.<get-signaturePopup>.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'changeSignature' @ [302:29] ==> private final fun changeSignature(signature: ChangeMemberFunctionSignatureFix.Signature): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[SimpleFunctionDescriptorImpl]

'selectedValue' @ [302:45] ==> value-parameter selectedValue: ChangeMemberFunctionSignatureFix.Signature defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.<get-signaturePopup>.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'FINAL_CHOICE' @ [304:42] ==> public final val FINAL_CHOICE: raw (PopupStep<(Any..Any?)>..PopupStep<*>?) defined in com.intellij.openapi.ui.popup.PopupStep[JavaPropertyDescriptor]

'FUNCTION_ICON' @ [307:80] ==> public final val FUNCTION_ICON: (Icon..Icon?) defined in com.intellij.util.PlatformIcons[JavaPropertyDescriptor]

'aValue' @ [309:66] ==> value-parameter aValue: ChangeMemberFunctionSignatureFix.Signature defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.<get-signaturePopup>.<no name provided>.getTextFor[ValueParameterDescriptorImpl]

'preview' @ [309:73] ==> public final val preview: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature[PropertyDescriptorImpl]

'getInstance' @ [314:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [314:44] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'commitAllDocuments' @ [314:53] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [316:13] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'executeWriteCommand' @ [316:21] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [317:39] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [317:52] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'createFunction' @ [317:61] ==> public final fun createFunction(funDecl: String): KtNamedFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'signature' @ [317:76] ==> value-parameter signature: ChangeMemberFunctionSignatureFix.Signature defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature[ValueParameterDescriptorImpl]

'sourceCode' @ [317:86] ==> public final val sourceCode: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.Signature[PropertyDescriptorImpl]

'function' @ [319:34] ==> private final val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'setTypeReference' @ [319:43] ==> @Nullable public open fun setTypeReference(@Nullable p0: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'patternFunction' @ [319:60] ==> val patternFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [319:76] ==> public final var KtNamedFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'newTypeRef' @ [320:21] ==> val newTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>[LocalVariableDescriptor]

'ShortenReferences' @ [321:21] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [321:39] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [321:47] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'newTypeRef' @ [321:55] ==> val newTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>[LocalVariableDescriptor]

'patternFunction' @ [324:17] ==> val patternFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>[LocalVariableDescriptor]

'valueParameters' @ [324:33] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'forEach' @ [324:49] ==> @HidesMembers public inline fun <T> Iterable<(KtParameter..KtParameter?)>.forEach(action: ((KtParameter..KtParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'param' @ [325:21] ==> value-parameter param: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'annotationEntries' @ [325:27] ==> public final val KtParameter.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'forEach' @ [325:45] ==> @HidesMembers public inline fun <T> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.forEach(action: ((KtAnnotationEntry..KtAnnotationEntry?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'a' @ [326:25] ==> value-parameter a: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [326:27] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'run' @ [326:42] ==> @InlineOnly public inline fun <T, R> KtTypeReference.run(block: (KtTypeReference).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> Unit

'FqName' @ [327:42] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'this' @ [327:49] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'text' @ [327:54] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'fqName' @ [328:33] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'NULLABLE_ANNOTATIONS' @ [328:44] ==> public val NULLABLE_ANNOTATIONS: List<(FqName..FqName?)> defined in org.jetbrains.kotlin.load.java[DeserializedPropertyDescriptor]

'NOT_NULL_ANNOTATIONS' @ [328:67] ==> public val NOT_NULL_ANNOTATIONS: List<(FqName..FqName?)> defined in org.jetbrains.kotlin.load.java[DeserializedPropertyDescriptor]

'a' @ [328:90] ==> value-parameter a: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [328:92] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtAnnotationEntry[JavaMethodDescriptor]

'function' @ [333:40] ==> private final val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'valueParameterList' @ [333:49] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'replace' @ [333:70] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'patternFunction' @ [333:78] ==> val patternFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>[LocalVariableDescriptor]

'valueParameterList' @ [333:94] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'ShortenReferences' @ [334:17] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [334:35] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [334:43] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'newParameterList' @ [334:51] ==> val newParameterList: KtParameterList defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction.changeSignature.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [339:28] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopup' @ [339:42] ==> @NotNull public abstract fun createListPopup(@NotNull p0: raw (ListPopupStep<(Any..Any?)>..ListPopupStep<*>)): ListPopup defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'signaturePopup' @ [339:58] ==> private final val signaturePopup: BaseListPopupStep<ChangeMemberFunctionSignatureFix.Signature> defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

'showInBestPositionFor' @ [339:74] ==> public abstract fun showInBestPositionFor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.ui.popup.ListPopup[JavaMethodDescriptor]

'editor' @ [339:96] ==> private final val editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ChangeMemberFunctionSignatureFix.MyAction[PropertyDescriptorImpl]

