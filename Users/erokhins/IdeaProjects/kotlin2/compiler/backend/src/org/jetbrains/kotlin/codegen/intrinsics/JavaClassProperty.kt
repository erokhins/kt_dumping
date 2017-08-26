'IntrinsicPropertyGetter' @ [32:28] ==> public constructor IntrinsicPropertyGetter() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicPropertyGetter[ClassConstructorDescriptorImpl]

'operation' @ [39:24] ==> public open fun operation(type: (Type..Type?), lambda: (((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?)..(((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?))?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'returnType' @ [39:34] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generate[ValueParameterDescriptorImpl]

'generateImpl' @ [40:34] ==> public final fun generateImpl(v: InstructionAdapter, receiver: StackValue): Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty[SimpleFunctionDescriptorImpl]

'it' @ [40:47] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generate.<anonymous>[ValueParameterDescriptorImpl]

'receiver' @ [40:51] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generate[ValueParameterDescriptorImpl]

'coerce' @ [41:28] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'actualType' @ [41:35] ==> val actualType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generate.<anonymous>[LocalVariableDescriptor]

'returnType' @ [41:47] ==> value-parameter returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generate[ValueParameterDescriptorImpl]

'it' @ [41:59] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generate.<anonymous>[ValueParameterDescriptorImpl]

'receiver' @ [45:20] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'type' @ [45:29] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'when {
            type == Type.VOID_TYPE -> {
                receiver.put(Type.VOID_TYPE, v)
                StackValue.unit().put(UNIT_TYPE, v)
                v.invokevirtual("java/lang/Object", "getClass", "()Ljava/lang/Class;", false)
            }
            isPrimitive(type) -> {
                if (!StackValue.couldSkipReceiverOnStaticCall(receiver)) {
                    receiver.put(type, v)
                    AsmUtil.pop(v, type)
                }
                v.getstatic(boxType(type).internalName, "TYPE", "Ljava/lang/Class;")
            }
            else -> {
                receiver.put(type, v)
                v.invokevirtual("java/lang/Object", "getClass", "()Ljava/lang/Class;", false)
            }
        }' @ [46:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'type' @ [47:13] ==> val type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[LocalVariableDescriptor]

'VOID_TYPE' @ [47:26] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'receiver' @ [48:17] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'put' @ [48:26] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'VOID_TYPE' @ [48:35] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [48:46] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'unit' @ [49:28] ==> public open fun unit(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'put' @ [49:35] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'UNIT_TYPE' @ [49:39] ==> public final val UNIT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'v' @ [49:50] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'v' @ [50:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'invokevirtual' @ [50:19] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'isPrimitive' @ [52:13] ==> public open fun isPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'type' @ [52:25] ==> val type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[LocalVariableDescriptor]

'!' @ [53:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'couldSkipReceiverOnStaticCall' @ [53:33] ==> public open fun couldSkipReceiverOnStaticCall(value: (StackValue..StackValue?)): Boolean defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'receiver' @ [53:63] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'receiver' @ [54:21] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'put' @ [54:30] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [54:34] ==> val type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[LocalVariableDescriptor]

'v' @ [54:40] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'pop' @ [55:29] ==> public open fun pop(@NotNull v: MethodVisitor, @NotNull type: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [55:33] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'type' @ [55:36] ==> val type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[LocalVariableDescriptor]

'v' @ [57:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'getstatic' @ [57:19] ==> public open fun getstatic(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'boxType' @ [57:29] ==> @NotNull public open fun boxType(@NotNull type: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'type' @ [57:37] ==> val type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[LocalVariableDescriptor]

'internalName' @ [57:43] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'receiver' @ [60:17] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'put' @ [60:26] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [60:30] ==> val type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[LocalVariableDescriptor]

'v' @ [60:36] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'v' @ [61:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.generateImpl[ValueParameterDescriptorImpl]

'invokevirtual' @ [61:19] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'getType' @ [65:16] ==> @NotNull public open fun getType(@NotNull p0: Class<*>): Type defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaMethodDescriptor]

'Class' @ [65:24] ==> private constructor Class<T : (Any..Any?)>(p0: (ClassLoader..ClassLoader?)) defined in java.lang.Class[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@42c068df

'java' @ [65:37] ==> public val <T> KClass<Class<*>>.java: Class<Class<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Class<*>

'codegen' @ [69:25] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.toCallable[ValueParameterDescriptorImpl]

'state' @ [69:33] ==> public final val ExpressionCodegen.state: GenerationState[MyPropertyDescriptor]

'typeMapper' @ [69:39] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'mapType' @ [69:50] ==> @NotNull public open fun mapType(@NotNull jetType: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'resolvedCall' @ [69:58] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.toCallable[ValueParameterDescriptorImpl]

'call' @ [69:71] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'dispatchReceiver' @ [69:76] ==> public final val Call.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]

'type' @ [69:95] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'IntrinsicCallable' @ [70:25] ==> public constructor IntrinsicCallable(returnType: Type, valueParameterTypes: List<Type>, dispatchReceiverType: Type?, extensionReceiverType: Type?, invoke: IntrinsicCallable.(v: InstructionAdapter) -> Unit = ...) defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicCallable[ClassConstructorDescriptorImpl]

'getType' @ [70:43] ==> @NotNull public open fun getType(@NotNull p0: Class<*>): Type defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaMethodDescriptor]

'Class' @ [70:51] ==> private constructor Class<T : (Any..Any?)>(p0: (ClassLoader..ClassLoader?)) defined in java.lang.Class[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@7938955f

'java' @ [70:64] ==> public val <T> KClass<Class<*>>.java: Class<Class<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Class<*>

'listOf' @ [70:71] ==> @InlineOnly public inline fun <T> listOf(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'classType' @ [70:81] ==> val classType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.toCallable[LocalVariableDescriptor]

'generateImpl' @ [72:17] ==> public final fun generateImpl(v: InstructionAdapter, receiver: StackValue): Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty[SimpleFunctionDescriptorImpl]

'v' @ [72:30] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.toCallable.<no name provided>.invokeIntrinsic[ValueParameterDescriptorImpl]

'none' @ [72:44] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'isPrimitive' @ [75:43] ==> public open fun isPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'classType' @ [75:55] ==> val classType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.JavaClassProperty.toCallable[LocalVariableDescriptor]

