'KCallableImpl<R>' @ [41:5] ==> public constructor KCallableImpl<out R>() defined in kotlin.reflect.jvm.internal.KCallableImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> R

'this' @ [42:111] ==> private constructor KPropertyImpl<out R>(container: KDeclarationContainerImpl, name: String, signature: String, descriptorInitialValue: PropertyDescriptor?, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.KPropertyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> R

'container' @ [43:13] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl.<init>[ValueParameterDescriptorImpl]

'name' @ [43:24] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KPropertyImpl.<init>[ValueParameterDescriptorImpl]

'signature' @ [43:30] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KPropertyImpl.<init>[ValueParameterDescriptorImpl]

'boundReceiver' @ [43:47] ==> value-parameter boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [46:89] ==> private constructor KPropertyImpl<out R>(container: KDeclarationContainerImpl, name: String, signature: String, descriptorInitialValue: PropertyDescriptor?, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.KPropertyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> R

'container' @ [47:13] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [48:13] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.<init>[ValueParameterDescriptorImpl]

'name' @ [48:24] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [48:29] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'RuntimeTypeMapper' @ [49:13] ==> internal object RuntimeTypeMapper defined in kotlin.reflect.jvm.internal in file RuntimeTypeMapper.kt[FakeCallableDescriptorForObject]

'mapPropertySignature' @ [49:31] ==> public final fun mapPropertySignature(possiblyOverriddenProperty: PropertyDescriptor): JvmPropertySignature defined in kotlin.reflect.jvm.internal.RuntimeTypeMapper[SimpleFunctionDescriptorImpl]

'descriptor' @ [49:52] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.<init>[ValueParameterDescriptorImpl]

'asString' @ [49:64] ==> public abstract fun asString(): String defined in kotlin.reflect.jvm.internal.JvmPropertySignature[SimpleFunctionDescriptorImpl]

'descriptor' @ [50:13] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.<init>[ValueParameterDescriptorImpl]

'NO_RECEIVER' @ [51:31] ==> @SinceKotlin public final val NO_RECEIVER: (Any..Any?) defined in kotlin.jvm.internal.CallableReference[JavaPropertyDescriptor]

'boundReceiver' @ [54:43] ==> public final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'NO_RECEIVER' @ [54:78] ==> @SinceKotlin public final val NO_RECEIVER: (Any..Any?) defined in kotlin.jvm.internal.CallableReference[JavaPropertyDescriptor]

'lazySoft' @ [56:48] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (Field..Field?)): ReflectProperties.LazySoftVal<(Field..Field?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Field

'RuntimeTypeMapper' @ [57:28] ==> internal object RuntimeTypeMapper defined in kotlin.reflect.jvm.internal in file RuntimeTypeMapper.kt[FakeCallableDescriptorForObject]

'mapPropertySignature' @ [57:46] ==> public final fun mapPropertySignature(possiblyOverriddenProperty: PropertyDescriptor): JvmPropertySignature defined in kotlin.reflect.jvm.internal.RuntimeTypeMapper[SimpleFunctionDescriptorImpl]

'descriptor' @ [57:67] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'when (jvmSignature) {
            is KotlinProperty -> {
                val descriptor = jvmSignature.descriptor
                JvmProtoBufUtil.getJvmFieldSignature(jvmSignature.proto, jvmSignature.nameResolver, jvmSignature.typeTable)?.let {
                    val owner = if (JvmAbi.isCompanionObjectWithBackingFieldsInOuter(descriptor.containingDeclaration)) {
                        container.jClass.enclosingClass
                    }
                    else descriptor.containingDeclaration.let { containingDeclaration ->
                        if (containingDeclaration is ClassDescriptor) containingDeclaration.toJavaClass()
                        else container.jClass
                    }

                    try {
                        owner?.getDeclaredField(it.name)
                    }
                    catch (e: NoSuchFieldException) {
                        null
                    }
                }
            }
            is JavaField -> jvmSignature.field
            is JavaMethodProperty -> null
        }' @ [58:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Field?, entry1: Field?, entry2: Field?): Field?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Field?

'jvmSignature' @ [58:15] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>[LocalVariableDescriptor]

'jvmSignature' @ [60:34] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [60:47] ==> public final val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty[PropertyDescriptorImpl]

'JvmProtoBufUtil' @ [61:17] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'getJvmFieldSignature' @ [61:33] ==> public final fun getJvmFieldSignature(proto: ProtoBuf.Property, nameResolver: NameResolver, typeTable: TypeTable): JvmProtoBufUtil.PropertySignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'jvmSignature' @ [61:54] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>[LocalVariableDescriptor]

'proto' @ [61:67] ==> public final val proto: ProtoBuf.Property defined in kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty[PropertyDescriptorImpl]

'jvmSignature' @ [61:74] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>[LocalVariableDescriptor]

'nameResolver' @ [61:87] ==> public final val nameResolver: NameResolver defined in kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty[PropertyDescriptorImpl]

'jvmSignature' @ [61:101] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>[LocalVariableDescriptor]

'typeTable' @ [61:114] ==> public final val typeTable: TypeTable defined in kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty[PropertyDescriptorImpl]

'let' @ [61:126] ==> @InlineOnly public inline fun <T, R> JvmProtoBufUtil.PropertySignature.let(block: (JvmProtoBufUtil.PropertySignature) -> Field?): Field? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySignature
    <R> -> Field?

'if (JvmAbi.isCompanionObjectWithBackingFieldsInOuter(descriptor.containingDeclaration)) {
                        container.jClass.enclosingClass
                    }
                    else descriptor.containingDeclaration.let { containingDeclaration ->
                        if (containingDeclaration is ClassDescriptor) containingDeclaration.toJavaClass()
                        else container.jClass
                    }' @ [62:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Class<out Any>?, elseBranch: Class<out Any>?): Class<out Any>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Class<out Any>?

'isCompanionObjectWithBackingFieldsInOuter' @ [62:44] ==> public open fun isCompanionObjectWithBackingFieldsInOuter(@NotNull companionObject: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'descriptor' @ [62:86] ==> val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [62:97] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'container' @ [63:25] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'jClass' @ [63:35] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'enclosingClass' @ [63:42] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.enclosingClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'descriptor' @ [65:26] ==> val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [65:37] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'let' @ [65:59] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Class<out Any>?): Class<out Any>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Class<out Any>?

'if (containingDeclaration is ClassDescriptor) containingDeclaration.toJavaClass()
                        else container.jClass' @ [66:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Class<out Any>?, elseBranch: Class<out Any>?): Class<out Any>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Class<out Any>?

'containingDeclaration' @ [66:29] ==> value-parameter containingDeclaration: DeclarationDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [66:71] ==> value-parameter containingDeclaration: DeclarationDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toJavaClass' @ [66:93] ==> internal fun ClassDescriptor.toJavaClass(): Class<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'container' @ [67:30] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'jClass' @ [67:40] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'owner' @ [71:25] ==> val owner: Class<out Any>? defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getDeclaredField' @ [71:32] ==> public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [71:49] ==> value-parameter it: JvmProtoBufUtil.PropertySignature defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [71:52] ==> public final val name: String defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.PropertySignature[PropertyDescriptorImpl]

'jvmSignature' @ [78:29] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.KPropertyImpl.javaField_.<anonymous>[LocalVariableDescriptor]

'field' @ [78:42] ==> public final val field: Field defined in kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField[PropertyDescriptorImpl]

'invoke' @ [83:35] ==> @Override public open fun invoke(): (Field..Field?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'if (@Suppress("DEPRECATION") descriptor.isDelegated) javaField else null' @ [86:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Field?, elseBranch: Field?): Field?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Field?

'Suppress' @ [86:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'descriptor' @ [86:42] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'isDelegated' @ [86:53] ==> @Deprecated public abstract val isDelegated: Boolean defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[PropertyDescriptorImpl]

'javaField' @ [86:66] ==> public final val javaField: Field? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'receiver' @ [90:21] ==> value-parameter receiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl.getDelegate[ValueParameterDescriptorImpl]

'EXTENSION_PROPERTY_DELEGATE' @ [90:34] ==> public final val EXTENSION_PROPERTY_DELEGATE: Any defined in kotlin.reflect.jvm.internal.KPropertyImpl.Companion[PropertyDescriptorImpl]

'descriptor' @ [91:25] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'extensionReceiverParameter' @ [91:36] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'RuntimeException' @ [92:31] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'+' @ [92:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [92:51] ==> <this> defined in kotlin.reflect.jvm.internal.KPropertyImpl[LazyClassReceiverParameterDescriptor]

'field' @ [96:17] ==> value-parameter field: Field? defined in kotlin.reflect.jvm.internal.KPropertyImpl.getDelegate[ValueParameterDescriptorImpl]

'get' @ [96:24] ==> public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'receiver' @ [96:28] ==> value-parameter receiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl.getDelegate[ValueParameterDescriptorImpl]

'IllegalPropertyDelegateAccessException' @ [99:23] ==> public constructor IllegalPropertyDelegateAccessException(cause: IllegalAccessException) defined in kotlin.reflect.full.IllegalPropertyDelegateAccessException[ClassConstructorDescriptorImpl]

'e' @ [99:62] ==> val e: IllegalAccessException defined in kotlin.reflect.jvm.internal.KPropertyImpl.getDelegate[LocalVariableDescriptor]

'lazySoft' @ [104:49] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@Nullable initialValue: PropertyDescriptor?, @NotNull initializer: () -> (PropertyDescriptor..PropertyDescriptor?)): ReflectProperties.LazySoftVal<(PropertyDescriptor..PropertyDescriptor?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PropertyDescriptor

'descriptorInitialValue' @ [104:58] ==> value-parameter descriptorInitialValue: PropertyDescriptor? defined in kotlin.reflect.jvm.internal.KPropertyImpl.<init>[ValueParameterDescriptorImpl]

'container' @ [105:9] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'findPropertyDescriptor' @ [105:19] ==> public final fun findPropertyDescriptor(name: String, signature: String): PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'name' @ [105:42] ==> public open val name: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'signature' @ [105:48] ==> public final val signature: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'invoke' @ [108:57] ==> @Override public open fun invoke(): (PropertyDescriptor..PropertyDescriptor?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'getter' @ [110:52] ==> public abstract val getter: KPropertyImpl.Getter<R> defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'caller' @ [110:59] ==> public open val caller: FunctionCaller<*> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Getter[PropertyDescriptorImpl]

'getter' @ [112:60] ==> public abstract val getter: KPropertyImpl.Getter<R> defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'defaultCaller' @ [112:67] ==> public open val defaultCaller: FunctionCaller<*>? defined in kotlin.reflect.jvm.internal.KPropertyImpl.Getter[PropertyDescriptorImpl]

'descriptor' @ [114:46] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'isLateInit' @ [114:57] ==> public final val PropertyDescriptor.isLateInit: Boolean[MyPropertyDescriptor]

'descriptor' @ [116:43] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'isConst' @ [116:54] ==> public final val PropertyDescriptor.isConst: Boolean[MyPropertyDescriptor]

'other' @ [119:20] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl.equals[ValueParameterDescriptorImpl]

'asKPropertyImpl' @ [119:26] ==> internal fun Any?.asKPropertyImpl(): KPropertyImpl<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'container' @ [120:16] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'that' @ [120:29] ==> val that: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.equals[LocalVariableDescriptor]

'container' @ [120:34] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'name' @ [120:47] ==> public open val name: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'that' @ [120:55] ==> val that: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.equals[LocalVariableDescriptor]

'name' @ [120:60] ==> public open val name: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'signature' @ [120:68] ==> public final val signature: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'that' @ [120:81] ==> val that: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.equals[LocalVariableDescriptor]

'signature' @ [120:86] ==> public final val signature: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'boundReceiver' @ [120:99] ==> public final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'that' @ [120:116] ==> val that: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.equals[LocalVariableDescriptor]

'boundReceiver' @ [120:121] ==> public final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'*' @ [124:13] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'container' @ [124:14] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'hashCode' @ [124:24] ==> public open fun hashCode(): Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedSimpleFunctionDescriptor]

'name' @ [124:42] ==> public open val name: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'hashCode' @ [124:47] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'signature' @ [124:66] ==> public final val signature: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'hashCode' @ [124:76] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'ReflectionObjectRenderer' @ [127:13] ==> internal object ReflectionObjectRenderer defined in kotlin.reflect.jvm.internal in file ReflectionObjectRenderer.kt[FakeCallableDescriptorForObject]

'renderProperty' @ [127:38] ==> public final fun renderProperty(descriptor: PropertyDescriptor): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'descriptor' @ [127:53] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'KCallableImpl<ReturnType>' @ [130:13] ==> public constructor KCallableImpl<out R>() defined in kotlin.reflect.jvm.internal.KCallableImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> ReturnType

'property' @ [135:67] ==> public abstract val property: KPropertyImpl<PropertyType> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'container' @ [135:76] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'property' @ [139:47] ==> public abstract val property: KPropertyImpl<PropertyType> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'isBound' @ [139:56] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'descriptor' @ [141:48] ==> public abstract val descriptor: PropertyAccessorDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'isInline' @ [141:59] ==> public final val PropertyAccessorDescriptor.isInline: Boolean[MyPropertyDescriptor]

'descriptor' @ [142:50] ==> public abstract val descriptor: PropertyAccessorDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'isExternal' @ [142:61] ==> public final val PropertyAccessorDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'descriptor' @ [143:50] ==> public abstract val descriptor: PropertyAccessorDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'isOperator' @ [143:61] ==> public final val PropertyAccessorDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'descriptor' @ [144:47] ==> public abstract val descriptor: PropertyAccessorDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'isInfix' @ [144:58] ==> public final val PropertyAccessorDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'descriptor' @ [145:49] ==> public abstract val descriptor: PropertyAccessorDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'isSuspend' @ [145:60] ==> public final val PropertyAccessorDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'Accessor<R, R>' @ [148:36] ==> public constructor Accessor<out PropertyType, out ReturnType>() defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out PropertyType> -> R
    <out ReturnType> -> R

'property' @ [149:51] ==> public abstract val property: KPropertyImpl<R> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Getter[PropertyDescriptorImpl]

'name' @ [149:60] ==> public open val name: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'getValue' @ [151:62] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (PropertyGetterDescriptor..PropertyGetterDescriptor?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [151:80] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (PropertyGetterDescriptor..PropertyGetterDescriptor?)): ReflectProperties.LazySoftVal<(PropertyGetterDescriptor..PropertyGetterDescriptor?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PropertyGetterDescriptor

'property' @ [153:13] ==> public abstract val property: KPropertyImpl<R> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Getter[PropertyDescriptorImpl]

'descriptor' @ [153:22] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'getter' @ [153:33] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'createDefaultGetter' @ [153:61] ==> @NotNull public open fun createDefaultGetter(@NotNull propertyDescriptor: PropertyDescriptor, @NotNull annotations: Annotations): PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'property' @ [153:81] ==> public abstract val property: KPropertyImpl<R> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Getter[PropertyDescriptorImpl]

'descriptor' @ [153:90] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'Annotations' @ [153:102] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [153:114] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'getValue' @ [156:51] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (FunctionCaller<Member?>..FunctionCaller<Member?>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [156:69] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (FunctionCaller<Member?>..FunctionCaller<Member?>?)): ReflectProperties.LazySoftVal<(FunctionCaller<Member?>..FunctionCaller<Member?>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FunctionCaller<Member?>

'computeCallerForAccessor' @ [157:13] ==> private fun KPropertyImpl.Accessor<*, *>.computeCallerForAccessor(isGetter: Boolean): FunctionCaller<*> defined in kotlin.reflect.jvm.internal in file KPropertyImpl.kt[SimpleFunctionDescriptorImpl]

'Accessor<R, Unit>' @ [161:32] ==> public constructor Accessor<out PropertyType, out ReturnType>() defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out PropertyType> -> R
    <out ReturnType> -> Unit

'property' @ [162:51] ==> public abstract val property: KPropertyImpl<R> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Setter[PropertyDescriptorImpl]

'name' @ [162:60] ==> public open val name: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'getValue' @ [164:62] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (PropertySetterDescriptor..PropertySetterDescriptor?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [164:80] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (PropertySetterDescriptor..PropertySetterDescriptor?)): ReflectProperties.LazySoftVal<(PropertySetterDescriptor..PropertySetterDescriptor?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PropertySetterDescriptor

'property' @ [166:13] ==> public abstract val property: KPropertyImpl<R> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Setter[PropertyDescriptorImpl]

'descriptor' @ [166:22] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'setter' @ [166:33] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'createDefaultSetter' @ [166:61] ==> @NotNull public open fun createDefaultSetter(@NotNull propertyDescriptor: PropertyDescriptor, @NotNull annotations: Annotations): PropertySetterDescriptorImpl defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'property' @ [166:81] ==> public abstract val property: KPropertyImpl<R> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Setter[PropertyDescriptorImpl]

'descriptor' @ [166:90] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'Annotations' @ [166:102] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [166:114] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'getValue' @ [169:51] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (FunctionCaller<Member?>..FunctionCaller<Member?>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [169:69] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (FunctionCaller<Member?>..FunctionCaller<Member?>?)): ReflectProperties.LazySoftVal<(FunctionCaller<Member?>..FunctionCaller<Member?>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FunctionCaller<Member?>

'computeCallerForAccessor' @ [170:13] ==> private fun KPropertyImpl.Accessor<*, *>.computeCallerForAccessor(isGetter: Boolean): FunctionCaller<*> defined in kotlin.reflect.jvm.internal in file KPropertyImpl.kt[SimpleFunctionDescriptorImpl]

'Any' @ [175:43] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'KDeclarationContainerImpl' @ [181:9] ==> public companion object defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[FakeCallableDescriptorForObject]

'LOCAL_PROPERTY_SIGNATURE' @ [181:35] ==> internal final val LOCAL_PROPERTY_SIGNATURE: Regex defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Companion[PropertyDescriptorImpl]

'matches' @ [181:60] ==> public final infix fun matches(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'property' @ [181:68] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'signature' @ [181:77] ==> public final val signature: String defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [182:16] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'ThrowingCaller' @ [182:31] ==> public object ThrowingCaller : FunctionCaller<Nothing?> defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'property' @ [186:39] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'descriptor' @ [186:48] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'containingDeclaration' @ [186:59] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isCompanionObject' @ [187:32] ==> public open fun isCompanionObject(@Nullable descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'possibleCompanionObject' @ [187:50] ==> val possibleCompanionObject: DeclarationDescriptor defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.isInsideClassCompanionObject[LocalVariableDescriptor]

'!' @ [188:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [188:33] ==> public open fun isInterface(@Nullable descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'possibleCompanionObject' @ [188:45] ==> val possibleCompanionObject: DeclarationDescriptor defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.isInsideClassCompanionObject[LocalVariableDescriptor]

'containingDeclaration' @ [188:69] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'property' @ [192:13] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'descriptor' @ [192:22] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'annotations' @ [192:33] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[PropertyDescriptorImpl]

'findAnnotation' @ [192:45] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'JVM_STATIC' @ [192:60] ==> internal val JVM_STATIC: FqName defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'!' @ [195:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [195:24] ==> public open fun isNullableType(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'property' @ [195:39] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'descriptor' @ [195:48] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'type' @ [195:59] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'when {
        isInsideClassCompanionObject() -> {
            val klass = (descriptor.containingDeclaration as ClassDescriptor).toJavaClass()!!
            if (isGetter)
                if (isBound) FunctionCaller.BoundClassCompanionFieldGetter(field, klass)
                else FunctionCaller.ClassCompanionFieldGetter(field, klass)
            else
                if (isBound) FunctionCaller.BoundClassCompanionFieldSetter(field, klass)
                else FunctionCaller.ClassCompanionFieldSetter(field, klass)
        }
        !Modifier.isStatic(field.modifiers) ->
            if (isGetter)
                if (isBound) FunctionCaller.BoundInstanceFieldGetter(field, property.boundReceiver)
                else FunctionCaller.InstanceFieldGetter(field)
            else
                if (isBound) FunctionCaller.BoundInstanceFieldSetter(field, isNotNullProperty(), property.boundReceiver)
                else FunctionCaller.InstanceFieldSetter(field, isNotNullProperty())
        isJvmStaticProperty() ->
            if (isGetter)
                if (isBound) FunctionCaller.BoundJvmStaticInObjectFieldGetter(field)
                else FunctionCaller.JvmStaticInObjectFieldGetter(field)
            else
                if (isBound) FunctionCaller.BoundJvmStaticInObjectFieldSetter(field, isNotNullProperty())
                else FunctionCaller.JvmStaticInObjectFieldSetter(field, isNotNullProperty())
        else ->
            if (isGetter) FunctionCaller.StaticFieldGetter(field)
            else FunctionCaller.StaticFieldSetter(field, isNotNullProperty())
    }' @ [197:67] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionCaller<Field>, entry1: FunctionCaller<Field>, entry2: FunctionCaller<Field>, entry3: FunctionCaller<Field>): FunctionCaller<Field>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionCaller<Field>

'isInsideClassCompanionObject' @ [198:9] ==> local final fun isInsideClassCompanionObject(): Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'!!' @ [199:25] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Class<out (Any..Any?)>?): Class<out (Any..Any?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Class<out (kotlin.Any..kotlin.Any?)>

'descriptor' @ [199:26] ==> public abstract val descriptor: PropertyAccessorDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'containingDeclaration' @ [199:37] ==> public final val PropertyAccessorDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'toJavaClass' @ [199:79] ==> internal fun ClassDescriptor.toJavaClass(): Class<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'if (isGetter)
                if (isBound) FunctionCaller.BoundClassCompanionFieldGetter(field, klass)
                else FunctionCaller.ClassCompanionFieldGetter(field, klass)
            else
                if (isBound) FunctionCaller.BoundClassCompanionFieldSetter(field, klass)
                else FunctionCaller.ClassCompanionFieldSetter(field, klass)' @ [200:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller<Field>, elseBranch: FunctionCaller<Field>): FunctionCaller<Field>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionCaller<Field>

'isGetter' @ [200:17] ==> value-parameter isGetter: Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[ValueParameterDescriptorImpl]

'if (isBound) FunctionCaller.BoundClassCompanionFieldGetter(field, klass)
                else FunctionCaller.ClassCompanionFieldGetter(field, klass)' @ [201:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller<Field>, elseBranch: FunctionCaller<Field>): FunctionCaller<Field>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionCaller<Field>

'isBound' @ [201:21] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [201:30] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundClassCompanionFieldGetter' @ [201:45] ==> public constructor BoundClassCompanionFieldGetter(field: Field, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundClassCompanionFieldGetter[ClassConstructorDescriptorImpl]

'field' @ [201:76] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'klass' @ [201:83] ==> val klass: Class<out (Any..Any?)> defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[LocalVariableDescriptor]

'FunctionCaller' @ [202:22] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'ClassCompanionFieldGetter' @ [202:37] ==> public constructor ClassCompanionFieldGetter(field: Field, klass: Class<*>) defined in kotlin.reflect.jvm.internal.FunctionCaller.ClassCompanionFieldGetter[ClassConstructorDescriptorImpl]

'field' @ [202:63] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'klass' @ [202:70] ==> val klass: Class<out (Any..Any?)> defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[LocalVariableDescriptor]

'if (isBound) FunctionCaller.BoundClassCompanionFieldSetter(field, klass)
                else FunctionCaller.ClassCompanionFieldSetter(field, klass)' @ [204:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller<Field>, elseBranch: FunctionCaller<Field>): FunctionCaller<Field>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionCaller<Field>

'isBound' @ [204:21] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [204:30] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundClassCompanionFieldSetter' @ [204:45] ==> public constructor BoundClassCompanionFieldSetter(field: Field, klass: Class<*>) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundClassCompanionFieldSetter[ClassConstructorDescriptorImpl]

'field' @ [204:76] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'klass' @ [204:83] ==> val klass: Class<out (Any..Any?)> defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[LocalVariableDescriptor]

'FunctionCaller' @ [205:22] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'ClassCompanionFieldSetter' @ [205:37] ==> public constructor ClassCompanionFieldSetter(field: Field, klass: Class<*>) defined in kotlin.reflect.jvm.internal.FunctionCaller.ClassCompanionFieldSetter[ClassConstructorDescriptorImpl]

'field' @ [205:63] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'klass' @ [205:70] ==> val klass: Class<out (Any..Any?)> defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[LocalVariableDescriptor]

'!' @ [207:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStatic' @ [207:19] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'field' @ [207:28] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'modifiers' @ [207:34] ==> public final val Field.modifiers: Int[MyPropertyDescriptor]

'if (isGetter)
                if (isBound) FunctionCaller.BoundInstanceFieldGetter(field, property.boundReceiver)
                else FunctionCaller.InstanceFieldGetter(field)
            else
                if (isBound) FunctionCaller.BoundInstanceFieldSetter(field, isNotNullProperty(), property.boundReceiver)
                else FunctionCaller.InstanceFieldSetter(field, isNotNullProperty())' @ [208:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller<Field>, elseBranch: FunctionCaller<Field>): FunctionCaller<Field>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionCaller<Field>

'isGetter' @ [208:17] ==> value-parameter isGetter: Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[ValueParameterDescriptorImpl]

'if (isBound) FunctionCaller.BoundInstanceFieldGetter(field, property.boundReceiver)
                else FunctionCaller.InstanceFieldGetter(field)' @ [209:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.FieldGetter, elseBranch: FunctionCaller.FieldGetter): FunctionCaller.FieldGetter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FieldGetter

'isBound' @ [209:21] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [209:30] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundInstanceFieldGetter' @ [209:45] ==> public constructor BoundInstanceFieldGetter(field: Field, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundInstanceFieldGetter[ClassConstructorDescriptorImpl]

'field' @ [209:70] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'property' @ [209:77] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'boundReceiver' @ [209:86] ==> public final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [210:22] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'InstanceFieldGetter' @ [210:37] ==> public constructor InstanceFieldGetter(field: Field) defined in kotlin.reflect.jvm.internal.FunctionCaller.InstanceFieldGetter[ClassConstructorDescriptorImpl]

'field' @ [210:57] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'if (isBound) FunctionCaller.BoundInstanceFieldSetter(field, isNotNullProperty(), property.boundReceiver)
                else FunctionCaller.InstanceFieldSetter(field, isNotNullProperty())' @ [212:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.FieldSetter, elseBranch: FunctionCaller.FieldSetter): FunctionCaller.FieldSetter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FieldSetter

'isBound' @ [212:21] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [212:30] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundInstanceFieldSetter' @ [212:45] ==> public constructor BoundInstanceFieldSetter(field: Field, notNull: Boolean, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundInstanceFieldSetter[ClassConstructorDescriptorImpl]

'field' @ [212:70] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'isNotNullProperty' @ [212:77] ==> local final fun isNotNullProperty(): Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'property' @ [212:98] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'boundReceiver' @ [212:107] ==> public final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [213:22] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'InstanceFieldSetter' @ [213:37] ==> public constructor InstanceFieldSetter(field: Field, notNull: Boolean) defined in kotlin.reflect.jvm.internal.FunctionCaller.InstanceFieldSetter[ClassConstructorDescriptorImpl]

'field' @ [213:57] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'isNotNullProperty' @ [213:64] ==> local final fun isNotNullProperty(): Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'isJvmStaticProperty' @ [214:9] ==> local final fun isJvmStaticProperty(): Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'if (isGetter)
                if (isBound) FunctionCaller.BoundJvmStaticInObjectFieldGetter(field)
                else FunctionCaller.JvmStaticInObjectFieldGetter(field)
            else
                if (isBound) FunctionCaller.BoundJvmStaticInObjectFieldSetter(field, isNotNullProperty())
                else FunctionCaller.JvmStaticInObjectFieldSetter(field, isNotNullProperty())' @ [215:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller<Field>, elseBranch: FunctionCaller<Field>): FunctionCaller<Field>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionCaller<Field>

'isGetter' @ [215:17] ==> value-parameter isGetter: Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[ValueParameterDescriptorImpl]

'if (isBound) FunctionCaller.BoundJvmStaticInObjectFieldGetter(field)
                else FunctionCaller.JvmStaticInObjectFieldGetter(field)' @ [216:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.FieldGetter, elseBranch: FunctionCaller.FieldGetter): FunctionCaller.FieldGetter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FieldGetter

'isBound' @ [216:21] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [216:30] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundJvmStaticInObjectFieldGetter' @ [216:45] ==> public constructor BoundJvmStaticInObjectFieldGetter(field: Field) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundJvmStaticInObjectFieldGetter[ClassConstructorDescriptorImpl]

'field' @ [216:79] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'FunctionCaller' @ [217:22] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'JvmStaticInObjectFieldGetter' @ [217:37] ==> public constructor JvmStaticInObjectFieldGetter(field: Field) defined in kotlin.reflect.jvm.internal.FunctionCaller.JvmStaticInObjectFieldGetter[ClassConstructorDescriptorImpl]

'field' @ [217:66] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'if (isBound) FunctionCaller.BoundJvmStaticInObjectFieldSetter(field, isNotNullProperty())
                else FunctionCaller.JvmStaticInObjectFieldSetter(field, isNotNullProperty())' @ [219:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.FieldSetter, elseBranch: FunctionCaller.FieldSetter): FunctionCaller.FieldSetter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FieldSetter

'isBound' @ [219:21] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [219:30] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundJvmStaticInObjectFieldSetter' @ [219:45] ==> public constructor BoundJvmStaticInObjectFieldSetter(field: Field, notNull: Boolean) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundJvmStaticInObjectFieldSetter[ClassConstructorDescriptorImpl]

'field' @ [219:79] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'isNotNullProperty' @ [219:86] ==> local final fun isNotNullProperty(): Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'FunctionCaller' @ [220:22] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'JvmStaticInObjectFieldSetter' @ [220:37] ==> public constructor JvmStaticInObjectFieldSetter(field: Field, notNull: Boolean) defined in kotlin.reflect.jvm.internal.FunctionCaller.JvmStaticInObjectFieldSetter[ClassConstructorDescriptorImpl]

'field' @ [220:66] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'isNotNullProperty' @ [220:73] ==> local final fun isNotNullProperty(): Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'if (isGetter) FunctionCaller.StaticFieldGetter(field)
            else FunctionCaller.StaticFieldSetter(field, isNotNullProperty())' @ [222:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller<Field>, elseBranch: FunctionCaller<Field>): FunctionCaller<Field>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionCaller<Field>

'isGetter' @ [222:17] ==> value-parameter isGetter: Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[ValueParameterDescriptorImpl]

'FunctionCaller' @ [222:27] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'StaticFieldGetter' @ [222:42] ==> public constructor StaticFieldGetter(field: Field) defined in kotlin.reflect.jvm.internal.FunctionCaller.StaticFieldGetter[ClassConstructorDescriptorImpl]

'field' @ [222:60] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'FunctionCaller' @ [223:18] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'StaticFieldSetter' @ [223:33] ==> public constructor StaticFieldSetter(field: Field, notNull: Boolean) defined in kotlin.reflect.jvm.internal.FunctionCaller.StaticFieldSetter[ClassConstructorDescriptorImpl]

'field' @ [223:51] ==> value-parameter field: Field defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.computeFieldCaller[ValueParameterDescriptorImpl]

'isNotNullProperty' @ [223:58] ==> local final fun isNotNullProperty(): Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'RuntimeTypeMapper' @ [226:24] ==> internal object RuntimeTypeMapper defined in kotlin.reflect.jvm.internal in file RuntimeTypeMapper.kt[FakeCallableDescriptorForObject]

'mapPropertySignature' @ [226:42] ==> public final fun mapPropertySignature(possiblyOverriddenProperty: PropertyDescriptor): JvmPropertySignature defined in kotlin.reflect.jvm.internal.RuntimeTypeMapper[SimpleFunctionDescriptorImpl]

'property' @ [226:63] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'descriptor' @ [226:72] ==> public open val descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'when (jvmSignature) {
        is KotlinProperty -> {
            val accessorSignature = jvmSignature.signature.run {
                when {
                    isGetter -> if (hasGetter()) getter else null
                    else -> if (hasSetter()) setter else null
                }
            }

            val accessor = accessorSignature?.let { signature ->
                property.container.findMethodBySignature(
                        jvmSignature.nameResolver.getString(signature.name),
                        jvmSignature.nameResolver.getString(signature.desc),
                        descriptor.isPublicInBytecode
                )
            }

            when {
                accessor == null -> computeFieldCaller(
                        property.javaField
                        ?: throw KotlinReflectionInternalError("No accessors or field is found for property $property")
                )
                !Modifier.isStatic(accessor.modifiers) ->
                    if (isBound) FunctionCaller.BoundInstanceMethod(accessor, property.boundReceiver)
                    else FunctionCaller.InstanceMethod(accessor)
                isJvmStaticProperty() ->
                    if (isBound) FunctionCaller.BoundJvmStaticInObject(accessor)
                    else FunctionCaller.JvmStaticInObject(accessor)
                else ->
                    if (isBound) FunctionCaller.BoundStaticMethod(accessor, property.boundReceiver)
                    else FunctionCaller.StaticMethod(accessor)
            }
        }
        is JavaField -> {
            computeFieldCaller(jvmSignature.field)
        }
        is JavaMethodProperty -> {
            val method =
                    if (isGetter) jvmSignature.getterMethod
                    else jvmSignature.setterMethod ?: throw KotlinReflectionInternalError(
                            "No source found for setter of Java method property: ${jvmSignature.getterMethod}"
                    )
            if (isBound) FunctionCaller.BoundInstanceMethod(method, property.boundReceiver)
            else FunctionCaller.InstanceMethod(method)
        }
    }' @ [227:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionCaller<*>, entry1: FunctionCaller<*>, entry2: FunctionCaller<*>): FunctionCaller<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionCaller<*>

'jvmSignature' @ [227:18] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'jvmSignature' @ [229:37] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'signature' @ [229:50] ==> public final val signature: JvmProtoBuf.JvmPropertySignature defined in kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty[PropertyDescriptorImpl]

'run' @ [229:60] ==> @InlineOnly public inline fun <T, R> JvmProtoBuf.JvmPropertySignature.run(block: JvmProtoBuf.JvmPropertySignature.() -> JvmProtoBuf.JvmMethodSignature?): JvmProtoBuf.JvmMethodSignature? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmPropertySignature
    <R> -> JvmMethodSignature?

'when {
                    isGetter -> if (hasGetter()) getter else null
                    else -> if (hasSetter()) setter else null
                }' @ [230:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JvmProtoBuf.JvmMethodSignature?, entry1: JvmProtoBuf.JvmMethodSignature?): JvmProtoBuf.JvmMethodSignature?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JvmMethodSignature?

'isGetter' @ [231:21] ==> value-parameter isGetter: Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[ValueParameterDescriptorImpl]

'if (hasGetter()) getter else null' @ [231:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmProtoBuf.JvmMethodSignature?, elseBranch: JvmProtoBuf.JvmMethodSignature?): JvmProtoBuf.JvmMethodSignature?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmMethodSignature?

'hasGetter' @ [231:37] ==> public open fun hasGetter(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature[JavaMethodDescriptor]

'getter' @ [231:50] ==> public final val JvmProtoBuf.JvmPropertySignature.getter: (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)[MyPropertyDescriptor]

'if (hasSetter()) setter else null' @ [232:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmProtoBuf.JvmMethodSignature?, elseBranch: JvmProtoBuf.JvmMethodSignature?): JvmProtoBuf.JvmMethodSignature?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmMethodSignature?

'hasSetter' @ [232:33] ==> public open fun hasSetter(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature[JavaMethodDescriptor]

'setter' @ [232:46] ==> public final val JvmProtoBuf.JvmPropertySignature.setter: (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)[MyPropertyDescriptor]

'accessorSignature' @ [236:28] ==> val accessorSignature: JvmProtoBuf.JvmMethodSignature? defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'let' @ [236:47] ==> @InlineOnly public inline fun <T, R> JvmProtoBuf.JvmMethodSignature.let(block: (JvmProtoBuf.JvmMethodSignature) -> Method?): Method? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmMethodSignature
    <R> -> Method?

'property' @ [237:17] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'container' @ [237:26] ==> public open val container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'findMethodBySignature' @ [237:36] ==> public final fun findMethodBySignature(name: String, desc: String, isPublic: Boolean): Method? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'jvmSignature' @ [238:25] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'nameResolver' @ [238:38] ==> public final val nameResolver: NameResolver defined in kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty[PropertyDescriptorImpl]

'getString' @ [238:51] ==> @NotNull public abstract fun getString(index: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'signature' @ [238:61] ==> value-parameter signature: JvmProtoBuf.JvmMethodSignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [238:71] ==> public final val JvmProtoBuf.JvmMethodSignature.name: Int[MyPropertyDescriptor]

'jvmSignature' @ [239:25] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'nameResolver' @ [239:38] ==> public final val nameResolver: NameResolver defined in kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty[PropertyDescriptorImpl]

'getString' @ [239:51] ==> @NotNull public abstract fun getString(index: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'signature' @ [239:61] ==> value-parameter signature: JvmProtoBuf.JvmMethodSignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [239:71] ==> public final val JvmProtoBuf.JvmMethodSignature.desc: Int[MyPropertyDescriptor]

'descriptor' @ [240:25] ==> public abstract val descriptor: PropertyAccessorDescriptor defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'isPublicInBytecode' @ [240:36] ==> internal val CallableMemberDescriptor.isPublicInBytecode: Boolean defined in kotlin.reflect.jvm.internal in file util.kt[PropertyDescriptorImpl]

'when {
                accessor == null -> computeFieldCaller(
                        property.javaField
                        ?: throw KotlinReflectionInternalError("No accessors or field is found for property $property")
                )
                !Modifier.isStatic(accessor.modifiers) ->
                    if (isBound) FunctionCaller.BoundInstanceMethod(accessor, property.boundReceiver)
                    else FunctionCaller.InstanceMethod(accessor)
                isJvmStaticProperty() ->
                    if (isBound) FunctionCaller.BoundJvmStaticInObject(accessor)
                    else FunctionCaller.JvmStaticInObject(accessor)
                else ->
                    if (isBound) FunctionCaller.BoundStaticMethod(accessor, property.boundReceiver)
                    else FunctionCaller.StaticMethod(accessor)
            }' @ [244:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionCaller<{AccessibleObject & Member}>, entry1: FunctionCaller<{AccessibleObject & Member}>, entry2: FunctionCaller<{AccessibleObject & Member}>, entry3: FunctionCaller<{AccessibleObject & Member}>): FunctionCaller<{AccessibleObject & Member}>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionCaller<{AccessibleObject & Member}>

'accessor' @ [245:17] ==> val accessor: Method? defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'computeFieldCaller' @ [245:37] ==> local final fun computeFieldCaller(field: Field): FunctionCaller<Field> defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'property' @ [246:25] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'javaField' @ [246:34] ==> public final val javaField: Field? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'KotlinReflectionInternalError' @ [247:34] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'property' @ [247:110] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'!' @ [249:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStatic' @ [249:27] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'accessor' @ [249:36] ==> val accessor: Method? defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'modifiers' @ [249:45] ==> public final val Method.modifiers: Int[MyPropertyDescriptor]

'if (isBound) FunctionCaller.BoundInstanceMethod(accessor, property.boundReceiver)
                    else FunctionCaller.InstanceMethod(accessor)' @ [250:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.Method, elseBranch: FunctionCaller.Method): FunctionCaller.Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method

'isBound' @ [250:25] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [250:34] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundInstanceMethod' @ [250:49] ==> public constructor BoundInstanceMethod(method: Method, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundInstanceMethod[ClassConstructorDescriptorImpl]

'accessor' @ [250:69] ==> val accessor: Method? defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'property' @ [250:79] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'boundReceiver' @ [250:88] ==> public final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [251:26] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'InstanceMethod' @ [251:41] ==> public constructor InstanceMethod(method: Method) defined in kotlin.reflect.jvm.internal.FunctionCaller.InstanceMethod[ClassConstructorDescriptorImpl]

'accessor' @ [251:56] ==> val accessor: Method? defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'isJvmStaticProperty' @ [252:17] ==> local final fun isJvmStaticProperty(): Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'if (isBound) FunctionCaller.BoundJvmStaticInObject(accessor)
                    else FunctionCaller.JvmStaticInObject(accessor)' @ [253:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.Method, elseBranch: FunctionCaller.Method): FunctionCaller.Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method

'isBound' @ [253:25] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [253:34] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundJvmStaticInObject' @ [253:49] ==> public constructor BoundJvmStaticInObject(method: Method) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundJvmStaticInObject[ClassConstructorDescriptorImpl]

'accessor' @ [253:72] ==> val accessor: Method? defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'FunctionCaller' @ [254:26] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'JvmStaticInObject' @ [254:41] ==> public constructor JvmStaticInObject(method: Method) defined in kotlin.reflect.jvm.internal.FunctionCaller.JvmStaticInObject[ClassConstructorDescriptorImpl]

'accessor' @ [254:59] ==> val accessor: Method? defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'if (isBound) FunctionCaller.BoundStaticMethod(accessor, property.boundReceiver)
                    else FunctionCaller.StaticMethod(accessor)' @ [256:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.Method, elseBranch: FunctionCaller.Method): FunctionCaller.Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method

'isBound' @ [256:25] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [256:34] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundStaticMethod' @ [256:49] ==> public constructor BoundStaticMethod(method: Method, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundStaticMethod[ClassConstructorDescriptorImpl]

'accessor' @ [256:67] ==> val accessor: Method? defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'property' @ [256:77] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'boundReceiver' @ [256:86] ==> public final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [257:26] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'StaticMethod' @ [257:41] ==> public constructor StaticMethod(method: Method) defined in kotlin.reflect.jvm.internal.FunctionCaller.StaticMethod[ClassConstructorDescriptorImpl]

'accessor' @ [257:54] ==> val accessor: Method? defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'computeFieldCaller' @ [261:13] ==> local final fun computeFieldCaller(field: Field): FunctionCaller<Field> defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[SimpleFunctionDescriptorImpl]

'jvmSignature' @ [261:32] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'field' @ [261:45] ==> public final val field: Field defined in kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField[PropertyDescriptorImpl]

'if (isGetter) jvmSignature.getterMethod
                    else jvmSignature.setterMethod ?: throw KotlinReflectionInternalError(
                            "No source found for setter of Java method property: ${jvmSignature.getterMethod}"
                    )' @ [265:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Method, elseBranch: Method): Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method

'isGetter' @ [265:25] ==> value-parameter isGetter: Boolean defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[ValueParameterDescriptorImpl]

'jvmSignature' @ [265:35] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'getterMethod' @ [265:48] ==> public final val getterMethod: Method defined in kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty[PropertyDescriptorImpl]

'jvmSignature' @ [266:26] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'setterMethod' @ [266:39] ==> public final val setterMethod: Method? defined in kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty[PropertyDescriptorImpl]

'KotlinReflectionInternalError' @ [266:61] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'jvmSignature' @ [267:84] ==> val jvmSignature: JvmPropertySignature defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'getterMethod' @ [267:97] ==> public final val getterMethod: Method defined in kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty[PropertyDescriptorImpl]

'if (isBound) FunctionCaller.BoundInstanceMethod(method, property.boundReceiver)
            else FunctionCaller.InstanceMethod(method)' @ [269:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionCaller.Method, elseBranch: FunctionCaller.Method): FunctionCaller.Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method

'isBound' @ [269:17] ==> public open val isBound: Boolean defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'FunctionCaller' @ [269:26] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'BoundInstanceMethod' @ [269:41] ==> public constructor BoundInstanceMethod(method: Method, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.FunctionCaller.BoundInstanceMethod[ClassConstructorDescriptorImpl]

'method' @ [269:61] ==> val method: Method defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

'property' @ [269:69] ==> public abstract val property: KPropertyImpl<Any?> defined in kotlin.reflect.jvm.internal.KPropertyImpl.Accessor[PropertyDescriptorImpl]

'boundReceiver' @ [269:78] ==> public final val boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'FunctionCaller' @ [270:18] ==> public companion object defined in kotlin.reflect.jvm.internal.FunctionCaller[FakeCallableDescriptorForObject]

'InstanceMethod' @ [270:33] ==> public constructor InstanceMethod(method: Method) defined in kotlin.reflect.jvm.internal.FunctionCaller.InstanceMethod[ClassConstructorDescriptorImpl]

'method' @ [270:48] ==> val method: Method defined in kotlin.reflect.jvm.internal.computeCallerForAccessor[LocalVariableDescriptor]

