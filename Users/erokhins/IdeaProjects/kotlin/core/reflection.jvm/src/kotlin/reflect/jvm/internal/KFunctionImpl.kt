'NO_RECEIVER' @ [39:61] ==> @SinceKotlin public final val NO_RECEIVER: (Any..Any?) defined in kotlin.jvm.internal.CallableReference[JavaPropertyDescriptor]

'KCallableImpl<Any?>' @ [40:5] ==> public constructor KCallableImpl<out R>() defined in kotlin.reflect.jvm.internal.KCallableImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> Any?

'this' @ [42:15] ==> private constructor KFunctionImpl(container: KDeclarationContainerImpl, name: String, signature: String, descriptorInitialValue: FunctionDescriptor?, boundReceiver: Any? = ...) defined in kotlin.reflect.jvm.internal.KFunctionImpl[ClassConstructorDescriptorImpl]

'container' @ [42:20] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'name' @ [42:31] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'signature' @ [42:37] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'boundReceiver' @ [42:54] ==> value-parameter boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [44:89] ==> private constructor KFunctionImpl(container: KDeclarationContainerImpl, name: String, signature: String, descriptorInitialValue: FunctionDescriptor?, boundReceiver: Any? = ...) defined in kotlin.reflect.jvm.internal.KFunctionImpl[ClassConstructorDescriptorImpl]

'container' @ [45:13] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [46:13] ==> value-parameter descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'name' @ [46:24] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [46:29] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'RuntimeTypeMapper' @ [47:13] ==> internal object RuntimeTypeMapper defined in kotlin.reflect.jvm.internal in file RuntimeTypeMapper.kt[FakeCallableDescriptorForObject]

'mapSignature' @ [47:31] ==> public final fun mapSignature(possiblySubstitutedFunction: FunctionDescriptor): JvmFunctionSignature defined in kotlin.reflect.jvm.internal.RuntimeTypeMapper[SimpleFunctionDescriptorImpl]

'descriptor' @ [47:44] ==> value-parameter descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'asString' @ [47:56] ==> public abstract fun asString(): String defined in kotlin.reflect.jvm.internal.JvmFunctionSignature[SimpleFunctionDescriptorImpl]

'descriptor' @ [48:13] ==> value-parameter descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'boundReceiver' @ [51:43] ==> private final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'NO_RECEIVER' @ [51:78] ==> @SinceKotlin public final val NO_RECEIVER: (Any..Any?) defined in kotlin.jvm.internal.CallableReference[JavaPropertyDescriptor]

'getValue' @ [53:52] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (FunctionDescriptor..FunctionDescriptor?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [53:70] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@Nullable initialValue: FunctionDescriptor?, @NotNull initializer: () -> (FunctionDescriptor..FunctionDescriptor?)): ReflectProperties.LazySoftVal<(FunctionDescriptor..FunctionDescriptor?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FunctionDescriptor

'descriptorInitialValue' @ [53:79] ==> value-parameter descriptorInitialValue: FunctionDescriptor? defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'container' @ [54:9] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'findFunctionDescriptor' @ [54:19] ==> public final fun findFunctionDescriptor(name: String, signature: String): FunctionDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'name' @ [54:42] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KFunctionImpl.<init>[ValueParameterDescriptorImpl]

'signature' @ [54:48] ==> private final val signature: String defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'descriptor' @ [57:39] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'name' @ [57:50] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [57:55] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'getValue' @ [59:47] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>..FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [59:65] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>..FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>?)): ReflectProperties.LazySoftVal<(FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>..FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>

'RuntimeTypeMapper' @ [60:28] ==> internal object RuntimeTypeMapper defined in kotlin.reflect.jvm.internal in file RuntimeTypeMapper.kt[FakeCallableDescriptorForObject]

'mapSignature' @ [60:46] ==> public final fun mapSignature(possiblySubstitutedFunction: FunctionDescriptor): JvmFunctionSignature defined in kotlin.reflect.jvm.internal.RuntimeTypeMapper[SimpleFunctionDescriptorImpl]

'descriptor' @ [60:59] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'when (jvmSignature) {
            is KotlinConstructor -> {
                if (isAnnotationConstructor)
                    return@caller AnnotationConstructorCaller(container.jClass, parameters.map { it.name!! }, POSITIONAL_CALL, KOTLIN)
                container.findConstructorBySignature(jvmSignature.constructorDesc, descriptor.isPublicInBytecode)
            }
            is KotlinFunction ->
                container.findMethodBySignature(jvmSignature.methodName, jvmSignature.methodDesc, descriptor.isPublicInBytecode)
            is JavaMethod -> jvmSignature.method
            is JavaConstructor -> jvmSignature.constructor
            is FakeJavaAnnotationConstructor -> {
                val methods = jvmSignature.methods
                return@caller AnnotationConstructorCaller(container.jClass, methods.map { it.name }, POSITIONAL_CALL, JAVA, methods)
            }
            is BuiltInFunction -> jvmSignature.getMember(container)
        }' @ [61:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Member?, entry1: Member?, entry2: Member?, entry3: Member?, entry4: Member?, entry5: Member?): Member?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Member?

'jvmSignature' @ [61:37] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'isAnnotationConstructor' @ [63:21] ==> protected final val isAnnotationConstructor: Boolean defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'AnnotationConstructorCaller' @ [64:35] ==> public constructor AnnotationConstructorCaller(jClass: Class<*>, parameterNames: List<String>, callMode: AnnotationConstructorCaller.CallMode, origin: AnnotationConstructorCaller.Origin, methods: List<Method> = ...) defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller[ClassConstructorDescriptorImpl]

'container' @ [64:63] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'jClass' @ [64:73] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'parameters' @ [64:81] ==> public open val parameters: List<KParameter> defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'map' @ [64:92] ==> public inline fun <T, R> Iterable<KParameter>.map(transform: (KParameter) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter
    <R> -> String

'it' @ [64:98] ==> value-parameter it: KParameter defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [64:101] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'POSITIONAL_CALL' @ [64:111] ==> enum entry POSITIONAL_CALL defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller.CallMode[FakeCallableDescriptorForObject]

'KOTLIN' @ [64:128] ==> enum entry KOTLIN defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller.Origin[FakeCallableDescriptorForObject]

'container' @ [65:17] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'findConstructorBySignature' @ [65:27] ==> public final fun findConstructorBySignature(desc: String, isPublic: Boolean): Constructor<*>? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'jvmSignature' @ [65:54] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'constructorDesc' @ [65:67] ==> public final val constructorDesc: String defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor[PropertyDescriptorImpl]

'descriptor' @ [65:84] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'isPublicInBytecode' @ [65:95] ==> internal val CallableMemberDescriptor.isPublicInBytecode: Boolean defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'container' @ [68:17] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'findMethodBySignature' @ [68:27] ==> public final fun findMethodBySignature(name: String, desc: String, isPublic: Boolean): Method? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'jvmSignature' @ [68:49] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'methodName' @ [68:62] ==> public final val methodName: String defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction[PropertyDescriptorImpl]

'jvmSignature' @ [68:74] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'methodDesc' @ [68:87] ==> public final val methodDesc: String defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction[PropertyDescriptorImpl]

'descriptor' @ [68:99] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'isPublicInBytecode' @ [68:110] ==> internal val CallableMemberDescriptor.isPublicInBytecode: Boolean defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'jvmSignature' @ [69:30] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'method' @ [69:43] ==> public final val method: Method defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaMethod[PropertyDescriptorImpl]

'jvmSignature' @ [70:35] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'constructor' @ [70:48] ==> public final val constructor: Constructor<*> defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor[PropertyDescriptorImpl]

'jvmSignature' @ [72:31] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'methods' @ [72:44] ==> public final val methods: List<(Method..Method?)> defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor[PropertyDescriptorImpl]

'AnnotationConstructorCaller' @ [73:31] ==> public constructor AnnotationConstructorCaller(jClass: Class<*>, parameterNames: List<String>, callMode: AnnotationConstructorCaller.CallMode, origin: AnnotationConstructorCaller.Origin, methods: List<Method> = ...) defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller[ClassConstructorDescriptorImpl]

'container' @ [73:59] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'jClass' @ [73:69] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'methods' @ [73:77] ==> val methods: List<(Method..Method?)> defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'map' @ [73:85] ==> public inline fun <T, R> Iterable<(Method..Method?)>.map(transform: ((Method..Method?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [73:91] ==> value-parameter it: (Method..Method?) defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [73:94] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'POSITIONAL_CALL' @ [73:102] ==> enum entry POSITIONAL_CALL defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller.CallMode[FakeCallableDescriptorForObject]

'JAVA' @ [73:119] ==> enum entry JAVA defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller.Origin[FakeCallableDescriptorForObject]

'methods' @ [73:125] ==> val methods: List<(Method..Method?)> defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'jvmSignature' @ [75:35] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'getMember' @ [75:48] ==> public open fun getMember(container: KDeclarationContainerImpl): Member? defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.BuiltInFunction[SimpleFunctionDescriptorImpl]

'container' @ [75:58] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'when (member) {
            is Constructor<*> ->
                createConstructorCaller(member)
            is Method -> when {
                !Modifier.isStatic(member.modifiers) ->
                    createInstanceMethodCaller(member)
                descriptor.annotations.findAnnotation(JVM_STATIC) != null ->
                    createJvmStaticInObjectCaller(member)
                else ->
                    createStaticMethodCaller(member)
            }
            else -> throw KotlinReflectionInternalError("Call is not yet supported for this function: $descriptor (member = $member)")
        }' @ [78:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>, entry1: FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>, entry2: FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>): FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>

'member' @ [78:15] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'createConstructorCaller' @ [80:17] ==> private final fun createConstructorCaller(member: Constructor<*>): FunctionCaller<Constructor<*>> defined in kotlin.reflect.jvm.internal.KFunctionImpl[SimpleFunctionDescriptorImpl]

'member' @ [80:41] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'when {
                !Modifier.isStatic(member.modifiers) ->
                    createInstanceMethodCaller(member)
                descriptor.annotations.findAnnotation(JVM_STATIC) != null ->
                    createJvmStaticInObjectCaller(member)
                else ->
                    createStaticMethodCaller(member)
            }' @ [81:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionCaller.Method, entry1: FunctionCaller.Method, entry2: FunctionCaller.Method): FunctionCaller.Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Method

'!' @ [82:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStatic' @ [82:27] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'member' @ [82:36] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'modifiers' @ [82:43] ==> public final val Method.modifiers: Int[MyPropertyDescriptor]

'createInstanceMethodCaller' @ [83:21] ==> private final fun createInstanceMethodCaller(member: Method): FunctionCaller.Method defined in kotlin.reflect.jvm.internal.KFunctionImpl[SimpleFunctionDescriptorImpl]

'member' @ [83:48] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [84:17] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'annotations' @ [84:28] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[PropertyDescriptorImpl]

'findAnnotation' @ [84:40] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'JVM_STATIC' @ [84:55] ==> internal val JVM_STATIC: FqName defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'createJvmStaticInObjectCaller' @ [85:21] ==> private final fun createJvmStaticInObjectCaller(member: Method): FunctionCaller.Method defined in kotlin.reflect.jvm.internal.KFunctionImpl[SimpleFunctionDescriptorImpl]

'member' @ [85:51] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'createStaticMethodCaller' @ [87:21] ==> private final fun createStaticMethodCaller(member: Method): FunctionCaller.Method defined in kotlin.reflect.jvm.internal.KFunctionImpl[SimpleFunctionDescriptorImpl]

'member' @ [87:46] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'KotlinReflectionInternalError' @ [89:27] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'descriptor' @ [89:104] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'member' @ [89:126] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.caller.<anonymous>[LocalVariableDescriptor]

'getValue' @ [93:55] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>..FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [93:73] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>..FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>?)): ReflectProperties.LazySoftVal<(FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>..FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FunctionCaller<{AccessibleObject & Member & GenericDeclaration}?>

'RuntimeTypeMapper' @ [94:28] ==> internal object RuntimeTypeMapper defined in kotlin.reflect.jvm.internal in file RuntimeTypeMapper.kt[FakeCallableDescriptorForObject]

'mapSignature' @ [94:46] ==> public final fun mapSignature(possiblySubstitutedFunction: FunctionDescriptor): JvmFunctionSignature defined in kotlin.reflect.jvm.internal.RuntimeTypeMapper[SimpleFunctionDescriptorImpl]

'descriptor' @ [94:59] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'when (jvmSignature) {
            is KotlinFunction -> {
                container.findDefaultMethod(jvmSignature.methodName, jvmSignature.methodDesc,
                                            !Modifier.isStatic(caller.member!!.modifiers), descriptor.isPublicInBytecode)
            }
            is KotlinConstructor -> {
                if (isAnnotationConstructor)
                    return@defaultCaller AnnotationConstructorCaller(container.jClass, parameters.map { it.name!! }, CALL_BY_NAME, KOTLIN)
                container.findDefaultConstructor(jvmSignature.constructorDesc, descriptor.isPublicInBytecode)
            }
            is FakeJavaAnnotationConstructor -> {
                val methods = jvmSignature.methods
                return@defaultCaller AnnotationConstructorCaller(container.jClass, methods.map { it.name }, CALL_BY_NAME, JAVA, methods)
            }
            else -> {
                // Java methods, Java constructors and built-ins don't have $default methods
                null
            }
        }' @ [95:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Member?, entry1: Member?, entry2: Member?, entry3: Member?): Member?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Member?

'jvmSignature' @ [95:37] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'container' @ [97:17] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'findDefaultMethod' @ [97:27] ==> public final fun findDefaultMethod(name: String, desc: String, isMember: Boolean, isPublic: Boolean): Method? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'jvmSignature' @ [97:45] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'methodName' @ [97:58] ==> public final val methodName: String defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction[PropertyDescriptorImpl]

'jvmSignature' @ [97:70] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'methodDesc' @ [97:83] ==> public final val methodDesc: String defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction[PropertyDescriptorImpl]

'!' @ [98:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStatic' @ [98:55] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'caller' @ [98:64] ==> public open val caller: FunctionCaller<*> defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'member' @ [98:71] ==> internal final val member: Member? defined in kotlin.reflect.jvm.internal.FunctionCaller[PropertyDescriptorImpl]

'modifiers' @ [98:80] ==> public final val Member.modifiers: Int[MyPropertyDescriptor]

'descriptor' @ [98:92] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'isPublicInBytecode' @ [98:103] ==> internal val CallableMemberDescriptor.isPublicInBytecode: Boolean defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'isAnnotationConstructor' @ [101:21] ==> protected final val isAnnotationConstructor: Boolean defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'AnnotationConstructorCaller' @ [102:42] ==> public constructor AnnotationConstructorCaller(jClass: Class<*>, parameterNames: List<String>, callMode: AnnotationConstructorCaller.CallMode, origin: AnnotationConstructorCaller.Origin, methods: List<Method> = ...) defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller[ClassConstructorDescriptorImpl]

'container' @ [102:70] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'jClass' @ [102:80] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'parameters' @ [102:88] ==> public open val parameters: List<KParameter> defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'map' @ [102:99] ==> public inline fun <T, R> Iterable<KParameter>.map(transform: (KParameter) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter
    <R> -> String

'it' @ [102:105] ==> value-parameter it: KParameter defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [102:108] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'CALL_BY_NAME' @ [102:118] ==> enum entry CALL_BY_NAME defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller.CallMode[FakeCallableDescriptorForObject]

'KOTLIN' @ [102:132] ==> enum entry KOTLIN defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller.Origin[FakeCallableDescriptorForObject]

'container' @ [103:17] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'findDefaultConstructor' @ [103:27] ==> public final fun findDefaultConstructor(desc: String, isPublic: Boolean): Constructor<*>? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'jvmSignature' @ [103:50] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'constructorDesc' @ [103:63] ==> public final val constructorDesc: String defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor[PropertyDescriptorImpl]

'descriptor' @ [103:80] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'isPublicInBytecode' @ [103:91] ==> internal val CallableMemberDescriptor.isPublicInBytecode: Boolean defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'jvmSignature' @ [106:31] ==> val jvmSignature: JvmFunctionSignature defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'methods' @ [106:44] ==> public final val methods: List<(Method..Method?)> defined in kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor[PropertyDescriptorImpl]

'AnnotationConstructorCaller' @ [107:38] ==> public constructor AnnotationConstructorCaller(jClass: Class<*>, parameterNames: List<String>, callMode: AnnotationConstructorCaller.CallMode, origin: AnnotationConstructorCaller.Origin, methods: List<Method> = ...) defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller[ClassConstructorDescriptorImpl]

'container' @ [107:66] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'jClass' @ [107:76] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'methods' @ [107:84] ==> val methods: List<(Method..Method?)> defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'map' @ [107:92] ==> public inline fun <T, R> Iterable<(Method..Method?)>.map(transform: ((Method..Method?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [107:98] ==> value-parameter it: (Method..Method?) defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [107:101] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'CALL_BY_NAME' @ [107:109] ==> enum entry CALL_BY_NAME defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller.CallMode[FakeCallableDescriptorForObject]

'JAVA' @ [107:123] ==> enum entry JAVA defined in kotlin.reflect.jvm.internal.AnnotationConstructorCaller.Origin[FakeCallableDescriptorForObject]

'methods' @ [107:129] ==> val methods: List<(Method..Method?)> defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'when (member) {
            is Constructor<*> ->
                createConstructorCaller(member)
            is Method -> when {
                // Note that static $default methods for @JvmStatic functions are generated differently in objects and companion objects.
                // In objects, $default's signature does _not_ contain the additional object instance parameter,
                // as opposed to companion objects where the first parameter is the companion object instance.
                descriptor.annotations.findAnnotation(JVM_STATIC) != null &&
                !(descriptor.containingDeclaration as ClassDescriptor).isCompanionObject ->
                    createJvmStaticInObjectCaller(member)

                else ->
                    createStaticMethodCaller(member)
            }
            else -> null
        }' @ [115:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>?, entry1: FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>?, entry2: FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>?): FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionCaller<{AccessibleObject & Member & GenericDeclaration}>?

'member' @ [115:15] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'createConstructorCaller' @ [117:17] ==> private final fun createConstructorCaller(member: Constructor<*>): FunctionCaller<Constructor<*>> defined in kotlin.reflect.jvm.internal.KFunctionImpl[SimpleFunctionDescriptorImpl]

'member' @ [117:41] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'when {
                // Note that static $default methods for @JvmStatic functions are generated differently in objects and companion objects.
                // In objects, $default's signature does _not_ contain the additional object instance parameter,
                // as opposed to companion objects where the first parameter is the companion object instance.
                descriptor.annotations.findAnnotation(JVM_STATIC) != null &&
                !(descriptor.containingDeclaration as ClassDescriptor).isCompanionObject ->
                    createJvmStaticInObjectCaller(member)

                else ->
                    createStaticMethodCaller(member)
            }' @ [118:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionCaller.Method, entry1: FunctionCaller.Method): FunctionCaller.Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Method

'descriptor' @ [122:17] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'annotations' @ [122:28] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[PropertyDescriptorImpl]

'findAnnotation' @ [122:40] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'JVM_STATIC' @ [122:55] ==> internal val JVM_STATIC: FqName defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'!' @ [123:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [123:19] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'containingDeclaration' @ [123:30] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isCompanionObject' @ [123:72] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'createJvmStaticInObjectCaller' @ [124:21] ==> private final fun createJvmStaticInObjectCaller(member: Method): FunctionCaller.Method defined in kotlin.reflect.jvm.internal.KFunctionImpl[SimpleFunctionDescriptorImpl]

'member' @ [124:51] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'createStaticMethodCaller' @ [127:21] ==> private final fun createStaticMethodCaller(member: Method): FunctionCaller.Method defined in kotlin.reflect.jvm.internal.KFunctionImpl[SimpleFunctionDescriptorImpl]

'member' @ [127:46] ==> val member: Member? defined in kotlin.reflect.jvm.internal.KFunctionImpl.defaultCaller.<anonymous>[LocalVariableDescriptor]

'if (isBound) FunctionCaller.BoundStaticMethod(member, boundReceiver) else FunctionCaller.StaticMethod(member)' @ [134:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.Method, elseBranch: FunctionCaller.Method): FunctionCaller.Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method

'isBound' @ [134:17] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [134:26] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundStaticMethod' @ [134:41] ==> public constructor BoundStaticMethod(method: Method, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundStaticMethod[ClassConstructorDescriptorImpl]

'member' @ [134:59] ==> value-parameter member: Method defined in kotlin.reflect.jvm.internal.KFunctionImpl.createStaticMethodCaller[ValueParameterDescriptorImpl]

'boundReceiver' @ [134:67] ==> private final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [134:87] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'StaticMethod' @ [134:102] ==> public constructor StaticMethod(method: Method) defined in kotlin.reflect.jvm.internal.FunctionCaller.StaticMethod[ClassConstructorDescriptorImpl]

'member' @ [134:115] ==> value-parameter member: Method defined in kotlin.reflect.jvm.internal.KFunctionImpl.createStaticMethodCaller[ValueParameterDescriptorImpl]

'if (isBound) FunctionCaller.BoundJvmStaticInObject(member) else FunctionCaller.JvmStaticInObject(member)' @ [137:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.Method, elseBranch: FunctionCaller.Method): FunctionCaller.Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method

'isBound' @ [137:17] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [137:26] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundJvmStaticInObject' @ [137:41] ==> public constructor BoundJvmStaticInObject(method: Method) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundJvmStaticInObject[ClassConstructorDescriptorImpl]

'member' @ [137:64] ==> value-parameter member: Method defined in kotlin.reflect.jvm.internal.KFunctionImpl.createJvmStaticInObjectCaller[ValueParameterDescriptorImpl]

'FunctionCaller' @ [137:77] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'JvmStaticInObject' @ [137:92] ==> public constructor JvmStaticInObject(method: Method) defined in kotlin.reflect.jvm.internal.FunctionCaller.JvmStaticInObject[ClassConstructorDescriptorImpl]

'member' @ [137:110] ==> value-parameter member: Method defined in kotlin.reflect.jvm.internal.KFunctionImpl.createJvmStaticInObjectCaller[ValueParameterDescriptorImpl]

'if (isBound) FunctionCaller.BoundInstanceMethod(member, boundReceiver) else FunctionCaller.InstanceMethod(member)' @ [140:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.Method, elseBranch: FunctionCaller.Method): FunctionCaller.Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method

'isBound' @ [140:17] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [140:26] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundInstanceMethod' @ [140:41] ==> public constructor BoundInstanceMethod(method: Method, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundInstanceMethod[ClassConstructorDescriptorImpl]

'member' @ [140:61] ==> value-parameter member: Method defined in kotlin.reflect.jvm.internal.KFunctionImpl.createInstanceMethodCaller[ValueParameterDescriptorImpl]

'boundReceiver' @ [140:69] ==> private final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [140:89] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'InstanceMethod' @ [140:104] ==> public constructor InstanceMethod(method: Method) defined in kotlin.reflect.jvm.internal.FunctionCaller.InstanceMethod[ClassConstructorDescriptorImpl]

'member' @ [140:119] ==> value-parameter member: Method defined in kotlin.reflect.jvm.internal.KFunctionImpl.createInstanceMethodCaller[ValueParameterDescriptorImpl]

'if (isBound) FunctionCaller.BoundConstructor(member, boundReceiver) else FunctionCaller.Constructor(member)' @ [143:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller<Constructor<*>>, elseBranch: FunctionCaller<Constructor<*>>): FunctionCaller<Constructor<*>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionCaller<Constructor<*>>

'isBound' @ [143:17] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [143:26] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundConstructor' @ [143:41] ==> public constructor BoundConstructor(constructor: Constructor<*>, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundConstructor[ClassConstructorDescriptorImpl]

'member' @ [143:58] ==> value-parameter member: Constructor<*> defined in kotlin.reflect.jvm.internal.KFunctionImpl.createConstructorCaller[ValueParameterDescriptorImpl]

'boundReceiver' @ [143:66] ==> private final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [143:86] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'Constructor' @ [143:101] ==> public constructor Constructor(constructor: Constructor<*>) defined in kotlin.reflect.jvm.internal.FunctionCaller.Constructor[ClassConstructorDescriptorImpl]

'member' @ [143:113] ==> value-parameter member: Constructor<*> defined in kotlin.reflect.jvm.internal.KFunctionImpl.createConstructorCaller[ValueParameterDescriptorImpl]

'caller' @ [145:31] ==> public open val caller: FunctionCaller<*> defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'arity' @ [145:38] ==> public final val arity: Int defined in kotlin.reflect.jvm.internal.FunctionCaller[PropertyDescriptorImpl]

'descriptor' @ [148:17] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'isInline' @ [148:28] ==> public final val FunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'descriptor' @ [151:17] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'isExternal' @ [151:28] ==> public final val FunctionDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'descriptor' @ [154:17] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'isOperator' @ [154:28] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'descriptor' @ [157:17] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'isInfix' @ [157:28] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'descriptor' @ [160:17] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'isSuspend' @ [160:28] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'other' @ [163:20] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KFunctionImpl.equals[ValueParameterDescriptorImpl]

'asKFunctionImpl' @ [163:26] ==> internal fun Any?.asKFunctionImpl(): KFunctionImpl? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'container' @ [164:16] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'that' @ [164:29] ==> val that: KFunctionImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl.equals[LocalVariableDescriptor]

'container' @ [164:34] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'name' @ [164:47] ==> public open val name: String defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'that' @ [164:55] ==> val that: KFunctionImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl.equals[LocalVariableDescriptor]

'name' @ [164:60] ==> public open val name: String defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'signature' @ [164:68] ==> private final val signature: String defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'that' @ [164:81] ==> val that: KFunctionImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl.equals[LocalVariableDescriptor]

'signature' @ [164:86] ==> private final val signature: String defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'boundReceiver' @ [164:99] ==> private final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'that' @ [164:116] ==> val that: KFunctionImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl.equals[LocalVariableDescriptor]

'boundReceiver' @ [164:121] ==> private final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'*' @ [168:13] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'container' @ [168:14] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'hashCode' @ [168:24] ==> public open fun hashCode(): Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedSimpleFunctionDescriptor]

'name' @ [168:42] ==> public open val name: String defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'hashCode' @ [168:47] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'signature' @ [168:66] ==> private final val signature: String defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

'hashCode' @ [168:76] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'ReflectionObjectRenderer' @ [171:13] ==> internal object ReflectionObjectRenderer defined in kotlin.reflect.jvm.internal in file ReflectionObjectRenderer.kt[FakeCallableDescriptorForObject]

'renderFunction' @ [171:38] ==> public final fun renderFunction(descriptor: FunctionDescriptor): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [171:53] ==> public open val descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KFunctionImpl[PropertyDescriptorImpl]

