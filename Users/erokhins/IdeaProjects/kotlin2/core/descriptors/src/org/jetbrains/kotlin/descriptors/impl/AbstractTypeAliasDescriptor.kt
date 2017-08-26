'DeclarationDescriptorNonRootImpl' @ [34:5] ==> protected/*protected and package*/ constructor DeclarationDescriptorNonRootImpl(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull annotations: Annotations, @NotNull name: Name, @NotNull source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.DeclarationDescriptorNonRootImpl[JavaClassConstructorDescriptor]

'containingDeclaration' @ [34:38] ==> value-parameter containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.<init>[ValueParameterDescriptorImpl]

'annotations' @ [34:61] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.<init>[ValueParameterDescriptorImpl]

'name' @ [34:74] ==> value-parameter name: Name defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.<init>[ValueParameterDescriptorImpl]

'sourceElement' @ [34:80] ==> value-parameter sourceElement: SourceElement defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.<init>[ValueParameterDescriptorImpl]

'this' @ [43:9] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[LazyClassReceiverParameterDescriptor]

'declaredTypeParametersImpl' @ [43:14] ==> private final lateinit var declaredTypeParametersImpl: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[PropertyDescriptorImpl]

'declaredTypeParameters' @ [43:43] ==> value-parameter declaredTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.initialize[ValueParameterDescriptorImpl]

'visitor' @ [47:13] ==> value-parameter visitor: DeclarationDescriptorVisitor<R, D> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.accept[ValueParameterDescriptorImpl]

'visitTypeAliasDescriptor' @ [47:21] ==> public abstract fun visitTypeAliasDescriptor(descriptor: (TypeAliasDescriptor..TypeAliasDescriptor?), data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptorVisitor[JavaMethodDescriptor]

'this' @ [47:46] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[LazyClassReceiverParameterDescriptor]

'data' @ [47:52] ==> value-parameter data: D defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.accept[ValueParameterDescriptorImpl]

'contains' @ [53:23] ==> public open fun contains(@Nullable type: KotlinType?, @NotNull isSpecialType: ((UnwrappedType..UnwrappedType?)) -> (Boolean..Boolean?)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'underlyingType' @ [53:32] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[PropertyDescriptorImpl]

'!' @ [54:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [54:18] ==> value-parameter type: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.isInner.<anonymous>[ValueParameterDescriptorImpl]

'isError' @ [54:23] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types in file KotlinType.kt[PropertyDescriptorImpl]

'run' @ [54:34] ==> @InlineOnly public inline fun <T, R> AbstractTypeAliasDescriptor.run(block: AbstractTypeAliasDescriptor.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractTypeAliasDescriptor
    <R> -> Boolean

'type' @ [55:49] ==> value-parameter type: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.isInner.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [55:54] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[PropertyDescriptorImpl]

'declarationDescriptor' @ [55:66] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'constructorDescriptor' @ [56:21] ==> val constructorDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.isInner.<anonymous>.<anonymous>[LocalVariableDescriptor]

'constructorDescriptor' @ [57:21] ==> val constructorDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.isInner.<anonymous>.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [57:43] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'this@AbstractTypeAliasDescriptor' @ [57:68] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[LazyClassReceiverParameterDescriptor]

'this' @ [63:31] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[LazyClassReceiverParameterDescriptor]

'classDescriptor' @ [63:36] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[PropertyDescriptorImpl]

'emptyList' @ [63:62] ==> public fun <T> emptyList(): List<TypeAliasConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasConstructorDescriptor

'classDescriptor' @ [65:16] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.getTypeAliasConstructors[LocalVariableDescriptor]

'constructors' @ [65:32] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'mapNotNull' @ [65:45] ==> public inline fun <T, R : Any> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.mapNotNull(transform: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> TypeAliasConstructorDescriptor?): List<TypeAliasConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)
    <R : Any> -> TypeAliasConstructorDescriptor

'TypeAliasConstructorDescriptorImpl' @ [66:13] ==> public companion object defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl[FakeCallableDescriptorForObject]

'createIfAvailable' @ [66:48] ==> public final fun createIfAvailable(storageManager: StorageManager, typeAliasDescriptor: TypeAliasDescriptor, constructor: ClassConstructorDescriptor): TypeAliasConstructorDescriptor? defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion[SimpleFunctionDescriptorImpl]

'storageManager' @ [66:66] ==> protected abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[PropertyDescriptorImpl]

'this' @ [66:82] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[LazyClassReceiverParameterDescriptor]

'it' @ [66:88] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.getTypeAliasConstructors.<anonymous>[ValueParameterDescriptorImpl]

'declaredTypeParametersImpl' @ [71:13] ==> private final lateinit var declaredTypeParametersImpl: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[PropertyDescriptorImpl]

'Modality' @ [73:34] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [73:43] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'visibilityImpl' @ [75:36] ==> private final val visibilityImpl: Visibility defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[PropertyDescriptorImpl]

'typeConstructor' @ [84:13] ==> private final val typeConstructor: <no name provided> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[PropertyDescriptorImpl]

'name' @ [86:52] ==> public final val AbstractTypeAliasDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [86:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'super' @ [88:55] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[LazyClassReceiverParameterDescriptor]

'getOriginal' @ [88:61] ==> @NotNull @Override public open fun getOriginal(): DeclarationDescriptorWithSource defined in org.jetbrains.kotlin.descriptors.impl.DeclarationDescriptorNonRootImpl[JavaMethodDescriptor]

'makeUnsubstitutedType' @ [93:23] ==> @NotNull public open fun makeUnsubstitutedType(classifierDescriptor: (ClassifierDescriptor..ClassifierDescriptor?), unsubstitutedMemberScope: (MemberScope..MemberScope?)): SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [93:45] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[LazyClassReceiverParameterDescriptor]

'classDescriptor' @ [93:51] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[PropertyDescriptorImpl]

'unsubstitutedMemberScope' @ [93:68] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'MemberScope' @ [93:96] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'Empty' @ [93:108] ==> public object Empty : MemberScopeImpl defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'this@AbstractTypeAliasDescriptor' @ [97:17] ==> <this> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[LazyClassReceiverParameterDescriptor]

'getTypeConstructorTypeParameters' @ [100:17] ==> protected abstract fun getTypeConstructorTypeParameters(): List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [103:17] ==> public final val <no name provided>.declarationDescriptor: TypeAliasDescriptor[MyPropertyDescriptor]

'underlyingType' @ [103:39] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[PropertyDescriptorImpl]

'constructor' @ [103:54] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'supertypes' @ [103:66] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'declarationDescriptor' @ [106:17] ==> public final val <no name provided>.declarationDescriptor: TypeAliasDescriptor[MyPropertyDescriptor]

'underlyingType' @ [106:39] ==> public abstract val underlyingType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[PropertyDescriptorImpl]

'constructor' @ [106:54] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'isFinal' @ [106:66] ==> public final val TypeConstructor.isFinal: Boolean[MyPropertyDescriptor]

'declarationDescriptor' @ [112:17] ==> public final val <no name provided>.declarationDescriptor: TypeAliasDescriptor[MyPropertyDescriptor]

'builtIns' @ [112:39] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'declarationDescriptor' @ [114:57] ==> public final val <no name provided>.declarationDescriptor: TypeAliasDescriptor[MyPropertyDescriptor]

'name' @ [114:79] ==> public final val TypeAliasDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [114:84] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

