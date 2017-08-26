'HashMap' @ [32:35] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> PropertyGetterDescriptor

'when {
            isStaticPropertyInClass(property) ->
                IrSyntheticPropertyGetterDescriptorImpl(property, STATIC_PROPERTY)
            isPropertyInClass(property) ->
                IrSyntheticPropertyGetterDescriptorImpl(property, MEMBER_PROPERTY)
            else ->
                throw AssertionError("Don't know how to create synthetic getter for $property")
        }' @ [35:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PropertyGetterDescriptor, entry1: PropertyGetterDescriptor, entry2: PropertyGetterDescriptor): PropertyGetterDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PropertyGetterDescriptor

'isStaticPropertyInClass' @ [36:13] ==> private final fun isStaticPropertyInClass(propertyDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory[SimpleFunctionDescriptorImpl]

'property' @ [36:37] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateGetter[ValueParameterDescriptorImpl]

'IrSyntheticPropertyGetterDescriptorImpl' @ [37:17] ==> public constructor IrSyntheticPropertyGetterDescriptorImpl(correspondingProperty: PropertyDescriptor, kind: IrSyntheticPropertyAccessorDescriptor.Kind) defined in org.jetbrains.kotlin.ir.descriptors.IrSyntheticPropertyGetterDescriptorImpl[DeserializedClassConstructorDescriptor]

'property' @ [37:57] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateGetter[ValueParameterDescriptorImpl]

'STATIC_PROPERTY' @ [37:67] ==> enum entry STATIC_PROPERTY defined in org.jetbrains.kotlin.ir.descriptors.IrSyntheticPropertyAccessorDescriptor.Kind[FakeCallableDescriptorForObject]

'isPropertyInClass' @ [38:13] ==> private final fun isPropertyInClass(propertyDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory[SimpleFunctionDescriptorImpl]

'property' @ [38:31] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateGetter[ValueParameterDescriptorImpl]

'IrSyntheticPropertyGetterDescriptorImpl' @ [39:17] ==> public constructor IrSyntheticPropertyGetterDescriptorImpl(correspondingProperty: PropertyDescriptor, kind: IrSyntheticPropertyAccessorDescriptor.Kind) defined in org.jetbrains.kotlin.ir.descriptors.IrSyntheticPropertyGetterDescriptorImpl[DeserializedClassConstructorDescriptor]

'property' @ [39:57] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateGetter[ValueParameterDescriptorImpl]

'MEMBER_PROPERTY' @ [39:67] ==> enum entry MEMBER_PROPERTY defined in org.jetbrains.kotlin.ir.descriptors.IrSyntheticPropertyAccessorDescriptor.Kind[FakeCallableDescriptorForObject]

'AssertionError' @ [41:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'property' @ [41:86] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateGetter[ValueParameterDescriptorImpl]

'HashMap' @ [45:35] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> PropertySetterDescriptor

'when {
            isStaticPropertyInClass(property) ->
                IrSyntheticPropertySetterDescriptorImpl(property, STATIC_PROPERTY)
            isPropertyInClass(property) ->
                IrSyntheticPropertySetterDescriptorImpl(property, MEMBER_PROPERTY)
            else ->
                throw AssertionError("Don't know how to create synthetic setter for $property")
        }' @ [48:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PropertySetterDescriptor, entry1: PropertySetterDescriptor, entry2: PropertySetterDescriptor): PropertySetterDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PropertySetterDescriptor

'isStaticPropertyInClass' @ [49:13] ==> private final fun isStaticPropertyInClass(propertyDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory[SimpleFunctionDescriptorImpl]

'property' @ [49:37] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateSetter[ValueParameterDescriptorImpl]

'IrSyntheticPropertySetterDescriptorImpl' @ [50:17] ==> public constructor IrSyntheticPropertySetterDescriptorImpl(correspondingProperty: PropertyDescriptor, kind: IrSyntheticPropertyAccessorDescriptor.Kind) defined in org.jetbrains.kotlin.ir.descriptors.IrSyntheticPropertySetterDescriptorImpl[DeserializedClassConstructorDescriptor]

'property' @ [50:57] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateSetter[ValueParameterDescriptorImpl]

'STATIC_PROPERTY' @ [50:67] ==> enum entry STATIC_PROPERTY defined in org.jetbrains.kotlin.ir.descriptors.IrSyntheticPropertyAccessorDescriptor.Kind[FakeCallableDescriptorForObject]

'isPropertyInClass' @ [51:13] ==> private final fun isPropertyInClass(propertyDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory[SimpleFunctionDescriptorImpl]

'property' @ [51:31] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateSetter[ValueParameterDescriptorImpl]

'IrSyntheticPropertySetterDescriptorImpl' @ [52:17] ==> public constructor IrSyntheticPropertySetterDescriptorImpl(correspondingProperty: PropertyDescriptor, kind: IrSyntheticPropertyAccessorDescriptor.Kind) defined in org.jetbrains.kotlin.ir.descriptors.IrSyntheticPropertySetterDescriptorImpl[DeserializedClassConstructorDescriptor]

'property' @ [52:57] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateSetter[ValueParameterDescriptorImpl]

'MEMBER_PROPERTY' @ [52:67] ==> enum entry MEMBER_PROPERTY defined in org.jetbrains.kotlin.ir.descriptors.IrSyntheticPropertyAccessorDescriptor.Kind[FakeCallableDescriptorForObject]

'AssertionError' @ [54:23] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'property' @ [54:86] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.generateSetter[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [59:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.isStaticPropertyInClass[ValueParameterDescriptorImpl]

'containingDeclaration' @ [59:32] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'propertyDescriptor' @ [60:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.isStaticPropertyInClass[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [60:32] ==> public final val PropertyDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'propertyDescriptor' @ [61:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.isStaticPropertyInClass[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [61:32] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'propertyDescriptor' @ [64:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.isPropertyInClass[ValueParameterDescriptorImpl]

'containingDeclaration' @ [64:32] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'propertyGetters' @ [67:13] ==> private final val propertyGetters: HashMap<PropertyDescriptor, PropertyGetterDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory[PropertyDescriptorImpl]

'getOrPut' @ [67:29] ==> public inline fun <K, V> MutableMap<PropertyDescriptor, PropertyGetterDescriptor>.getOrPut(key: PropertyDescriptor, defaultValue: () -> PropertyGetterDescriptor): PropertyGetterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PropertyDescriptor
    <V> -> PropertyGetterDescriptor

'propertyDescriptor' @ [67:38] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.getOrCreatePropertyGetter[ValueParameterDescriptorImpl]

'generateGetter' @ [67:60] ==> private final fun generateGetter(property: PropertyDescriptor): PropertyGetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [67:75] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.getOrCreatePropertyGetter[ValueParameterDescriptorImpl]

'propertySetters' @ [70:13] ==> private final val propertySetters: HashMap<PropertyDescriptor, PropertySetterDescriptor> defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory[PropertyDescriptorImpl]

'getOrPut' @ [70:29] ==> public inline fun <K, V> MutableMap<PropertyDescriptor, PropertySetterDescriptor>.getOrPut(key: PropertyDescriptor, defaultValue: () -> PropertySetterDescriptor): PropertySetterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PropertyDescriptor
    <V> -> PropertySetterDescriptor

'propertyDescriptor' @ [70:38] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.getOrCreatePropertySetter[ValueParameterDescriptorImpl]

'generateSetter' @ [70:60] ==> private final fun generateSetter(property: PropertyDescriptor): PropertySetterDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [70:75] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.psi2ir.generators.SyntheticDescriptorsFactory.getOrCreatePropertySetter[ValueParameterDescriptorImpl]

