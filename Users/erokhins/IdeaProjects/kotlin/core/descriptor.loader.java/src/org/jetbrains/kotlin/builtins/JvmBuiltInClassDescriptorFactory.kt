'module' @ [32:13] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.<init>.<anonymous>[ValueParameterDescriptorImpl]

'getPackage' @ [32:20] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[SimpleFunctionDescriptorImpl]

'KOTLIN_FQ_NAME' @ [32:31] ==> private final val KOTLIN_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.Companion[PropertyDescriptorImpl]

'fragments' @ [32:47] ==> public abstract val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[PropertyDescriptorImpl]

'filterIsInstance' @ [32:57] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<BuiltInsPackageFragment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> BuiltInsPackageFragment

'first' @ [32:101] ==> public fun <T> List<BuiltInsPackageFragment>.first(): BuiltInsPackageFragment defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BuiltInsPackageFragment

'storageManager' @ [35:30] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [35:45] ==> public abstract fun <T : Any> createLazyValue(computable: () -> ClassDescriptorImpl): NotNullLazyValue<ClassDescriptorImpl> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ClassDescriptorImpl

'ClassDescriptorImpl' @ [36:9] ==> public constructor ClassDescriptorImpl(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull name: Name, @NotNull modality: Modality, @NotNull kind: ClassKind, @NotNull supertypes: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>), @NotNull source: SourceElement, isExternal: Boolean) defined in org.jetbrains.kotlin.descriptors.impl.ClassDescriptorImpl[JavaClassConstructorDescriptor]

'invoke' @ [37:17] ==> public abstract operator fun invoke(p1: ModuleDescriptor): DeclarationDescriptor defined in kotlin.Function1[FunctionInvokeDescriptor]

'moduleDescriptor' @ [37:46] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory[PropertyDescriptorImpl]

'CLONEABLE_NAME' @ [38:17] ==> private final val CLONEABLE_NAME: Name defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.Companion[PropertyDescriptorImpl]

'Modality' @ [38:33] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [38:42] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'INTERFACE' @ [38:62] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'listOf' @ [38:73] ==> public fun <T> listOf(element: SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'moduleDescriptor' @ [38:80] ==> private final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory[PropertyDescriptorImpl]

'builtIns' @ [38:97] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'anyType' @ [38:106] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'NO_SOURCE' @ [39:31] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'apply' @ [40:11] ==> @InlineOnly public inline fun <T> ClassDescriptorImpl.apply(block: ClassDescriptorImpl.() -> Unit): ClassDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptorImpl

'initialize' @ [41:13] ==> public final fun initialize(@NotNull unsubstitutedMemberScope: MemberScope, @NotNull constructors: (MutableSet<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>..Set<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>), @Nullable primaryConstructor: ClassConstructorDescriptor?): Unit defined in org.jetbrains.kotlin.descriptors.impl.ClassDescriptorImpl[JavaMethodDescriptor]

'CloneableClassScope' @ [41:24] ==> public constructor CloneableClassScope(storageManager: StorageManager, containingClass: ClassDescriptor) defined in org.jetbrains.kotlin.builtins.CloneableClassScope[ClassConstructorDescriptorImpl]

'storageManager' @ [41:44] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.<init>[ValueParameterDescriptorImpl]

'this' @ [41:60] ==> <this> defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.cloneable.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'emptySet' @ [41:67] ==> public fun <T> emptySet(): Set<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'name' @ [46:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.shouldCreateClass[ValueParameterDescriptorImpl]

'CLONEABLE_NAME' @ [46:21] ==> private final val CLONEABLE_NAME: Name defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.Companion[PropertyDescriptorImpl]

'packageFqName' @ [46:39] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.shouldCreateClass[ValueParameterDescriptorImpl]

'KOTLIN_FQ_NAME' @ [46:56] ==> private final val KOTLIN_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.Companion[PropertyDescriptorImpl]

'when (classId) {
                CLONEABLE_CLASS_ID -> cloneable
                else -> null
            }' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor?, entry1: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor?

'classId' @ [49:19] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.createClass[ValueParameterDescriptorImpl]

'CLONEABLE_CLASS_ID' @ [50:17] ==> public final val CLONEABLE_CLASS_ID: ClassId defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.Companion[PropertyDescriptorImpl]

'cloneable' @ [50:39] ==> private final val cloneable: ClassDescriptorImpl defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory[PropertyDescriptorImpl]

'when (packageFqName) {
                KOTLIN_FQ_NAME -> setOf(cloneable)
                else -> emptySet()
            }' @ [55:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<ClassDescriptor>, entry1: Collection<ClassDescriptor>): Collection<ClassDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<ClassDescriptor>

'packageFqName' @ [55:19] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.getAllContributedClassesIfPossible[ValueParameterDescriptorImpl]

'KOTLIN_FQ_NAME' @ [56:17] ==> private final val KOTLIN_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory.Companion[PropertyDescriptorImpl]

'setOf' @ [56:35] ==> public fun <T> setOf(element: ClassDescriptorImpl): Set<ClassDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptorImpl

'cloneable' @ [56:41] ==> private final val cloneable: ClassDescriptorImpl defined in org.jetbrains.kotlin.builtins.JvmBuiltInClassDescriptorFactory[PropertyDescriptorImpl]

'emptySet' @ [57:25] ==> public fun <T> emptySet(): Set<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'BUILT_INS_PACKAGE_FQ_NAME' @ [61:53] ==> public final val BUILT_INS_PACKAGE_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'FQ_NAMES' @ [62:53] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'cloneable' @ [62:62] ==> public final val cloneable: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'shortName' @ [62:72] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'topLevel' @ [63:42] ==> @NotNull public open fun topLevel(@NotNull topLevelFqName: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FQ_NAMES' @ [63:66] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'cloneable' @ [63:75] ==> public final val cloneable: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'toSafe' @ [63:85] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

