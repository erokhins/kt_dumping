'getValue' @ [34:46] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (RuntimeModuleData..RuntimeModuleData?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [34:64] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (RuntimeModuleData..RuntimeModuleData?)): ReflectProperties.LazySoftVal<(RuntimeModuleData..RuntimeModuleData?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> RuntimeModuleData

'jClass' @ [35:13] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'getOrCreateModule' @ [35:20] ==> internal fun Class<*>.getOrCreateModule(): RuntimeModuleData defined in kotlin.reflect.jvm.internal in file moduleByClassLoader.kt[SimpleFunctionDescriptorImpl]

'jClass' @ [40:17] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'DeclarationDescriptorVisitorEmptyBodies<KCallableImpl<*>, Unit>' @ [51:32] ==> public constructor DeclarationDescriptorVisitorEmptyBodies<R : (Any..Any?), D : (Any..Any?)>() defined in org.jetbrains.kotlin.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies[JavaClassConstructorDescriptor]
Inferred types:
    <R : (Any..Any?)> -> KCallableImpl<*>
    <D : (Any..Any?)> -> Unit

'createProperty' @ [53:21] ==> private final fun createProperty(descriptor: PropertyDescriptor): KPropertyImpl<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'descriptor' @ [53:36] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers.<no name provided>.visitPropertyDescriptor[ValueParameterDescriptorImpl]

'KFunctionImpl' @ [56:21] ==> public constructor KFunctionImpl(container: KDeclarationContainerImpl, descriptor: FunctionDescriptor) defined in kotlin.reflect.jvm.internal.KFunctionImpl[ClassConstructorDescriptorImpl]

'this@KDeclarationContainerImpl' @ [56:35] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'descriptor' @ [56:67] ==> value-parameter descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers.<no name provided>.visitFunctionDescriptor[ValueParameterDescriptorImpl]

'IllegalStateException' @ [59:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [59:96] ==> value-parameter descriptor: ConstructorDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers.<no name provided>.visitConstructorDescriptor[ValueParameterDescriptorImpl]

'scope' @ [62:16] ==> value-parameter scope: MemberScope defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [62:22] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'mapNotNull' @ [62:50] ==> public inline fun <T, R : Any> Iterable<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> KCallableImpl<*>?): List<KCallableImpl<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> KCallableImpl<*>

'if (descriptor is CallableMemberDescriptor &&
                descriptor.visibility != Visibilities.INVISIBLE_FAKE &&
                belonginess.accept(descriptor))
                descriptor.accept(visitor, Unit)
            else null' @ [63:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KCallableImpl<*>?, elseBranch: KCallableImpl<*>?): KCallableImpl<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KCallableImpl<*>?

'descriptor' @ [63:17] ==> value-parameter descriptor: DeclarationDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [64:17] ==> value-parameter descriptor: DeclarationDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [64:28] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'INVISIBLE_FAKE' @ [64:55] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'belonginess' @ [65:17] ==> value-parameter belonginess: KDeclarationContainerImpl.MemberBelonginess defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers[ValueParameterDescriptorImpl]

'accept' @ [65:29] ==> public final fun accept(member: CallableMemberDescriptor): Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[SimpleFunctionDescriptorImpl]

'descriptor' @ [65:36] ==> value-parameter descriptor: DeclarationDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [66:17] ==> value-parameter descriptor: DeclarationDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [66:28] ==> public abstract fun <R : (Any..Any?), D : (Any..Any?)> accept(visitor: (DeclarationDescriptorVisitor<(KCallableImpl<*>..KCallableImpl<*>?), (Unit..Unit?)>..DeclarationDescriptorVisitor<(KCallableImpl<*>..KCallableImpl<*>?), (Unit..Unit?)>?), data: (Unit..Unit?)): (KCallableImpl<*>..KCallableImpl<*>?) defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> KCallableImpl<*>
    <D : (Any..Any?)> -> Unit

'visitor' @ [66:35] ==> val visitor: <no name provided> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.getMembers[LocalVariableDescriptor]

'Unit' @ [66:44] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'toList' @ [68:11] ==> public fun <T> Iterable<KCallableImpl<*>>.toList(): List<KCallableImpl<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KCallableImpl<*>

'member' @ [76:17] ==> value-parameter member: CallableMemberDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.accept[ValueParameterDescriptorImpl]

'kind' @ [76:24] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [76:29] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'this' @ [76:40] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[LazyClassReceiverParameterDescriptor]

'DECLARED' @ [76:48] ==> enum entry DECLARED defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[FakeCallableDescriptorForObject]

'+' @ [80:29] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [80:30] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [80:41] ==> public final val PropertyDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [80:68] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Int

'descriptor' @ [81:30] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [81:41] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [81:69] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Int

'when {
            descriptor.isVar -> when (receiverCount) {
                0 -> return KMutableProperty0Impl<Any?>(this, descriptor)
                1 -> return KMutableProperty1Impl<Any?, Any?>(this, descriptor)
                2 -> return KMutableProperty2Impl<Any?, Any?, Any?>(this, descriptor)
            }
            else -> when (receiverCount) {
                0 -> return KProperty0Impl<Any?>(this, descriptor)
                1 -> return KProperty1Impl<Any?, Any?>(this, descriptor)
                2 -> return KProperty2Impl<Any?, Any?, Any?>(this, descriptor)
            }
        }' @ [83:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'descriptor' @ [84:13] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'isVar' @ [84:24] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'when (receiverCount) {
                0 -> return KMutableProperty0Impl<Any?>(this, descriptor)
                1 -> return KMutableProperty1Impl<Any?, Any?>(this, descriptor)
                2 -> return KMutableProperty2Impl<Any?, Any?, Any?>(this, descriptor)
            }' @ [84:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'receiverCount' @ [84:39] ==> val receiverCount: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[LocalVariableDescriptor]

'KMutableProperty0Impl' @ [85:29] ==> public constructor KMutableProperty0Impl<R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KMutableProperty0Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <R> -> Any?

'this' @ [85:57] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'descriptor' @ [85:63] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'KMutableProperty1Impl' @ [86:29] ==> public constructor KMutableProperty1Impl<T, R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KMutableProperty1Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Any?
    <R> -> Any?

'this' @ [86:63] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'descriptor' @ [86:69] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'KMutableProperty2Impl' @ [87:29] ==> public constructor KMutableProperty2Impl<D, E, R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KMutableProperty2Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <D> -> Any?
    <E> -> Any?
    <R> -> Any?

'this' @ [87:69] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'descriptor' @ [87:75] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'when (receiverCount) {
                0 -> return KProperty0Impl<Any?>(this, descriptor)
                1 -> return KProperty1Impl<Any?, Any?>(this, descriptor)
                2 -> return KProperty2Impl<Any?, Any?, Any?>(this, descriptor)
            }' @ [89:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'receiverCount' @ [89:27] ==> val receiverCount: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[LocalVariableDescriptor]

'KProperty0Impl' @ [90:29] ==> public constructor KProperty0Impl<out R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KProperty0Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <out R> -> Any?

'this' @ [90:50] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'descriptor' @ [90:56] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'KProperty1Impl' @ [91:29] ==> public constructor KProperty1Impl<T, out R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KProperty1Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Any?
    <out R> -> Any?

'this' @ [91:56] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'descriptor' @ [91:62] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'KProperty2Impl' @ [92:29] ==> public constructor KProperty2Impl<D, E, out R>(container: KDeclarationContainerImpl, descriptor: PropertyDescriptor) defined in kotlin.reflect.jvm.internal.KProperty2Impl[ClassConstructorDescriptorImpl]
Inferred types:
    <D> -> Any?
    <E> -> Any?
    <out R> -> Any?

'this' @ [92:62] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'descriptor' @ [92:68] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'KotlinReflectionInternalError' @ [96:15] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'descriptor' @ [96:69] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.createProperty[ValueParameterDescriptorImpl]

'LOCAL_PROPERTY_SIGNATURE' @ [100:21] ==> internal final val LOCAL_PROPERTY_SIGNATURE: Regex defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Companion[PropertyDescriptorImpl]

'matchEntire' @ [100:46] ==> public final fun matchEntire(input: CharSequence): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'signature' @ [100:58] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[ValueParameterDescriptorImpl]

'match' @ [101:13] ==> val match: MatchResult? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'component1' @ [102:18] ==> @InlineOnly public final operator inline fun component1(): String defined in kotlin.text.MatchResult.Destructured[DeserializedSimpleFunctionDescriptor]

'match' @ [102:28] ==> val match: MatchResult? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'destructured' @ [102:34] ==> public open val destructured: MatchResult.Destructured defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'getLocalProperty' @ [103:20] ==> public abstract fun getLocalProperty(index: Int): PropertyDescriptor? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'number' @ [103:37] ==> val number: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'toInt' @ [103:44] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'KotlinReflectionInternalError' @ [104:29] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'number' @ [104:77] ==> val number: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'jClass' @ [104:98] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'getProperties' @ [107:26] ==> public abstract fun getProperties(name: Name): Collection<PropertyDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'identifier' @ [107:45] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [107:56] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[ValueParameterDescriptorImpl]

'filter' @ [108:18] ==> public inline fun <T> Iterable<PropertyDescriptor>.filter(predicate: (PropertyDescriptor) -> Boolean): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'RuntimeTypeMapper' @ [109:21] ==> internal object RuntimeTypeMapper defined in kotlin.reflect.jvm.internal in file RuntimeTypeMapper.kt[FakeCallableDescriptorForObject]

'mapPropertySignature' @ [109:39] ==> public final fun mapPropertySignature(possiblyOverriddenProperty: PropertyDescriptor): JvmPropertySignature defined in kotlin.reflect.jvm.internal.RuntimeTypeMapper[SimpleFunctionDescriptorImpl]

'descriptor' @ [109:60] ==> value-parameter descriptor: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [109:72] ==> public abstract fun asString(): String defined in kotlin.reflect.jvm.internal.JvmPropertySignature[SimpleFunctionDescriptorImpl]

'signature' @ [109:86] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[ValueParameterDescriptorImpl]

'properties' @ [112:13] ==> val properties: List<PropertyDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'isEmpty' @ [112:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'KotlinReflectionInternalError' @ [113:19] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'name' @ [113:61] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[ValueParameterDescriptorImpl]

'signature' @ [113:84] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[ValueParameterDescriptorImpl]

'this' @ [113:112] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'properties' @ [116:13] ==> val properties: List<PropertyDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'size' @ [116:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'properties' @ [127:41] ==> val properties: List<PropertyDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'groupBy' @ [128:22] ==> public inline fun <T, K> Iterable<PropertyDescriptor>.groupBy(keySelector: (PropertyDescriptor) -> Visibility): Map<Visibility, List<PropertyDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <K> -> Visibility

'it' @ [128:32] ==> value-parameter it: PropertyDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [128:35] ==> public final val PropertyDescriptor.visibility: Visibility[MyPropertyDescriptor]

'toSortedMap' @ [129:22] ==> public fun <K, V> Map<out Visibility, List<PropertyDescriptor>>.toSortedMap(comparator: Comparator<in Visibility>): SortedMap<Visibility, List<PropertyDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Visibility
    <V> -> List<PropertyDescriptor>

'Comparator' @ [129:34] ==> public fun <T> Comparator(function: ((Visibility..Visibility?), (Visibility..Visibility?)) -> Int): Comparator<Visibility> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Visibility

'?:' @ [130:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'compare' @ [130:38] ==> @Nullable public open fun compare(@NotNull first: Visibility, @NotNull second: Visibility): Int? defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'first' @ [130:46] ==> value-parameter first: (Visibility..Visibility?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [130:53] ==> value-parameter second: (Visibility..Visibility?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'values' @ [131:24] ==> public abstract val values: MutableCollection<(List<PropertyDescriptor>..List<PropertyDescriptor>?)> defined in java.util.SortedMap[JavaPropertyDescriptor]

'last' @ [131:31] ==> public fun <T> Iterable<(List<PropertyDescriptor>..List<PropertyDescriptor>?)>.last(): (List<PropertyDescriptor>..List<PropertyDescriptor>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.List<org.jetbrains.kotlin.descriptors.PropertyDescriptor>..kotlin.collections.List<org.jetbrains.kotlin.descriptors.PropertyDescriptor>?)

'mostVisibleProperties' @ [132:17] ==> val mostVisibleProperties: (List<PropertyDescriptor>..List<PropertyDescriptor>?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'size' @ [132:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'mostVisibleProperties' @ [133:24] ==> val mostVisibleProperties: (List<PropertyDescriptor>..List<PropertyDescriptor>?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'first' @ [133:46] ==> public fun <T> List<PropertyDescriptor>.first(): PropertyDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'KotlinReflectionInternalError' @ [136:19] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'properties' @ [137:24] ==> val properties: List<PropertyDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'size' @ [137:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'name' @ [137:54] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[ValueParameterDescriptorImpl]

'signature' @ [137:77] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[ValueParameterDescriptorImpl]

'this' @ [137:101] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'properties' @ [137:108] ==> val properties: List<PropertyDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'properties' @ [141:16] ==> val properties: List<PropertyDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findPropertyDescriptor[LocalVariableDescriptor]

'single' @ [141:27] ==> public fun <T> List<PropertyDescriptor>.single(): PropertyDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'if (name == "<init>") constructorDescriptors.toList() else getFunctions(Name.identifier(name))' @ [145:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<FunctionDescriptor>, elseBranch: Collection<FunctionDescriptor>): Collection<FunctionDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<FunctionDescriptor>

'name' @ [145:30] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[ValueParameterDescriptorImpl]

'constructorDescriptors' @ [145:48] ==> public abstract val constructorDescriptors: Collection<ConstructorDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[PropertyDescriptorImpl]

'toList' @ [145:71] ==> public fun <T> Iterable<ConstructorDescriptor>.toList(): List<ConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorDescriptor

'getFunctions' @ [145:85] ==> public abstract fun getFunctions(name: Name): Collection<FunctionDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'identifier' @ [145:103] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [145:114] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[ValueParameterDescriptorImpl]

'filter' @ [146:18] ==> public inline fun <T> Iterable<FunctionDescriptor>.filter(predicate: (FunctionDescriptor) -> Boolean): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'RuntimeTypeMapper' @ [147:21] ==> internal object RuntimeTypeMapper defined in kotlin.reflect.jvm.internal in file RuntimeTypeMapper.kt[FakeCallableDescriptorForObject]

'mapSignature' @ [147:39] ==> public final fun mapSignature(possiblySubstitutedFunction: FunctionDescriptor): JvmFunctionSignature defined in kotlin.reflect.jvm.internal.RuntimeTypeMapper[SimpleFunctionDescriptorImpl]

'descriptor' @ [147:52] ==> value-parameter descriptor: FunctionDescriptor defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [147:64] ==> public abstract fun asString(): String defined in kotlin.reflect.jvm.internal.JvmFunctionSignature[SimpleFunctionDescriptorImpl]

'signature' @ [147:78] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[ValueParameterDescriptorImpl]

'functions' @ [150:13] ==> val functions: List<FunctionDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[LocalVariableDescriptor]

'size' @ [150:23] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'name' @ [151:32] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[ValueParameterDescriptorImpl]

'signature' @ [151:55] ==> value-parameter signature: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[ValueParameterDescriptorImpl]

'KotlinReflectionInternalError' @ [152:19] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'if (functions.isEmpty()) "Function $debugText not resolved in $this"
                    else "${functions.size} functions $debugText resolved in $this: $functions"' @ [153:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'functions' @ [153:25] ==> val functions: List<FunctionDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[LocalVariableDescriptor]

'isEmpty' @ [153:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'debugText' @ [153:57] ==> val debugText: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[LocalVariableDescriptor]

'this' @ [153:84] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'functions' @ [154:29] ==> val functions: List<FunctionDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[LocalVariableDescriptor]

'size' @ [154:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'debugText' @ [154:56] ==> val debugText: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[LocalVariableDescriptor]

'this' @ [154:79] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[LazyClassReceiverParameterDescriptor]

'functions' @ [154:86] ==> val functions: List<FunctionDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[LocalVariableDescriptor]

'functions' @ [158:16] ==> val functions: List<FunctionDescriptor> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findFunctionDescriptor[LocalVariableDescriptor]

'single' @ [158:26] ==> public fun <T> List<FunctionDescriptor>.single(): FunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'parameterTypes' @ [162:31] ==> value-parameter parameterTypes: List<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[ValueParameterDescriptorImpl]

'toTypedArray' @ [162:46] ==> public inline fun <reified T> Collection<Class<*>>.toTypedArray(): Array<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Class<*>

'isPublic' @ [165:13] ==> value-parameter isPublic: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[ValueParameterDescriptorImpl]

'tryGetMethod' @ [166:20] ==> private final fun Class<*>.tryGetMethod(name: String, parameterTypes: Array<Class<*>>, returnType: Class<*>, declared: Boolean): Method? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'name' @ [166:33] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[ValueParameterDescriptorImpl]

'parametersArray' @ [166:39] ==> val parametersArray: Array<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[LocalVariableDescriptor]

'returnType' @ [166:56] ==> value-parameter returnType: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[ValueParameterDescriptorImpl]

'this' @ [170:32] ==> <this> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[ReceiverParameterDescriptorImpl]

'klass' @ [171:16] ==> var klass: Class<*>? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[LocalVariableDescriptor]

'klass' @ [172:26] ==> var klass: Class<*>? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[LocalVariableDescriptor]

'tryGetMethod' @ [172:32] ==> private final fun Class<*>.tryGetMethod(name: String, parameterTypes: Array<Class<*>>, returnType: Class<*>, declared: Boolean): Method? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'name' @ [172:45] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[ValueParameterDescriptorImpl]

'parametersArray' @ [172:51] ==> val parametersArray: Array<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[LocalVariableDescriptor]

'returnType' @ [172:68] ==> value-parameter returnType: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[ValueParameterDescriptorImpl]

'method' @ [173:17] ==> val method: Method? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[LocalVariableDescriptor]

'method' @ [173:40] ==> val method: Method? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[LocalVariableDescriptor]

'klass' @ [174:13] ==> var klass: Class<*>? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[LocalVariableDescriptor]

'klass' @ [174:21] ==> var klass: Class<*>? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.lookupMethod[LocalVariableDescriptor]

'superclass' @ [174:27] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.superclass: (Class<in (Nothing..Nothing?)>..Class<in (Nothing..Nothing?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'if (declared) getDeclaredMethod(name, *parameterTypes) else getMethod(name, *parameterTypes)' @ [182:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Method..Method?), elseBranch: (Method..Method?)): (Method..Method?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'declared' @ [182:34] ==> value-parameter declared: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'getDeclaredMethod' @ [182:44] ==> public open fun getDeclaredMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'name' @ [182:62] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'parameterTypes' @ [182:69] ==> value-parameter parameterTypes: Array<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'getMethod' @ [182:90] ==> public open fun getMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'name' @ [182:100] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'parameterTypes' @ [182:107] ==> value-parameter parameterTypes: Array<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'if (result.returnType == returnType) result
                else {
                    // If we've found a method with an unexpected return type, it's likely that there are several methods in this class
                    // with the given parameter types and Java reflection API has returned not the one we're looking for.
                    // Falling back to enumerating all methods in the class in this (rather rare) case.
                    // Example: class A(val x: Int) { fun getX(): String = ... }
                    val allMethods = if (declared) declaredMethods else methods
                    allMethods.firstOrNull { method ->
                        method.name == name &&
                        method.returnType == returnType &&
                        method.parameterTypes.contentEquals(parameterTypes)
                    }
                }' @ [184:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Method?, elseBranch: Method?): Method?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method?

'result' @ [184:21] ==> val result: (Method..Method?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[LocalVariableDescriptor]

'returnType' @ [184:28] ==> public final val Method.returnType: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'returnType' @ [184:42] ==> value-parameter returnType: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'result' @ [184:54] ==> val result: (Method..Method?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[LocalVariableDescriptor]

'if (declared) declaredMethods else methods' @ [190:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Array<(Method..Method?)>..Array<out (Method..Method?)>?), elseBranch: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)): (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Array<(java.lang.reflect.Method..java.lang.reflect.Method?)>..kotlin.Array<out (java.lang.reflect.Method..java.lang.reflect.Method?)>?)

'declared' @ [190:42] ==> value-parameter declared: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'declaredMethods' @ [190:52] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.declaredMethods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'methods' @ [190:73] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.methods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'allMethods' @ [191:21] ==> val allMethods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[LocalVariableDescriptor]

'firstOrNull' @ [191:32] ==> public inline fun <T> Array<out (Method..Method?)>.firstOrNull(predicate: ((Method..Method?)) -> Boolean): Method? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'method' @ [192:25] ==> value-parameter method: (Method..Method?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [192:32] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'name' @ [192:40] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'method' @ [193:25] ==> value-parameter method: (Method..Method?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [193:32] ==> public final val Method.returnType: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'returnType' @ [193:46] ==> value-parameter returnType: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'method' @ [194:25] ==> value-parameter method: (Method..Method?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod.<anonymous>[ValueParameterDescriptorImpl]

'parameterTypes' @ [194:32] ==> public final val Method.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]

'contentEquals' @ [194:47] ==> @SinceKotlin @InlineOnly public infix inline fun <T> Array<out (Class<*>..Class<*>?)>.contentEquals(other: Array<out (Class<*>..Class<*>?)>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.Class<*>..java.lang.Class<*>?)

'parameterTypes' @ [194:61] ==> value-parameter parameterTypes: Array<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod[ValueParameterDescriptorImpl]

'if (declared) getDeclaredConstructor(*parameterTypes.toTypedArray())
                else getConstructor(*parameterTypes.toTypedArray())' @ [204:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Constructor<*>?, elseBranch: Constructor<*>?): Constructor<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Constructor<*>?

'declared' @ [204:21] ==> value-parameter declared: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetConstructor[ValueParameterDescriptorImpl]

'getDeclaredConstructor' @ [204:31] ==> public open fun getDeclaredConstructor(vararg p0: (Class<*>..Class<*>?)): (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?) defined in java.lang.Class[JavaMethodDescriptor]

'parameterTypes' @ [204:55] ==> value-parameter parameterTypes: List<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetConstructor[ValueParameterDescriptorImpl]

'toTypedArray' @ [204:70] ==> public inline fun <reified T> Collection<Class<*>>.toTypedArray(): Array<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Class<*>

'getConstructor' @ [205:22] ==> public open fun getConstructor(vararg p0: (Class<*>..Class<*>?)): (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?) defined in java.lang.Class[JavaMethodDescriptor]

'parameterTypes' @ [205:38] ==> value-parameter parameterTypes: List<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetConstructor[ValueParameterDescriptorImpl]

'toTypedArray' @ [205:53] ==> public inline fun <reified T> Collection<Class<*>>.toTypedArray(): Array<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Class<*>

'name' @ [212:13] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findMethodBySignature[ValueParameterDescriptorImpl]

'methodOwner' @ [214:16] ==> protected open val methodOwner: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[PropertyDescriptorImpl]

'lookupMethod' @ [214:28] ==> private final fun Class<*>.lookupMethod(name: String, parameterTypes: List<Class<*>>, returnType: Class<*>, isPublic: Boolean): Method? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'name' @ [214:41] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findMethodBySignature[ValueParameterDescriptorImpl]

'loadParameterTypes' @ [214:47] ==> private final fun loadParameterTypes(desc: String): List<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'desc' @ [214:66] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findMethodBySignature[ValueParameterDescriptorImpl]

'loadReturnType' @ [214:73] ==> private final fun loadReturnType(desc: String): Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'desc' @ [214:88] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findMethodBySignature[ValueParameterDescriptorImpl]

'isPublic' @ [214:95] ==> value-parameter isPublic: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findMethodBySignature[ValueParameterDescriptorImpl]

'name' @ [218:13] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultMethod[ValueParameterDescriptorImpl]

'arrayListOf' @ [220:30] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'isMember' @ [221:13] ==> value-parameter isMember: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultMethod[ValueParameterDescriptorImpl]

'parameterTypes' @ [222:13] ==> val parameterTypes: ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultMethod[LocalVariableDescriptor]

'add' @ [222:28] ==> public open fun add(element: Class<*>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'jClass' @ [222:32] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'addParametersAndMasks' @ [224:9] ==> private final fun addParametersAndMasks(result: MutableList<Class<*>>, desc: String, isConstructor: Boolean): Unit defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'parameterTypes' @ [224:31] ==> val parameterTypes: ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultMethod[LocalVariableDescriptor]

'desc' @ [224:47] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultMethod[ValueParameterDescriptorImpl]

'methodOwner' @ [226:16] ==> protected open val methodOwner: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[PropertyDescriptorImpl]

'lookupMethod' @ [226:28] ==> private final fun Class<*>.lookupMethod(name: String, parameterTypes: List<Class<*>>, returnType: Class<*>, isPublic: Boolean): Method? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'name' @ [226:41] ==> value-parameter name: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultMethod[ValueParameterDescriptorImpl]

'DEFAULT_PARAMS_IMPL_SUFFIX' @ [226:55] ==> public const final val DEFAULT_PARAMS_IMPL_SUFFIX: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'parameterTypes' @ [226:83] ==> val parameterTypes: ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultMethod[LocalVariableDescriptor]

'loadReturnType' @ [226:99] ==> private final fun loadReturnType(desc: String): Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'desc' @ [226:114] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultMethod[ValueParameterDescriptorImpl]

'isPublic' @ [226:121] ==> value-parameter isPublic: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultMethod[ValueParameterDescriptorImpl]

'jClass' @ [230:16] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'tryGetConstructor' @ [230:23] ==> private final fun Class<*>.tryGetConstructor(parameterTypes: List<Class<*>>, declared: Boolean): Constructor<*>? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'loadParameterTypes' @ [230:41] ==> private final fun loadParameterTypes(desc: String): List<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'desc' @ [230:60] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findConstructorBySignature[ValueParameterDescriptorImpl]

'!' @ [230:78] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPublic' @ [230:79] ==> value-parameter isPublic: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findConstructorBySignature[ValueParameterDescriptorImpl]

'arrayListOf' @ [234:30] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'addParametersAndMasks' @ [235:9] ==> private final fun addParametersAndMasks(result: MutableList<Class<*>>, desc: String, isConstructor: Boolean): Unit defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'parameterTypes' @ [235:31] ==> val parameterTypes: ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultConstructor[LocalVariableDescriptor]

'desc' @ [235:47] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultConstructor[ValueParameterDescriptorImpl]

'jClass' @ [237:16] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'tryGetConstructor' @ [237:23] ==> private final fun Class<*>.tryGetConstructor(parameterTypes: List<Class<*>>, declared: Boolean): Constructor<*>? defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'parameterTypes' @ [237:41] ==> val parameterTypes: ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultConstructor[LocalVariableDescriptor]

'!' @ [237:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPublic' @ [237:69] ==> value-parameter isPublic: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.findDefaultConstructor[ValueParameterDescriptorImpl]

'loadParameterTypes' @ [241:31] ==> private final fun loadParameterTypes(desc: String): List<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'desc' @ [241:50] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.addParametersAndMasks[ValueParameterDescriptorImpl]

'result' @ [242:9] ==> value-parameter result: MutableList<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.addParametersAndMasks[ValueParameterDescriptorImpl]

'addAll' @ [242:16] ==> public abstract fun addAll(elements: Collection<Class<*>>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [242:23] ==> val valueParameters: List<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.addParametersAndMasks[LocalVariableDescriptor]

'repeat' @ [243:9] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'/' @ [243:16] ==> public final operator fun div(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [243:17] ==> val valueParameters: List<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.addParametersAndMasks[LocalVariableDescriptor]

'size' @ [243:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'SIZE' @ [243:48] ==> public const final val SIZE: Int defined in java.lang.Integer[JavaPropertyDescriptor]

'SIZE' @ [243:68] ==> public const final val SIZE: Int defined in java.lang.Integer[JavaPropertyDescriptor]

'result' @ [244:13] ==> value-parameter result: MutableList<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.addParametersAndMasks[ValueParameterDescriptorImpl]

'add' @ [244:20] ==> public abstract fun add(element: Class<*>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'TYPE' @ [244:32] ==> public final val TYPE: (Class<(Int..Int?)>..Class<(Int..Int?)>?) defined in java.lang.Integer[JavaPropertyDescriptor]

'result' @ [246:9] ==> value-parameter result: MutableList<Class<*>> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.addParametersAndMasks[ValueParameterDescriptorImpl]

'add' @ [246:16] ==> public abstract fun add(element: Class<*>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'if (isConstructor) DEFAULT_CONSTRUCTOR_MARKER else Any::class.java' @ [246:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Class<out Any>, elseBranch: Class<out Any>): Class<out Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Class<out Any>

'isConstructor' @ [246:24] ==> value-parameter isConstructor: Boolean defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.addParametersAndMasks[ValueParameterDescriptorImpl]

'DEFAULT_CONSTRUCTOR_MARKER' @ [246:39] ==> private final val DEFAULT_CONSTRUCTOR_MARKER: (Class<*>..Class<*>?) defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Companion[PropertyDescriptorImpl]

'Any' @ [246:71] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [246:82] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'arrayListOf' @ [250:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'desc' @ [253:16] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[ValueParameterDescriptorImpl]

'begin' @ [253:21] ==> var begin: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'begin' @ [254:23] ==> var begin: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'desc' @ [255:20] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[ValueParameterDescriptorImpl]

'end' @ [255:25] ==> var end: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'end' @ [255:38] ==> var end: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'when (desc[end]) {
                in "VZCBSIFJD" -> end++
                'L' -> end = desc.indexOf(';', begin) + 1
                else -> throw KotlinReflectionInternalError("Unknown type prefix in the method signature: $desc")
            }' @ [256:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'desc' @ [256:19] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[ValueParameterDescriptorImpl]

'end' @ [256:24] ==> var end: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'in' @ [257:17] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'end' @ [257:35] ==> var end: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'end' @ [258:24] ==> var end: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'desc' @ [258:30] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[ValueParameterDescriptorImpl]

'indexOf' @ [258:35] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'begin' @ [258:48] ==> var begin: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'KotlinReflectionInternalError' @ [259:31] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'desc' @ [259:108] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[ValueParameterDescriptorImpl]

'result' @ [262:13] ==> val result: ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'add' @ [262:20] ==> public open fun add(element: Class<*>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'parseType' @ [262:24] ==> private final fun parseType(desc: String, begin: Int, end: Int): Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'desc' @ [262:34] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[ValueParameterDescriptorImpl]

'begin' @ [262:40] ==> var begin: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'end' @ [262:47] ==> var end: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'begin' @ [263:13] ==> var begin: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'end' @ [263:21] ==> var end: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'result' @ [266:16] ==> val result: ArrayList<Class<*>> /* = ArrayList<Class<*>> */ defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadParameterTypes[LocalVariableDescriptor]

'when (desc[begin]) {
                'L' -> jClass.safeClassLoader.loadClass(desc.substring(begin + 1, end - 1).replace('/', '.'))
                '[' -> parseType(desc, begin + 1, end).createArrayType()
                'V' -> Void.TYPE
                'Z' -> Boolean::class.java
                'C' -> Char::class.java
                'B' -> Byte::class.java
                'S' -> Short::class.java
                'I' -> Int::class.java
                'F' -> Float::class.java
                'J' -> Long::class.java
                'D' -> Double::class.java
                else -> throw KotlinReflectionInternalError("Unknown type prefix in the method signature: $desc")
            }' @ [270:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<*>, entry1: Class<*>, entry2: Class<*>, entry3: Class<*>, entry4: Class<*>, entry5: Class<*>, entry6: Class<*>, entry7: Class<*>, entry8: Class<*>, entry9: Class<*>, entry10: Class<*>, entry11: Class<*>): Class<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<*>

'desc' @ [270:19] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.parseType[ValueParameterDescriptorImpl]

'begin' @ [270:24] ==> value-parameter begin: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.parseType[ValueParameterDescriptorImpl]

'jClass' @ [271:24] ==> public abstract val jClass: Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[DeserializedPropertyDescriptor]

'safeClassLoader' @ [271:31] ==> public val Class<*>.safeClassLoader: ClassLoader defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'loadClass' @ [271:47] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'desc' @ [271:57] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.parseType[ValueParameterDescriptorImpl]

'substring' @ [271:62] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'begin' @ [271:72] ==> value-parameter begin: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.parseType[ValueParameterDescriptorImpl]

'end' @ [271:83] ==> value-parameter end: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.parseType[ValueParameterDescriptorImpl]

'replace' @ [271:92] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parseType' @ [272:24] ==> private final fun parseType(desc: String, begin: Int, end: Int): Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'desc' @ [272:34] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.parseType[ValueParameterDescriptorImpl]

'begin' @ [272:40] ==> value-parameter begin: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.parseType[ValueParameterDescriptorImpl]

'end' @ [272:51] ==> value-parameter end: Int defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.parseType[ValueParameterDescriptorImpl]

'createArrayType' @ [272:56] ==> public fun Class<*>.createArrayType(): Class<*> defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[SimpleFunctionDescriptorImpl]

'TYPE' @ [273:29] ==> public final val TYPE: (Class<(Void..Void?)>..Class<(Void..Void?)>?) defined in java.lang.Void[JavaPropertyDescriptor]

'Boolean' @ [274:24] ==> private constructor Boolean() defined in kotlin.Boolean[DeserializedClassConstructorDescriptor]

'java' @ [274:39] ==> public val <T> KClass<Boolean>.java: Class<Boolean> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Boolean

'Char' @ [275:24] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'java' @ [275:36] ==> public val <T> KClass<Char>.java: Class<Char> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Char

'Byte' @ [276:24] ==> public companion object defined in kotlin.Byte[FakeCallableDescriptorForObject]

'java' @ [276:36] ==> public val <T> KClass<Byte>.java: Class<Byte> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Byte

'Short' @ [277:24] ==> public companion object defined in kotlin.Short[FakeCallableDescriptorForObject]

'java' @ [277:37] ==> public val <T> KClass<Short>.java: Class<Short> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Short

'Int' @ [278:24] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'java' @ [278:35] ==> public val <T> KClass<Int>.java: Class<Int> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Int

'Float' @ [279:24] ==> public companion object defined in kotlin.Float[FakeCallableDescriptorForObject]

'java' @ [279:37] ==> public val <T> KClass<Float>.java: Class<Float> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Float

'Long' @ [280:24] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'java' @ [280:36] ==> public val <T> KClass<Long>.java: Class<Long> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Long

'Double' @ [281:24] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'java' @ [281:38] ==> public val <T> KClass<Double>.java: Class<Double> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Double

'KotlinReflectionInternalError' @ [282:31] ==> public constructor KotlinReflectionInternalError(message: String) defined in kotlin.reflect.jvm.internal.KotlinReflectionInternalError[ClassConstructorDescriptorImpl]

'desc' @ [282:108] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.parseType[ValueParameterDescriptorImpl]

'parseType' @ [286:13] ==> private final fun parseType(desc: String, begin: Int, end: Int): Class<*> defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl[SimpleFunctionDescriptorImpl]

'desc' @ [286:23] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadReturnType[ValueParameterDescriptorImpl]

'desc' @ [286:29] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadReturnType[ValueParameterDescriptorImpl]

'indexOf' @ [286:34] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'desc' @ [286:52] ==> value-parameter desc: String defined in kotlin.reflect.jvm.internal.KDeclarationContainerImpl.loadReturnType[ValueParameterDescriptorImpl]

'length' @ [286:57] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'forName' @ [289:56] ==> public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'toRegex' @ [291:62] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

