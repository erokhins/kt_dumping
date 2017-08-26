'InstructionWithNext' @ [34:5] ==> public constructor InstructionWithNext(element: KtElement, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionWithNext[ClassConstructorDescriptorImpl]

'element' @ [34:25] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction.<init>[ValueParameterDescriptorImpl]

'blockScope' @ [34:34] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction.<init>[ValueParameterDescriptorImpl]

'resultValue' @ [38:17] ==> protected final var resultValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[PropertyDescriptorImpl]

'+' @ [41:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [41:15] ==> value-parameter name: String defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction.renderInstruction[ValueParameterDescriptorImpl]

'desc' @ [41:21] ==> value-parameter desc: String defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction.renderInstruction[ValueParameterDescriptorImpl]

'if (inputValues.isNotEmpty()) "|${inputValues.joinToString(", ")})" else ")"' @ [42:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'inputValues' @ [42:18] ==> public open val inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[PropertyDescriptorImpl]

'isNotEmpty' @ [42:30] ==> @InlineOnly public inline fun <T> Collection<PseudoValue>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'inputValues' @ [42:48] ==> public open val inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[PropertyDescriptorImpl]

'joinToString' @ [42:60] ==> public fun <T> Iterable<PseudoValue>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((PseudoValue) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'if (resultValue != null) " -> $resultValue" else ""' @ [43:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'resultValue' @ [43:18] ==> protected final var resultValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[PropertyDescriptorImpl]

'resultValue' @ [43:45] ==> protected final var resultValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[PropertyDescriptorImpl]

'this' @ [46:9] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[LazyClassReceiverParameterDescriptor]

'resultValue' @ [46:14] ==> protected final var resultValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[PropertyDescriptorImpl]

'value' @ [46:28] ==> value-parameter value: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction.setResult[ValueParameterDescriptorImpl]

'this' @ [47:16] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[LazyClassReceiverParameterDescriptor]

'element' @ [50:86] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[PropertyDescriptorImpl]

'setResult' @ [51:13] ==> protected final fun setResult(value: PseudoValue?): OperationInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[SimpleFunctionDescriptorImpl]

'factory' @ [51:23] ==> value-parameter factory: PseudoValueFactory? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction.setResult[ValueParameterDescriptorImpl]

'newValue' @ [51:32] ==> public abstract fun newValue(element: KtElement?, instruction: InstructionWithValue?): PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValueFactory[SimpleFunctionDescriptorImpl]

'valueElement' @ [51:41] ==> value-parameter valueElement: KtElement? = ... defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction.setResult[ValueParameterDescriptorImpl]

'this' @ [51:55] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[LazyClassReceiverParameterDescriptor]

'OperationInstruction' @ [60:5] ==> protected constructor OperationInstruction(element: KtElement, blockScope: BlockScope, inputValues: List<PseudoValue>) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[ClassConstructorDescriptorImpl]

'element' @ [60:26] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'blockScope' @ [60:35] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'+' @ [60:47] ==> public operator fun <T> Collection<PseudoValue>.plus(elements: Iterable<PseudoValue>): List<PseudoValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'receiverValues' @ [60:48] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'keys' @ [60:63] ==> public abstract val keys: Set<PseudoValue> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'arguments' @ [60:98] ==> value-parameter arguments: Map<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'keys' @ [60:108] ==> public abstract val keys: Set<PseudoValue> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'this' @ [69:8] ==> private constructor CallInstruction(element: KtElement, blockScope: BlockScope, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>, arguments: Map<PseudoValue, ValueParameterDescriptor>) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[ClassConstructorDescriptorImpl]

'element' @ [69:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'blockScope' @ [69:22] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'resolvedCall' @ [69:34] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'receiverValues' @ [69:48] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'arguments' @ [69:64] ==> value-parameter arguments: Map<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'setResult' @ [70:9] ==> protected final fun setResult(factory: PseudoValueFactory?, valueElement: KtElement?): OperationInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[SimpleFunctionDescriptorImpl]

'factory' @ [70:19] ==> value-parameter factory: PseudoValueFactory? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.<init>[ValueParameterDescriptorImpl]

'visitor' @ [74:9] ==> value-parameter visitor: InstructionVisitor defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.accept[ValueParameterDescriptorImpl]

'visitCallInstruction' @ [74:17] ==> public open fun visitCallInstruction(instruction: CallInstruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitor[SimpleFunctionDescriptorImpl]

'this' @ [74:38] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[LazyClassReceiverParameterDescriptor]

'visitor' @ [77:76] ==> value-parameter visitor: InstructionVisitorWithResult<R> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction.accept[ValueParameterDescriptorImpl]

'visitCallInstruction' @ [77:84] ==> public open fun visitCallInstruction(instruction: CallInstruction): R defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitorWithResult[SimpleFunctionDescriptorImpl]

'this' @ [77:105] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[LazyClassReceiverParameterDescriptor]

'CallInstruction' @ [80:13] ==> private constructor CallInstruction(element: KtElement, blockScope: BlockScope, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>, arguments: Map<PseudoValue, ValueParameterDescriptor>) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[ClassConstructorDescriptorImpl]

'element' @ [80:29] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'blockScope' @ [80:38] ==> public open val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'resolvedCall' @ [80:50] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'receiverValues' @ [80:64] ==> public open val receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'arguments' @ [80:80] ==> public final val arguments: Map<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'setResult' @ [80:91] ==> protected final fun setResult(value: PseudoValue?): OperationInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[SimpleFunctionDescriptorImpl]

'resultValue' @ [80:101] ==> protected final var resultValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'renderInstruction' @ [83:13] ==> protected final fun renderInstruction(name: String, desc: String): String defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[SimpleFunctionDescriptorImpl]

'render' @ [83:42] ==> protected final fun render(element: PsiElement): String defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[SimpleFunctionDescriptorImpl]

'element' @ [83:49] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'resolvedCall' @ [83:62] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'resultingDescriptor' @ [83:75] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'name' @ [83:97] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'OperationInstruction' @ [96:5] ==> protected constructor OperationInstruction(element: KtElement, blockScope: BlockScope, inputValues: List<PseudoValue>) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[ClassConstructorDescriptorImpl]

'element' @ [96:26] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.<init>[ValueParameterDescriptorImpl]

'blockScope' @ [96:35] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.<init>[ValueParameterDescriptorImpl]

'inputValues' @ [96:47] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.<init>[ValueParameterDescriptorImpl]

'this' @ [104:8] ==> public constructor MagicInstruction(element: KtElement, blockScope: BlockScope, inputValues: List<PseudoValue>, kind: MagicKind) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[ClassConstructorDescriptorImpl]

'element' @ [104:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.<init>[ValueParameterDescriptorImpl]

'blockScope' @ [104:22] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.<init>[ValueParameterDescriptorImpl]

'inputValues' @ [104:34] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.<init>[ValueParameterDescriptorImpl]

'kind' @ [104:47] ==> value-parameter kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.<init>[ValueParameterDescriptorImpl]

'setResult' @ [105:9] ==> protected final fun setResult(factory: PseudoValueFactory?, valueElement: KtElement?): OperationInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[SimpleFunctionDescriptorImpl]

'factory' @ [105:19] ==> value-parameter factory: PseudoValueFactory defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.<init>[ValueParameterDescriptorImpl]

'valueElement' @ [105:28] ==> value-parameter valueElement: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.<init>[ValueParameterDescriptorImpl]

'outputValue' @ [108:36] ==> public open val outputValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'element' @ [108:48] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[PropertyDescriptorImpl]

'resultValue' @ [111:17] ==> protected final var resultValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'visitor' @ [113:56] ==> value-parameter visitor: InstructionVisitor defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.accept[ValueParameterDescriptorImpl]

'visitMagic' @ [113:64] ==> public open fun visitMagic(instruction: MagicInstruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitor[SimpleFunctionDescriptorImpl]

'this' @ [113:75] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[LazyClassReceiverParameterDescriptor]

'visitor' @ [115:76] ==> value-parameter visitor: InstructionVisitorWithResult<R> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction.accept[ValueParameterDescriptorImpl]

'visitMagic' @ [115:84] ==> public open fun visitMagic(instruction: MagicInstruction): R defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitorWithResult[SimpleFunctionDescriptorImpl]

'this' @ [115:95] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[LazyClassReceiverParameterDescriptor]

'MagicInstruction' @ [118:13] ==> public constructor MagicInstruction(element: KtElement, blockScope: BlockScope, inputValues: List<PseudoValue>, kind: MagicKind) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[ClassConstructorDescriptorImpl]

'element' @ [118:30] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'blockScope' @ [118:39] ==> public open val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'inputValues' @ [118:51] ==> public open val inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'kind' @ [118:64] ==> public final val kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'setResult' @ [118:70] ==> protected final fun setResult(value: PseudoValue?): OperationInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[SimpleFunctionDescriptorImpl]

'resultValue' @ [118:80] ==> protected final var resultValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'renderInstruction' @ [120:31] ==> protected final fun renderInstruction(name: String, desc: String): String defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[SimpleFunctionDescriptorImpl]

'kind' @ [120:57] ==> public final val kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'render' @ [120:65] ==> protected final fun render(element: PsiElement): String defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[SimpleFunctionDescriptorImpl]

'element' @ [120:72] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'' @ [125:20] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [126:8] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [127:7] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [128:23] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [129:29] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [130:7] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [131:9] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [132:31] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [133:29] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [135:25] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [136:22] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [137:19] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [139:20] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [140:24] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [141:27] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [142:21] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'' @ [143:25] ==> private constructor MagicKind(sideEffectFree: Boolean = ...) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[ClassConstructorDescriptorImpl]

'OperationInstruction' @ [151:4] ==> protected constructor OperationInstruction(element: KtElement, blockScope: BlockScope, inputValues: List<PseudoValue>) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.OperationInstruction[ClassConstructorDescriptorImpl]

'element' @ [151:25] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction.<init>[ValueParameterDescriptorImpl]

'blockScope' @ [151:34] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction.<init>[ValueParameterDescriptorImpl]

'inputValues' @ [151:46] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction.<init>[ValueParameterDescriptorImpl]

'this' @ [157:8] ==> private constructor MergeInstruction(element: KtElement, blockScope: BlockScope, inputValues: List<PseudoValue>) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[ClassConstructorDescriptorImpl]

'element' @ [157:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction.<init>[ValueParameterDescriptorImpl]

'blockScope' @ [157:22] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction.<init>[ValueParameterDescriptorImpl]

'inputValues' @ [157:34] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction.<init>[ValueParameterDescriptorImpl]

'setResult' @ [158:9] ==> protected final fun setResult(factory: PseudoValueFactory?, valueElement: KtElement?): OperationInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[SimpleFunctionDescriptorImpl]

'factory' @ [158:19] ==> value-parameter factory: PseudoValueFactory defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction.<init>[ValueParameterDescriptorImpl]

'resultValue' @ [162:17] ==> protected final var resultValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

'visitor' @ [164:56] ==> value-parameter visitor: InstructionVisitor defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction.accept[ValueParameterDescriptorImpl]

'visitMerge' @ [164:64] ==> public open fun visitMerge(instruction: MergeInstruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitor[SimpleFunctionDescriptorImpl]

'this' @ [164:75] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[LazyClassReceiverParameterDescriptor]

'visitor' @ [166:76] ==> value-parameter visitor: InstructionVisitorWithResult<R> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction.accept[ValueParameterDescriptorImpl]

'visitMerge' @ [166:84] ==> public open fun visitMerge(instruction: MergeInstruction): R defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitorWithResult[SimpleFunctionDescriptorImpl]

'this' @ [166:95] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[LazyClassReceiverParameterDescriptor]

'MergeInstruction' @ [168:33] ==> private constructor MergeInstruction(element: KtElement, blockScope: BlockScope, inputValues: List<PseudoValue>) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[ClassConstructorDescriptorImpl]

'element' @ [168:50] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

'blockScope' @ [168:59] ==> public open val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

'inputValues' @ [168:71] ==> public open val inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

'setResult' @ [168:84] ==> protected final fun setResult(value: PseudoValue?): OperationInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[SimpleFunctionDescriptorImpl]

'resultValue' @ [168:94] ==> protected final var resultValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

'renderInstruction' @ [170:31] ==> protected final fun renderInstruction(name: String, desc: String): String defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[SimpleFunctionDescriptorImpl]

'render' @ [170:58] ==> protected final fun render(element: PsiElement): String defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[SimpleFunctionDescriptorImpl]

'element' @ [170:65] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

