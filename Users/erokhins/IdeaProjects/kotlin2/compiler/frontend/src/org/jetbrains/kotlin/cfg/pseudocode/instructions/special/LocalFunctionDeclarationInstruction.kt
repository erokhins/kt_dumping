'InstructionWithNext' @ [32:5] ==> public constructor InstructionWithNext(element: KtElement, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionWithNext[ClassConstructorDescriptorImpl]

'element' @ [32:25] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction.<init>[ValueParameterDescriptorImpl]

'blockScope' @ [32:34] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction.<init>[ValueParameterDescriptorImpl]

'field' @ [35:13] ==> var field: SubroutineSinkInstruction? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction.<set-sink>[SyntheticFieldDescriptor]

'outgoingEdgeTo' @ [35:21] ==> protected final fun outgoingEdgeTo(target: Instruction?): Instruction? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[SimpleFunctionDescriptorImpl]

'value' @ [35:36] ==> value-parameter value: SubroutineSinkInstruction? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction.<set-sink>[ValueParameterDescriptorImpl]

'sink' @ [40:13] ==> public final var sink: SubroutineSinkInstruction? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'let' @ [40:19] ==> @InlineOnly public inline fun <T, R> SubroutineSinkInstruction.let(block: (SubroutineSinkInstruction) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SubroutineSinkInstruction
    <R> -> Nothing

'arrayListOf' @ [41:36] ==> public fun <T> arrayListOf(vararg elements: Instruction): ArrayList<Instruction> /* = ArrayList<Instruction> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'it' @ [41:61] ==> value-parameter it: SubroutineSinkInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction.<get-nextInstructions>.<anonymous>[ValueParameterDescriptorImpl]

'instructions' @ [42:17] ==> val instructions: ArrayList<Instruction> /* = ArrayList<Instruction> */ defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction.<get-nextInstructions>.<anonymous>[LocalVariableDescriptor]

'addAll' @ [42:30] ==> public open fun addAll(elements: Collection<Instruction>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'super' @ [42:37] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[LazyClassReceiverParameterDescriptor]

'nextInstructions' @ [42:43] ==> public open val nextInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionWithNext[PropertyDescriptorImpl]

'instructions' @ [43:24] ==> val instructions: ArrayList<Instruction> /* = ArrayList<Instruction> */ defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction.<get-nextInstructions>.<anonymous>[LocalVariableDescriptor]

'super' @ [45:20] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[LazyClassReceiverParameterDescriptor]

'nextInstructions' @ [45:26] ==> public open val nextInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionWithNext[PropertyDescriptorImpl]

'visitor' @ [49:9] ==> value-parameter visitor: InstructionVisitor defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction.accept[ValueParameterDescriptorImpl]

'visitLocalFunctionDeclarationInstruction' @ [49:17] ==> public open fun visitLocalFunctionDeclarationInstruction(instruction: LocalFunctionDeclarationInstruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitor[SimpleFunctionDescriptorImpl]

'this' @ [49:58] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[LazyClassReceiverParameterDescriptor]

'visitor' @ [52:76] ==> value-parameter visitor: InstructionVisitorWithResult<R> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction.accept[ValueParameterDescriptorImpl]

'visitLocalFunctionDeclarationInstruction' @ [52:84] ==> public open fun visitLocalFunctionDeclarationInstruction(instruction: LocalFunctionDeclarationInstruction): R defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitorWithResult[SimpleFunctionDescriptorImpl]

'this' @ [52:125] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[LazyClassReceiverParameterDescriptor]

'render' @ [54:44] ==> protected final fun render(element: PsiElement): String defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[SimpleFunctionDescriptorImpl]

'element' @ [54:51] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'LocalFunctionDeclarationInstruction' @ [57:13] ==> public constructor LocalFunctionDeclarationInstruction(element: KtElement, body: Pseudocode, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[ClassConstructorDescriptorImpl]

'element' @ [57:49] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'body' @ [57:58] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'copy' @ [57:63] ==> public abstract fun copy(): Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[SimpleFunctionDescriptorImpl]

'blockScope' @ [57:71] ==> public open val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

