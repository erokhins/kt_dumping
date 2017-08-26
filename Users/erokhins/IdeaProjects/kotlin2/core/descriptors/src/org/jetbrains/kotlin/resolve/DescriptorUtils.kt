'companionObjectDescriptor' @ [46:72] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'this' @ [46:101] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.getClassObjectReferenceTarget[ReceiverParameterDescriptorImpl]

'when {
        this is TypeAliasConstructorDescriptor -> containingDeclaration
        this is ConstructorDescriptor -> containingDeclaration
        this is PropertyAccessorDescriptor -> correspondingProperty
        else -> this
    }' @ [49:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor, entry1: DeclarationDescriptor, entry2: DeclarationDescriptor, entry3: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor

'this' @ [50:9] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.getImportableDescriptor[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [50:51] ==> public final val TypeAliasConstructorDescriptor.containingDeclaration: TypeAliasDescriptor[MyPropertyDescriptor]

'this' @ [51:9] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.getImportableDescriptor[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [51:42] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'this' @ [52:9] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.getImportableDescriptor[ReceiverParameterDescriptorImpl]

'correspondingProperty' @ [52:47] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'this' @ [53:17] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.getImportableDescriptor[ReceiverParameterDescriptorImpl]

'getFqName' @ [58:29] ==> @NotNull public open fun getFqName(@NotNull descriptor: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [58:39] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.fqNameUnsafe[ReceiverParameterDescriptorImpl]

'getFqNameSafe' @ [61:29] ==> @NotNull public open fun getFqNameSafe(@NotNull descriptor: DeclarationDescriptor): FqName defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [61:43] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe[ReceiverParameterDescriptorImpl]

'this' @ [64:13] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isExtension[ReceiverParameterDescriptorImpl]

'extensionReceiverParameter' @ [64:43] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'getContainingModule' @ [67:29] ==> @NotNull public open fun getContainingModule(@NotNull descriptor: DeclarationDescriptor): ModuleDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [67:49] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.module[ReceiverParameterDescriptorImpl]

'assert' @ [70:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [70:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'topLevelClassFqName' @ [70:13] ==> value-parameter topLevelClassFqName: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil.resolveTopLevelClass[ValueParameterDescriptorImpl]

'isRoot' @ [70:33] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'getPackage' @ [71:12] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[SimpleFunctionDescriptorImpl]

'topLevelClassFqName' @ [71:23] ==> value-parameter topLevelClassFqName: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil.resolveTopLevelClass[ValueParameterDescriptorImpl]

'parent' @ [71:43] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'memberScope' @ [71:53] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[PropertyDescriptorImpl]

'getContributedClassifier' @ [71:65] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'topLevelClassFqName' @ [71:90] ==> value-parameter topLevelClassFqName: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil.resolveTopLevelClass[ValueParameterDescriptorImpl]

'shortName' @ [71:110] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'location' @ [71:123] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.descriptorUtil.resolveTopLevelClass[ValueParameterDescriptorImpl]

'when (this) {
        is ClassDescriptor -> this
        is TypeAliasDescriptor -> classDescriptor
        else -> throw UnsupportedOperationException("Unexpected descriptor kind: $this")
    }' @ [75:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor?, entry1: ClassDescriptor?, entry2: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor?

'this' @ [75:19] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.denotedClassDescriptor[ReceiverParameterDescriptorImpl]

'this' @ [76:31] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.denotedClassDescriptor[ReceiverParameterDescriptorImpl]

'classDescriptor' @ [77:35] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [78:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'this' @ [78:83] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.denotedClassDescriptor[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [82:13] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'let' @ [82:35] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> ClassId?): ClassId? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> ClassId?

'when (owner) {
            is PackageFragmentDescriptor -> ClassId(owner.fqName, name)
            is ClassifierDescriptorWithTypeParameters -> owner.classId?.createNestedClassId(name)
            else -> null
        }' @ [83:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassId?, entry1: ClassId?, entry2: ClassId?): ClassId?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassId?

'owner' @ [83:15] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classId>.<anonymous>[ValueParameterDescriptorImpl]

'ClassId' @ [84:45] ==> public constructor ClassId(@NotNull packageFqName: FqName, @NotNull topLevelName: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'owner' @ [84:53] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classId>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [84:59] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[PropertyDescriptorImpl]

'name' @ [84:67] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'owner' @ [85:58] ==> value-parameter owner: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classId>.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [85:64] ==> public val ClassifierDescriptorWithTypeParameters.classId: ClassId? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'createNestedClassId' @ [85:73] ==> @NotNull public open fun createNestedClassId(@NotNull name: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'name' @ [85:93] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'denotedClassDescriptor' @ [91:13] ==> public val ClassifierDescriptorWithTypeParameters.denotedClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'companionObjectDescriptor' @ [91:37] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'classValueDescriptor' @ [93:62] ==> public val ClassifierDescriptorWithTypeParameters.classValueDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'denotedClassDescriptor' @ [96:13] ==> public val ClassifierDescriptorWithTypeParameters.denotedClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'let' @ [96:37] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> ClassDescriptor?): ClassDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> ClassDescriptor?

'if (it.kind.isSingleton)
            it
        else
            it.companionObjectDescriptor' @ [97:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'it' @ [97:13] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classValueDescriptor>.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [97:16] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [97:21] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'it' @ [98:13] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classValueDescriptor>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [100:13] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classValueDescriptor>.<anonymous>[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [100:16] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'denotedClassDescriptor' @ [104:13] ==> public val ClassifierDescriptorWithTypeParameters.denotedClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'let' @ [104:37] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> ClassDescriptor?): ClassDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> ClassDescriptor?

'when (it.kind) {
            OBJECT -> it
            ENUM_ENTRY -> {
                // enum entry has the type of enum class
                val container = this.containingDeclaration
                assert(container is ClassDescriptor && container.kind == ENUM_CLASS)
                container as ClassDescriptor
            }
            else -> it.companionObjectDescriptor
        }' @ [105:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor?, entry1: ClassDescriptor?, entry2: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor?

'it' @ [105:15] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classValueTypeDescriptor>.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [105:18] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [106:13] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'it' @ [106:23] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classValueTypeDescriptor>.<anonymous>[ValueParameterDescriptorImpl]

'ENUM_ENTRY' @ [107:13] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'this' @ [109:33] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.classValueTypeDescriptor[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [109:38] ==> public final val ClassifierDescriptorWithTypeParameters.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'assert' @ [110:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'container' @ [110:24] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classValueTypeDescriptor>.<anonymous>[LocalVariableDescriptor]

'container' @ [110:56] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classValueTypeDescriptor>.<anonymous>[LocalVariableDescriptor]

'kind' @ [110:66] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [110:74] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'container' @ [111:17] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classValueTypeDescriptor>.<anonymous>[LocalVariableDescriptor]

'it' @ [113:21] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-classValueTypeDescriptor>.<anonymous>[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [113:24] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'classValueTypeDescriptor' @ [119:13] ==> public val ClassifierDescriptorWithTypeParameters.classValueTypeDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'defaultType' @ [119:39] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'effectiveVisibility' @ [122:13] ==> public fun DeclarationDescriptorWithVisibility.effectiveVisibility(visibility: Visibility = ..., checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'publicApi' @ [122:35] ==> public final val publicApi: Boolean defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[PropertyDescriptorImpl]

'effectiveVisibility' @ [125:13] ==> public fun DeclarationDescriptorWithVisibility.effectiveVisibility(visibility: Visibility = ..., checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'privateApi' @ [125:35] ==> public final val privateApi: Boolean defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[PropertyDescriptorImpl]

'containingDeclaration' @ [130:22] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'parent' @ [131:16] ==> val parent: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-isInsidePrivateClass>[LocalVariableDescriptor]

'isPrivate' @ [131:47] ==> public open fun isPrivate(@NotNull visibility: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'parent' @ [131:57] ==> val parent: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-isInsidePrivateClass>[LocalVariableDescriptor]

'visibility' @ [131:64] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'defaultType' @ [136:23] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'constructor' @ [136:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'supertypes' @ [136:47] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'!' @ [137:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnyOrNullableAny' @ [137:29] ==> public open fun isAnyOrNullableAny(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'supertype' @ [137:48] ==> val supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.getSuperClassNotAny[LocalVariableDescriptor]

'supertype' @ [138:35] ==> val supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.getSuperClassNotAny[LocalVariableDescriptor]

'constructor' @ [138:45] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [138:57] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'isClassOrEnumClass' @ [139:33] ==> public open fun isClassOrEnumClass(@Nullable descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'superClassifier' @ [139:52] ==> val superClassifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.getSuperClassNotAny[LocalVariableDescriptor]

'superClassifier' @ [140:24] ==> val superClassifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.getSuperClassNotAny[LocalVariableDescriptor]

'getSuperClassNotAny' @ [147:61] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[SimpleFunctionDescriptorImpl]

'builtIns' @ [147:86] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'any' @ [147:95] ==> public final val KotlinBuiltIns.any: ClassDescriptor[MyPropertyDescriptor]

'defaultType' @ [150:9] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'constructor' @ [150:21] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'supertypes' @ [150:33] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'filterNot' @ [151:18] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.filterNot(predicate: ((KotlinType..KotlinType?)) -> Boolean): List<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'isAnyOrNullableAny' @ [151:45] ==> public open fun isAnyOrNullableAny(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [151:64] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.getSuperInterfaces.<anonymous>[ValueParameterDescriptorImpl]

'mapNotNull' @ [152:18] ==> public inline fun <T, R : Any> Iterable<(KotlinType..KotlinType?)>.mapNotNull(transform: ((KotlinType..KotlinType?)) -> ClassDescriptor?): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R : Any> -> ClassDescriptor

'it' @ [153:43] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.getSuperInterfaces.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [153:46] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [153:58] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'if (DescriptorUtils.isInterface(superClassifier)) superClassifier as ClassDescriptor
                    else null' @ [154:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'isInterface' @ [154:41] ==> public open fun isInterface(@Nullable descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'superClassifier' @ [154:53] ==> val superClassifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.getSuperInterfaces.<anonymous>[LocalVariableDescriptor]

'superClassifier' @ [154:71] ==> val superClassifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.getSuperInterfaces.<anonymous>[LocalVariableDescriptor]

'constructors' @ [159:13] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'filterNot' @ [159:26] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filterNot(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [159:38] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-secondaryConstructors>.<anonymous>[ValueParameterDescriptorImpl]

'isPrimary' @ [159:41] ==> public final val ClassConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'module' @ [162:13] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'builtIns' @ [162:20] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'this' @ [183:9] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.getOwnerForEffectiveDispatchReceiverParameter[ReceiverParameterDescriptorImpl]

'kind' @ [183:45] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [183:83] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'getContainingDeclaration' @ [184:16] ==> @Override @NotNull public abstract fun getContainingDeclaration(): DeclarationDescriptor defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'dispatchReceiverParameter' @ [186:12] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'containingDeclaration' @ [186:39] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ifAny' @ [193:16] ==> public open fun <N : (Any..Any?)> ifAny(@NotNull p0: (MutableCollection<(ValueParameterDescriptor..ValueParameterDescriptor?)>..Collection<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @NotNull p1: DFS.Neighbors<(ValueParameterDescriptor..ValueParameterDescriptor?)>, @NotNull p2: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> (Boolean..Boolean?)): (Boolean..Boolean?) defined in org.jetbrains.kotlin.utils.DFS[JavaMethodDescriptor]
Inferred types:
    <N : (Any..Any?)> -> ValueParameterDescriptor

'listOf' @ [194:13] ==> public fun <T> listOf(element: ValueParameterDescriptor): List<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'this' @ [194:20] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.hasDefaultValue[ReceiverParameterDescriptorImpl]

'Neighbors' @ [195:17] ==> public final fun <N : (Any..Any?)> Neighbors(function: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> (MutableIterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>..Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>)): DFS.Neighbors<ValueParameterDescriptor> defined in org.jetbrains.kotlin.utils.DFS[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : (Any..Any?)> -> ValueParameterDescriptor

'current' @ [196:17] ==> value-parameter current: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.hasDefaultValue.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [196:25] ==> public final val ValueParameterDescriptor.overriddenDescriptors: Collection<ValueParameterDescriptor>[MyPropertyDescriptor]

'map' @ [196:47] ==> public inline fun <T, R> Iterable<ValueParameterDescriptor>.map(transform: (ValueParameterDescriptor) -> ValueParameterDescriptor): List<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor
    <R> -> ValueParameterDescriptor

'ifAny' @ [202:81] ==> public final fun <N : (Any..Any?)> ifAny(@NotNull p0: (MutableCollection<(FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>), @NotNull p1: ((FunctionDescriptor..FunctionDescriptor?)) -> (MutableIterable<(FunctionDescriptor..FunctionDescriptor?)>..Iterable<(FunctionDescriptor..FunctionDescriptor?)>), @NotNull p2: ((FunctionDescriptor..FunctionDescriptor?)) -> (Boolean..Boolean?)): (Boolean..Boolean?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> FunctionDescriptor

'listOf' @ [203:9] ==> public fun <T> listOf(element: FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'this' @ [203:16] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.hasOrInheritsParametersWithDefaultValue[ReceiverParameterDescriptorImpl]

'current' @ [204:22] ==> value-parameter current: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.hasOrInheritsParametersWithDefaultValue.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [204:30] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'map' @ [204:52] ==> public inline fun <T, R> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.map(transform: ((FunctionDescriptor..FunctionDescriptor?)) -> FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)
    <R> -> FunctionDescriptor

'it' @ [204:58] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.hasOrInheritsParametersWithDefaultValue.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [204:61] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'it' @ [205:11] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.hasOrInheritsParametersWithDefaultValue.<anonymous>[ValueParameterDescriptorImpl]

'hasOwnParametersWithDefaultValue' @ [205:14] ==> public fun FunctionDescriptor.hasOwnParametersWithDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[SimpleFunctionDescriptorImpl]

'original' @ [208:61] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'valueParameters' @ [208:70] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'any' @ [208:86] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [208:92] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.hasOwnParametersWithDefaultValue.<anonymous>[ValueParameterDescriptorImpl]

'declaresDefaultValue' @ [208:95] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[SimpleFunctionDescriptorImpl]

'annotations' @ [211:9] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotated[PropertyDescriptorImpl]

'findAnnotation' @ [211:21] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'FQ_NAMES' @ [211:51] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'repeatable' @ [211:60] ==> public final val repeatable: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'annotations' @ [214:9] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotated[PropertyDescriptorImpl]

'findAnnotation' @ [214:21] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'FQ_NAMES' @ [214:51] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mustBeDocumented' @ [214:60] ==> public final val mustBeDocumented: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'annotations' @ [217:34] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotated[PropertyDescriptorImpl]

'findAnnotation' @ [217:46] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'FQ_NAMES' @ [217:76] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'retention' @ [217:85] ==> public final val retention: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'allValueArguments' @ [218:44] ==> public abstract val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'get' @ [219:44] ==> public abstract operator fun get(key: Name): ConstantValue<*>? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'identifier' @ [219:53] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'valueOf' @ [221:28] ==> public final fun valueOf(value: String): KotlinRetention defined in org.jetbrains.kotlin.descriptors.annotations.KotlinRetention[SimpleFunctionDescriptorImpl]

'retentionArgumentValue' @ [221:36] ==> val retentionArgumentValue: EnumValue defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAnnotationRetention[LocalVariableDescriptor]

'value' @ [221:59] ==> public open val value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue[PropertyDescriptorImpl]

'name' @ [221:65] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [221:70] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'generateSequence' @ [225:13] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: DeclarationDescriptor?, nextFunction: (DeclarationDescriptor) -> DeclarationDescriptor?): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'this' @ [225:30] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.parentsWithSelf[ReceiverParameterDescriptorImpl]

'it' @ [225:38] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.<get-parentsWithSelf>.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [225:41] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'parentsWithSelf' @ [228:13] ==> public val DeclarationDescriptor.parentsWithSelf: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'drop' @ [228:29] ==> public fun <T> Sequence<DeclarationDescriptor>.drop(n: Int): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'if (this is PropertyAccessorDescriptor) correspondingProperty else this' @ [231:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableMemberDescriptor, elseBranch: CallableMemberDescriptor): CallableMemberDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableMemberDescriptor

'this' @ [231:17] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.propertyIfAccessor[ReceiverParameterDescriptorImpl]

'correspondingProperty' @ [231:53] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'this' @ [231:80] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.propertyIfAccessor[ReceiverParameterDescriptorImpl]

'fqNameUnsafe' @ [233:50] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'takeIf' @ [233:63] ==> @InlineOnly @SinceKotlin public inline fun <T> FqNameUnsafe.takeIf(predicate: (FqNameUnsafe) -> Boolean): FqNameUnsafe? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqNameUnsafe

'it' @ [233:72] ==> value-parameter it: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil.fqNameOrNull.<anonymous>[ValueParameterDescriptorImpl]

'isSafe' @ [233:75] ==> public final val FqNameUnsafe.isSafe: Boolean[MyPropertyDescriptor]

'toSafe' @ [233:85] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'dfs' @ [240:16] ==> public final fun <N : (Any..Any?), R : (Any..Any?)> dfs(@NotNull p0: (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull p1: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> (MutableIterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull p2: DFS.NodeHandler<(CallableMemberDescriptor..CallableMemberDescriptor?), (CallableMemberDescriptor..CallableMemberDescriptor?)>): (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> CallableMemberDescriptor
    <R : (Any..Any?)> -> CallableMemberDescriptor

'listOf' @ [240:20] ==> public fun <T> listOf(element: CallableMemberDescriptor): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'this' @ [240:27] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden[ReceiverParameterDescriptorImpl]

'if (useOriginal) current?.original else current' @ [242:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableMemberDescriptor?, elseBranch: CallableMemberDescriptor?): CallableMemberDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableMemberDescriptor?

'useOriginal' @ [242:45] ==> value-parameter useOriginal: Boolean = ... defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden[ValueParameterDescriptorImpl]

'current' @ [242:58] ==> value-parameter current: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [242:67] ==> public final val CallableMemberDescriptor.original: CallableMemberDescriptor[MyPropertyDescriptor]

'current' @ [242:81] ==> value-parameter current: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [243:24] ==> val descriptor: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden.<anonymous>[LocalVariableDescriptor]

'overriddenDescriptors' @ [243:36] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'emptyList' @ [243:61] ==> public fun <T> emptyList(): List<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor?>' @ [245:29] ==> public constructor AbstractNodeHandler<N : (Any..Any?), R : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.DFS.AbstractNodeHandler[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> CallableMemberDescriptor
    <R : (Any..Any?)> -> CallableMemberDescriptor?

'result' @ [246:89] ==> var result: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden[LocalVariableDescriptor]

'result' @ [248:32] ==> var result: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden[LocalVariableDescriptor]

'invoke' @ [248:50] ==> public abstract operator fun invoke(p1: CallableMemberDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'current' @ [248:60] ==> value-parameter current: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'result' @ [249:32] ==> var result: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden[LocalVariableDescriptor]

'current' @ [249:41] ==> value-parameter current: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'result' @ [252:75] ==> var result: CallableMemberDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.firstOverridden[LocalVariableDescriptor]

'overriddenDescriptors' @ [258:5] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'listOf' @ [258:29] ==> public fun <T> listOf(element: CallableMemberDescriptor): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'overridden' @ [258:36] ==> value-parameter overridden: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.setSingleOverridden[ValueParameterDescriptorImpl]

'with' @ [262:5] ==> @InlineOnly public inline fun <T, R> with(receiver: CallableMemberDescriptor, block: (CallableMemberDescriptor).() -> Sequence<CallableMemberDescriptor>): Sequence<CallableMemberDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <R> -> Sequence<CallableMemberDescriptor>

'if (useOriginal) original else this' @ [262:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableMemberDescriptor, elseBranch: CallableMemberDescriptor): CallableMemberDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableMemberDescriptor

'useOriginal' @ [262:14] ==> value-parameter useOriginal: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeAsSequence[ValueParameterDescriptorImpl]

'original' @ [262:27] ==> public final val CallableMemberDescriptor.original: CallableMemberDescriptor[MyPropertyDescriptor]

'this' @ [262:41] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeAsSequence[ReceiverParameterDescriptorImpl]

'sequenceOf' @ [263:9] ==> public fun <T> sequenceOf(vararg elements: CallableMemberDescriptor): Sequence<CallableMemberDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'this' @ [263:20] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeAsSequence.<anonymous>[ReceiverParameterDescriptorImpl]

'overriddenDescriptors' @ [263:28] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'asSequence' @ [263:50] ==> public fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.asSequence(): Sequence<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'flatMap' @ [263:63] ==> public fun <T, R> Sequence<(CallableMemberDescriptor..CallableMemberDescriptor?)>.flatMap(transform: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Sequence<CallableMemberDescriptor>): Sequence<CallableMemberDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <R> -> CallableMemberDescriptor

'it' @ [263:73] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeAsSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'overriddenTreeAsSequence' @ [263:76] ==> public fun CallableMemberDescriptor.overriddenTreeAsSequence(useOriginal: Boolean): Sequence<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[SimpleFunctionDescriptorImpl]

'useOriginal' @ [263:101] ==> value-parameter useOriginal: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeAsSequence[ValueParameterDescriptorImpl]

'hashSetOf' @ [267:15] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<D> /* = HashSet<D> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'Suppress' @ [269:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'with' @ [271:16] ==> @InlineOnly public inline fun <T, R> with(receiver: D, block: D.() -> Sequence<D>): Sequence<D> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D
    <R> -> Sequence<D>

'if (useOriginal) original as D else this' @ [271:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: D, elseBranch: D): D[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> D

'useOriginal' @ [271:25] ==> value-parameter useOriginal: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeUniqueAsSequence[ValueParameterDescriptorImpl]

'original' @ [271:38] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'this' @ [271:57] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeUniqueAsSequence.doBuildOverriddenTreeAsSequence[ReceiverParameterDescriptorImpl]

'if (original in set)
                emptySequence()
            else {
                set += original as D
                sequenceOf(this) + (overriddenDescriptors as Collection<D>).asSequence().flatMap { it.doBuildOverriddenTreeAsSequence() }
            }' @ [272:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<D>, elseBranch: Sequence<D>): Sequence<D>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<D>

'original' @ [272:17] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'set' @ [272:29] ==> val set: HashSet<D> /* = HashSet<D> */ defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeUniqueAsSequence[LocalVariableDescriptor]

'emptySequence' @ [273:17] ==> public fun <T> emptySequence(): Sequence<D> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'set' @ [275:17] ==> val set: HashSet<D> /* = HashSet<D> */ defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeUniqueAsSequence[LocalVariableDescriptor]

'original' @ [275:24] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'sequenceOf' @ [276:17] ==> public fun <T> sequenceOf(vararg elements: D): Sequence<D> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'this' @ [276:28] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeUniqueAsSequence.doBuildOverriddenTreeAsSequence.<anonymous>[ReceiverParameterDescriptorImpl]

'overriddenDescriptors' @ [276:37] ==> public final val CallableDescriptor.overriddenDescriptors: (MutableCollection<out (CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>)[MyPropertyDescriptor]

'asSequence' @ [276:77] ==> public fun <T> Iterable<D>.asSequence(): Sequence<D> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'flatMap' @ [276:90] ==> public fun <T, R> Sequence<D>.flatMap(transform: (D) -> Sequence<D>): Sequence<D> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D
    <R> -> D

'it' @ [276:100] ==> value-parameter it: D defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeUniqueAsSequence.doBuildOverriddenTreeAsSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'doBuildOverriddenTreeAsSequence' @ [276:103] ==> @Suppress local final fun D.doBuildOverriddenTreeAsSequence(): Sequence<D> defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeUniqueAsSequence[SimpleFunctionDescriptorImpl]

'doBuildOverriddenTreeAsSequence' @ [281:12] ==> @Suppress local final fun D.doBuildOverriddenTreeAsSequence(): Sequence<D> defined in org.jetbrains.kotlin.resolve.descriptorUtil.overriddenTreeUniqueAsSequence[SimpleFunctionDescriptorImpl]

'valueParameters' @ [285:9] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'indexOfFirst' @ [285:25] ==> public inline fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.indexOfFirst(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [285:40] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.varargParameterPosition.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [285:43] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[PropertyDescriptorImpl]

'scopeOwner' @ [308:21] ==> value-parameter scopeOwner: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.findImplicitOuterClassArguments[ValueParameterDescriptorImpl]

'classesFromInnerToOuter' @ [308:32] ==> private fun ClassDescriptor.classesFromInnerToOuter(): Sequence<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[SimpleFunctionDescriptorImpl]

'current' @ [309:27] ==> val current: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.findImplicitOuterClassArguments[LocalVariableDescriptor]

'getAllSuperClassesTypesIncludeItself' @ [309:35] ==> private fun ClassDescriptor.getAllSuperClassesTypesIncludeItself(): List<KotlinType> defined in org.jetbrains.kotlin.resolve.descriptorUtil[SimpleFunctionDescriptorImpl]

'supertype' @ [310:35] ==> val supertype: KotlinType defined in org.jetbrains.kotlin.resolve.descriptorUtil.findImplicitOuterClassArguments[LocalVariableDescriptor]

'constructor' @ [310:45] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [310:57] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classDescriptor' @ [311:17] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.findImplicitOuterClassArguments[LocalVariableDescriptor]

'outerClass' @ [311:36] ==> value-parameter outerClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.findImplicitOuterClassArguments[ValueParameterDescriptorImpl]

'supertype' @ [311:55] ==> val supertype: KotlinType defined in org.jetbrains.kotlin.resolve.descriptorUtil.findImplicitOuterClassArguments[LocalVariableDescriptor]

'arguments' @ [311:65] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'generateSequence' @ [318:57] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ClassDescriptor?, nextFunction: (ClassDescriptor) -> ClassDescriptor?): Sequence<ClassDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'this' @ [318:74] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.classesFromInnerToOuter[ReceiverParameterDescriptorImpl]

'if (it.isInner)
        it.containingDeclaration.original as? ClassDescriptor
    else
        null' @ [319:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'it' @ [319:9] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.classesFromInnerToOuter.<anonymous>[ValueParameterDescriptorImpl]

'isInner' @ [319:12] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'it' @ [320:9] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.classesFromInnerToOuter.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [320:12] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'original' @ [320:34] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'arrayListOf' @ [326:18] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'defaultType' @ [327:31] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'!' @ [329:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'current' @ [329:13] ==> var current: KotlinType defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassesTypesIncludeItself[LocalVariableDescriptor]

'isAnyOrNullableAny' @ [329:21] ==> public fun KotlinType.isAnyOrNullableAny(): Boolean defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [330:9] ==> val result: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassesTypesIncludeItself[LocalVariableDescriptor]

'add' @ [330:16] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'current' @ [330:20] ==> var current: KotlinType defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassesTypesIncludeItself[LocalVariableDescriptor]

'getSuperClassType' @ [331:36] ==> @NotNull public open fun getSuperClassType(@NotNull classDescriptor: ClassDescriptor): KotlinType defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'current' @ [331:54] ==> var current: KotlinType defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassesTypesIncludeItself[LocalVariableDescriptor]

'constructor' @ [331:62] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [331:74] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'current' @ [332:9] ==> var current: KotlinType defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassesTypesIncludeItself[LocalVariableDescriptor]

'?:' @ [332:19] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinType?, right: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinType

'create' @ [332:35] ==> @NotNull public open fun create(@NotNull context: KotlinType): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'current' @ [332:42] ==> var current: KotlinType defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassesTypesIncludeItself[LocalVariableDescriptor]

'substitute' @ [332:51] ==> @Nullable public open fun substitute(@NotNull type: KotlinType, @NotNull howThisTypeIsUsed: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'next' @ [332:62] ==> val next: KotlinType defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassesTypesIncludeItself[LocalVariableDescriptor]

'INVARIANT' @ [332:77] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'result' @ [335:12] ==> val result: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassesTypesIncludeItself[LocalVariableDescriptor]

'valueParameters' @ [339:32] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'builtIns' @ [340:26] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'stringType' @ [340:35] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'makeNullable' @ [340:46] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[SimpleFunctionDescriptorImpl]

'==' @ [341:12] ==> @Override public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ENUM_VALUE_OF' @ [341:28] ==> public final val ENUM_VALUE_OF: (Name..Name?) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaPropertyDescriptor]

'name' @ [341:45] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'methodTypeParameters' @ [342:15] ==> val methodTypeParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.descriptorUtil.isEnumValueOfMethod[LocalVariableDescriptor]

'size' @ [342:36] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'DEFAULT' @ [343:33] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [343:41] ==> public abstract fun isSubtypeOf(@NotNull subtype: KotlinType, @NotNull supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'methodTypeParameters' @ [343:53] ==> val methodTypeParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.descriptorUtil.isEnumValueOfMethod[LocalVariableDescriptor]

'type' @ [343:77] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'nullableString' @ [343:83] ==> val nullableString: KotlinType defined in org.jetbrains.kotlin.resolve.descriptorUtil.isEnumValueOfMethod[LocalVariableDescriptor]

'this' @ [347:13] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isExtensionProperty[ReceiverParameterDescriptorImpl]

'extensionReceiverParameter' @ [347:43] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'generateSequence' @ [350:9] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ClassDescriptor?, nextFunction: (ClassDescriptor) -> ClassDescriptor?): Sequence<ClassDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassDescriptor

'getSuperClassNotAny' @ [350:26] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[SimpleFunctionDescriptorImpl]

'toCollection' @ [350:87] ==> public fun <T, C : MutableCollection<in ClassDescriptor>> Sequence<ClassDescriptor>.toCollection(destination: SmartList<ClassDescriptor>): SmartList<ClassDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <C : MutableCollection<in T>> -> SmartList<ClassDescriptor>

'SmartList' @ [350:100] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ClassDescriptor

'hashSetOf' @ [353:15] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<ClassifierDescriptor> /* = HashSet<ClassifierDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'if (original in set) {
            emptySequence()
        }
        else {
            set += original
            sequenceOf(original) + typeConstructor.supertypes.asSequence().flatMap { it.constructor.declarationDescriptor?.doGetAllSuperClassesAndInterfaces() ?: sequenceOf() }
        }' @ [356:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<ClassifierDescriptor>, elseBranch: Sequence<ClassifierDescriptor>): Sequence<ClassifierDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<ClassifierDescriptor>

'original' @ [356:13] ==> public final val ClassifierDescriptor.original: ClassifierDescriptor[MyPropertyDescriptor]

'set' @ [356:25] ==> val set: HashSet<ClassifierDescriptor> /* = HashSet<ClassifierDescriptor> */ defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassifiers[LocalVariableDescriptor]

'emptySequence' @ [357:13] ==> public fun <T> emptySequence(): Sequence<ClassifierDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'set' @ [360:13] ==> val set: HashSet<ClassifierDescriptor> /* = HashSet<ClassifierDescriptor> */ defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassifiers[LocalVariableDescriptor]

'original' @ [360:20] ==> public final val ClassifierDescriptor.original: ClassifierDescriptor[MyPropertyDescriptor]

'sequenceOf' @ [361:13] ==> public fun <T> sequenceOf(vararg elements: ClassifierDescriptor): Sequence<ClassifierDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'original' @ [361:24] ==> public final val ClassifierDescriptor.original: ClassifierDescriptor[MyPropertyDescriptor]

'typeConstructor' @ [361:36] ==> public final val ClassifierDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [361:52] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'asSequence' @ [361:63] ==> public fun <T> Iterable<(KotlinType..KotlinType?)>.asSequence(): Sequence<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'flatMap' @ [361:76] ==> public fun <T, R> Sequence<(KotlinType..KotlinType?)>.flatMap(transform: ((KotlinType..KotlinType?)) -> Sequence<ClassifierDescriptor>): Sequence<ClassifierDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> ClassifierDescriptor

'it' @ [361:86] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassifiers.doGetAllSuperClassesAndInterfaces.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [361:89] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [361:101] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'doGetAllSuperClassesAndInterfaces' @ [361:124] ==> local final fun ClassifierDescriptor.doGetAllSuperClassesAndInterfaces(): Sequence<ClassifierDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassifiers[SimpleFunctionDescriptorImpl]

'sequenceOf' @ [361:163] ==> public fun <T> sequenceOf(vararg elements: ClassifierDescriptor): Sequence<ClassifierDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'doGetAllSuperClassesAndInterfaces' @ [364:12] ==> local final fun ClassifierDescriptor.doGetAllSuperClassesAndInterfaces(): Sequence<ClassifierDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperClassifiers[SimpleFunctionDescriptorImpl]

'sealedClass' @ [371:9] ==> value-parameter sealedClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[ValueParameterDescriptorImpl]

'modality' @ [371:21] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [371:33] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'SEALED' @ [371:42] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'emptyList' @ [371:57] ==> public fun <T> emptyList(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'linkedSetOf' @ [373:18] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<ClassDescriptor> /* = LinkedHashSet<ClassDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'scope' @ [376:28] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses.collectSubclasses[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [376:34] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'DescriptorKindFilter' @ [376:60] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CLASSIFIERS' @ [376:81] ==> @JvmField public final val CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'descriptor' @ [377:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses.collectSubclasses[LocalVariableDescriptor]

'isDirectSubclass' @ [379:33] ==> public open fun isDirectSubclass(@NotNull subClass: ClassDescriptor, @NotNull superClass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [379:50] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses.collectSubclasses[LocalVariableDescriptor]

'sealedClass' @ [379:62] ==> value-parameter sealedClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[ValueParameterDescriptorImpl]

'result' @ [380:17] ==> val result: LinkedHashSet<ClassDescriptor> /* = LinkedHashSet<ClassDescriptor> */ defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[LocalVariableDescriptor]

'add' @ [380:24] ==> public open fun add(element: ClassDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [380:28] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses.collectSubclasses[LocalVariableDescriptor]

'collectNested' @ [383:17] ==> value-parameter collectNested: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses.collectSubclasses[ValueParameterDescriptorImpl]

'collectSubclasses' @ [384:17] ==> local final fun collectSubclasses(scope: MemberScope, collectNested: Boolean): Unit defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[SimpleFunctionDescriptorImpl]

'descriptor' @ [384:35] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses.collectSubclasses[LocalVariableDescriptor]

'unsubstitutedInnerClassesScope' @ [384:46] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'collectNested' @ [384:78] ==> value-parameter collectNested: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses.collectSubclasses[ValueParameterDescriptorImpl]

'sealedClass' @ [389:21] ==> value-parameter sealedClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[ValueParameterDescriptorImpl]

'containingDeclaration' @ [389:33] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'container' @ [390:9] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[LocalVariableDescriptor]

'collectSubclasses' @ [391:9] ==> local final fun collectSubclasses(scope: MemberScope, collectNested: Boolean): Unit defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[SimpleFunctionDescriptorImpl]

'container' @ [391:27] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[LocalVariableDescriptor]

'getMemberScope' @ [391:37] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[SimpleFunctionDescriptorImpl]

'collectSubclasses' @ [393:5] ==> local final fun collectSubclasses(scope: MemberScope, collectNested: Boolean): Unit defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[SimpleFunctionDescriptorImpl]

'sealedClass' @ [393:23] ==> value-parameter sealedClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[ValueParameterDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [393:35] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'result' @ [394:12] ==> val result: LinkedHashSet<ClassDescriptor> /* = LinkedHashSet<ClassDescriptor> */ defined in org.jetbrains.kotlin.resolve.descriptorUtil.computeSealedSubclasses[LocalVariableDescriptor]

'constructors' @ [398:9] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'find' @ [398:22] ==> @InlineOnly public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.find(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): ClassConstructorDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [398:29] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.getNoArgsConstructor.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [398:32] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [398:48] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'constructors' @ [401:9] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'filter' @ [401:22] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filter(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [401:31] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.getConstructorForEmptyArgumentsList.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [401:34] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'all' @ [401:50] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.all(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [401:56] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.getConstructorForEmptyArgumentsList.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [401:59] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [401:80] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.descriptorUtil.getConstructorForEmptyArgumentsList.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [401:83] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[PropertyDescriptorImpl]

'if (this is CallableMemberDescriptor) DescriptorUtils.getDirectMember(this) else this' @ [404:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor, elseBranch: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor

'this' @ [404:26] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isPublishedApi[ReceiverParameterDescriptorImpl]

'getDirectMember' @ [404:76] ==> @NotNull public open fun getDirectMember(@NotNull descriptor: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [404:92] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isPublishedApi[ReceiverParameterDescriptorImpl]

'this' @ [404:103] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isPublishedApi[ReceiverParameterDescriptorImpl]

'descriptor' @ [405:12] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.isPublishedApi[LocalVariableDescriptor]

'annotations' @ [405:23] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[PropertyDescriptorImpl]

'hasAnnotation' @ [405:35] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'FQ_NAMES' @ [405:64] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'publishedApi' @ [405:73] ==> public final val publishedApi: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'isAncestor' @ [409:27] ==> public open fun isAncestor(@Nullable ancestor: DeclarationDescriptor?, @NotNull declarationDescriptor: DeclarationDescriptor, strict: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [409:38] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isAncestorOf[ReceiverParameterDescriptorImpl]

'descriptor' @ [409:44] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.isAncestorOf[ValueParameterDescriptorImpl]

'strict' @ [409:56] ==> value-parameter strict: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil.isAncestorOf[ValueParameterDescriptorImpl]

'isCompanionObject' @ [411:74] ==> public open fun isCompanionObject(@Nullable descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [411:92] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isCompanionObject[ReceiverParameterDescriptorImpl]

'isSubclass' @ [413:90] ==> public open fun isSubclass(@NotNull subClass: ClassDescriptor, @NotNull superClass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [413:101] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isSubclassOf[ReceiverParameterDescriptorImpl]

'superclass' @ [413:107] ==> value-parameter superclass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.isSubclassOf[ValueParameterDescriptorImpl]

'type' @ [416:13] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'constructor' @ [416:18] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [416:30] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'allValueArguments' @ [418:49] ==> public abstract val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'values' @ [418:67] ==> public abstract val values: Collection<ConstantValue<*>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'firstOrNull' @ [418:74] ==> public fun <T> Iterable<ConstantValue<*>>.firstOrNull(): ConstantValue<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<*>

'value' @ [418:89] ==> public open val value: Any? defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[PropertyDescriptorImpl]

'isExternal' @ [421:9] ==> public final val MemberDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'this' @ [423:9] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isEffectivelyExternal[ReceiverParameterDescriptorImpl]

'correspondingProperty' @ [424:34] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'variableDescriptor' @ [425:13] ==> val variableDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil.isEffectivelyExternal[LocalVariableDescriptor]

'isEffectivelyExternal' @ [425:32] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [428:9] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isEffectivelyExternal[ReceiverParameterDescriptorImpl]

'getter' @ [429:13] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'isExternal' @ [429:21] ==> public final val PropertyGetterDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'!' @ [430:14] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isVar' @ [430:15] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'setter' @ [430:24] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'isExternal' @ [430:32] ==> public final val PropertySetterDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'getContainingClass' @ [433:27] ==> @Nullable public open fun getContainingClass(@NotNull descriptor: DeclarationDescriptor): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [433:46] ==> <this> defined in org.jetbrains.kotlin.resolve.descriptorUtil.isEffectivelyExternal[ReceiverParameterDescriptorImpl]

'containingClass' @ [434:12] ==> val containingClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.isEffectivelyExternal[LocalVariableDescriptor]

'containingClass' @ [434:39] ==> val containingClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil.isEffectivelyExternal[LocalVariableDescriptor]

'isEffectivelyExternal' @ [434:55] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[SimpleFunctionDescriptorImpl]

