'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'when (this) {
            is KMutableProperty ->
                javaField?.isAccessible ?: true &&
                javaGetter?.isAccessible ?: true &&
                javaSetter?.isAccessible ?: true
            is KProperty ->
                javaField?.isAccessible ?: true &&
                javaGetter?.isAccessible ?: true
            is KProperty.Getter ->
                property.javaField?.isAccessible ?: true &&
                javaMethod?.isAccessible ?: true
            is KMutableProperty.Setter<*> ->
                property.javaField?.isAccessible ?: true &&
                javaMethod?.isAccessible ?: true
            is KFunction ->
                javaMethod?.isAccessible ?: true &&
                (this.asKCallableImpl()?.defaultCaller?.member as? AccessibleObject)?.isAccessible ?: true &&
                this.javaConstructor?.isAccessible ?: true
            else -> throw UnsupportedOperationException("Unknown callable: $this ($javaClass)")
        }' @ [40:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [40:22] ==> <this> defined in kotlin.reflect.jvm.isAccessible[ReceiverParameterDescriptorImpl]

'javaField' @ [42:17] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [42:28] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'javaGetter' @ [43:17] ==> public val KProperty<*>.javaGetter: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [43:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'javaSetter' @ [44:17] ==> public val KMutableProperty<*>.javaSetter: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [44:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'javaField' @ [46:17] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [46:28] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'javaGetter' @ [47:17] ==> public val KProperty<*>.javaGetter: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [47:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'property' @ [49:17] ==> public abstract val property: KProperty<Any?> defined in kotlin.reflect.KProperty.Getter[DeserializedPropertyDescriptor]

'javaField' @ [49:26] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [49:37] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'javaMethod' @ [50:17] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [50:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'property' @ [52:17] ==> public abstract val property: KProperty<Any?> defined in kotlin.reflect.KMutableProperty.Setter[DeserializedPropertyDescriptor]

'javaField' @ [52:26] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [52:37] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'javaMethod' @ [53:17] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [53:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'javaMethod' @ [55:17] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [55:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'?:' @ [56:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'this' @ [56:18] ==> <this> defined in kotlin.reflect.jvm.isAccessible[ReceiverParameterDescriptorImpl]

'asKCallableImpl' @ [56:23] ==> internal fun Any?.asKCallableImpl(): KCallableImpl<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'defaultCaller' @ [56:42] ==> public abstract val defaultCaller: FunctionCaller<*>? defined in kotlin.reflect.jvm.internal.KCallableImpl[PropertyDescriptorImpl]

'member' @ [56:57] ==> internal final val member: Member? defined in kotlin.reflect.jvm.internal.FunctionCaller[PropertyDescriptorImpl]

'isAccessible' @ [56:87] ==> public final var AccessibleObject.isAccessible: Boolean[MyPropertyDescriptor]

'this' @ [57:17] ==> <this> defined in kotlin.reflect.jvm.isAccessible[ReceiverParameterDescriptorImpl]

'javaConstructor' @ [57:22] ==> @Suppress public val <T> KFunction<Any?>.javaConstructor: Constructor<Any?>? defined in kotlin.reflect.jvm[PropertyDescriptorImpl]
Inferred types:
    <T> -> Any?

'isAccessible' @ [57:39] ==> public final var <T : (Any..Any?)> Constructor<Any?>.isAccessible: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any?

'UnsupportedOperationException' @ [58:27] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'this' @ [58:77] ==> <this> defined in kotlin.reflect.jvm.isAccessible[ReceiverParameterDescriptorImpl]

'javaClass' @ [58:84] ==> public val <T : Any> KCallable<Any?>.javaClass: Class<KCallable<Any?>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KCallable<Any?>

'when (this) {
            is KMutableProperty -> {
                javaField?.isAccessible = value
                javaGetter?.isAccessible = value
                javaSetter?.isAccessible = value
            }
            is KProperty -> {
                javaField?.isAccessible = value
                javaGetter?.isAccessible = value
            }
            is KProperty.Getter -> {
                property.javaField?.isAccessible = value
                javaMethod?.isAccessible = value
            }
            is KMutableProperty.Setter<*> -> {
                property.javaField?.isAccessible = value
                javaMethod?.isAccessible = value
            }
            is KFunction -> {
                javaMethod?.isAccessible = value
                (this.asKCallableImpl()?.defaultCaller?.member as? AccessibleObject)?.isAccessible = true
                this.javaConstructor?.isAccessible = value
            }
            else -> throw UnsupportedOperationException("Unknown callable: $this ($javaClass)")
        }' @ [62:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [62:15] ==> <this> defined in kotlin.reflect.jvm.isAccessible[ReceiverParameterDescriptorImpl]

'javaField' @ [64:17] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [64:28] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [64:43] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'javaGetter' @ [65:17] ==> public val KProperty<*>.javaGetter: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [65:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [65:44] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'javaSetter' @ [66:17] ==> public val KMutableProperty<*>.javaSetter: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [66:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [66:44] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'javaField' @ [69:17] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [69:28] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [69:43] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'javaGetter' @ [70:17] ==> public val KProperty<*>.javaGetter: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [70:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [70:44] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'property' @ [73:17] ==> public abstract val property: KProperty<Any?> defined in kotlin.reflect.KProperty.Getter[DeserializedPropertyDescriptor]

'javaField' @ [73:26] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [73:37] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [73:52] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'javaMethod' @ [74:17] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [74:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [74:44] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'property' @ [77:17] ==> public abstract val property: KProperty<Any?> defined in kotlin.reflect.KMutableProperty.Setter[DeserializedPropertyDescriptor]

'javaField' @ [77:26] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [77:37] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [77:52] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'javaMethod' @ [78:17] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [78:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [78:44] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'javaMethod' @ [81:17] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'isAccessible' @ [81:29] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'value' @ [81:44] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'this' @ [82:18] ==> <this> defined in kotlin.reflect.jvm.isAccessible[ReceiverParameterDescriptorImpl]

'asKCallableImpl' @ [82:23] ==> internal fun Any?.asKCallableImpl(): KCallableImpl<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'defaultCaller' @ [82:42] ==> public abstract val defaultCaller: FunctionCaller<*>? defined in kotlin.reflect.jvm.internal.KCallableImpl[PropertyDescriptorImpl]

'member' @ [82:57] ==> internal final val member: Member? defined in kotlin.reflect.jvm.internal.FunctionCaller[PropertyDescriptorImpl]

'isAccessible' @ [82:87] ==> public final var AccessibleObject.isAccessible: Boolean[MyPropertyDescriptor]

'this' @ [83:17] ==> <this> defined in kotlin.reflect.jvm.isAccessible[ReceiverParameterDescriptorImpl]

'javaConstructor' @ [83:22] ==> @Suppress public val <T> KFunction<Any?>.javaConstructor: Constructor<Any?>? defined in kotlin.reflect.jvm[PropertyDescriptorImpl]
Inferred types:
    <T> -> Any?

'isAccessible' @ [83:39] ==> public final var <T : (Any..Any?)> Constructor<Any?>.isAccessible: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any?

'value' @ [83:54] ==> value-parameter value: Boolean defined in kotlin.reflect.jvm.<set-isAccessible>[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [85:27] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'this' @ [85:77] ==> <this> defined in kotlin.reflect.jvm.isAccessible[ReceiverParameterDescriptorImpl]

'javaClass' @ [85:84] ==> public val <T : Any> KCallable<Any?>.javaClass: Class<KCallable<Any?>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KCallable<Any?>

