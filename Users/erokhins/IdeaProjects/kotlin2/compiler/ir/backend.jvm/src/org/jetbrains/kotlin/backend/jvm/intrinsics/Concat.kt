'IntrinsicMethod' @ [39:16] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'if (element is KtBinaryExpression && element.operationReference.getReferencedNameElementType() == KtTokens.PLUS) {
            // LHS + RHS
            genStringBuilderConstructor(v)
            codegen.invokeAppend(v, element.left)
            codegen.invokeAppend(v, element.right)
        }
        else {
            // LHS?.plus(RHS)
            receiver.put(AsmTypes.OBJECT_TYPE, v)
            genStringBuilderConstructor(v)
            v.swap()
            genInvokeAppendMethod(v, returnType)
            codegen.invokeAppend(v, arguments.get(0))
        }' @ [48:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [48:13] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'element' @ [48:46] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'operationReference' @ [48:54] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [48:73] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'PLUS' @ [48:116] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'genStringBuilderConstructor' @ [50:13] ==> public open fun genStringBuilderConstructor(p0: (InstructionAdapter..InstructionAdapter?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [50:41] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'codegen' @ [51:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'invokeAppend' @ [51:21] ==> public open fun invokeAppend(p0: (InstructionAdapter..InstructionAdapter?), p1: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'v' @ [51:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'element' @ [51:37] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'left' @ [51:45] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'codegen' @ [52:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'invokeAppend' @ [52:21] ==> public open fun invokeAppend(p0: (InstructionAdapter..InstructionAdapter?), p1: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'v' @ [52:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'element' @ [52:37] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'right' @ [52:45] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'receiver' @ [56:13] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'put' @ [56:22] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'OBJECT_TYPE' @ [56:35] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [56:48] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'genStringBuilderConstructor' @ [57:13] ==> public open fun genStringBuilderConstructor(p0: (InstructionAdapter..InstructionAdapter?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [57:41] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'v' @ [58:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'swap' @ [58:15] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'genInvokeAppendMethod' @ [59:13] ==> public open fun genInvokeAppendMethod(p0: (InstructionAdapter..InstructionAdapter?), p1: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [59:35] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'returnType' @ [59:38] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'codegen' @ [60:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'invokeAppend' @ [60:21] ==> public open fun invokeAppend(p0: (InstructionAdapter..InstructionAdapter?), p1: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'v' @ [60:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'arguments' @ [60:37] ==> value-parameter arguments: List<KtExpression> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'get' @ [60:47] ==> public abstract operator fun get(index: Int): KtExpression defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'v' @ [63:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'invokevirtual' @ [63:11] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'JAVA_STRING_TYPE' @ [64:16] ==> public final val JAVA_STRING_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'expression' @ [68:25] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable[ValueParameterDescriptorImpl]

'receiverAndArgs' @ [68:36] ==> public fun IrMemberAccessExpression.receiverAndArgs(): List<IrExpression> defined in org.jetbrains.kotlin.backend.jvm.intrinsics[SimpleFunctionDescriptorImpl]

'asmTypes' @ [68:54] ==> public fun List<IrExpression>.asmTypes(context: JvmBackendContext): List<Type> defined in org.jetbrains.kotlin.backend.jvm.intrinsics[SimpleFunctionDescriptorImpl]

'context' @ [68:63] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable[ValueParameterDescriptorImpl]

'toMutableList' @ [68:72] ==> public fun <T> Collection<Type>.toMutableList(): MutableList<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'argsTypes' @ [69:9] ==> val argsTypes: MutableList<Type> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable[LocalVariableDescriptor]

'JAVA_STRING_TYPE' @ [69:33] ==> public final val JAVA_STRING_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'IrIntrinsicFunction' @ [71:25] ==> public constructor IrIntrinsicFunction(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ...) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[ClassConstructorDescriptorImpl]

'expression' @ [71:45] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable[ValueParameterDescriptorImpl]

'signature' @ [71:57] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable[ValueParameterDescriptorImpl]

'context' @ [71:68] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable[ValueParameterDescriptorImpl]

'argsTypes' @ [71:77] ==> val argsTypes: MutableList<Type> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable[LocalVariableDescriptor]

'genInvokeAppendMethod' @ [74:25] ==> public open fun genInvokeAppendMethod(p0: (InstructionAdapter..InstructionAdapter?), p1: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [74:47] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.genInvokeInstruction[ValueParameterDescriptorImpl]

'argsTypes' @ [74:50] ==> val argsTypes: MutableList<Type> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable[LocalVariableDescriptor]

'v' @ [75:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.genInvokeInstruction[ValueParameterDescriptorImpl]

'invokevirtual' @ [75:19] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'v' @ [79:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'visitTypeInsn' @ [79:19] ==> public open fun visitTypeInsn(p0: Int, p1: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'NEW' @ [79:41] ==> public const final val NEW: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'v' @ [80:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'dup' @ [80:19] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'super' @ [82:24] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>[LazyClassReceiverParameterDescriptor]

'invoke' @ [82:30] ==> public open fun invoke(v: InstructionAdapter, codegen: ExpressionCodegen, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[SimpleFunctionDescriptorImpl]

'v' @ [82:37] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'codegen' @ [82:40] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'data' @ [82:49] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'super' @ [87:17] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>[LazyClassReceiverParameterDescriptor]

'genArg' @ [87:23] ==> public open fun genArg(expression: IrExpression, codegen: ExpressionCodegen, index: Int, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[SimpleFunctionDescriptorImpl]

'expression' @ [87:30] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.genArg[ValueParameterDescriptorImpl]

'codegen' @ [87:42] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.genArg[ValueParameterDescriptorImpl]

'index' @ [87:51] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.genArg[ValueParameterDescriptorImpl]

'data' @ [87:58] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.genArg[ValueParameterDescriptorImpl]

'index' @ [88:21] ==> value-parameter index: Int defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.genArg[ValueParameterDescriptorImpl]

'codegen' @ [89:21] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.genArg[ValueParameterDescriptorImpl]

'mv' @ [89:29] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'invokespecial' @ [89:32] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'IntrinsicCallable' @ [96:22] ==> public constructor IntrinsicCallable(callable: CallableMethod, invoke: IntrinsicCallable.(v: InstructionAdapter) -> Unit = ...) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicCallable[ClassConstructorDescriptorImpl]

'method' @ [96:40] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable[ValueParameterDescriptorImpl]

'resolvedCall' @ [102:25] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'call' @ [102:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [102:43] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'parent' @ [102:55] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'super' @ [105:32] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>[LazyClassReceiverParameterDescriptor]

'invokeMethodWithArguments' @ [105:38] ==> public open fun invokeMethodWithArguments(resolvedCall: ResolvedCall<*>, receiver: StackValue, codegen: ExpressionCodegen): StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicCallable[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [105:64] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'receiver' @ [105:78] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'codegen' @ [105:88] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'operation' @ [107:39] ==> public open fun operation(p0: (Type..Type?), p1: (((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?)..(((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?))?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'returnType' @ [107:49] ==> public open val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>[PropertyDescriptorImpl]

'resolvedCall' @ [108:41] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'call' @ [108:54] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'valueArguments' @ [108:59] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'map' @ [108:74] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> KtExpression

'it' @ [108:80] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [108:83] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'generateImpl' @ [109:42] ==> public final fun generateImpl(codegen: ExpressionCodegen, v: InstructionAdapter, returnType: Type, element: PsiElement?, arguments: List<KtExpression>, receiver: StackValue): Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat[SimpleFunctionDescriptorImpl]

'codegen' @ [110:33] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'it' @ [110:42] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [110:46] ==> public open val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>[PropertyDescriptorImpl]

'resolvedCall' @ [111:33] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'call' @ [111:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [111:51] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'arguments' @ [112:33] ==> val arguments: List<KtExpression> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>[LocalVariableDescriptor]

'receiver' @ [113:44] ==> public open fun receiver(p0: (ResolvedCall<*>..ResolvedCall<*>?), p1: (StackValue..StackValue?), p2: (ExpressionCodegen..ExpressionCodegen?), @Nullable p3: Callable?): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'resolvedCall' @ [113:53] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'receiver' @ [113:67] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'codegen' @ [113:77] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'this' @ [113:86] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>[LazyClassReceiverParameterDescriptor]

'coerce' @ [115:36] ==> public open fun coerce(@NotNull p0: Type, @NotNull p1: Type, @NotNull p2: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'actualType' @ [115:43] ==> val actualType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>[LocalVariableDescriptor]

'returnType' @ [115:55] ==> public open val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>[PropertyDescriptorImpl]

'it' @ [115:67] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [120:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.afterReceiverGeneration[ValueParameterDescriptorImpl]

'generateNewInstanceDupAndPlaceBeforeStackTop' @ [120:23] ==> public fun InstructionAdapter.generateNewInstanceDupAndPlaceBeforeStackTop(frameMap: FrameMap, topStackType: Type, newInstanceInternalName: String): Unit defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'frameMap' @ [120:68] ==> value-parameter frameMap: FrameMap defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.afterReceiverGeneration[ValueParameterDescriptorImpl]

'JAVA_STRING_TYPE' @ [120:87] ==> public final val JAVA_STRING_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [121:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.afterReceiverGeneration[ValueParameterDescriptorImpl]

'invokespecial' @ [121:23] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'genInvokeAppendMethod' @ [129:29] ==> public open fun genInvokeAppendMethod(p0: (InstructionAdapter..InstructionAdapter?), p1: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [129:51] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeIntrinsic[ValueParameterDescriptorImpl]

'OBJECT_TYPE' @ [129:63] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [130:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Concat.toCallable.<no name provided>.invokeIntrinsic[ValueParameterDescriptorImpl]

'invokevirtual' @ [130:23] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

