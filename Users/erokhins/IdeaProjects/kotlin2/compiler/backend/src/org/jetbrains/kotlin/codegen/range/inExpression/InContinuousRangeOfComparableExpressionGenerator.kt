'operatorReference' @ [35:27] ==> value-parameter operatorReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.<init>[ValueParameterDescriptorImpl]

'getReferencedNameElementType' @ [35:45] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'NOT_IN' @ [35:88] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ObjectComparisonGenerator' @ [36:39] ==> public object ObjectComparisonGenerator : ComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.comparison in file ObjectComparisonGenerator.kt[FakeCallableDescriptorForObject]

'gen' @ [39:13] ==> private final fun gen(argument: StackValue): BranchedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[SimpleFunctionDescriptorImpl]

'argument' @ [39:17] ==> value-parameter argument: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.generate[ValueParameterDescriptorImpl]

'let' @ [39:27] ==> @InlineOnly public inline fun <T, R> BranchedValue.let(block: (BranchedValue) -> BranchedValue): BranchedValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BranchedValue
    <R> -> BranchedValue

'if (isNotIn) Invert(it) else it' @ [39:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BranchedValue, elseBranch: BranchedValue): BranchedValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BranchedValue

'isNotIn' @ [39:37] ==> private final val isNotIn: Boolean defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'Invert' @ [39:46] ==> public constructor Invert(condition: BranchedValue) defined in org.jetbrains.kotlin.codegen.Invert[ClassConstructorDescriptorImpl]

'it' @ [39:53] ==> value-parameter it: BranchedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [39:62] ==> value-parameter it: BranchedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'BranchedValue' @ [42:22] ==> public constructor BranchedValue(arg1: StackValue, arg2: StackValue? = ..., operandType: Type, opcode: Int) defined in org.jetbrains.kotlin.codegen.BranchedValue[ClassConstructorDescriptorImpl]

'argument' @ [42:36] ==> value-parameter argument: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen[ValueParameterDescriptorImpl]

'comparisonGenerator' @ [42:52] ==> private final val comparisonGenerator: ObjectComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'comparedType' @ [42:72] ==> public open val comparedType: Type defined in org.jetbrains.kotlin.codegen.range.comparison.ObjectComparisonGenerator[PropertyDescriptorImpl]

'IFEQ' @ [42:94] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (jumpIfFalse) {
                        genJumpIfFalse(v, jumpLabel)
                    }
                    else {
                        genJumpIfTrue(v, jumpLabel)
                    }' @ [44:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'jumpIfFalse' @ [44:25] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'genJumpIfFalse' @ [45:25] ==> private final fun genJumpIfFalse(v: InstructionAdapter, jumpLabel: Label): Unit defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[SimpleFunctionDescriptorImpl]

'v' @ [45:40] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'jumpLabel' @ [45:43] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'genJumpIfTrue' @ [48:25] ==> private final fun genJumpIfTrue(v: InstructionAdapter, jumpLabel: Label): Unit defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[SimpleFunctionDescriptorImpl]

'v' @ [48:39] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'jumpLabel' @ [48:42] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'Label' @ [55:38] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'Label' @ [56:38] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'boundedValue' @ [58:21] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'putHighLow' @ [58:34] ==> public abstract fun putHighLow(v: InstructionAdapter, type: Type): Unit defined in org.jetbrains.kotlin.codegen.range.BoundedValue[SimpleFunctionDescriptorImpl]

'v' @ [58:45] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'operandType' @ [58:48] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'arg1' @ [59:21] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'put' @ [59:26] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [59:30] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'v' @ [59:43] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'dupx' @ [60:29] ==> public open fun dupx(@NotNull v: InstructionAdapter, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [60:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'operandType' @ [60:37] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'if (boundedValue.isLowInclusive) {
                        // arg < low
                        v.swap()
                        comparisonGenerator.jumpIfLess(v, exitLabel1)
                    }
                    else {
                        // arg <= low
                        v.swap()
                        comparisonGenerator.jumpIfLessOrEqual(v, exitLabel1)
                    }' @ [64:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'boundedValue' @ [64:25] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'isLowInclusive' @ [64:38] ==> public abstract val isLowInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.BoundedValue[PropertyDescriptorImpl]

'v' @ [66:25] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'swap' @ [66:27] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'comparisonGenerator' @ [67:25] ==> private final val comparisonGenerator: ObjectComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'jumpIfLess' @ [67:45] ==> public open fun jumpIfLess(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ObjectComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [67:56] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'exitLabel1' @ [67:59] ==> val exitLabel1: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'v' @ [71:25] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'swap' @ [71:27] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'comparisonGenerator' @ [72:25] ==> private final val comparisonGenerator: ObjectComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'jumpIfLessOrEqual' @ [72:45] ==> public open fun jumpIfLessOrEqual(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ObjectComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [72:63] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'exitLabel1' @ [72:66] ==> val exitLabel1: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'if (boundedValue.isHighInclusive) {
                        // arg <= high
                        v.swap()
                        comparisonGenerator.jumpIfLessOrEqual(v, jumpLabel)
                    }
                    else {
                        // arg < high
                        v.swap()
                        comparisonGenerator.jumpIfLess(v, jumpLabel)
                    }' @ [77:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'boundedValue' @ [77:25] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'isHighInclusive' @ [77:38] ==> public abstract val isHighInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.BoundedValue[PropertyDescriptorImpl]

'v' @ [79:25] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'swap' @ [79:27] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'comparisonGenerator' @ [80:25] ==> private final val comparisonGenerator: ObjectComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'jumpIfLessOrEqual' @ [80:45] ==> public open fun jumpIfLessOrEqual(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ObjectComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [80:63] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'jumpLabel' @ [80:66] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'v' @ [84:25] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'swap' @ [84:27] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'comparisonGenerator' @ [85:25] ==> private final val comparisonGenerator: ObjectComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'jumpIfLess' @ [85:45] ==> public open fun jumpIfLess(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ObjectComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [85:56] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'jumpLabel' @ [85:59] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'v' @ [87:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'goTo' @ [87:23] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'exitLabel2' @ [87:28] ==> val exitLabel2: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'v' @ [89:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'mark' @ [89:23] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'exitLabel1' @ [89:28] ==> val exitLabel1: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'pop2' @ [90:29] ==> public open fun pop2(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [90:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'operandType' @ [90:37] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'v' @ [92:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[ValueParameterDescriptorImpl]

'mark' @ [92:23] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'exitLabel2' @ [92:28] ==> val exitLabel2: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfTrue[LocalVariableDescriptor]

'Label' @ [98:40] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'boundedValue' @ [100:21] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'putHighLow' @ [100:34] ==> public abstract fun putHighLow(v: InstructionAdapter, type: Type): Unit defined in org.jetbrains.kotlin.codegen.range.BoundedValue[SimpleFunctionDescriptorImpl]

'v' @ [100:45] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'operandType' @ [100:48] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'arg1' @ [101:21] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'put' @ [101:26] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [101:30] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'v' @ [101:43] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'dupx' @ [102:29] ==> public open fun dupx(@NotNull v: InstructionAdapter, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [102:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'operandType' @ [102:37] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'if (boundedValue.isLowInclusive) {
                        // arg >= low
                        v.swap()
                        comparisonGenerator.jumpIfGreaterOrEqual(v, cmpHighLabel)
                    }
                    else {
                        // arg > low
                        v.swap()
                        comparisonGenerator.jumpIfGreater(v, cmpHighLabel)
                    }' @ [106:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'boundedValue' @ [106:25] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'isLowInclusive' @ [106:38] ==> public abstract val isLowInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.BoundedValue[PropertyDescriptorImpl]

'v' @ [108:25] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'swap' @ [108:27] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'comparisonGenerator' @ [109:25] ==> private final val comparisonGenerator: ObjectComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'jumpIfGreaterOrEqual' @ [109:45] ==> public open fun jumpIfGreaterOrEqual(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ObjectComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [109:66] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'cmpHighLabel' @ [109:69] ==> val cmpHighLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[LocalVariableDescriptor]

'v' @ [113:25] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'swap' @ [113:27] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'comparisonGenerator' @ [114:25] ==> private final val comparisonGenerator: ObjectComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'jumpIfGreater' @ [114:45] ==> public open fun jumpIfGreater(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ObjectComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [114:59] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'cmpHighLabel' @ [114:62] ==> val cmpHighLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[LocalVariableDescriptor]

'pop2' @ [118:29] ==> public open fun pop2(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [118:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'operandType' @ [118:37] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>[PropertyDescriptorImpl]

'v' @ [119:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'goTo' @ [119:23] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'jumpLabel' @ [119:28] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'v' @ [121:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'mark' @ [121:23] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'cmpHighLabel' @ [121:28] ==> val cmpHighLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[LocalVariableDescriptor]

'if (boundedValue.isHighInclusive) {
                        // arg > high
                        v.swap()
                        comparisonGenerator.jumpIfGreater(v, jumpLabel)
                    }
                    else {
                        // arg >= high
                        v.swap()
                        comparisonGenerator.jumpIfGreaterOrEqual(v, jumpLabel)
                    }' @ [124:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'boundedValue' @ [124:25] ==> private final val boundedValue: BoundedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'isHighInclusive' @ [124:38] ==> public abstract val isHighInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.BoundedValue[PropertyDescriptorImpl]

'v' @ [126:25] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'swap' @ [126:27] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'comparisonGenerator' @ [127:25] ==> private final val comparisonGenerator: ObjectComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'jumpIfGreater' @ [127:45] ==> public open fun jumpIfGreater(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ObjectComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [127:59] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'jumpLabel' @ [127:62] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'v' @ [131:25] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'swap' @ [131:27] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'comparisonGenerator' @ [132:25] ==> private final val comparisonGenerator: ObjectComparisonGenerator defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator[PropertyDescriptorImpl]

'jumpIfGreaterOrEqual' @ [132:45] ==> public open fun jumpIfGreaterOrEqual(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.range.comparison.ObjectComparisonGenerator[SimpleFunctionDescriptorImpl]

'v' @ [132:66] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

'jumpLabel' @ [132:69] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.InContinuousRangeOfComparableExpressionGenerator.gen.<no name provided>.genJumpIfFalse[ValueParameterDescriptorImpl]

