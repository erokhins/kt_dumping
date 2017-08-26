'IntrinsicMethod' @ [33:16] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethod[JavaClassConstructorDescriptor]

'if (element is KtBinaryExpression && element.operationReference.getReferencedNameElementType() == KtTokens.PLUS) {
            // LHS + RHS
            genStringBuilderConstructor(v)
            codegen.invokeAppend(v, element.left)
            codegen.invokeAppend(v, element.right)
        }
        else {
            // Explicit plus call LHS?.plus(RHS) or LHS.plus(RHS)
            receiver.put(AsmTypes.JAVA_STRING_TYPE, v)
            genStringBuilderConstructor(v)
            v.swap()
            genInvokeAppendMethod(v, returnType)
            codegen.invokeAppend(v, arguments[0])
        }' @ [42:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [42:13] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'element' @ [42:46] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'operationReference' @ [42:54] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [42:73] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'PLUS' @ [42:116] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'genStringBuilderConstructor' @ [44:13] ==> public open fun genStringBuilderConstructor(v: (InstructionAdapter..InstructionAdapter?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [44:41] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'codegen' @ [45:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'invokeAppend' @ [45:21] ==> public open fun invokeAppend(v: (InstructionAdapter..InstructionAdapter?), expr: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'v' @ [45:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'element' @ [45:37] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'left' @ [45:45] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'codegen' @ [46:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'invokeAppend' @ [46:21] ==> public open fun invokeAppend(v: (InstructionAdapter..InstructionAdapter?), expr: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'v' @ [46:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'element' @ [46:37] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'right' @ [46:45] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'receiver' @ [50:13] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'put' @ [50:22] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'JAVA_STRING_TYPE' @ [50:35] ==> public final val JAVA_STRING_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [50:53] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'genStringBuilderConstructor' @ [51:13] ==> public open fun genStringBuilderConstructor(v: (InstructionAdapter..InstructionAdapter?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [51:41] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'v' @ [52:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'swap' @ [52:15] ==> public open fun swap(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'genInvokeAppendMethod' @ [53:13] ==> public open fun genInvokeAppendMethod(v: (InstructionAdapter..InstructionAdapter?), type: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [53:35] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'returnType' @ [53:38] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'codegen' @ [54:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'invokeAppend' @ [54:21] ==> public open fun invokeAppend(v: (InstructionAdapter..InstructionAdapter?), expr: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'v' @ [54:34] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'arguments' @ [54:37] ==> value-parameter arguments: List<KtExpression> defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'v' @ [57:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.generateImpl[ValueParameterDescriptorImpl]

'invokevirtual' @ [57:11] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'JAVA_STRING_TYPE' @ [58:16] ==> public final val JAVA_STRING_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'IntrinsicCallable' @ [62:22] ==> public constructor IntrinsicCallable(callable: CallableMethod, invoke: IntrinsicCallable.(v: InstructionAdapter) -> Unit = ...) defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicCallable[ClassConstructorDescriptorImpl]

'method' @ [62:40] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable[ValueParameterDescriptorImpl]

'resolvedCall' @ [68:25] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'call' @ [68:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [68:43] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'parent' @ [68:55] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'super' @ [71:32] ==> <this> defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>[LazyClassReceiverParameterDescriptor]

'invokeMethodWithArguments' @ [71:38] ==> public open fun invokeMethodWithArguments(resolvedCall: ResolvedCall<*>, receiver: StackValue, codegen: ExpressionCodegen): StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicCallable[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [71:64] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'receiver' @ [71:78] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'codegen' @ [71:88] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'operation' @ [73:39] ==> public open fun operation(type: (Type..Type?), lambda: (((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?)..(((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?))?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'returnType' @ [73:49] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>[PropertyDescriptorImpl]

'resolvedCall' @ [74:41] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'call' @ [74:54] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'valueArguments' @ [74:59] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'map' @ [74:74] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> KtExpression

'it' @ [74:80] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [74:83] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'generateImpl' @ [75:42] ==> public final fun generateImpl(codegen: ExpressionCodegen, v: InstructionAdapter, returnType: Type, element: PsiElement?, arguments: List<KtExpression>, receiver: StackValue): Type defined in org.jetbrains.kotlin.codegen.intrinsics.Concat[SimpleFunctionDescriptorImpl]

'codegen' @ [76:33] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'it' @ [76:42] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [76:46] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>[PropertyDescriptorImpl]

'resolvedCall' @ [77:33] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'call' @ [77:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [77:51] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'arguments' @ [78:33] ==> val arguments: List<KtExpression> defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>[LocalVariableDescriptor]

'receiver' @ [79:44] ==> public open fun receiver(resolvedCall: (ResolvedCall<*>..ResolvedCall<*>?), receiver: (StackValue..StackValue?), codegen: (ExpressionCodegen..ExpressionCodegen?), @Nullable callableMethod: Callable?): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'resolvedCall' @ [79:53] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'receiver' @ [79:67] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'codegen' @ [79:77] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'this' @ [79:86] ==> <this> defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>[LazyClassReceiverParameterDescriptor]

'coerce' @ [81:36] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'actualType' @ [81:43] ==> val actualType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>[LocalVariableDescriptor]

'returnType' @ [81:55] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>[PropertyDescriptorImpl]

'it' @ [81:67] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeMethodWithArguments.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [86:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.afterReceiverGeneration[ValueParameterDescriptorImpl]

'generateNewInstanceDupAndPlaceBeforeStackTop' @ [86:23] ==> public fun InstructionAdapter.generateNewInstanceDupAndPlaceBeforeStackTop(frameMap: FrameMap, topStackType: Type, newInstanceInternalName: String): Unit defined in org.jetbrains.kotlin.codegen in file codegenUtil.kt[SimpleFunctionDescriptorImpl]

'frameMap' @ [86:68] ==> value-parameter frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.afterReceiverGeneration[ValueParameterDescriptorImpl]

'JAVA_STRING_TYPE' @ [86:87] ==> public final val JAVA_STRING_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [87:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.afterReceiverGeneration[ValueParameterDescriptorImpl]

'invokespecial' @ [87:23] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'genInvokeAppendMethod' @ [95:29] ==> public open fun genInvokeAppendMethod(v: (InstructionAdapter..InstructionAdapter?), type: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [95:51] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeIntrinsic[ValueParameterDescriptorImpl]

'OBJECT_TYPE' @ [95:63] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [96:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Concat.toCallable.<no name provided>.invokeIntrinsic[ValueParameterDescriptorImpl]

'invokevirtual' @ [96:23] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

