'NotNullVar' @ [14:65] ==> public constructor NotNullVar<T : Any>() defined in kotlin.properties.NotNullVar[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'ObservableProperty<T>' @ [23:47] ==> public constructor ObservableProperty<T>(initialValue: T) defined in kotlin.properties.ObservableProperty[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'initialValue' @ [23:69] ==> value-parameter initialValue: T defined in kotlin.properties.Delegates.observable[ValueParameterDescriptorImpl]

'invoke' @ [24:90] ==> public abstract operator fun invoke(property: @ParameterName KProperty<*>, oldValue: @ParameterName T, newValue: @ParameterName T): Unit defined in kotlin.Function3[FunctionInvokeDescriptor]

'property' @ [24:99] ==> value-parameter property: KProperty<*> defined in kotlin.properties.Delegates.observable.<no name provided>.afterChange[ValueParameterDescriptorImpl]

'oldValue' @ [24:109] ==> value-parameter oldValue: T defined in kotlin.properties.Delegates.observable.<no name provided>.afterChange[ValueParameterDescriptorImpl]

'newValue' @ [24:119] ==> value-parameter newValue: T defined in kotlin.properties.Delegates.observable.<no name provided>.afterChange[ValueParameterDescriptorImpl]

'ObservableProperty<T>' @ [37:47] ==> public constructor ObservableProperty<T>(initialValue: T) defined in kotlin.properties.ObservableProperty[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'initialValue' @ [37:69] ==> value-parameter initialValue: T defined in kotlin.properties.Delegates.vetoable[ValueParameterDescriptorImpl]

'invoke' @ [38:100] ==> public abstract operator fun invoke(property: @ParameterName KProperty<*>, oldValue: @ParameterName T, newValue: @ParameterName T): Boolean defined in kotlin.Function3[FunctionInvokeDescriptor]

'property' @ [38:109] ==> value-parameter property: KProperty<*> defined in kotlin.properties.Delegates.vetoable.<no name provided>.beforeChange[ValueParameterDescriptorImpl]

'oldValue' @ [38:119] ==> value-parameter oldValue: T defined in kotlin.properties.Delegates.vetoable.<no name provided>.beforeChange[ValueParameterDescriptorImpl]

'newValue' @ [38:129] ==> value-parameter newValue: T defined in kotlin.properties.Delegates.vetoable.<no name provided>.beforeChange[ValueParameterDescriptorImpl]

'value' @ [48:16] ==> private final var value: T? defined in kotlin.properties.NotNullVar[PropertyDescriptorImpl]

'IllegalStateException' @ [48:31] ==> public constructor IllegalStateException(message: String? = ...) defined in kotlin.IllegalStateException[ClassConstructorDescriptorImpl]

'property' @ [48:65] ==> value-parameter property: KProperty<*> defined in kotlin.properties.NotNullVar.getValue[ValueParameterDescriptorImpl]

'name' @ [48:74] ==> public abstract val name: String defined in kotlin.reflect.KProperty[PropertyDescriptorImpl]

'this' @ [52:9] ==> <this> defined in kotlin.properties.NotNullVar[LazyClassReceiverParameterDescriptor]

'value' @ [52:14] ==> private final var value: T? defined in kotlin.properties.NotNullVar[PropertyDescriptorImpl]

'value' @ [52:22] ==> value-parameter value: T defined in kotlin.properties.NotNullVar.setValue[ValueParameterDescriptorImpl]

