'operatorReference' @ [36:27] ==> value-parameter operatorReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.<init>[ValueParameterDescriptorImpl]

'getReferencedNameElementType' @ [36:45] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'NOT_IN' @ [36:88] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'gen' @ [39:13] ==> private final fun gen(argument: StackValue): BranchedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[SimpleFunctionDescriptorImpl]

'argument' @ [39:17] ==> value-parameter argument: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.generate[ValueParameterDescriptorImpl]

'let' @ [39:27] ==> @InlineOnly public inline fun <T, R> BranchedValue.let(block: (BranchedValue) -> BranchedValue): BranchedValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BranchedValue
    <R> -> BranchedValue

'if (isNotIn) Invert(it) else it' @ [39:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BranchedValue, elseBranch: BranchedValue): BranchedValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BranchedValue

'isNotIn' @ [39:37] ==> private final val isNotIn: Boolean defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'Invert' @ [39:46] ==> public constructor Invert(condition: BranchedValue) defined in org.jetbrains.kotlin.codegen.Invert[ClassConstructorDescriptorImpl]

'it' @ [39:53] ==> value-parameter it: BranchedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [39:62] ==> value-parameter it: BranchedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'BranchedValue' @ [42:22] ==> public constructor BranchedValue(arg1: StackValue, arg2: StackValue? = ..., operandType: Type, opcode: Int) defined in org.jetbrains.kotlin.codegen.BranchedValue[ClassConstructorDescriptorImpl]

'argument' @ [42:36] ==> value-parameter argument: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen[ValueParameterDescriptorImpl]

'comparisonGenerator' @ [42:52] ==> private final val comparisonGenerator: ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'comparedType' @ [42:72] ==> public abstract val comparedType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.ComparisonGenerator[PropertyDescriptorImpl]

'IFEQ' @ [42:94] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (jumpIfFalse) {
                        genJumpIfFalse(v, jumpLabel)
                    }
                    else {
                        genJumpIfTrue(v, jumpLabel)
                    }' @ [44:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'jumpIfFalse' @ [44:25] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'genJumpIfFalse' @ [45:25] ==> private final fun genJumpIfFalse(v: InstructionAdapter, jumpLabel: Label): Unit defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[SimpleFunctionDescriptorImpl]

'v' @ [45:40] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'jumpLabel' @ [45:43] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'genJumpIfTrue' @ [48:25] ==> private final fun genJumpIfTrue(v: InstructionAdapter, jumpLabel: Label): Unit defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[SimpleFunctionDescriptorImpl]

'v' @ [48:39] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'jumpLabel' @ [48:42] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'Label' @ [55:38] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'Label' @ [56:38] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'boundedValue' @ [58:21] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'putHighLow' @ [58:34] ==> public abstract fun putHighLow(v: InstructionAdapter, type: Type): Unit defined in org.jetbrains.kotlin.codegen.range.BoundedValue[SimpleFunctionDescriptorImpl]

'v' @ [58:45] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'operandType' @ [58:48] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'arg1' @ [59:21] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'put' @ [59:26] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [59:30] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'v' @ [59:43] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'dupx' @ [60:29] ==> public open fun dupx(@NotNull v: InstructionAdapter, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [60:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'operandType' @ [60:37] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'if (boundedValue.isLowInclusive) {
                        // low > arg
                        comparisonGenerator.jumpIfGreater(v, exitLabel1)
                    }
                    else {
                        // low >= arg
                        comparisonGenerator.jumpIfGreaterOrEqual(v, exitLabel1)
                    }' @ [64:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'boundedValue' @ [64:25] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'isLowInclusive' @ [64:38] ==> public abstract val isLowInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.BoundedValue[PropertyDescriptorImpl]

'comparisonGenerator' @ [66:25] ==> private final val comparisonGenerator: ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'jumpIfGreater' @ [66:45] ==> public abstract fun jumpIfGreater(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [66:59] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'exitLabel1' @ [66:62] ==> val exitLabel1: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'comparisonGenerator' @ [70:25] ==> private final val comparisonGenerator: ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'jumpIfGreaterOrEqual' @ [70:45] ==> public abstract fun jumpIfGreaterOrEqual(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [70:66] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'exitLabel1' @ [70:69] ==> val exitLabel1: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'if (boundedValue.isHighInclusive) {
                        // high >= arg
                        comparisonGenerator.jumpIfGreaterOrEqual(v, jumpLabel)
                    }
                    else {
                        // high > arg
                        comparisonGenerator.jumpIfGreater(v, jumpLabel)
                    }' @ [75:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'boundedValue' @ [75:25] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'isHighInclusive' @ [75:38] ==> public abstract val isHighInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.BoundedValue[PropertyDescriptorImpl]

'comparisonGenerator' @ [77:25] ==> private final val comparisonGenerator: ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'jumpIfGreaterOrEqual' @ [77:45] ==> public abstract fun jumpIfGreaterOrEqual(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [77:66] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'jumpLabel' @ [77:69] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'comparisonGenerator' @ [81:25] ==> private final val comparisonGenerator: ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'jumpIfGreater' @ [81:45] ==> public abstract fun jumpIfGreater(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [81:59] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'jumpLabel' @ [81:62] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'v' @ [83:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'goTo' @ [83:23] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'exitLabel2' @ [83:28] ==> val exitLabel2: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'v' @ [85:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'mark' @ [85:23] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'exitLabel1' @ [85:28] ==> val exitLabel1: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'pop2' @ [86:29] ==> public open fun pop2(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [86:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'operandType' @ [86:37] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'v' @ [88:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'mark' @ [88:23] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'exitLabel2' @ [88:28] ==> val exitLabel2: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'Label' @ [94:40] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'boundedValue' @ [96:21] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'putHighLow' @ [96:34] ==> public abstract fun putHighLow(v: InstructionAdapter, type: Type): Unit defined in org.jetbrains.kotlin.codegen.range.BoundedValue[SimpleFunctionDescriptorImpl]

'v' @ [96:45] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'operandType' @ [96:48] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'arg1' @ [97:21] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'put' @ [97:26] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [97:30] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'v' @ [97:43] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'dupx' @ [98:29] ==> public open fun dupx(@NotNull v: InstructionAdapter, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [98:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'operandType' @ [98:37] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'if (boundedValue.isLowInclusive) {
                        // low <= arg
                        comparisonGenerator.jumpIfLessOrEqual(v, cmpHighLabel)
                    }
                    else {
                        // low < arg
                        comparisonGenerator.jumpIfLess(v, cmpHighLabel)
                    }' @ [102:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'boundedValue' @ [102:25] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'isLowInclusive' @ [102:38] ==> public abstract val isLowInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.BoundedValue[PropertyDescriptorImpl]

'comparisonGenerator' @ [104:25] ==> private final val comparisonGenerator: ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'jumpIfLessOrEqual' @ [104:45] ==> public abstract fun jumpIfLessOrEqual(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [104:63] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'cmpHighLabel' @ [104:66] ==> val cmpHighLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[LocalVariableDescriptor]

'comparisonGenerator' @ [108:25] ==> private final val comparisonGenerator: ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'jumpIfLess' @ [108:45] ==> public abstract fun jumpIfLess(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [108:56] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'cmpHighLabel' @ [108:59] ==> val cmpHighLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[LocalVariableDescriptor]

'pop2' @ [112:29] ==> public open fun pop2(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [112:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'operandType' @ [112:37] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'v' @ [113:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'goTo' @ [113:23] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'jumpLabel' @ [113:28] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'v' @ [115:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'mark' @ [115:23] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'cmpHighLabel' @ [115:28] ==> val cmpHighLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[LocalVariableDescriptor]

'if (boundedValue.isHighInclusive) {
                        // high < arg
                        comparisonGenerator.jumpIfLess(v, jumpLabel)
                    }
                    else {
                        // high <= arg
                        comparisonGenerator.jumpIfLessOrEqual(v, jumpLabel)
                    }' @ [118:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'boundedValue' @ [118:25] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'isHighInclusive' @ [118:38] ==> public abstract val isHighInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.BoundedValue[PropertyDescriptorImpl]

'comparisonGenerator' @ [120:25] ==> private final val comparisonGenerator: ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'jumpIfLess' @ [120:45] ==> public abstract fun jumpIfLess(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [120:56] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'jumpLabel' @ [120:59] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'comparisonGenerator' @ [124:25] ==> private final val comparisonGenerator: ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[PropertyDescriptorImpl]

'jumpIfLessOrEqual' @ [124:45] ==> public abstract fun jumpIfLessOrEqual(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [124:63] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'jumpLabel' @ [124:66] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

