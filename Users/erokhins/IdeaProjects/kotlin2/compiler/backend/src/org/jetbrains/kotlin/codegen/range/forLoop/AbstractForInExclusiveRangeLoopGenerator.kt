'AbstractForInRangeWithGivenBoundsLoopGenerator' @ [27:5] ==> public constructor AbstractForInRangeWithGivenBoundsLoopGenerator(codegen: ExpressionCodegen, forExpression: KtForExpression, step: Int = ...) defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInRangeWithGivenBoundsLoopGenerator[ClassConstructorDescriptorImpl]

'codegen' @ [27:52] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'forExpression' @ [27:61] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator.<init>[ValueParameterDescriptorImpl]

'loopParameter' @ [31:9] ==> protected final fun loopParameter(): StackValue defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[SimpleFunctionDescriptorImpl]

'put' @ [31:25] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'asmElementType' @ [31:29] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[PropertyDescriptorImpl]

'v' @ [31:45] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[PropertyDescriptorImpl]

'v' @ [32:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[PropertyDescriptorImpl]

'load' @ [32:11] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'endVar' @ [32:16] ==> protected final var endVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[PropertyDescriptorImpl]

'asmElementType' @ [32:24] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[PropertyDescriptorImpl]

'if (asmElementType.sort == Type.LONG) {
            v.lcmp()
            v.ifge(loopExit)
        }
        else {
            v.ificmpge(loopExit)
        }' @ [33:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'asmElementType' @ [33:13] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[PropertyDescriptorImpl]

'sort' @ [33:28] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'LONG' @ [33:41] ==> public const final val LONG: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [34:13] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[PropertyDescriptorImpl]

'lcmp' @ [34:15] ==> public open fun lcmp(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'v' @ [35:13] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[PropertyDescriptorImpl]

'ifge' @ [35:15] ==> public open fun ifge(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'loopExit' @ [35:20] ==> value-parameter loopExit: Label defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator.checkPreCondition[ValueParameterDescriptorImpl]

'v' @ [38:13] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[PropertyDescriptorImpl]

'ificmpge' @ [38:15] ==> public open fun ificmpge(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'loopExit' @ [38:24] ==> value-parameter loopExit: Label defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator.checkPreCondition[ValueParameterDescriptorImpl]

'incrementLoopVariable' @ [43:9] ==> protected final fun incrementLoopVariable(): Unit defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForInExclusiveRangeLoopGenerator[SimpleFunctionDescriptorImpl]

