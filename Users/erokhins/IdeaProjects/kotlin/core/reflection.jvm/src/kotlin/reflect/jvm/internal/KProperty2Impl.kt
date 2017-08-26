'super' @ [26:90] ==> public constructor KPropertyImpl<out R>(container: KDeclarationContainerImpl, name: String, signature: String, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.KPropertyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> R

'container' @ [26:96] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KProperty2Impl.<init>[ValueParameterDescriptorImpl]

'name' @ [26:107] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KProperty2Impl.<init>[ValueParameterDescriptorImpl]

'signature' @ [26:113] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KProperty2Impl.<init>[ValueParameterDescriptorImpl]

'NO_RECEIVER' @ [26:142] ==> @SinceKotlin public final val NO_RECEIVER: (Any..Any?) defined in kotlin.jvm.internal.CallableReference[JavaPropertyDescriptor]

'super' @ [28:89] ==> public constructor KPropertyImpl<out R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KPropertyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> R

'container' @ [28:95] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KProperty2Impl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [28:106] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KProperty2Impl.<init>[ValueParameterDescriptorImpl]

'lazy' @ [30:45] ==> @NotNull public open fun <T : (Any..Any?)> lazy(@NotNull initializer: () -> (KProperty2Impl.Getter<D, E, R>..KProperty2Impl.Getter<D, E, R>?)): ReflectProperties.LazyVal<(KProperty2Impl.Getter<D, E, R>..KProperty2Impl.Getter<D, E, R>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.reflect.jvm.internal.KProperty2Impl.Getter<D, E, R>..kotlin.reflect.jvm.internal.KProperty2Impl.Getter<D, E, R>?)

'Getter' @ [30:52] ==> public constructor Getter<D, E, out R>(property: KProperty2Impl<D, E, R>) defined in kotlin.reflect.jvm.internal.KProperty2Impl.Getter[ClassConstructorDescriptorImpl]
Inferred types:
    <D> -> D
    <E> -> E
    <out R> -> R

'this' @ [30:59] ==> <this> defined in kotlin.reflect.jvm.internal.KProperty2Impl[LazyClassReceiverParameterDescriptor]

'invoke' @ [32:50] ==> @Override public open fun invoke(): (KProperty2Impl.Getter<D, E, R>..KProperty2Impl.Getter<D, E, R>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'getter' @ [34:55] ==> public open val getter: KProperty2Impl.Getter<D, E, R> defined in kotlin.reflect.jvm.internal.KProperty2Impl[PropertyDescriptorImpl]

'call' @ [34:62] ==> @Suppress public open fun call(vararg args: Any?): R defined in kotlin.reflect.jvm.internal.KProperty2Impl.Getter[SimpleFunctionDescriptorImpl]

'receiver1' @ [34:67] ==> value-parameter receiver1: D defined in kotlin.reflect.jvm.internal.KProperty2Impl.get[ValueParameterDescriptorImpl]

'receiver2' @ [34:78] ==> value-parameter receiver2: E defined in kotlin.reflect.jvm.internal.KProperty2Impl.get[ValueParameterDescriptorImpl]

'lazy' @ [36:33] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> Field?): Lazy<Field?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field?

'PUBLICATION' @ [36:38] ==> enum entry PUBLICATION defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'computeDelegateField' @ [36:53] ==> protected final fun computeDelegateField(): Field? defined in kotlin.reflect.jvm.internal.KProperty2Impl[SimpleFunctionDescriptorImpl]

'getDelegate' @ [38:66] ==> protected final fun getDelegate(field: Field?, receiver: Any?): Any? defined in kotlin.reflect.jvm.internal.KProperty2Impl[SimpleFunctionDescriptorImpl]

'delegateField' @ [38:78] ==> private final val delegateField: Lazy<Field?> defined in kotlin.reflect.jvm.internal.KProperty2Impl[PropertyDescriptorImpl]

'value' @ [38:92] ==> public abstract val value: Field? defined in kotlin.Lazy[DeserializedPropertyDescriptor]

'receiver1' @ [38:99] ==> value-parameter receiver1: D defined in kotlin.reflect.jvm.internal.KProperty2Impl.getDelegate[ValueParameterDescriptorImpl]

'get' @ [40:58] ==> public open fun get(receiver1: D, receiver2: E): R defined in kotlin.reflect.jvm.internal.KProperty2Impl[SimpleFunctionDescriptorImpl]

'receiver1' @ [40:62] ==> value-parameter receiver1: D defined in kotlin.reflect.jvm.internal.KProperty2Impl.invoke[ValueParameterDescriptorImpl]

'receiver2' @ [40:73] ==> value-parameter receiver2: E defined in kotlin.reflect.jvm.internal.KProperty2Impl.invoke[ValueParameterDescriptorImpl]

'KPropertyImpl.Getter<R>' @ [42:81] ==> public constructor Getter<out R>() defined in kotlin.reflect.jvm.internal.KPropertyImpl.Getter[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> R

'property' @ [43:62] ==> public open val property: KProperty2Impl<D, E, R> defined in kotlin.reflect.jvm.internal.KProperty2Impl.Getter[PropertyDescriptorImpl]

'get' @ [43:71] ==> public open fun get(receiver1: D, receiver2: E): R defined in kotlin.reflect.jvm.internal.KProperty2Impl[SimpleFunctionDescriptorImpl]

'receiver1' @ [43:75] ==> value-parameter receiver1: D defined in kotlin.reflect.jvm.internal.KProperty2Impl.Getter.invoke[ValueParameterDescriptorImpl]

'receiver2' @ [43:86] ==> value-parameter receiver2: E defined in kotlin.reflect.jvm.internal.KProperty2Impl.Getter.invoke[ValueParameterDescriptorImpl]

'super' @ [48:90] ==> public constructor KProperty2Impl<D, E, out R>(container: KDeclarationContainerImpl, name: String, signature: String) defined in kotlin.reflect.jvm.internal.KProperty2Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <D> -> D
    <E> -> E
    <out R> -> R

'container' @ [48:96] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.<init>[ValueParameterDescriptorImpl]

'name' @ [48:107] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.<init>[ValueParameterDescriptorImpl]

'signature' @ [48:113] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.<init>[ValueParameterDescriptorImpl]

'super' @ [50:89] ==> public constructor KProperty2Impl<D, E, out R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KProperty2Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <D> -> D
    <E> -> E
    <out R> -> R

'container' @ [50:95] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [50:106] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.<init>[ValueParameterDescriptorImpl]

'lazy' @ [52:45] ==> @NotNull public open fun <T : (Any..Any?)> lazy(@NotNull initializer: () -> (KMutableProperty2Impl.Setter<D, E, R>..KMutableProperty2Impl.Setter<D, E, R>?)): ReflectProperties.LazyVal<(KMutableProperty2Impl.Setter<D, E, R>..KMutableProperty2Impl.Setter<D, E, R>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.reflect.jvm.internal.KMutableProperty2Impl.Setter<D, E, R>..kotlin.reflect.jvm.internal.KMutableProperty2Impl.Setter<D, E, R>?)

'Setter' @ [52:52] ==> public constructor Setter<D, E, R>(property: KMutableProperty2Impl<D, E, R>) defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.Setter[ClassConstructorDescriptorImpl]
Inferred types:
    <D> -> D
    <E> -> E
    <R> -> R

'this' @ [52:59] ==> <this> defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl[LazyClassReceiverParameterDescriptor]

'invoke' @ [54:50] ==> @Override public open fun invoke(): (KMutableProperty2Impl.Setter<D, E, R>..KMutableProperty2Impl.Setter<D, E, R>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'setter' @ [56:62] ==> public open val setter: KMutableProperty2Impl.Setter<D, E, R> defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl[PropertyDescriptorImpl]

'call' @ [56:69] ==> @Suppress public open fun call(vararg args: Any?): Unit defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.Setter[SimpleFunctionDescriptorImpl]

'receiver1' @ [56:74] ==> value-parameter receiver1: D defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.set[ValueParameterDescriptorImpl]

'receiver2' @ [56:85] ==> value-parameter receiver2: E defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.set[ValueParameterDescriptorImpl]

'value' @ [56:96] ==> value-parameter value: R defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.set[ValueParameterDescriptorImpl]

'KPropertyImpl.Setter<R>' @ [58:84] ==> public constructor Setter<R>() defined in kotlin.reflect.jvm.internal.KPropertyImpl.Setter[ClassConstructorDescriptorImpl]
Inferred types:
    <R> -> R

'property' @ [59:75] ==> public open val property: KMutableProperty2Impl<D, E, R> defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.Setter[PropertyDescriptorImpl]

'set' @ [59:84] ==> public open fun set(receiver1: D, receiver2: E, value: R): Unit defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl[SimpleFunctionDescriptorImpl]

'receiver1' @ [59:88] ==> value-parameter receiver1: D defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.Setter.invoke[ValueParameterDescriptorImpl]

'receiver2' @ [59:99] ==> value-parameter receiver2: E defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.Setter.invoke[ValueParameterDescriptorImpl]

'value' @ [59:110] ==> value-parameter value: R defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl.Setter.invoke[ValueParameterDescriptorImpl]

