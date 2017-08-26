'super' @ [25:111] ==> public constructor KPropertyImpl<out R>(container: KDeclarationContainerImpl, name: String, signature: String, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.KPropertyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> R

'container' @ [25:117] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KProperty1Impl.<init>[ValueParameterDescriptorImpl]

'name' @ [25:128] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KProperty1Impl.<init>[ValueParameterDescriptorImpl]

'signature' @ [25:134] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KProperty1Impl.<init>[ValueParameterDescriptorImpl]

'boundReceiver' @ [25:145] ==> value-parameter boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KProperty1Impl.<init>[ValueParameterDescriptorImpl]

'super' @ [27:89] ==> public constructor KPropertyImpl<out R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KPropertyImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> R

'container' @ [27:95] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KProperty1Impl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [27:106] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KProperty1Impl.<init>[ValueParameterDescriptorImpl]

'lazy' @ [29:45] ==> @NotNull public open fun <T : (Any..Any?)> lazy(@NotNull initializer: () -> (KProperty1Impl.Getter<T, R>..KProperty1Impl.Getter<T, R>?)): ReflectProperties.LazyVal<(KProperty1Impl.Getter<T, R>..KProperty1Impl.Getter<T, R>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Getter<T, R>

'Getter' @ [29:52] ==> public constructor Getter<T, out R>(property: KProperty1Impl<T, R>) defined in kotlin.reflect.jvm.internal.KProperty1Impl.Getter[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T
    <out R> -> R

'this' @ [29:59] ==> <this> defined in kotlin.reflect.jvm.internal.KProperty1Impl[LazyClassReceiverParameterDescriptor]

'invoke' @ [31:47] ==> @Override public open fun invoke(): (KProperty1Impl.Getter<T, R>..KProperty1Impl.Getter<T, R>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'getter' @ [33:40] ==> public open val getter: KProperty1Impl.Getter<T, R> defined in kotlin.reflect.jvm.internal.KProperty1Impl[PropertyDescriptorImpl]

'call' @ [33:47] ==> @Suppress public open fun call(vararg args: Any?): R defined in kotlin.reflect.jvm.internal.KProperty1Impl.Getter[SimpleFunctionDescriptorImpl]

'receiver' @ [33:52] ==> value-parameter receiver: T defined in kotlin.reflect.jvm.internal.KProperty1Impl.get[ValueParameterDescriptorImpl]

'lazy' @ [35:33] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> Field?): Lazy<Field?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field?

'PUBLICATION' @ [35:38] ==> enum entry PUBLICATION defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'computeDelegateField' @ [35:53] ==> protected final fun computeDelegateField(): Field? defined in kotlin.reflect.jvm.internal.KProperty1Impl[SimpleFunctionDescriptorImpl]

'getDelegate' @ [37:51] ==> protected final fun getDelegate(field: Field?, receiver: Any?): Any? defined in kotlin.reflect.jvm.internal.KProperty1Impl[SimpleFunctionDescriptorImpl]

'delegateField' @ [37:63] ==> private final val delegateField: Lazy<Field?> defined in kotlin.reflect.jvm.internal.KProperty1Impl[PropertyDescriptorImpl]

'value' @ [37:77] ==> public abstract val value: Field? defined in kotlin.Lazy[DeserializedPropertyDescriptor]

'receiver' @ [37:84] ==> value-parameter receiver: T defined in kotlin.reflect.jvm.internal.KProperty1Impl.getDelegate[ValueParameterDescriptorImpl]

'get' @ [39:43] ==> public open fun get(receiver: T): R defined in kotlin.reflect.jvm.internal.KProperty1Impl[SimpleFunctionDescriptorImpl]

'receiver' @ [39:47] ==> value-parameter receiver: T defined in kotlin.reflect.jvm.internal.KProperty1Impl.invoke[ValueParameterDescriptorImpl]

'KPropertyImpl.Getter<R>' @ [41:75] ==> public constructor Getter<out R>() defined in kotlin.reflect.jvm.internal.KPropertyImpl.Getter[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> R

'property' @ [42:47] ==> public open val property: KProperty1Impl<T, R> defined in kotlin.reflect.jvm.internal.KProperty1Impl.Getter[PropertyDescriptorImpl]

'get' @ [42:56] ==> public open fun get(receiver: T): R defined in kotlin.reflect.jvm.internal.KProperty1Impl[SimpleFunctionDescriptorImpl]

'receiver' @ [42:60] ==> value-parameter receiver: T defined in kotlin.reflect.jvm.internal.KProperty1Impl.Getter.invoke[ValueParameterDescriptorImpl]

'super' @ [47:111] ==> public constructor KProperty1Impl<T, out R>(container: KDeclarationContainerImpl, name: String, signature: String, boundReceiver: Any?) defined in kotlin.reflect.jvm.internal.KProperty1Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T
    <out R> -> R

'container' @ [47:117] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.<init>[ValueParameterDescriptorImpl]

'name' @ [47:128] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.<init>[ValueParameterDescriptorImpl]

'signature' @ [47:134] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.<init>[ValueParameterDescriptorImpl]

'boundReceiver' @ [47:145] ==> value-parameter boundReceiver: Any? defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.<init>[ValueParameterDescriptorImpl]

'super' @ [49:89] ==> public constructor KProperty1Impl<T, out R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KProperty1Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T
    <out R> -> R

'container' @ [49:95] ==> value-parameter container: KDeclarationContainerImpl defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [49:106] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.<init>[ValueParameterDescriptorImpl]

'lazy' @ [51:45] ==> @NotNull public open fun <T : (Any..Any?)> lazy(@NotNull initializer: () -> (KMutableProperty1Impl.Setter<T, R>..KMutableProperty1Impl.Setter<T, R>?)): ReflectProperties.LazyVal<(KMutableProperty1Impl.Setter<T, R>..KMutableProperty1Impl.Setter<T, R>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Setter<T, R>

'Setter' @ [51:52] ==> public constructor Setter<T, R>(property: KMutableProperty1Impl<T, R>) defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T
    <R> -> R

'this' @ [51:59] ==> <this> defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl[LazyClassReceiverParameterDescriptor]

'invoke' @ [53:47] ==> @Override public open fun invoke(): (KMutableProperty1Impl.Setter<T, R>..KMutableProperty1Impl.Setter<T, R>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazyVal[JavaMethodDescriptor]

'setter' @ [55:47] ==> public open val setter: KMutableProperty1Impl.Setter<T, R> defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl[PropertyDescriptorImpl]

'call' @ [55:54] ==> @Suppress public open fun call(vararg args: Any?): Unit defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter[SimpleFunctionDescriptorImpl]

'receiver' @ [55:59] ==> value-parameter receiver: T defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.set[ValueParameterDescriptorImpl]

'value' @ [55:69] ==> value-parameter value: R defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.set[ValueParameterDescriptorImpl]

'KPropertyImpl.Setter<R>' @ [57:78] ==> public constructor Setter<R>() defined in kotlin.reflect.jvm.internal.KPropertyImpl.Setter[ClassConstructorDescriptorImpl]
Inferred types:
    <R> -> R

'property' @ [58:60] ==> public open val property: KMutableProperty1Impl<T, R> defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter[PropertyDescriptorImpl]

'set' @ [58:69] ==> public open fun set(receiver: T, value: R): Unit defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl[SimpleFunctionDescriptorImpl]

'receiver' @ [58:73] ==> value-parameter receiver: T defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter.invoke[ValueParameterDescriptorImpl]

'value' @ [58:83] ==> value-parameter value: R defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter.invoke[ValueParameterDescriptorImpl]

