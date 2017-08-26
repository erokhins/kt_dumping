'super' @ [30:90] ==> public constructor AbstractForInProgressionOrRangeLoopGenerator(codegen: ExpressionCodegen, forExpression: KtForExpression) defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInProgressionOrRangeLoopGenerator[ClassConstructorDescriptorImpl]

'codegen' @ [30:96] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'forExpression' @ [30:105] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'assert' @ [31:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'step' @ [31:16] ==> value-parameter step: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'step' @ [31:29] ==> value-parameter step: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'-' @ [31:37] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'+' @ [31:43] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'step' @ [31:81] ==> value-parameter step: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'this' @ [32:9] ==> <this> defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[LazyClassReceiverParameterDescriptor]

'step' @ [32:14] ==> private final val step: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'step' @ [32:21] ==> value-parameter step: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'this' @ [35:79] ==> public constructor AbstractForInRangeLoopGenerator(codegen: ExpressionCodegen, forExpression: KtForExpression, step: Int) defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[ClassConstructorDescriptorImpl]

'codegen' @ [35:84] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'forExpression' @ [35:93] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'super' @ [38:9] ==> <this> defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[LazyClassReceiverParameterDescriptor]

'beforeLoop' @ [38:15] ==> public open fun beforeLoop(): Unit defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInProgressionOrRangeLoopGenerator[SimpleFunctionDescriptorImpl]

'storeRangeStartAndEnd' @ [40:9] ==> protected abstract fun storeRangeStartAndEnd(): Unit defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[SimpleFunctionDescriptorImpl]

'loopParameter' @ [46:9] ==> protected final fun loopParameter(): StackValue defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[SimpleFunctionDescriptorImpl]

'put' @ [46:25] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'asmElementType' @ [46:29] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'v' @ [46:45] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'v' @ [47:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'load' @ [47:11] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endVar' @ [47:16] ==> protected final var endVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'asmElementType' @ [47:24] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'if (asmElementType.sort == Type.LONG) {
            v.lcmp()
            if (step > 0) {
                v.ifgt(loopExit)
            }
            else {
                v.iflt(loopExit)
            }
        }
        else {
            if (step > 0) {
                v.ificmpgt(loopExit)
            }
            else {
                v.ificmplt(loopExit)
            }
        }' @ [48:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'asmElementType' @ [48:13] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'sort' @ [48:28] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'LONG' @ [48:41] ==> public const final val LONG: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [49:13] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'lcmp' @ [49:15] ==> public open fun lcmp(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'if (step > 0) {
                v.ifgt(loopExit)
            }
            else {
                v.iflt(loopExit)
            }' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'step' @ [50:17] ==> private final val step: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'v' @ [51:17] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'ifgt' @ [51:19] ==> public open fun ifgt(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'loopExit' @ [51:24] ==> value-parameter loopExit: Label defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.checkEmptyLoop[ValueParameterDescriptorImpl]

'v' @ [54:17] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'iflt' @ [54:19] ==> public open fun iflt(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'loopExit' @ [54:24] ==> value-parameter loopExit: Label defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.checkEmptyLoop[ValueParameterDescriptorImpl]

'if (step > 0) {
                v.ificmpgt(loopExit)
            }
            else {
                v.ificmplt(loopExit)
            }' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'step' @ [58:17] ==> private final val step: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'v' @ [59:17] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'ificmpgt' @ [59:19] ==> public open fun ificmpgt(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'loopExit' @ [59:28] ==> value-parameter loopExit: Label defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.checkEmptyLoop[ValueParameterDescriptorImpl]

'v' @ [62:17] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'ificmplt' @ [62:19] ==> public open fun ificmplt(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'loopExit' @ [62:28] ==> value-parameter loopExit: Label defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.checkEmptyLoop[ValueParameterDescriptorImpl]

'checkPostCondition' @ [70:9] ==> protected final fun checkPostCondition(loopExit: Label): Unit defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[SimpleFunctionDescriptorImpl]

'loopExit' @ [70:28] ==> value-parameter loopExit: Label defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.checkPostConditionAndIncrement[ValueParameterDescriptorImpl]

'incrementLoopVariable' @ [72:9] ==> protected final fun incrementLoopVariable(): Unit defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[SimpleFunctionDescriptorImpl]

'if (loopParameterType === Type.INT_TYPE) {
            v.iinc(loopParameterVar, step)
        }
        else {
            val loopParameter = loopParameter()
            loopParameter.put(asmElementType, v)
            genIncrement(asmElementType, step, v)
            loopParameter.store(StackValue.onStack(asmElementType), v)
        }' @ [76:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'loopParameterType' @ [76:13] ==> protected final lateinit var loopParameterType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'INT_TYPE' @ [76:40] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [77:13] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'iinc' @ [77:15] ==> public open fun iinc(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'loopParameterVar' @ [77:20] ==> protected final var loopParameterVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'step' @ [77:38] ==> private final val step: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'loopParameter' @ [80:33] ==> protected final fun loopParameter(): StackValue defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[SimpleFunctionDescriptorImpl]

'loopParameter' @ [81:13] ==> val loopParameter: StackValue defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.incrementLoopVariable[LocalVariableDescriptor]

'put' @ [81:27] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'asmElementType' @ [81:31] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'v' @ [81:47] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'genIncrement' @ [82:13] ==> public open fun genIncrement(baseType: (Type..Type?), myDelta: Int, v: (InstructionAdapter..InstructionAdapter?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'asmElementType' @ [82:26] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'step' @ [82:42] ==> private final val step: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'v' @ [82:48] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'loopParameter' @ [83:13] ==> val loopParameter: StackValue defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator.incrementLoopVariable[LocalVariableDescriptor]

'store' @ [83:27] ==> public open fun store(@NotNull value: StackValue, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'onStack' @ [83:44] ==> @NotNull public open fun onStack(@NotNull type: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'asmElementType' @ [83:52] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

'v' @ [83:69] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeLoopGenerator[PropertyDescriptorImpl]

