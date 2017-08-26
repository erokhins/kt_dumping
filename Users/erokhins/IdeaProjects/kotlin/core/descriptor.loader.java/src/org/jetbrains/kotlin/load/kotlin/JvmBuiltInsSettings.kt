'JavaToKotlinClassMap' @ [61:31] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform in file JavaToKotlinClassMap.kt[FakeCallableDescriptorForObject]

'getValue' @ [63:60] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'deferredOwnerModuleDescriptor' @ [63:65] ==> value-parameter deferredOwnerModuleDescriptor: () -> ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.<init>[ValueParameterDescriptorImpl]

'getValue' @ [64:66] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'isAdditionalBuiltInsFeatureSupported' @ [64:71] ==> value-parameter isAdditionalBuiltInsFeatureSupported: () -> Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [66:40] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.<init>[ValueParameterDescriptorImpl]

'createMockJavaIoSerializableType' @ [66:55] ==> private final fun StorageManager.createMockJavaIoSerializableType(): KotlinType defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'storageManager' @ [67:34] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [67:49] ==> public abstract fun <T : Any> createLazyValue(computable: () -> SimpleType): NotNullLazyValue<SimpleType> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> SimpleType

'ownerModuleDescriptor' @ [68:9] ==> private final val ownerModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'findNonGenericClassAcrossDependencies' @ [68:31] ==> public fun ModuleDescriptor.findNonGenericClassAcrossDependencies(classId: ClassId, notFoundClasses: NotFoundClasses): ClassDescriptor defined in org.jetbrains.kotlin.descriptors in file findClassInModule.kt[SimpleFunctionDescriptorImpl]

'CLONEABLE_CLASS_ID' @ [69:50] ==> public final val CLONEABLE_CLASS_ID: ClassId defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.Companion[PropertyDescriptorImpl]

'NotFoundClasses' @ [70:17] ==> public constructor NotFoundClasses(storageManager: StorageManager, module: ModuleDescriptor) defined in org.jetbrains.kotlin.descriptors.NotFoundClasses[ClassConstructorDescriptorImpl]

'storageManager' @ [70:33] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.<init>[ValueParameterDescriptorImpl]

'ownerModuleDescriptor' @ [70:49] ==> private final val ownerModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'defaultType' @ [71:11] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'storageManager' @ [74:63] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.<init>[ValueParameterDescriptorImpl]

'createCacheWithNotNullValues' @ [74:78] ==> public abstract fun <K, V : Any> createCacheWithNotNullValues(): CacheWithNotNullValues<FqName, ClassDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> FqName
    <V : Any> -> ClassDescriptor

'storageManager' @ [77:45] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [77:60] ==> public abstract fun <T : Any> createLazyValue(computable: () -> AnnotationsImpl): NotNullLazyValue<AnnotationsImpl> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> AnnotationsImpl

'moduleDescriptor' @ [78:9] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'builtIns' @ [78:26] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'createDeprecatedAnnotation' @ [78:35] ==> public fun KotlinBuiltIns.createDeprecatedAnnotation(message: String, replaceWith: String = ..., level: String = ...): AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations in file annotationUtil.kt[SimpleFunctionDescriptorImpl]

'let' @ [80:11] ==> @InlineOnly public inline fun <T, R> AnnotationDescriptor.let(block: (AnnotationDescriptor) -> AnnotationsImpl): AnnotationsImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> AnnotationsImpl

'AnnotationsImpl' @ [80:17] ==> public constructor AnnotationsImpl(annotations: List<AnnotationDescriptor>) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationsImpl[ClassConstructorDescriptorImpl]

'listOf' @ [80:33] ==> public fun <T> listOf(element: AnnotationDescriptor): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'it' @ [80:40] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.notConsideredDeprecation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'PackageFragmentDescriptorImpl' @ [84:50] ==> public constructor PackageFragmentDescriptorImpl(module: ModuleDescriptor, fqName: FqName) defined in org.jetbrains.kotlin.descriptors.impl.PackageFragmentDescriptorImpl[ClassConstructorDescriptorImpl]

'moduleDescriptor' @ [84:80] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'FqName' @ [84:98] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'MemberScope' @ [85:45] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'Empty' @ [85:57] ==> public object Empty : MemberScopeImpl defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'listOf' @ [89:26] ==> public fun <T> listOf(element: LazyWrappedType): List<LazyWrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LazyWrappedType

'LazyWrappedType' @ [89:33] ==> public constructor LazyWrappedType(storageManager: StorageManager, computation: () -> KotlinType) defined in org.jetbrains.kotlin.types.LazyWrappedType[ClassConstructorDescriptorImpl]

'this' @ [89:49] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.createMockJavaIoSerializableType[ReceiverParameterDescriptorImpl]

'moduleDescriptor' @ [89:57] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'builtIns' @ [89:74] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'anyType' @ [89:83] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'ClassDescriptorImpl' @ [91:37] ==> public constructor ClassDescriptorImpl(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull name: Name, @NotNull modality: Modality, @NotNull kind: ClassKind, @NotNull supertypes: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>), @NotNull source: SourceElement, isExternal: Boolean) defined in org.jetbrains.kotlin.descriptors.impl.ClassDescriptorImpl[JavaClassConstructorDescriptor]

'mockJavaIoPackageFragment' @ [92:17] ==> val mockJavaIoPackageFragment: <no name provided> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.createMockJavaIoSerializableType[LocalVariableDescriptor]

'identifier' @ [92:49] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ABSTRACT' @ [92:86] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'INTERFACE' @ [92:106] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'superTypes' @ [92:117] ==> val superTypes: List<LazyWrappedType> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.createMockJavaIoSerializableType[LocalVariableDescriptor]

'NO_SOURCE' @ [93:31] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'mockSerializableClass' @ [96:9] ==> val mockSerializableClass: ClassDescriptorImpl defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.createMockJavaIoSerializableType[LocalVariableDescriptor]

'initialize' @ [96:31] ==> public final fun initialize(@NotNull unsubstitutedMemberScope: MemberScope, @NotNull constructors: (MutableSet<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>..Set<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>), @Nullable primaryConstructor: ClassConstructorDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.ClassDescriptorImpl[JavaMethodDescriptor]

'Empty' @ [96:54] ==> public object Empty : MemberScopeImpl defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'emptySet' @ [96:61] ==> public fun <T> emptySet(): Set<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'mockSerializableClass' @ [97:16] ==> val mockSerializableClass: ClassDescriptorImpl defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.createMockJavaIoSerializableType[LocalVariableDescriptor]

'defaultType' @ [97:38] ==> public final val ClassDescriptorImpl.defaultType: SimpleType[MyPropertyDescriptor]

'classDescriptor' @ [101:22] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getSupertypes[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [101:38] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'when {
            isArrayOrPrimitiveArray(fqName) -> listOf(cloneableType, mockSerializableType)
            isSerializableInJava(fqName) -> listOf(mockSerializableType)
            else -> listOf()
        }' @ [102:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<KotlinType>, entry1: Collection<KotlinType>, entry2: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<KotlinType>

'isArrayOrPrimitiveArray' @ [103:13] ==> private final fun isArrayOrPrimitiveArray(fqName: FqNameUnsafe): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[SimpleFunctionDescriptorImpl]

'fqName' @ [103:37] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getSupertypes[LocalVariableDescriptor]

'listOf' @ [103:48] ==> public fun <T> listOf(vararg elements: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'cloneableType' @ [103:55] ==> private final val cloneableType: SimpleType defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'mockSerializableType' @ [103:70] ==> private final val mockSerializableType: KotlinType defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'isSerializableInJava' @ [104:13] ==> public final fun isSerializableInJava(fqName: FqNameUnsafe): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[SimpleFunctionDescriptorImpl]

'fqName' @ [104:34] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getSupertypes[LocalVariableDescriptor]

'listOf' @ [104:45] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'mockSerializableType' @ [104:52] ==> private final val mockSerializableType: KotlinType defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'listOf' @ [105:21] ==> @InlineOnly public inline fun <T> listOf(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'name' @ [110:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'CLONE_NAME' @ [110:41] ==> internal final val CLONE_NAME: Name defined in org.jetbrains.kotlin.builtins.CloneableClassScope.Companion[PropertyDescriptorImpl]

'classDescriptor' @ [110:55] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'isArrayOrPrimitiveArray' @ [111:28] ==> public open fun isArrayOrPrimitiveArray(@NotNull descriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'classDescriptor' @ [111:52] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'classDescriptor' @ [113:17] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'classProto' @ [113:33] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[PropertyDescriptorImpl]

'functionList' @ [113:44] ==> public final val ProtoBuf.Class.functionList: (MutableList<(ProtoBuf.Function..ProtoBuf.Function?)>..List<(ProtoBuf.Function..ProtoBuf.Function?)>?)[MyPropertyDescriptor]

'any' @ [113:57] ==> public inline fun <T> Iterable<(ProtoBuf.Function..ProtoBuf.Function?)>.any(predicate: ((ProtoBuf.Function..ProtoBuf.Function?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Function..org.jetbrains.kotlin.serialization.ProtoBuf.Function?)

'classDescriptor' @ [114:17] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'c' @ [114:33] ==> public final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[PropertyDescriptorImpl]

'nameResolver' @ [114:35] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getName' @ [114:48] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'functionProto' @ [114:56] ==> value-parameter functionProto: (ProtoBuf.Function..ProtoBuf.Function?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [114:70] ==> public final val ProtoBuf.Function.name: Int[MyPropertyDescriptor]

'CLONE_NAME' @ [114:99] ==> internal final val CLONE_NAME: Name defined in org.jetbrains.kotlin.builtins.CloneableClassScope.Companion[PropertyDescriptorImpl]

'emptyList' @ [116:24] ==> public fun <T> emptyList(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'listOf' @ [118:20] ==> public fun <T> listOf(element: SimpleFunctionDescriptor): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'createCloneForArray' @ [118:27] ==> private final fun createCloneForArray(arrayClassDescriptor: DeserializedClassDescriptor, cloneFromCloneable: SimpleFunctionDescriptor): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [119:21] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'cloneableType' @ [119:38] ==> private final val cloneableType: SimpleType defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'memberScope' @ [119:52] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'getContributedFunctions' @ [119:64] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [119:88] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'FROM_BUILTINS' @ [119:111] ==> enum entry FROM_BUILTINS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'single' @ [119:126] ==> public fun <T> Iterable<SimpleFunctionDescriptor>.single(): SimpleFunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'!' @ [123:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAdditionalBuiltInsFeatureSupported' @ [123:14] ==> private final val isAdditionalBuiltInsFeatureSupported: Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'emptyList' @ [123:59] ==> public fun <T> emptyList(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'getAdditionalFunctions' @ [125:16] ==> private final fun getAdditionalFunctions(classDescriptor: ClassDescriptor, functionsByScope: (MemberScope) -> Collection<SimpleFunctionDescriptor>): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [125:39] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'it' @ [126:13] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions.<anonymous>[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [126:16] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [126:40] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'FROM_BUILTINS' @ [126:63] ==> enum entry FROM_BUILTINS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'mapNotNull' @ [127:11] ==> public inline fun <T, R : Any> Iterable<SimpleFunctionDescriptor>.mapNotNull(transform: (SimpleFunctionDescriptor) -> SimpleFunctionDescriptor?): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R : Any> -> SimpleFunctionDescriptor

'additionalMember' @ [130:21] ==> value-parameter additionalMember: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions.<anonymous>[ValueParameterDescriptorImpl]

'substitute' @ [130:38] ==> @Nullable @Override public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[JavaMethodDescriptor]

'createMappedTypeParametersSubstitution' @ [131:29] ==> public fun createMappedTypeParametersSubstitution(from: ClassDescriptor, to: ClassDescriptor): TypeConstructorSubstitution defined in org.jetbrains.kotlin.platform in file mappingUtil.kt[SimpleFunctionDescriptorImpl]

'additionalMember' @ [132:37] ==> value-parameter additionalMember: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [132:54] ==> public final val SimpleFunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classDescriptor' @ [132:96] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'buildSubstitutor' @ [132:113] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[SimpleFunctionDescriptorImpl]

'substitutedWithKotlinTypeParameters' @ [135:13] ==> val substitutedWithKotlinTypeParameters: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions.<anonymous>[LocalVariableDescriptor]

'newCopyBuilder' @ [135:49] ==> @NotNull @Override public abstract fun newCopyBuilder(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[JavaMethodDescriptor]

'apply' @ [135:66] ==> @InlineOnly public inline fun <T> FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>.apply(block: (FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>).() -> Unit): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CopyBuilder<out (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)>

'setOwner' @ [136:17] ==> @NotNull @Override public abstract fun setOwner(@NotNull owner: DeclarationDescriptor): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'classDescriptor' @ [136:26] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'setDispatchReceiverParameter' @ [137:17] ==> @NotNull @Override public abstract fun setDispatchReceiverParameter(@Nullable dispatchReceiverParameter: ReceiverParameterDescriptor?): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'classDescriptor' @ [137:46] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'thisAsReceiverParameter' @ [137:62] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'setPreserveSourceElement' @ [138:17] ==> @NotNull public abstract fun setPreserveSourceElement(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'setSubstitution' @ [139:17] ==> @NotNull @Override public abstract fun setSubstitution(@NotNull substitution: TypeSubstitution): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'UnsafeVarianceTypeSubstitution' @ [139:33] ==> public constructor UnsafeVarianceTypeSubstitution(builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[ClassConstructorDescriptorImpl]

'moduleDescriptor' @ [139:64] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'builtIns' @ [139:81] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'additionalMember' @ [141:36] ==> value-parameter additionalMember: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions.<anonymous>[ValueParameterDescriptorImpl]

'getJdkMethodStatus' @ [141:53] ==> private final fun FunctionDescriptor.getJdkMethodStatus(): JvmBuiltInsSettings.JDKMemberStatus defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'when (memberStatus) {
                    JDKMemberStatus.BLACK_LIST -> {
                        // Black list methods in final class can't be overridden or called with 'super'
                        if (classDescriptor.isFinalClass) return@mapNotNull null
                        setHiddenForResolutionEverywhereBesideSupercalls()
                    }

                    JDKMemberStatus.NOT_CONSIDERED -> {
                        setAdditionalAnnotations(notConsideredDeprecation)
                    }

                    JDKMemberStatus.DROP -> return@mapNotNull null

                    JDKMemberStatus.WHITE_LIST -> Unit // Do nothing
                }' @ [142:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'memberStatus' @ [142:23] ==> val memberStatus: JvmBuiltInsSettings.JDKMemberStatus defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions.<anonymous>.<anonymous>[LocalVariableDescriptor]

'BLACK_LIST' @ [143:37] ==> enum entry BLACK_LIST defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.JDKMemberStatus[FakeCallableDescriptorForObject]

'classDescriptor' @ [145:29] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctions[ValueParameterDescriptorImpl]

'isFinalClass' @ [145:45] ==> public val ClassDescriptor.isFinalClass: Boolean defined in org.jetbrains.kotlin.descriptors in file Modality.kt[PropertyDescriptorImpl]

'setHiddenForResolutionEverywhereBesideSupercalls' @ [146:25] ==> @NotNull public abstract fun setHiddenForResolutionEverywhereBesideSupercalls(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'NOT_CONSIDERED' @ [149:37] ==> enum entry NOT_CONSIDERED defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.JDKMemberStatus[FakeCallableDescriptorForObject]

'setAdditionalAnnotations' @ [150:25] ==> @NotNull public abstract fun setAdditionalAnnotations(@NotNull additionalAnnotations: Annotations): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'notConsideredDeprecation' @ [150:50] ==> private final val notConsideredDeprecation: AnnotationsImpl defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'DROP' @ [153:37] ==> enum entry DROP defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.JDKMemberStatus[FakeCallableDescriptorForObject]

'WHITE_LIST' @ [155:37] ==> enum entry WHITE_LIST defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.JDKMemberStatus[FakeCallableDescriptorForObject]

'Unit' @ [155:51] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'build' @ [158:15] ==> @Nullable @Override public abstract fun build(): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'!' @ [163:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAdditionalBuiltInsFeatureSupported' @ [163:14] ==> private final val isAdditionalBuiltInsFeatureSupported: Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'emptySet' @ [163:59] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'classDescriptor' @ [166:16] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getFunctionsNames[ValueParameterDescriptorImpl]

'getJavaAnalogue' @ [166:32] ==> private final fun ClassDescriptor.getJavaAnalogue(): LazyJavaClassDescriptor? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'unsubstitutedMemberScope' @ [166:51] ==> public final val LazyJavaClassDescriptor.unsubstitutedMemberScope: LazyJavaClassMemberScope[MyPropertyDescriptor]

'getFunctionNames' @ [166:77] ==> public open fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'emptySet' @ [166:99] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'classDescriptor' @ [173:38] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[ValueParameterDescriptorImpl]

'getJavaAnalogue' @ [173:54] ==> private final fun ClassDescriptor.getJavaAnalogue(): LazyJavaClassDescriptor? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'emptyList' @ [173:82] ==> public fun <T> emptyList(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'j2kClassMap' @ [175:38] ==> private final val j2kClassMap: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'mapPlatformClass' @ [175:50] ==> public final fun mapPlatformClass(fqName: FqName, builtIns: KotlinBuiltIns): Collection<ClassDescriptor> defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'javaAnalogueDescriptor' @ [175:67] ==> val javaAnalogueDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'fqNameSafe' @ [175:90] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'Instance' @ [175:119] ==> @JvmStatic public final val Instance: KotlinBuiltIns defined in org.jetbrains.kotlin.load.kotlin.FallbackBuiltIns.Companion[PropertyDescriptorImpl]

'kotlinClassDescriptors' @ [176:45] ==> val kotlinClassDescriptors: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'lastOrNull' @ [176:68] ==> public fun <T> Iterable<ClassDescriptor>.lastOrNull(): ClassDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'emptyList' @ [176:91] ==> public fun <T> emptyList(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'SmartSet' @ [177:30] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [177:39] ==> @JvmStatic public final fun <T> create(set: Collection<FqName>): SmartSet<FqName> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> FqName

'kotlinClassDescriptors' @ [177:46] ==> val kotlinClassDescriptors: Collection<ClassDescriptor> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'map' @ [177:69] ==> public inline fun <T, R> Iterable<ClassDescriptor>.map(transform: (ClassDescriptor) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> FqName

'it' @ [177:75] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions.<anonymous>[ValueParameterDescriptorImpl]

'fqNameSafe' @ [177:78] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'j2kClassMap' @ [179:25] ==> private final val j2kClassMap: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'isMutable' @ [179:37] ==> public final fun isMutable(mutable: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [179:47] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[ValueParameterDescriptorImpl]

'javaAnalogueClassesWithCustomSupertypeCache' @ [181:39] ==> private final val javaAnalogueClassesWithCustomSupertypeCache: CacheWithNotNullValues<FqName, ClassDescriptor> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'computeIfAbsent' @ [181:83] ==> public abstract fun computeIfAbsent(key: FqName, computation: () -> ClassDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.storage.CacheWithNotNullValues[SimpleFunctionDescriptorImpl]

'javaAnalogueDescriptor' @ [181:99] ==> val javaAnalogueDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'fqNameSafe' @ [181:122] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'javaAnalogueDescriptor' @ [182:13] ==> val javaAnalogueDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'copy' @ [182:36] ==> internal final fun copy(javaResolverCache: JavaResolverCache, additionalSupertypeClassDescriptor: ClassDescriptor?): LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[SimpleFunctionDescriptorImpl]

'EMPTY' @ [183:59] ==> public final val EMPTY: (JavaResolverCache..JavaResolverCache?) defined in org.jetbrains.kotlin.load.java.components.JavaResolverCache[JavaPropertyDescriptor]

'kotlinMutableClassIfContainer' @ [184:58] ==> val kotlinMutableClassIfContainer: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'fakeJavaClassDescriptor' @ [187:21] ==> val fakeJavaClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [187:45] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'invoke' @ [189:16] ==> public abstract operator fun invoke(p1: MemberScope): Collection<SimpleFunctionDescriptor> defined in kotlin.Function1[FunctionInvokeDescriptor]

'scope' @ [189:33] ==> val scope: MemberScope defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'filter' @ [190:18] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.filter(predicate: (SimpleFunctionDescriptor) -> Boolean): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'analogueMember' @ [191:25] ==> value-parameter analogueMember: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [191:40] ==> public final val SimpleFunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [191:78] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'!' @ [192:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'analogueMember' @ [192:26] ==> value-parameter analogueMember: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [192:41] ==> public final val SimpleFunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'isPublicAPI' @ [192:52] ==> public final val isPublicAPI: Boolean defined in org.jetbrains.kotlin.descriptors.Visibility[PropertyDescriptorImpl]

'isDeprecated' @ [193:40] ==> public open fun isDeprecated(@NotNull declarationDescriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'analogueMember' @ [193:53] ==> value-parameter analogueMember: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions.<anonymous>[ValueParameterDescriptorImpl]

'analogueMember' @ [195:25] ==> value-parameter analogueMember: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [195:40] ==> public final var SimpleFunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'any' @ [195:62] ==> public inline fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.any(predicate: ((FunctionDescriptor..FunctionDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'it' @ [196:25] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [196:28] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'fqNameSafe' @ [196:50] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'kotlinVersions' @ [196:64] ==> val kotlinVersions: SmartSet<FqName> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'!' @ [199:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'analogueMember' @ [199:22] ==> value-parameter analogueMember: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions.<anonymous>[ValueParameterDescriptorImpl]

'isMutabilityViolation' @ [199:37] ==> private final fun SimpleFunctionDescriptor.isMutabilityViolation(isMutable: Boolean): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'isMutable' @ [199:59] ==> val isMutable: Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getAdditionalFunctions[LocalVariableDescriptor]

'cloneFromCloneable' @ [206:35] ==> value-parameter cloneFromCloneable: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.createCloneForArray[ValueParameterDescriptorImpl]

'newCopyBuilder' @ [206:54] ==> @NotNull @Override public abstract fun newCopyBuilder(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[JavaMethodDescriptor]

'apply' @ [206:71] ==> @InlineOnly public inline fun <T> FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>.apply(block: (FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>).() -> Unit): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CopyBuilder<out (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)>

'setOwner' @ [207:9] ==> @NotNull @Override public abstract fun setOwner(@NotNull owner: DeclarationDescriptor): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'arrayClassDescriptor' @ [207:18] ==> value-parameter arrayClassDescriptor: DeserializedClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.createCloneForArray[ValueParameterDescriptorImpl]

'setVisibility' @ [208:9] ==> @NotNull @Override public abstract fun setVisibility(@NotNull visibility: Visibility): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'PUBLIC' @ [208:36] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'setReturnType' @ [209:9] ==> @NotNull public abstract fun setReturnType(@NotNull type: KotlinType): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'arrayClassDescriptor' @ [209:23] ==> value-parameter arrayClassDescriptor: DeserializedClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.createCloneForArray[ValueParameterDescriptorImpl]

'defaultType' @ [209:44] ==> public final val DeserializedClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'setDispatchReceiverParameter' @ [210:9] ==> @NotNull @Override public abstract fun setDispatchReceiverParameter(@Nullable dispatchReceiverParameter: ReceiverParameterDescriptor?): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'arrayClassDescriptor' @ [210:38] ==> value-parameter arrayClassDescriptor: DeserializedClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.createCloneForArray[ValueParameterDescriptorImpl]

'thisAsReceiverParameter' @ [210:59] ==> public final val DeserializedClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'build' @ [211:7] ==> @Nullable @Override public abstract fun build(): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'containingDeclaration' @ [214:21] ==> public final val SimpleFunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'computeJvmDescriptor' @ [215:29] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureMapping.kt[SimpleFunctionDescriptorImpl]

'xor' @ [217:13] ==> public final infix fun xor(other: Boolean): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'in' @ [217:14] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'signature' @ [217:42] ==> public final fun signature(classDescriptor: ClassDescriptor, jvmDescriptor: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'owner' @ [217:52] ==> val owner: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isMutabilityViolation[LocalVariableDescriptor]

'jvmDescriptor' @ [217:59] ==> val jvmDescriptor: String defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isMutabilityViolation[LocalVariableDescriptor]

'MUTABLE_METHOD_SIGNATURES' @ [217:77] ==> public final val MUTABLE_METHOD_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[PropertyDescriptorImpl]

'isMutable' @ [217:108] ==> value-parameter isMutable: Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isMutabilityViolation[ValueParameterDescriptorImpl]

'ifAny' @ [219:20] ==> public final fun <N : (Any..Any?)> ifAny(@NotNull nodes: (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull neighbors: (current: (CallableMemberDescriptor..CallableMemberDescriptor?)) -> (MutableIterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> (Boolean..Boolean?)): (Boolean..Boolean?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> CallableMemberDescriptor

'listOf' @ [220:17] ==> public fun <T> listOf(element: SimpleFunctionDescriptor): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'this' @ [220:24] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isMutabilityViolation[ReceiverParameterDescriptorImpl]

'it' @ [221:19] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isMutabilityViolation.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [221:22] ==> public final val CallableMemberDescriptor.original: CallableMemberDescriptor[MyPropertyDescriptor]

'overriddenDescriptors' @ [221:31] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'overridden' @ [224:13] ==> value-parameter overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isMutabilityViolation.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [224:24] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [224:62] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'j2kClassMap' @ [225:17] ==> private final val j2kClassMap: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'isMutable' @ [225:29] ==> public final fun isMutable(mutable: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'overridden' @ [225:39] ==> value-parameter overridden: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isMutabilityViolation.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [225:50] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclaration' @ [230:21] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'computeJvmDescriptor' @ [231:29] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureMapping.kt[SimpleFunctionDescriptorImpl]

'dfs' @ [233:20] ==> public final fun <N : (Any..Any?), R : (Any..Any?)> dfs(@NotNull nodes: (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>), @NotNull neighbors: (current: (ClassDescriptor..ClassDescriptor?)) -> (MutableIterable<(ClassDescriptor..ClassDescriptor?)>..Iterable<(ClassDescriptor..ClassDescriptor?)>), @NotNull handler: DFS.NodeHandler<(ClassDescriptor..ClassDescriptor?), (JvmBuiltInsSettings.JDKMemberStatus..JvmBuiltInsSettings.JDKMemberStatus?)>): (JvmBuiltInsSettings.JDKMemberStatus..JvmBuiltInsSettings.JDKMemberStatus?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> ClassDescriptor
    <R : (Any..Any?)> -> JDKMemberStatus

'listOf' @ [234:17] ==> public fun <T> listOf(element: ClassDescriptor): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'owner' @ [234:24] ==> val owner: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus[LocalVariableDescriptor]

'it' @ [239:21] ==> value-parameter it: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus.<anonymous>[ValueParameterDescriptorImpl]

'typeConstructor' @ [239:24] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [239:40] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'mapNotNull' @ [239:51] ==> public inline fun <T, R : Any> Iterable<(KotlinType..KotlinType?)>.mapNotNull(transform: ((KotlinType..KotlinType?)) -> LazyJavaClassDescriptor?): List<LazyJavaClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R : Any> -> LazyJavaClassDescriptor

'it' @ [240:26] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [240:29] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [240:41] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'original' @ [240:64] ==> public final val ClassifierDescriptor.original: ClassifierDescriptor[MyPropertyDescriptor]

'getJavaAnalogue' @ [240:95] ==> private final fun ClassDescriptor.getJavaAnalogue(): LazyJavaClassDescriptor? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>' @ [243:26] ==> public constructor AbstractNodeHandler<N : (Any..Any?), R : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.DFS.AbstractNodeHandler[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> ClassDescriptor
    <R : (Any..Any?)> -> JDKMemberStatus

'SignatureBuildingComponents' @ [245:41] ==> public object SignatureBuildingComponents defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureBuilding.kt[FakeCallableDescriptorForObject]

'signature' @ [245:69] ==> public final fun signature(classDescriptor: ClassDescriptor, jvmDescriptor: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaClassDescriptor' @ [245:79] ==> value-parameter javaClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus.<no name provided>.beforeChildren[ValueParameterDescriptorImpl]

'jvmDescriptor' @ [245:100] ==> val jvmDescriptor: String defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus[LocalVariableDescriptor]

'when (signature) {
                            in BLACK_LIST_METHOD_SIGNATURES -> { result = JDKMemberStatus.BLACK_LIST }
                            in WHITE_LIST_METHOD_SIGNATURES -> { result = JDKMemberStatus.WHITE_LIST }
                            in DROP_LIST_METHOD_SIGNATURES -> { result = JDKMemberStatus.DROP }
                        }' @ [246:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'signature' @ [246:31] ==> val signature: String defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus.<no name provided>.beforeChildren[LocalVariableDescriptor]

'in' @ [247:29] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'BLACK_LIST_METHOD_SIGNATURES' @ [247:32] ==> public final val BLACK_LIST_METHOD_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[PropertyDescriptorImpl]

'result' @ [247:66] ==> var result: JvmBuiltInsSettings.JDKMemberStatus? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus[LocalVariableDescriptor]

'BLACK_LIST' @ [247:91] ==> enum entry BLACK_LIST defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.JDKMemberStatus[FakeCallableDescriptorForObject]

'in' @ [248:29] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'WHITE_LIST_METHOD_SIGNATURES' @ [248:32] ==> public final val WHITE_LIST_METHOD_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[PropertyDescriptorImpl]

'result' @ [248:66] ==> var result: JvmBuiltInsSettings.JDKMemberStatus? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus[LocalVariableDescriptor]

'WHITE_LIST' @ [248:91] ==> enum entry WHITE_LIST defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.JDKMemberStatus[FakeCallableDescriptorForObject]

'in' @ [249:29] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'DROP_LIST_METHOD_SIGNATURES' @ [249:32] ==> public final val DROP_LIST_METHOD_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[PropertyDescriptorImpl]

'result' @ [249:65] ==> var result: JvmBuiltInsSettings.JDKMemberStatus? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus[LocalVariableDescriptor]

'DROP' @ [249:90] ==> enum entry DROP defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.JDKMemberStatus[FakeCallableDescriptorForObject]

'result' @ [252:32] ==> var result: JvmBuiltInsSettings.JDKMemberStatus? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus[LocalVariableDescriptor]

'result' @ [255:45] ==> var result: JvmBuiltInsSettings.JDKMemberStatus? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJdkMethodStatus[LocalVariableDescriptor]

'NOT_CONSIDERED' @ [255:71] ==> enum entry NOT_CONSIDERED defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.JDKMemberStatus[FakeCallableDescriptorForObject]

'isAny' @ [266:28] ==> public open fun isAny(@NotNull descriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [266:34] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJavaAnalogue[ReceiverParameterDescriptorImpl]

'!' @ [269:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnderKotlinPackage' @ [269:29] ==> public open fun isUnderKotlinPackage(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [269:50] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJavaAnalogue[ReceiverParameterDescriptorImpl]

'fqNameUnsafe' @ [271:22] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'!' @ [272:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fqName' @ [272:14] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJavaAnalogue[LocalVariableDescriptor]

'isSafe' @ [272:21] ==> public final val FqNameUnsafe.isSafe: Boolean[MyPropertyDescriptor]

'j2kClassMap' @ [273:34] ==> private final val j2kClassMap: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'mapKotlinToJava' @ [273:46] ==> public final fun mapKotlinToJava(kotlinFqName: FqNameUnsafe): ClassId? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'fqName' @ [273:62] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJavaAnalogue[LocalVariableDescriptor]

'asSingleFqName' @ [273:71] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'ownerModuleDescriptor' @ [275:16] ==> private final val ownerModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'resolveClassByFqName' @ [275:38] ==> public fun ModuleDescriptor.resolveClassByFqName(fqName: FqName, lookupLocation: LookupLocation): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors in file descriptorUtil.kt[SimpleFunctionDescriptorImpl]

'javaAnalogueFqName' @ [275:59] ==> val javaAnalogueFqName: FqName defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getJavaAnalogue[LocalVariableDescriptor]

'FROM_BUILTINS' @ [275:96] ==> enum entry FROM_BUILTINS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classDescriptor' @ [279:13] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[ValueParameterDescriptorImpl]

'kind' @ [279:29] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'CLASS' @ [279:47] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'!' @ [279:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAdditionalBuiltInsFeatureSupported' @ [279:57] ==> private final val isAdditionalBuiltInsFeatureSupported: Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'emptyList' @ [279:102] ==> public fun <T> emptyList(): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor

'classDescriptor' @ [281:38] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[ValueParameterDescriptorImpl]

'getJavaAnalogue' @ [281:54] ==> private final fun ClassDescriptor.getJavaAnalogue(): LazyJavaClassDescriptor? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'emptyList' @ [281:82] ==> public fun <T> emptyList(): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor

'j2kClassMap' @ [284:17] ==> private final val j2kClassMap: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'mapJavaToKotlin' @ [284:29] ==> public final fun mapJavaToKotlin(fqName: FqName, builtIns: KotlinBuiltIns): ClassDescriptor? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'javaAnalogueDescriptor' @ [284:45] ==> val javaAnalogueDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[LocalVariableDescriptor]

'fqNameSafe' @ [284:68] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'Instance' @ [284:97] ==> @JvmStatic public final val Instance: KotlinBuiltIns defined in org.jetbrains.kotlin.load.kotlin.FallbackBuiltIns.Companion[PropertyDescriptorImpl]

'emptyList' @ [284:117] ==> public fun <T> emptyList(): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor

'createMappedTypeParametersSubstitution' @ [286:27] ==> public fun createMappedTypeParametersSubstitution(from: ClassDescriptor, to: ClassDescriptor): TypeConstructorSubstitution defined in org.jetbrains.kotlin.platform in file mappingUtil.kt[SimpleFunctionDescriptorImpl]

'defaultKotlinVersion' @ [286:66] ==> val defaultKotlinVersion: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[LocalVariableDescriptor]

'javaAnalogueDescriptor' @ [286:88] ==> val javaAnalogueDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[LocalVariableDescriptor]

'buildSubstitutor' @ [286:112] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[SimpleFunctionDescriptorImpl]

'==' @ [289:17] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[DeserializedSimpleFunctionDescriptor]

'getBothWaysOverridability' @ [289:32] ==> @Nullable public open fun getBothWaysOverridability(overriderDescriptor: (CallableDescriptor..CallableDescriptor?), candidateDescriptor: (CallableDescriptor..CallableDescriptor?)): OverridingUtil.OverrideCompatibilityInfo.Result? defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'this' @ [289:58] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.isEffectivelyTheSameAs[ReceiverParameterDescriptorImpl]

'javaConstructor' @ [289:64] ==> value-parameter javaConstructor: ConstructorDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.isEffectivelyTheSameAs[ValueParameterDescriptorImpl]

'substitute' @ [289:80] ==> @Nullable @Override public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): ConstructorDescriptor? defined in org.jetbrains.kotlin.descriptors.ConstructorDescriptor[JavaMethodDescriptor]

'substitutor' @ [289:91] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[LocalVariableDescriptor]

'OVERRIDABLE' @ [290:69] ==> enum entry OVERRIDABLE defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[FakeCallableDescriptorForObject]

'javaAnalogueDescriptor' @ [292:16] ==> val javaAnalogueDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[LocalVariableDescriptor]

'constructors' @ [292:39] ==> public final val LazyJavaClassDescriptor.constructors: List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'filter' @ [292:52] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filter(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'javaConstructor' @ [294:13] ==> value-parameter javaConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [294:29] ==> public final val ClassConstructorDescriptor.visibility: Visibility[MyPropertyDescriptor]

'isPublicAPI' @ [294:40] ==> public final val isPublicAPI: Boolean defined in org.jetbrains.kotlin.descriptors.Visibility[PropertyDescriptorImpl]

'defaultKotlinVersion' @ [295:17] ==> val defaultKotlinVersion: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[LocalVariableDescriptor]

'constructors' @ [295:38] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'none' @ [295:51] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.none(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [295:58] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isEffectivelyTheSameAs' @ [295:61] ==> local final fun ConstructorDescriptor.isEffectivelyTheSameAs(javaConstructor: ConstructorDescriptor): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[SimpleFunctionDescriptorImpl]

'javaConstructor' @ [295:84] ==> value-parameter javaConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [296:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'javaConstructor' @ [296:18] ==> value-parameter javaConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.<anonymous>[ValueParameterDescriptorImpl]

'isTrivialCopyConstructorFor' @ [296:34] ==> private final fun ConstructorDescriptor.isTrivialCopyConstructorFor(classDescriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [296:62] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[ValueParameterDescriptorImpl]

'!' @ [297:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDeprecated' @ [297:33] ==> public open fun isDeprecated(@NotNull declarationDescriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'javaConstructor' @ [297:46] ==> value-parameter javaConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.<anonymous>[ValueParameterDescriptorImpl]

'!in' @ [298:17] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'signature' @ [298:45] ==> public final fun signature(classDescriptor: ClassDescriptor, jvmDescriptor: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaAnalogueDescriptor' @ [298:55] ==> val javaAnalogueDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[LocalVariableDescriptor]

'javaConstructor' @ [298:79] ==> value-parameter javaConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.<anonymous>[ValueParameterDescriptorImpl]

'computeJvmDescriptor' @ [298:95] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureMapping.kt[SimpleFunctionDescriptorImpl]

'BLACK_LIST_CONSTRUCTOR_SIGNATURES' @ [298:123] ==> public final val BLACK_LIST_CONSTRUCTOR_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[PropertyDescriptorImpl]

'map' @ [299:11] ==> public inline fun <T, R> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.map(transform: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> ClassConstructorDescriptor): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)
    <R> -> ClassConstructorDescriptor

'javaConstructor' @ [301:13] ==> value-parameter javaConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.<anonymous>[ValueParameterDescriptorImpl]

'newCopyBuilder' @ [301:29] ==> @NotNull @Override public abstract fun newCopyBuilder(): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor[JavaMethodDescriptor]

'apply' @ [301:46] ==> @InlineOnly public inline fun <T> FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)>.apply(block: (FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)>).() -> Unit): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CopyBuilder<out (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'setOwner' @ [302:17] ==> @NotNull @Override public abstract fun setOwner(@NotNull owner: DeclarationDescriptor): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'classDescriptor' @ [302:26] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[ValueParameterDescriptorImpl]

'setReturnType' @ [303:17] ==> @NotNull public abstract fun setReturnType(@NotNull type: KotlinType): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'classDescriptor' @ [303:31] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[ValueParameterDescriptorImpl]

'defaultType' @ [303:47] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'setPreserveSourceElement' @ [304:17] ==> @NotNull public abstract fun setPreserveSourceElement(): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'setSubstitution' @ [305:17] ==> @NotNull @Override public abstract fun setSubstitution(@NotNull substitution: TypeSubstitution): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'substitutor' @ [305:33] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[LocalVariableDescriptor]

'substitution' @ [305:45] ==> public final val TypeSubstitutor.substitution: TypeSubstitution[MyPropertyDescriptor]

'!in' @ [306:21] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'signature' @ [306:49] ==> public final fun signature(classDescriptor: ClassDescriptor, jvmDescriptor: String): String defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'javaAnalogueDescriptor' @ [306:59] ==> val javaAnalogueDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors[LocalVariableDescriptor]

'javaConstructor' @ [306:83] ==> value-parameter javaConstructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.getConstructors.<anonymous>[ValueParameterDescriptorImpl]

'computeJvmDescriptor' @ [306:99] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureMapping.kt[SimpleFunctionDescriptorImpl]

'WHITE_LIST_CONSTRUCTOR_SIGNATURES' @ [306:127] ==> public final val WHITE_LIST_CONSTRUCTOR_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[PropertyDescriptorImpl]

'setAdditionalAnnotations' @ [307:21] ==> @NotNull public abstract fun setAdditionalAnnotations(@NotNull additionalAnnotations: Annotations): FunctionDescriptor.CopyBuilder<out (FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'notConsideredDeprecation' @ [307:46] ==> private final val notConsideredDeprecation: AnnotationsImpl defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'build' @ [310:15] ==> @Nullable @Override public abstract fun build(): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'classDescriptor' @ [315:43] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isFunctionAvailable[ValueParameterDescriptorImpl]

'getJavaAnalogue' @ [315:59] ==> private final fun ClassDescriptor.getJavaAnalogue(): LazyJavaClassDescriptor? defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[SimpleFunctionDescriptorImpl]

'!' @ [317:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [317:14] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isFunctionAvailable[ValueParameterDescriptorImpl]

'annotations' @ [317:33] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[PropertyDescriptorImpl]

'hasAnnotation' @ [317:45] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME' @ [317:59] ==> public val PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME: FqName defined in org.jetbrains.kotlin.descriptors.deserialization in file PlatformDependentDeclarationFilter.kt[PropertyDescriptorImpl]

'!' @ [318:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAdditionalBuiltInsFeatureSupported' @ [318:14] ==> private final val isAdditionalBuiltInsFeatureSupported: Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[PropertyDescriptorImpl]

'functionDescriptor' @ [320:29] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isFunctionAvailable[ValueParameterDescriptorImpl]

'computeJvmDescriptor' @ [320:48] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureMapping.kt[SimpleFunctionDescriptorImpl]

'javaAnalogueClassDescriptor' @ [321:16] ==> val javaAnalogueClassDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isFunctionAvailable[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [322:22] ==> public final val LazyJavaClassDescriptor.unsubstitutedMemberScope: LazyJavaClassMemberScope[MyPropertyDescriptor]

'getContributedFunctions' @ [323:22] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [323:46] ==> value-parameter functionDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isFunctionAvailable[ValueParameterDescriptorImpl]

'name' @ [323:65] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'FROM_BUILTINS' @ [323:88] ==> enum entry FROM_BUILTINS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'any' @ [324:22] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.any(predicate: (SimpleFunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [324:28] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isFunctionAvailable.<anonymous>[ValueParameterDescriptorImpl]

'computeJvmDescriptor' @ [324:31] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureMapping.kt[SimpleFunctionDescriptorImpl]

'jvmDescriptor' @ [324:57] ==> val jvmDescriptor: String defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isFunctionAvailable[LocalVariableDescriptor]

'valueParameters' @ [328:13] ==> public final val ConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [328:29] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'valueParameters' @ [329:13] ==> public final val ConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'single' @ [329:29] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.single(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [329:38] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [329:43] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [329:55] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameUnsafe' @ [329:78] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'classDescriptor' @ [329:94] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.isTrivialCopyConstructorFor[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [329:110] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'isArrayOrPrimitiveArray' @ [333:17] ==> private final fun isArrayOrPrimitiveArray(fqName: FqNameUnsafe): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[SimpleFunctionDescriptorImpl]

'fqName' @ [333:41] ==> value-parameter fqName: FqNameUnsafe defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.isSerializableInJava[ValueParameterDescriptorImpl]

'?:' @ [336:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassId?, right: ClassId): ClassId[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassId

'mapKotlinToJava' @ [336:52] ==> public final fun mapKotlinToJava(kotlinFqName: FqNameUnsafe): ClassId? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'fqName' @ [336:68] ==> value-parameter fqName: FqNameUnsafe defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.isSerializableInJava[ValueParameterDescriptorImpl]

'forName' @ [338:23] ==> public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'javaClassId' @ [338:31] ==> val javaClassId: ClassId defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.isSerializableInJava[LocalVariableDescriptor]

'asSingleFqName' @ [338:43] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'asString' @ [338:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'java' @ [343:40] ==> public val <T> KClass<Serializable>.java: Class<Serializable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Serializable

'isAssignableFrom' @ [343:45] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'classViaReflection' @ [343:62] ==> val classViaReflection: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.isSerializableInJava[LocalVariableDescriptor]

'fqName' @ [347:20] ==> value-parameter fqName: FqNameUnsafe defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.isArrayOrPrimitiveArray[ValueParameterDescriptorImpl]

'FQ_NAMES' @ [347:45] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'array' @ [347:54] ==> public final val array: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'isPrimitiveArray' @ [347:78] ==> public open fun isPrimitiveArray(@NotNull arrayFqName: FqNameUnsafe): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'fqName' @ [347:95] ==> value-parameter fqName: FqNameUnsafe defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.isArrayOrPrimitiveArray[ValueParameterDescriptorImpl]

'SignatureBuildingComponents' @ [351:17] ==> public object SignatureBuildingComponents defined in org.jetbrains.kotlin.load.kotlin in file methodSignatureBuilding.kt[FakeCallableDescriptorForObject]

'inJavaUtil' @ [351:45] ==> public final fun inJavaUtil(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'signatures' @ [358:13] ==> public inline fun <T> signatures(block: SignatureBuildingComponents.() -> Set<String>): Set<String> defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Set<String>

'buildPrimitiveValueMethodsSet' @ [359:17] ==> private final fun buildPrimitiveValueMethodsSet(): Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[SimpleFunctionDescriptorImpl]

'inJavaUtil' @ [361:17] ==> public final fun inJavaUtil(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaLang' @ [363:17] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaLang' @ [382:17] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaLang' @ [383:17] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaLang' @ [385:17] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'signatures' @ [389:13] ==> public inline fun <T> signatures(block: SignatureBuildingComponents.() -> LinkedHashSet<String>): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> LinkedHashSet<String>

'listOf' @ [390:17] ==> public fun <T> listOf(vararg elements: JvmPrimitiveType): List<JvmPrimitiveType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmPrimitiveType

'BOOLEAN' @ [390:41] ==> enum entry BOOLEAN defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'CHAR' @ [390:67] ==> enum entry CHAR defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'flatMapTo' @ [390:73] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<JvmPrimitiveType>.flatMapTo(destination: LinkedHashSet<String>, transform: (JvmPrimitiveType) -> Iterable<String>): LinkedHashSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmPrimitiveType
    <R> -> String
    <C : MutableCollection<in R>> -> LinkedHashSet<String>

'LinkedHashSet' @ [390:83] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'inJavaLang' @ [391:21] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'it' @ [391:32] ==> value-parameter it: JvmPrimitiveType defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.buildPrimitiveValueMethodsSet.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'wrapperFqName' @ [391:35] ==> public final val JvmPrimitiveType.wrapperFqName: FqName[MyPropertyDescriptor]

'shortName' @ [391:49] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [391:61] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [391:76] ==> value-parameter it: JvmPrimitiveType defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.buildPrimitiveValueMethodsSet.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javaKeywordName' @ [391:79] ==> public final val JvmPrimitiveType.javaKeywordName: String[MyPropertyDescriptor]

'it' @ [391:104] ==> value-parameter it: JvmPrimitiveType defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.buildPrimitiveValueMethodsSet.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [391:107] ==> public final val JvmPrimitiveType.desc: String[MyPropertyDescriptor]

'signatures' @ [396:17] ==> public inline fun <T> signatures(block: SignatureBuildingComponents.() -> Set<String>): Set<String> defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Set<String>

'inJavaLang' @ [397:21] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaUtil' @ [400:21] ==> public final fun inJavaUtil(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaLang' @ [403:21] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaLang' @ [406:21] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaUtil' @ [413:21] ==> public final fun inJavaUtil(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaUtil' @ [417:21] ==> public final fun inJavaUtil(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaUtil' @ [420:21] ==> public final fun inJavaUtil(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'signatures' @ [433:13] ==> public inline fun <T> signatures(block: SignatureBuildingComponents.() -> Set<String>): Set<String> defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Set<String>

'inJavaUtil' @ [434:17] ==> public final fun inJavaUtil(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaUtil' @ [436:17] ==> public final fun inJavaUtil(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaUtil' @ [438:17] ==> public final fun inJavaUtil(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'signatures' @ [450:13] ==> public inline fun <T> signatures(block: SignatureBuildingComponents.() -> Set<String>): Set<String> defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Set<String>

'buildPrimitiveStringConstructorsSet' @ [451:17] ==> private final fun buildPrimitiveStringConstructorsSet(): Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[SimpleFunctionDescriptorImpl]

'inJavaLang' @ [452:17] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'constructors' @ [452:38] ==> public final fun constructors(vararg signatures: String): Array<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'inJavaLang' @ [453:17] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'constructors' @ [453:39] ==> public final fun constructors(vararg signatures: String): Array<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'signatures' @ [465:17] ==> public inline fun <T> signatures(block: SignatureBuildingComponents.() -> LinkedHashSet<String>): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> LinkedHashSet<String>

'inJavaLang' @ [466:21] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'constructors' @ [466:46] ==> public final fun constructors(vararg signatures: String): Array<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'signatures' @ [470:13] ==> public inline fun <T> signatures(block: SignatureBuildingComponents.() -> LinkedHashSet<String>): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> LinkedHashSet<String>

'listOf' @ [471:17] ==> public fun <T> listOf(vararg elements: JvmPrimitiveType): List<JvmPrimitiveType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmPrimitiveType

'BOOLEAN' @ [471:41] ==> enum entry BOOLEAN defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'BYTE' @ [471:67] ==> enum entry BYTE defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'DOUBLE' @ [471:90] ==> enum entry DOUBLE defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'FLOAT' @ [471:115] ==> enum entry FLOAT defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'BYTE' @ [472:40] ==> enum entry BYTE defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'INT' @ [472:63] ==> enum entry INT defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'LONG' @ [472:85] ==> enum entry LONG defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'SHORT' @ [472:108] ==> enum entry SHORT defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[FakeCallableDescriptorForObject]

'flatMapTo' @ [473:19] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<JvmPrimitiveType>.flatMapTo(destination: LinkedHashSet<String>, transform: (JvmPrimitiveType) -> Iterable<String>): LinkedHashSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmPrimitiveType
    <R> -> String
    <C : MutableCollection<in R>> -> LinkedHashSet<String>

'LinkedHashSet' @ [473:29] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'inJavaLang' @ [475:21] ==> public final fun inJavaLang(name: String, vararg signatures: String): LinkedHashSet<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'it' @ [475:32] ==> value-parameter it: JvmPrimitiveType defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion.buildPrimitiveStringConstructorsSet.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'wrapperFqName' @ [475:35] ==> public final val JvmPrimitiveType.wrapperFqName: FqName[MyPropertyDescriptor]

'shortName' @ [475:49] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [475:61] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'constructors' @ [475:74] ==> public final fun constructors(vararg signatures: String): Array<String> defined in org.jetbrains.kotlin.load.kotlin.SignatureBuildingComponents[SimpleFunctionDescriptorImpl]

'KotlinBuiltIns' @ [481:56] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull storageManager: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'LockBasedStorageManager' @ [481:71] ==> public constructor LockBasedStorageManager() defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaClassConstructorDescriptor]

'createBuiltInsModule' @ [483:9] ==> protected/*protected and package*/ open fun createBuiltInsModule(): Unit defined in org.jetbrains.kotlin.load.kotlin.FallbackBuiltIns[JavaMethodDescriptor]

'BuiltInsInitializer' @ [487:35] ==> public constructor BuiltInsInitializer<out T : KotlinBuiltIns>(constructor: () -> FallbackBuiltIns) defined in org.jetbrains.kotlin.builtins.BuiltInsInitializer[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : KotlinBuiltIns> -> FallbackBuiltIns

'FallbackBuiltIns' @ [488:13] ==> private constructor FallbackBuiltIns() defined in org.jetbrains.kotlin.load.kotlin.FallbackBuiltIns[ClassConstructorDescriptorImpl]

'JvmStatic' @ [491:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'initializer' @ [493:21] ==> private final val initializer: BuiltInsInitializer<FallbackBuiltIns> defined in org.jetbrains.kotlin.load.kotlin.FallbackBuiltIns.Companion[PropertyDescriptorImpl]

'get' @ [493:33] ==> public final fun get(): FallbackBuiltIns defined in org.jetbrains.kotlin.builtins.BuiltInsInitializer[SimpleFunctionDescriptorImpl]

'All' @ [496:95] ==> public object All : PlatformDependentDeclarationFilter defined in org.jetbrains.kotlin.descriptors.deserialization.PlatformDependentDeclarationFilter[FakeCallableDescriptorForObject]

