'FunctionImportedFromObject' @ [23:9] ==> public constructor FunctionImportedFromObject(functionFromObject: FunctionDescriptor, originalOrNull: FunctionDescriptor? = ...) defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject[ClassConstructorDescriptorImpl]

'this' @ [23:36] ==> <this> defined in org.jetbrains.kotlin.resolve.asImportedFromObject[ReceiverParameterDescriptorImpl]

'original' @ [23:42] ==> value-parameter original: FunctionImportedFromObject? = ... defined in org.jetbrains.kotlin.resolve.asImportedFromObject[ValueParameterDescriptorImpl]

'PropertyImportedFromObject' @ [26:9] ==> public constructor PropertyImportedFromObject(propertyFromObject: PropertyDescriptor, originalOrNull: PropertyDescriptor? = ...) defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject[ClassConstructorDescriptorImpl]

'this' @ [26:36] ==> <this> defined in org.jetbrains.kotlin.resolve.asImportedFromObject[ReceiverParameterDescriptorImpl]

'original' @ [26:42] ==> value-parameter original: PropertyImportedFromObject? = ... defined in org.jetbrains.kotlin.resolve.asImportedFromObject[ValueParameterDescriptorImpl]

'callableFromObject' @ [33:28] ==> public final val callableFromObject: TCallable defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[PropertyDescriptorImpl]

'containingDeclaration' @ [33:47] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'originalOrNull' @ [36:17] ==> private final val originalOrNull: TCallable? defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[PropertyDescriptorImpl]

'this' @ [36:35] ==> <this> defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[LazyClassReceiverParameterDescriptor]

'ImportedFromObjectCallableDescriptor<FunctionDescriptor>' @ [43:5] ==> public constructor ImportedFromObjectCallableDescriptor<out TCallable : CallableMemberDescriptor>(callableFromObject: FunctionDescriptor, originalOrNull: FunctionDescriptor?) defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[ClassConstructorDescriptorImpl]
Inferred types:
    <out TCallable : CallableMemberDescriptor> -> FunctionDescriptor

'functionFromObject' @ [43:62] ==> value-parameter functionFromObject: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject.<init>[ValueParameterDescriptorImpl]

'originalOrNull' @ [43:82] ==> value-parameter originalOrNull: FunctionDescriptor? = ... defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject.<init>[ValueParameterDescriptorImpl]

'functionFromObject' @ [44:31] ==> value-parameter functionFromObject: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject.<init>[ValueParameterDescriptorImpl]

'callableFromObject' @ [49:13] ==> public final val callableFromObject: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject[PropertyDescriptorImpl]

'substitute' @ [49:32] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'substitutor' @ [49:43] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject.substitute[ValueParameterDescriptorImpl]

'asImportedFromObject' @ [49:57] ==> public fun FunctionDescriptor.asImportedFromObject(original: FunctionImportedFromObject? = ...): FunctionImportedFromObject defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]

'this' @ [49:78] ==> <this> defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject[LazyClassReceiverParameterDescriptor]

'_original' @ [51:34] ==> protected final val _original: CallableDescriptor defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [57:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'this' @ [57:79] ==> <this> defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject[LazyClassReceiverParameterDescriptor]

'java' @ [57:91] ==> public val <T> KClass<out FunctionImportedFromObject>.java: Class<out FunctionImportedFromObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FunctionImportedFromObject

'simpleName' @ [57:96] ==> public final val <T : (Any..Any?)> Class<out FunctionImportedFromObject>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FunctionImportedFromObject

'this' @ [57:125] ==> <this> defined in org.jetbrains.kotlin.resolve.FunctionImportedFromObject[LazyClassReceiverParameterDescriptor]

'ImportedFromObjectCallableDescriptor<PropertyDescriptor>' @ [64:5] ==> public constructor ImportedFromObjectCallableDescriptor<out TCallable : CallableMemberDescriptor>(callableFromObject: PropertyDescriptor, originalOrNull: PropertyDescriptor?) defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[ClassConstructorDescriptorImpl]
Inferred types:
    <out TCallable : CallableMemberDescriptor> -> PropertyDescriptor

'propertyFromObject' @ [64:62] ==> value-parameter propertyFromObject: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject.<init>[ValueParameterDescriptorImpl]

'originalOrNull' @ [64:82] ==> value-parameter originalOrNull: PropertyDescriptor? = ... defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject.<init>[ValueParameterDescriptorImpl]

'propertyFromObject' @ [65:31] ==> value-parameter propertyFromObject: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject.<init>[ValueParameterDescriptorImpl]

'callableFromObject' @ [69:61] ==> public final val callableFromObject: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject[PropertyDescriptorImpl]

'substitute' @ [69:80] ==> public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaMethodDescriptor]

'substitutor' @ [69:91] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject.substitute[ValueParameterDescriptorImpl]

'asImportedFromObject' @ [69:105] ==> public fun PropertyDescriptor.asImportedFromObject(original: PropertyImportedFromObject? = ...): PropertyImportedFromObject defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]

'this' @ [69:126] ==> <this> defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject[LazyClassReceiverParameterDescriptor]

'_original' @ [71:34] ==> protected final val _original: CallableDescriptor defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [77:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'this' @ [77:79] ==> <this> defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject[LazyClassReceiverParameterDescriptor]

'java' @ [77:91] ==> public val <T> KClass<out PropertyImportedFromObject>.java: Class<out PropertyImportedFromObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PropertyImportedFromObject

'simpleName' @ [77:96] ==> public final val <T : (Any..Any?)> Class<out PropertyImportedFromObject>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PropertyImportedFromObject

'this' @ [77:125] ==> <this> defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject[LazyClassReceiverParameterDescriptor]

