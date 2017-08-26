'BranchedValue' @ [30:5] ==> public constructor BranchedValue(arg1: StackValue, arg2: StackValue? = ..., operandType: Type, opcode: Int) defined in org.jetbrains.kotlin.codegen.BranchedValue[ClassConstructorDescriptorImpl]

'left' @ [30:19] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.NumberLikeCompare.<init>[ValueParameterDescriptorImpl]

'right' @ [30:25] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.NumberLikeCompare.<init>[ValueParameterDescriptorImpl]

'operandType' @ [30:32] ==> value-parameter operandType: Type defined in org.jetbrains.kotlin.codegen.NumberLikeCompare.<init>[ValueParameterDescriptorImpl]

'NumberCompare' @ [30:45] ==> public companion object defined in org.jetbrains.kotlin.codegen.NumberCompare[FakeCallableDescriptorForObject]

'getNumberCompareOpcode' @ [30:59] ==> public final fun getNumberCompareOpcode(opToken: IElementType): Int defined in org.jetbrains.kotlin.codegen.NumberCompare.Companion[SimpleFunctionDescriptorImpl]

'opToken' @ [30:82] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.NumberLikeCompare.<init>[ValueParameterDescriptorImpl]

'NumberCompare' @ [32:13] ==> public companion object defined in org.jetbrains.kotlin.codegen.NumberCompare[FakeCallableDescriptorForObject]

'patchOpcode' @ [32:27] ==> public final fun patchOpcode(opcode: Int, v: InstructionAdapter, opToken: IElementType, operandType: Type): Int defined in org.jetbrains.kotlin.codegen.NumberCompare.Companion[SimpleFunctionDescriptorImpl]

'opcode' @ [32:39] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.NumberLikeCompare.patchOpcode[ValueParameterDescriptorImpl]

'v' @ [32:47] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.NumberLikeCompare.patchOpcode[ValueParameterDescriptorImpl]

'opToken' @ [32:50] ==> private final val opToken: IElementType defined in org.jetbrains.kotlin.codegen.NumberLikeCompare[PropertyDescriptorImpl]

'operandType' @ [32:59] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.NumberLikeCompare[PropertyDescriptorImpl]

'NumberLikeCompare' @ [40:5] ==> public constructor NumberLikeCompare(left: StackValue, right: StackValue, operandType: Type, opToken: IElementType) defined in org.jetbrains.kotlin.codegen.NumberLikeCompare[ClassConstructorDescriptorImpl]

'left' @ [40:23] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.<init>[ValueParameterDescriptorImpl]

'right' @ [40:29] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.<init>[ValueParameterDescriptorImpl]

'operandType' @ [40:36] ==> value-parameter operandType: Type defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.<init>[ValueParameterDescriptorImpl]

'opToken' @ [40:49] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.<init>[ValueParameterDescriptorImpl]

'opToken' @ [41:31] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.<init>[ValueParameterDescriptorImpl]

'EQEQ' @ [41:51] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'opToken' @ [41:59] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.<init>[ValueParameterDescriptorImpl]

'EQEQEQ' @ [41:79] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Label' @ [46:24] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'arg1' @ [48:9] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'put' @ [48:14] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [48:18] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'v' @ [48:31] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'arg2' @ [49:9] ==> public final val arg2: StackValue? defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'put' @ [49:16] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [49:20] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'v' @ [49:33] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'v' @ [50:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'visitJumpInsn' @ [50:11] ==> public open fun visitJumpInsn(p0: Int, p1: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'patchOpcode' @ [50:25] ==> protected open fun patchOpcode(opcode: Int, v: InstructionAdapter): Int defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[SimpleFunctionDescriptorImpl]

'if (jumpIfFalse) opcode else negatedOperations[opcode]!!' @ [50:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'jumpIfFalse' @ [50:41] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'opcode' @ [50:54] ==> public final val opcode: Int defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'negatedOperations' @ [50:66] ==> public final val negatedOperations: HashMap<Int, Int> /* = HashMap<Int, Int> */ defined in org.jetbrains.kotlin.codegen.BranchedValue.Companion[PropertyDescriptorImpl]

'opcode' @ [50:84] ==> public final val opcode: Int defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'v' @ [50:95] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'jumpLabel' @ [50:99] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'v' @ [51:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'goTo' @ [51:11] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [51:16] ==> val endLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[LocalVariableDescriptor]

'cleanupOnNullReceiver' @ [53:9] ==> protected abstract fun cleanupOnNullReceiver(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[SimpleFunctionDescriptorImpl]

'v' @ [53:31] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'jumpIfFalse' @ [54:13] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'trueIfEqual' @ [54:28] ==> private final val trueIfEqual: Boolean defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'v' @ [55:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'goTo' @ [55:15] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'jumpLabel' @ [55:20] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'v' @ [58:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[ValueParameterDescriptorImpl]

'mark' @ [58:11] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [58:16] ==> val endLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.condJump[LocalVariableDescriptor]

'Label' @ [62:26] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'Label' @ [63:24] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'arg1' @ [65:9] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'put' @ [65:14] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [65:18] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'v' @ [65:31] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'arg2' @ [66:9] ==> public final val arg2: StackValue? defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'put' @ [66:16] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [66:20] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'v' @ [66:33] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'v' @ [67:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'visitJumpInsn' @ [67:11] ==> public open fun visitJumpInsn(p0: Int, p1: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'patchOpcode' @ [67:25] ==> protected open fun patchOpcode(opcode: Int, v: InstructionAdapter): Int defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[SimpleFunctionDescriptorImpl]

'opcode' @ [67:37] ==> public final val opcode: Int defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'v' @ [67:45] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'falseLabel' @ [67:49] ==> val falseLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[LocalVariableDescriptor]

'!' @ [69:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'trueIfEqual' @ [69:14] ==> private final val trueIfEqual: Boolean defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'Label' @ [70:29] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'v' @ [71:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'goTo' @ [71:15] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'trueLabel' @ [71:20] ==> val trueLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[LocalVariableDescriptor]

'cleanupOnNullReceiver' @ [72:13] ==> protected abstract fun cleanupOnNullReceiver(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[SimpleFunctionDescriptorImpl]

'v' @ [72:35] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'v' @ [73:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'mark' @ [73:15] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'trueLabel' @ [73:20] ==> val trueLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[LocalVariableDescriptor]

'v' @ [76:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'iconst' @ [76:11] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'v' @ [77:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'goTo' @ [77:11] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [77:16] ==> val endLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[LocalVariableDescriptor]

'trueIfEqual' @ [79:13] ==> private final val trueIfEqual: Boolean defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[PropertyDescriptorImpl]

'cleanupOnNullReceiver' @ [80:13] ==> protected abstract fun cleanupOnNullReceiver(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[SimpleFunctionDescriptorImpl]

'v' @ [80:35] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'v' @ [83:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'mark' @ [83:11] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'falseLabel' @ [83:16] ==> val falseLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[LocalVariableDescriptor]

'v' @ [84:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'iconst' @ [84:11] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'v' @ [86:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'mark' @ [86:11] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [86:16] ==> val endLabel: Label defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[LocalVariableDescriptor]

'coerceTo' @ [87:9] ==> protected/*protected and package*/ open fun coerceTo(@NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[JavaMethodDescriptor]

'type' @ [87:18] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'v' @ [87:24] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase.putSelector[ValueParameterDescriptorImpl]

'SafeCallFusedWithPrimitiveEqualityBase' @ [99:5] ==> public constructor SafeCallFusedWithPrimitiveEqualityBase(opToken: IElementType, operandType: Type, left: StackValue, right: StackValue) defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[ClassConstructorDescriptorImpl]

'opToken' @ [99:44] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.SafeCallToPrimitiveEquality.<init>[ValueParameterDescriptorImpl]

'operandType' @ [99:53] ==> value-parameter operandType: Type defined in org.jetbrains.kotlin.codegen.SafeCallToPrimitiveEquality.<init>[ValueParameterDescriptorImpl]

'left' @ [99:66] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.SafeCallToPrimitiveEquality.<init>[ValueParameterDescriptorImpl]

'right' @ [99:72] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.SafeCallToPrimitiveEquality.<init>[ValueParameterDescriptorImpl]

'v' @ [101:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallToPrimitiveEquality.cleanupOnNullReceiver[ValueParameterDescriptorImpl]

'mark' @ [101:11] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'safeReceiverIsNull' @ [101:16] ==> private final val safeReceiverIsNull: Label defined in org.jetbrains.kotlin.codegen.SafeCallToPrimitiveEquality[PropertyDescriptorImpl]

'pop' @ [102:17] ==> public open fun pop(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [102:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.SafeCallToPrimitiveEquality.cleanupOnNullReceiver[ValueParameterDescriptorImpl]

'safeReceiverType' @ [102:24] ==> private final val safeReceiverType: Type defined in org.jetbrains.kotlin.codegen.SafeCallToPrimitiveEquality[PropertyDescriptorImpl]

'SafeCallFusedWithPrimitiveEqualityBase' @ [114:5] ==> public constructor SafeCallFusedWithPrimitiveEqualityBase(opToken: IElementType, operandType: Type, left: StackValue, right: StackValue) defined in org.jetbrains.kotlin.codegen.SafeCallFusedWithPrimitiveEqualityBase[ClassConstructorDescriptorImpl]

'opToken' @ [114:44] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality.<init>[ValueParameterDescriptorImpl]

'operandType' @ [114:53] ==> value-parameter operandType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality.<init>[ValueParameterDescriptorImpl]

'left' @ [114:66] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality.<init>[ValueParameterDescriptorImpl]

'right' @ [114:72] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality.<init>[ValueParameterDescriptorImpl]

'v' @ [116:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality.cleanupOnNullReceiver[ValueParameterDescriptorImpl]

'mark' @ [116:11] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'safeReceiverIsNull' @ [116:16] ==> private final val safeReceiverIsNull: Label defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality[PropertyDescriptorImpl]

'pop' @ [117:17] ==> public open fun pop(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [117:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality.cleanupOnNullReceiver[ValueParameterDescriptorImpl]

'safeReceiverType' @ [117:24] ==> private final val safeReceiverType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality[PropertyDescriptorImpl]

'pop' @ [118:17] ==> public open fun pop(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [118:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality.cleanupOnNullReceiver[ValueParameterDescriptorImpl]

'arg1' @ [118:24] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToSafeCallEquality[PropertyDescriptorImpl]

'type' @ [118:29] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'NumberLikeCompare' @ [128:5] ==> public constructor NumberLikeCompare(left: StackValue, right: StackValue, operandType: Type, opToken: IElementType) defined in org.jetbrains.kotlin.codegen.NumberLikeCompare[ClassConstructorDescriptorImpl]

'leftBoxed' @ [128:23] ==> value-parameter leftBoxed: StackValue defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.<init>[ValueParameterDescriptorImpl]

'rightPrimitive' @ [128:34] ==> value-parameter rightPrimitive: StackValue defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.<init>[ValueParameterDescriptorImpl]

'primitiveType' @ [128:50] ==> value-parameter primitiveType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.<init>[ValueParameterDescriptorImpl]

'EQEQ' @ [128:74] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'arg1' @ [129:29] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'type' @ [129:34] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'if (arg2!!.canHaveSideEffects()) {
            val tmp = frameMap.enterTemp(operandType)
            doJump(
                    v, jumpLabel, jumpIfFalse,
                    {
                        arg1.put(boxedType, v)
                        arg2.put(operandType, v)
                        v.store(tmp, operandType)
                    },
                    { v.load(tmp, operandType) }
            )
            frameMap.leaveTemp(operandType)
        }
        else {
            doJump(
                    v, jumpLabel, jumpIfFalse,
                    { arg1.put(boxedType, v) },
                    { arg2.put(operandType, v) }
            )
        }' @ [132:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arg2' @ [132:13] ==> public final val arg2: StackValue? defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'canHaveSideEffects' @ [132:20] ==> public open fun canHaveSideEffects(): Boolean defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'frameMap' @ [133:23] ==> private final val frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'enterTemp' @ [133:32] ==> public open fun enterTemp(type: (Type..Type?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'operandType' @ [133:42] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'doJump' @ [134:13] ==> private final inline fun doJump(v: InstructionAdapter, jumpLabel: Label, jumpIfFalse: Boolean, putArg1: () -> Unit, putArg2: () -> Unit): Unit defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[SimpleFunctionDescriptorImpl]

'v' @ [135:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'jumpLabel' @ [135:24] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'jumpIfFalse' @ [135:35] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'arg1' @ [137:25] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'put' @ [137:30] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'boxedType' @ [137:34] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'v' @ [137:45] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'arg2' @ [138:25] ==> public final val arg2: StackValue? defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'put' @ [138:30] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [138:34] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'v' @ [138:47] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'v' @ [139:25] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'store' @ [139:27] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'tmp' @ [139:33] ==> val tmp: Int defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[LocalVariableDescriptor]

'operandType' @ [139:38] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'v' @ [141:23] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'load' @ [141:25] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'tmp' @ [141:30] ==> val tmp: Int defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[LocalVariableDescriptor]

'operandType' @ [141:35] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'frameMap' @ [143:13] ==> private final val frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'leaveTemp' @ [143:22] ==> public open fun leaveTemp(type: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'operandType' @ [143:32] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'doJump' @ [146:13] ==> private final inline fun doJump(v: InstructionAdapter, jumpLabel: Label, jumpIfFalse: Boolean, putArg1: () -> Unit, putArg2: () -> Unit): Unit defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[SimpleFunctionDescriptorImpl]

'v' @ [147:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'jumpLabel' @ [147:24] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'jumpIfFalse' @ [147:35] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'arg1' @ [148:23] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'put' @ [148:28] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'boxedType' @ [148:32] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'v' @ [148:43] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'arg2' @ [149:23] ==> public final val arg2: StackValue? defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'put' @ [149:28] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operandType' @ [149:32] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'v' @ [149:45] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.condJump[ValueParameterDescriptorImpl]

'Label' @ [161:28] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'Label' @ [162:24] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'invoke' @ [164:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'dup' @ [165:17] ==> public open fun dup(@NotNull v: InstructionAdapter, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [165:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'boxedType' @ [165:24] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'v' @ [166:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'ifnonnull' @ [166:11] ==> public open fun ifnonnull(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'notNullLabel' @ [166:21] ==> val notNullLabel: Label defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[LocalVariableDescriptor]

'pop' @ [168:17] ==> public open fun pop(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [168:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'boxedType' @ [168:24] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'if (jumpIfFalse) v.goTo(jumpLabel) else v.goTo(endLabel)' @ [169:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'jumpIfFalse' @ [169:13] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'v' @ [169:26] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'goTo' @ [169:28] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'jumpLabel' @ [169:33] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'v' @ [169:49] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'goTo' @ [169:51] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [169:56] ==> val endLabel: Label defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[LocalVariableDescriptor]

'v' @ [171:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'mark' @ [171:11] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'notNullLabel' @ [171:16] ==> val notNullLabel: Label defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[LocalVariableDescriptor]

'coerce' @ [172:9] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'boxedType' @ [172:16] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'operandType' @ [172:27] ==> public final val operandType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'v' @ [172:40] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'invoke' @ [173:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'v' @ [174:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'visitJumpInsn' @ [174:11] ==> public open fun visitJumpInsn(p0: Int, p1: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'patchOpcode' @ [174:25] ==> protected open fun patchOpcode(opcode: Int, v: InstructionAdapter): Int defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[SimpleFunctionDescriptorImpl]

'if (jumpIfFalse) opcode else negatedOperations[opcode]!!' @ [174:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'jumpIfFalse' @ [174:41] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'opcode' @ [174:54] ==> public final val opcode: Int defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'negatedOperations' @ [174:66] ==> public final val negatedOperations: HashMap<Int, Int> /* = HashMap<Int, Int> */ defined in org.jetbrains.kotlin.codegen.BranchedValue.Companion[PropertyDescriptorImpl]

'opcode' @ [174:84] ==> public final val opcode: Int defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[PropertyDescriptorImpl]

'v' @ [174:95] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'jumpLabel' @ [174:99] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'v' @ [176:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[ValueParameterDescriptorImpl]

'mark' @ [176:11] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [176:16] ==> val endLabel: Label defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.doJump[LocalVariableDescriptor]

'JvmStatic' @ [180:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (!isApplicable(opToken, leftType, rightType))
                    throw IllegalArgumentException("Not applicable for $opToken, $leftType, $rightType")
                else when (opToken) {
                    KtTokens.EQEQ -> BoxedToPrimitiveEquality(left, right, rightType, frameMap)
                    KtTokens.EXCLEQ -> Invert(BoxedToPrimitiveEquality(left, right, rightType, frameMap))
                    else -> throw AssertionError("Unexpected opToken: $opToken")
                }' @ [189:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BranchedValue, elseBranch: BranchedValue): BranchedValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BranchedValue

'!' @ [189:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isApplicable' @ [189:22] ==> @JvmStatic public final fun isApplicable(opToken: IElementType, leftType: Type, rightType: Type): Boolean defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion[SimpleFunctionDescriptorImpl]

'opToken' @ [189:35] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [189:44] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'rightType' @ [189:54] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [190:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'opToken' @ [190:73] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [190:83] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'rightType' @ [190:94] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'when (opToken) {
                    KtTokens.EQEQ -> BoxedToPrimitiveEquality(left, right, rightType, frameMap)
                    KtTokens.EXCLEQ -> Invert(BoxedToPrimitiveEquality(left, right, rightType, frameMap))
                    else -> throw AssertionError("Unexpected opToken: $opToken")
                }' @ [191:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BranchedValue, entry1: BranchedValue, entry2: BranchedValue): BranchedValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BranchedValue

'opToken' @ [191:28] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'EQEQ' @ [192:30] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'BoxedToPrimitiveEquality' @ [192:38] ==> private constructor BoxedToPrimitiveEquality(leftBoxed: StackValue, rightPrimitive: StackValue, primitiveType: Type, frameMap: FrameMap) defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[ClassConstructorDescriptorImpl]

'left' @ [192:63] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'right' @ [192:69] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'rightType' @ [192:76] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'frameMap' @ [192:87] ==> value-parameter frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'EXCLEQ' @ [193:30] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Invert' @ [193:40] ==> public constructor Invert(condition: BranchedValue) defined in org.jetbrains.kotlin.codegen.Invert[ClassConstructorDescriptorImpl]

'BoxedToPrimitiveEquality' @ [193:47] ==> private constructor BoxedToPrimitiveEquality(leftBoxed: StackValue, rightPrimitive: StackValue, primitiveType: Type, frameMap: FrameMap) defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality[ClassConstructorDescriptorImpl]

'left' @ [193:72] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'right' @ [193:78] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'rightType' @ [193:85] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'frameMap' @ [193:96] ==> value-parameter frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'AssertionError' @ [194:35] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'opToken' @ [194:72] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.create[ValueParameterDescriptorImpl]

'JvmStatic' @ [197:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'opToken' @ [199:18] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'EQEQ' @ [199:38] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'opToken' @ [199:46] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'EXCLEQ' @ [199:66] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'isIntOrLongPrimitive' @ [200:25] ==> public open fun isIntOrLongPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'rightType' @ [200:46] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'isBoxedTypeOf' @ [201:25] ==> public open fun isBoxedTypeOf(@NotNull boxedType: Type, @NotNull unboxedType: Type): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'leftType' @ [201:39] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'rightType' @ [201:49] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.BoxedToPrimitiveEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'NumberLikeCompare' @ [210:5] ==> public constructor NumberLikeCompare(left: StackValue, right: StackValue, operandType: Type, opToken: IElementType) defined in org.jetbrains.kotlin.codegen.NumberLikeCompare[ClassConstructorDescriptorImpl]

'leftPrimitive' @ [210:23] ==> value-parameter leftPrimitive: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.<init>[ValueParameterDescriptorImpl]

'right' @ [210:38] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.<init>[ValueParameterDescriptorImpl]

'primitiveType' @ [210:45] ==> value-parameter primitiveType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.<init>[ValueParameterDescriptorImpl]

'EQEQ' @ [210:69] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'leftPrimitive' @ [211:35] ==> value-parameter leftPrimitive: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.<init>[ValueParameterDescriptorImpl]

'type' @ [211:49] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'right' @ [212:31] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.<init>[ValueParameterDescriptorImpl]

'type' @ [212:37] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'Label' @ [215:28] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'Label' @ [216:24] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'arg1' @ [218:9] ==> public final val arg1: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[PropertyDescriptorImpl]

'put' @ [218:14] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'primitiveType' @ [218:18] ==> protected final val primitiveType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[PropertyDescriptorImpl]

'v' @ [218:33] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'arg2' @ [219:9] ==> public final val arg2: StackValue? defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[PropertyDescriptorImpl]

'put' @ [219:16] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'rightType' @ [219:20] ==> protected final val rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[PropertyDescriptorImpl]

'v' @ [219:31] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'dup' @ [220:17] ==> public open fun dup(@NotNull v: InstructionAdapter, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [220:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'rightType' @ [220:24] ==> protected final val rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[PropertyDescriptorImpl]

'jumpIfCanCompareTopWithPrimitive' @ [221:9] ==> protected abstract fun jumpIfCanCompareTopWithPrimitive(v: InstructionAdapter, label: Label): Unit defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[SimpleFunctionDescriptorImpl]

'v' @ [221:42] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'notNullLabel' @ [221:45] ==> val notNullLabel: Label defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[LocalVariableDescriptor]

'pop' @ [223:17] ==> public open fun pop(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [223:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'rightType' @ [223:24] ==> protected final val rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[PropertyDescriptorImpl]

'pop' @ [224:17] ==> public open fun pop(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [224:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'primitiveType' @ [224:24] ==> protected final val primitiveType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[PropertyDescriptorImpl]

'if (jumpIfFalse) v.goTo(jumpLabel) else v.goTo(endLabel)' @ [225:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'jumpIfFalse' @ [225:13] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'v' @ [225:26] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'goTo' @ [225:28] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'jumpLabel' @ [225:33] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'v' @ [225:49] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'goTo' @ [225:51] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [225:56] ==> val endLabel: Label defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[LocalVariableDescriptor]

'v' @ [227:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'mark' @ [227:11] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'notNullLabel' @ [227:16] ==> val notNullLabel: Label defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[LocalVariableDescriptor]

'coerceRightToPrimitive' @ [228:9] ==> protected abstract fun coerceRightToPrimitive(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[SimpleFunctionDescriptorImpl]

'v' @ [228:32] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'v' @ [229:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'visitJumpInsn' @ [229:11] ==> public open fun visitJumpInsn(p0: Int, p1: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'patchOpcode' @ [229:25] ==> protected open fun patchOpcode(opcode: Int, v: InstructionAdapter): Int defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[SimpleFunctionDescriptorImpl]

'if (jumpIfFalse) opcode else negatedOperations[opcode]!!' @ [229:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'jumpIfFalse' @ [229:41] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'opcode' @ [229:54] ==> public final val opcode: Int defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[PropertyDescriptorImpl]

'negatedOperations' @ [229:66] ==> public final val negatedOperations: HashMap<Int, Int> /* = HashMap<Int, Int> */ defined in org.jetbrains.kotlin.codegen.BranchedValue.Companion[PropertyDescriptorImpl]

'opcode' @ [229:84] ==> public final val opcode: Int defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[PropertyDescriptorImpl]

'v' @ [229:95] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'jumpLabel' @ [229:99] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'v' @ [231:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[ValueParameterDescriptorImpl]

'mark' @ [231:11] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endLabel' @ [231:16] ==> val endLabel: Label defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality.condJump[LocalVariableDescriptor]

'PrimitiveToSomethingEquality' @ [243:5] ==> protected constructor PrimitiveToSomethingEquality(leftPrimitive: StackValue, right: StackValue, primitiveType: Type) defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[ClassConstructorDescriptorImpl]

'leftPrimitive' @ [243:34] ==> value-parameter leftPrimitive: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.<init>[ValueParameterDescriptorImpl]

'rightBoxed' @ [243:49] ==> value-parameter rightBoxed: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.<init>[ValueParameterDescriptorImpl]

'primitiveType' @ [243:61] ==> value-parameter primitiveType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.<init>[ValueParameterDescriptorImpl]

'rightBoxed' @ [244:29] ==> value-parameter rightBoxed: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.<init>[ValueParameterDescriptorImpl]

'type' @ [244:40] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'v' @ [247:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.jumpIfCanCompareTopWithPrimitive[ValueParameterDescriptorImpl]

'ifnonnull' @ [247:11] ==> public open fun ifnonnull(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'label' @ [247:21] ==> value-parameter label: Label defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.jumpIfCanCompareTopWithPrimitive[ValueParameterDescriptorImpl]

'coerce' @ [251:9] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'boxedType' @ [251:16] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality[PropertyDescriptorImpl]

'primitiveType' @ [251:27] ==> protected final val primitiveType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality[PropertyDescriptorImpl]

'v' @ [251:42] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.coerceRightToPrimitive[ValueParameterDescriptorImpl]

'JvmStatic' @ [255:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (!isApplicable(opToken, leftType, rightType))
                    throw IllegalArgumentException("Not applicable for $opToken, $leftType, $rightType")
                else when (opToken) {
                    KtTokens.EQEQ -> PrimitiveToBoxedEquality(left, right, leftType)
                    KtTokens.EXCLEQ -> Invert(PrimitiveToBoxedEquality(left, right, leftType))
                    else -> throw AssertionError("Unexpected opToken: $opToken")
                }' @ [257:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BranchedValue, elseBranch: BranchedValue): BranchedValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BranchedValue

'!' @ [257:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isApplicable' @ [257:22] ==> @JvmStatic public final fun isApplicable(opToken: IElementType, leftType: Type, rightType: Type): Boolean defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion[SimpleFunctionDescriptorImpl]

'opToken' @ [257:35] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [257:44] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'rightType' @ [257:54] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [258:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'opToken' @ [258:73] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [258:83] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'rightType' @ [258:94] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'when (opToken) {
                    KtTokens.EQEQ -> PrimitiveToBoxedEquality(left, right, leftType)
                    KtTokens.EXCLEQ -> Invert(PrimitiveToBoxedEquality(left, right, leftType))
                    else -> throw AssertionError("Unexpected opToken: $opToken")
                }' @ [259:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BranchedValue, entry1: BranchedValue, entry2: BranchedValue): BranchedValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BranchedValue

'opToken' @ [259:28] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'EQEQ' @ [260:30] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PrimitiveToBoxedEquality' @ [260:38] ==> private constructor PrimitiveToBoxedEquality(leftPrimitive: StackValue, rightBoxed: StackValue, primitiveType: Type) defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality[ClassConstructorDescriptorImpl]

'left' @ [260:63] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'right' @ [260:69] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [260:76] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'EXCLEQ' @ [261:30] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Invert' @ [261:40] ==> public constructor Invert(condition: BranchedValue) defined in org.jetbrains.kotlin.codegen.Invert[ClassConstructorDescriptorImpl]

'PrimitiveToBoxedEquality' @ [261:47] ==> private constructor PrimitiveToBoxedEquality(leftPrimitive: StackValue, rightBoxed: StackValue, primitiveType: Type) defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality[ClassConstructorDescriptorImpl]

'left' @ [261:72] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'right' @ [261:78] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [261:85] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'AssertionError' @ [262:35] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'opToken' @ [262:72] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.create[ValueParameterDescriptorImpl]

'JvmStatic' @ [265:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'opToken' @ [267:18] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'EQEQ' @ [267:38] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'opToken' @ [267:46] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'EXCLEQ' @ [267:66] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'isIntOrLongPrimitive' @ [268:25] ==> public open fun isIntOrLongPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'leftType' @ [268:46] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'isBoxedTypeOf' @ [269:25] ==> public open fun isBoxedTypeOf(@NotNull boxedType: Type, @NotNull unboxedType: Type): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'rightType' @ [269:39] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'leftType' @ [269:50] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToBoxedEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'PrimitiveToSomethingEquality' @ [278:5] ==> protected constructor PrimitiveToSomethingEquality(leftPrimitive: StackValue, right: StackValue, primitiveType: Type) defined in org.jetbrains.kotlin.codegen.PrimitiveToSomethingEquality[ClassConstructorDescriptorImpl]

'leftPrimitive' @ [278:34] ==> value-parameter leftPrimitive: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.<init>[ValueParameterDescriptorImpl]

'rightObject' @ [278:49] ==> value-parameter rightObject: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.<init>[ValueParameterDescriptorImpl]

'primitiveType' @ [278:62] ==> value-parameter primitiveType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.<init>[ValueParameterDescriptorImpl]

'boxType' @ [279:37] ==> @NotNull public open fun boxType(@NotNull type: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'primitiveType' @ [279:45] ==> value-parameter primitiveType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.<init>[ValueParameterDescriptorImpl]

'v' @ [282:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.jumpIfCanCompareTopWithPrimitive[ValueParameterDescriptorImpl]

'instanceOf' @ [282:11] ==> public open fun instanceOf(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'boxedType' @ [282:22] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality[PropertyDescriptorImpl]

'v' @ [283:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.jumpIfCanCompareTopWithPrimitive[ValueParameterDescriptorImpl]

'ifne' @ [283:11] ==> public open fun ifne(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'label' @ [283:16] ==> value-parameter label: Label defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.jumpIfCanCompareTopWithPrimitive[ValueParameterDescriptorImpl]

'coerce' @ [287:9] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'rightType' @ [287:16] ==> protected final val rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality[PropertyDescriptorImpl]

'boxedType' @ [287:27] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality[PropertyDescriptorImpl]

'v' @ [287:38] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.coerceRightToPrimitive[ValueParameterDescriptorImpl]

'coerce' @ [288:9] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'boxedType' @ [288:16] ==> private final val boxedType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality[PropertyDescriptorImpl]

'primitiveType' @ [288:27] ==> protected final val primitiveType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality[PropertyDescriptorImpl]

'v' @ [288:42] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.coerceRightToPrimitive[ValueParameterDescriptorImpl]

'JvmStatic' @ [292:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (!isApplicable(opToken, leftType, rightType))
                    throw IllegalArgumentException("Not applicable for $opToken, $leftType, $rightType")
                else when (opToken) {
                    KtTokens.EQEQ -> PrimitiveToObjectEquality(left, right, leftType)
                    KtTokens.EXCLEQ -> Invert(PrimitiveToObjectEquality(left, right, leftType))
                    else -> throw AssertionError("Unexpected opToken: $opToken")
                }' @ [294:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BranchedValue, elseBranch: BranchedValue): BranchedValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BranchedValue

'!' @ [294:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isApplicable' @ [294:22] ==> @JvmStatic public final fun isApplicable(opToken: IElementType, leftType: Type, rightType: Type): Boolean defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion[SimpleFunctionDescriptorImpl]

'opToken' @ [294:35] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [294:44] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'rightType' @ [294:54] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [295:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'opToken' @ [295:73] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [295:83] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'rightType' @ [295:94] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'when (opToken) {
                    KtTokens.EQEQ -> PrimitiveToObjectEquality(left, right, leftType)
                    KtTokens.EXCLEQ -> Invert(PrimitiveToObjectEquality(left, right, leftType))
                    else -> throw AssertionError("Unexpected opToken: $opToken")
                }' @ [296:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BranchedValue, entry1: BranchedValue, entry2: BranchedValue): BranchedValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BranchedValue

'opToken' @ [296:28] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'EQEQ' @ [297:30] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PrimitiveToObjectEquality' @ [297:38] ==> private constructor PrimitiveToObjectEquality(leftPrimitive: StackValue, rightObject: StackValue, primitiveType: Type) defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality[ClassConstructorDescriptorImpl]

'left' @ [297:64] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'right' @ [297:70] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [297:77] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'EXCLEQ' @ [298:30] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Invert' @ [298:40] ==> public constructor Invert(condition: BranchedValue) defined in org.jetbrains.kotlin.codegen.Invert[ClassConstructorDescriptorImpl]

'PrimitiveToObjectEquality' @ [298:47] ==> private constructor PrimitiveToObjectEquality(leftPrimitive: StackValue, rightObject: StackValue, primitiveType: Type) defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality[ClassConstructorDescriptorImpl]

'left' @ [298:73] ==> value-parameter left: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'right' @ [298:79] ==> value-parameter right: StackValue defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'leftType' @ [298:86] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'AssertionError' @ [299:35] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'opToken' @ [299:72] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.create[ValueParameterDescriptorImpl]

'JvmStatic' @ [302:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'opToken' @ [304:18] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'EQEQ' @ [304:38] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'opToken' @ [304:46] ==> value-parameter opToken: IElementType defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'EXCLEQ' @ [304:66] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'isIntOrLongPrimitive' @ [305:25] ==> public open fun isIntOrLongPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'leftType' @ [305:46] ==> value-parameter leftType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'rightType' @ [306:17] ==> value-parameter rightType: Type defined in org.jetbrains.kotlin.codegen.PrimitiveToObjectEquality.Companion.isApplicable[ValueParameterDescriptorImpl]

'sort' @ [306:27] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'OBJECT' @ [306:40] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

