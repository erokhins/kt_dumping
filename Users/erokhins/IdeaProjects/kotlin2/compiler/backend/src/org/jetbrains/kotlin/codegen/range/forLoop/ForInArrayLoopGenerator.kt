'AbstractForLoopGenerator' @ [31:7] ==> public constructor AbstractForLoopGenerator(codegen: ExpressionCodegen, forExpression: KtForExpression) defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForLoopGenerator[ClassConstructorDescriptorImpl]

'codegen' @ [31:32] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.<init>[ValueParameterDescriptorImpl]

'forExpression' @ [31:41] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [35:45] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'getType' @ [35:60] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'forExpression' @ [35:68] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.<init>[ValueParameterDescriptorImpl]

'loopRange' @ [35:82] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'super' @ [38:9] ==> <this> defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[LazyClassReceiverParameterDescriptor]

'beforeLoop' @ [38:15] ==> public open fun beforeLoop(): Unit defined in org.jetbrains.kotlin.codegen.range.forLoop.AbstractForLoopGenerator[SimpleFunctionDescriptorImpl]

'indexVar' @ [40:9] ==> private final var indexVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'createLoopTempVariable' @ [40:20] ==> protected final fun createLoopTempVariable(type: Type): Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[SimpleFunctionDescriptorImpl]

'INT_TYPE' @ [40:48] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'forExpression' @ [42:25] ==> public open val forExpression: KtForExpression defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'loopRange' @ [42:39] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'codegen' @ [43:21] ==> protected final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'gen' @ [43:29] ==> public open fun gen(expr: (KtElement..KtElement?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'loopRange' @ [43:33] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.beforeLoop[LocalVariableDescriptor]

'codegen' @ [44:32] ==> protected final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'asmType' @ [44:40] ==> @NotNull public open fun asmType(@NotNull type: KotlinType): Type defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'loopRangeType' @ [44:48] ==> private final val loopRangeType: KotlinType defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'if (value is StackValue.Local && value.type == asmLoopRangeType) {
            arrayVar = value.index // no need to copy local variable into another variable
        }
        else {
            arrayVar = createLoopTempVariable(OBJECT_TYPE)
            value.put(asmLoopRangeType, v)
            v.store(arrayVar, OBJECT_TYPE)
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [45:13] ==> val value: (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.beforeLoop[LocalVariableDescriptor]

'value' @ [45:42] ==> val value: (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.beforeLoop[LocalVariableDescriptor]

'type' @ [45:48] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'asmLoopRangeType' @ [45:56] ==> val asmLoopRangeType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.beforeLoop[LocalVariableDescriptor]

'arrayVar' @ [46:13] ==> private final var arrayVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'value' @ [46:24] ==> val value: (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.beforeLoop[LocalVariableDescriptor]

'index' @ [46:30] ==> public final val index: Int defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaPropertyDescriptor]

'arrayVar' @ [49:13] ==> private final var arrayVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'createLoopTempVariable' @ [49:24] ==> protected final fun createLoopTempVariable(type: Type): Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[SimpleFunctionDescriptorImpl]

'OBJECT_TYPE' @ [49:47] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'value' @ [50:13] ==> val value: (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.beforeLoop[LocalVariableDescriptor]

'put' @ [50:19] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'asmLoopRangeType' @ [50:23] ==> val asmLoopRangeType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.beforeLoop[LocalVariableDescriptor]

'v' @ [50:41] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'v' @ [51:13] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'store' @ [51:15] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'arrayVar' @ [51:21] ==> private final var arrayVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'OBJECT_TYPE' @ [51:31] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [54:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'iconst' @ [54:11] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'v' @ [55:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'store' @ [55:11] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'indexVar' @ [55:17] ==> private final var indexVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'INT_TYPE' @ [55:32] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [61:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'load' @ [61:11] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'indexVar' @ [61:16] ==> private final var indexVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'INT_TYPE' @ [61:31] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [62:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'load' @ [62:11] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'arrayVar' @ [62:16] ==> private final var arrayVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'OBJECT_TYPE' @ [62:26] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [63:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'arraylength' @ [63:11] ==> public open fun arraylength(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'v' @ [64:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'ificmpge' @ [64:11] ==> public open fun ificmpge(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'loopExit' @ [64:20] ==> value-parameter loopExit: Label defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.checkPreCondition[ValueParameterDescriptorImpl]

'if (KotlinBuiltIns.isArray(loopRangeType)) boxType(asmElementType) else asmElementType' @ [68:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'isArray' @ [68:51] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'loopRangeType' @ [68:59] ==> private final val loopRangeType: KotlinType defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'boxType' @ [68:75] ==> @NotNull public open fun boxType(@NotNull type: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'asmElementType' @ [68:83] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'asmElementType' @ [68:104] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'v' @ [70:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'load' @ [70:11] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'arrayVar' @ [70:16] ==> private final var arrayVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'OBJECT_TYPE' @ [70:26] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [71:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'load' @ [71:11] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'indexVar' @ [71:16] ==> private final var indexVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'INT_TYPE' @ [71:31] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [72:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'aload' @ [72:11] ==> public open fun aload(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'arrayElParamType' @ [72:17] ==> val arrayElParamType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.assignToLoopParameter[LocalVariableDescriptor]

'onStack' @ [73:20] ==> @NotNull public open fun onStack(@NotNull type: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'arrayElParamType' @ [73:28] ==> val arrayElParamType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator.assignToLoopParameter[LocalVariableDescriptor]

'put' @ [73:46] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'asmElementType' @ [73:50] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'codegen' @ [73:66] ==> protected final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'v' @ [73:74] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'v' @ [74:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'store' @ [74:11] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'loopParameterVar' @ [74:17] ==> protected final var loopParameterVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'asmElementType' @ [74:35] ==> protected final val asmElementType: Type defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'v' @ [78:9] ==> protected final val v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

'iinc' @ [78:11] ==> public open fun iinc(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'indexVar' @ [78:16] ==> private final var indexVar: Int defined in org.jetbrains.kotlin.codegen.range.forLoop.ForInArrayLoopGenerator[PropertyDescriptorImpl]

