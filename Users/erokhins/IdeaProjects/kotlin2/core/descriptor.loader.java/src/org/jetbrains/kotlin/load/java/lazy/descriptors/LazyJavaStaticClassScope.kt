'LazyJavaStaticScope' @ [41:5] ==> public constructor LazyJavaStaticScope(c: LazyJavaResolverContext) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticScope[ClassConstructorDescriptorImpl]

'c' @ [41:25] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.<init>[ValueParameterDescriptorImpl]

'ClassDeclaredMemberIndex' @ [43:41] ==> public constructor ClassDeclaredMemberIndex(jClass: JavaClass, memberFilter: (JavaMember) -> Boolean) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[ClassConstructorDescriptorImpl]

'jClass' @ [43:66] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'it' @ [43:76] ==> value-parameter it: JavaMember defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeMemberIndex.<anonymous>[ValueParameterDescriptorImpl]

'isStatic' @ [43:79] ==> public abstract val isStatic: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaMember[PropertyDescriptorImpl]

'invoke' @ [46:9] ==> public abstract fun invoke(): DeclaredMemberIndex defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'getMethodNames' @ [46:31] ==> public abstract fun getMethodNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.DeclaredMemberIndex[SimpleFunctionDescriptorImpl]

'toMutableSet' @ [46:48] ==> public fun <T> Iterable<Name>.toMutableSet(): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'apply' @ [46:63] ==> @InlineOnly public inline fun <T> MutableSet<Name>.apply(block: MutableSet<Name>.() -> Unit): MutableSet<Name> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableSet<Name>

'addAll' @ [47:13] ==> public abstract fun addAll(elements: Collection<Name>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'ownerDescriptor' @ [47:20] ==> protected open val ownerDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'getParentJavaStaticClassScope' @ [47:36] ==> public fun ClassDescriptor.getParentJavaStaticClassScope(): LazyJavaStaticClassScope? defined in org.jetbrains.kotlin.load.java.descriptors in file util.kt[SimpleFunctionDescriptorImpl]

'getFunctionNames' @ [47:69] ==> public open fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[SimpleFunctionDescriptorImpl]

'orEmpty' @ [47:88] ==> @InlineOnly public inline fun <T> Set<Name>?.orEmpty(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'jClass' @ [48:17] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'isEnum' @ [48:24] ==> public abstract val isEnum: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'addAll' @ [49:17] ==> public abstract fun addAll(elements: Collection<Name>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'listOf' @ [49:24] ==> public fun <T> listOf(vararg elements: (Name..Name?)): List<(Name..Name?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'ENUM_VALUE_OF' @ [49:47] ==> public final val ENUM_VALUE_OF: (Name..Name?) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaPropertyDescriptor]

'ENUM_VALUES' @ [49:78] ==> public final val ENUM_VALUES: (Name..Name?) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaPropertyDescriptor]

'invoke' @ [54:9] ==> public abstract fun invoke(): DeclaredMemberIndex defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'getFieldNames' @ [54:31] ==> public abstract fun getFieldNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.DeclaredMemberIndex[SimpleFunctionDescriptorImpl]

'toMutableSet' @ [54:47] ==> public fun <T> Iterable<Name>.toMutableSet(): MutableSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'apply' @ [54:62] ==> @InlineOnly public inline fun <T> MutableSet<Name>.apply(block: MutableSet<Name>.() -> Unit): MutableSet<Name> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableSet<Name>

'flatMapJavaStaticSupertypesScopes' @ [55:13] ==> private final fun <R> flatMapJavaStaticSupertypesScopes(root: ClassDescriptor, result: MutableSet<Name>, onJavaStaticScope: (MemberScope) -> Collection<Name>): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Name

'ownerDescriptor' @ [55:47] ==> protected open val ownerDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'this' @ [55:64] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computePropertyNames.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [55:72] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computePropertyNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getVariableNames' @ [55:75] ==> public abstract fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'emptySet' @ [58:117] ==> public fun <T> emptySet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'getStaticFunctionsFromJavaSuperClasses' @ [66:39] ==> private final fun getStaticFunctionsFromJavaSuperClasses(name: Name, descriptor: ClassDescriptor): Set<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[SimpleFunctionDescriptorImpl]

'name' @ [66:78] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [66:84] ==> protected open val ownerDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'result' @ [67:9] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'addAll' @ [67:16] ==> public abstract fun addAll(elements: Collection<SimpleFunctionDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'resolveOverridesForStaticMembers' @ [67:23] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> resolveOverridesForStaticMembers(@NotNull name: Name, @NotNull membersFromSupertypes: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>), @NotNull membersFromCurrent: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>), @NotNull classDescriptor: ClassDescriptor, @NotNull errorReporter: ErrorReporter): (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>) defined in org.jetbrains.kotlin.load.java.components.DescriptorResolverUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'name' @ [67:56] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'functionsFromSupertypes' @ [67:62] ==> val functionsFromSupertypes: Set<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredFunctions[LocalVariableDescriptor]

'result' @ [67:87] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [67:95] ==> protected open val ownerDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'c' @ [67:112] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'components' @ [67:114] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'errorReporter' @ [67:125] ==> public final val errorReporter: ErrorReporter defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'jClass' @ [69:13] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'isEnum' @ [69:20] ==> public abstract val isEnum: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'when (name) {
                DescriptorUtils.ENUM_VALUE_OF -> result.add(createEnumValueOfMethod(ownerDescriptor))
                DescriptorUtils.ENUM_VALUES -> result.add(createEnumValuesMethod(ownerDescriptor))
            }' @ [70:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'name' @ [70:19] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'ENUM_VALUE_OF' @ [71:33] ==> public final val ENUM_VALUE_OF: (Name..Name?) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaPropertyDescriptor]

'result' @ [71:50] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'add' @ [71:57] ==> public abstract fun add(element: SimpleFunctionDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createEnumValueOfMethod' @ [71:61] ==> @NotNull public open fun createEnumValueOfMethod(@NotNull p0: ClassDescriptor): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'ownerDescriptor' @ [71:85] ==> protected open val ownerDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'ENUM_VALUES' @ [72:33] ==> public final val ENUM_VALUES: (Name..Name?) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaPropertyDescriptor]

'result' @ [72:48] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'add' @ [72:55] ==> public abstract fun add(element: SimpleFunctionDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createEnumValuesMethod' @ [72:59] ==> @NotNull public open fun createEnumValuesMethod(@NotNull p0: ClassDescriptor): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'ownerDescriptor' @ [72:82] ==> protected open val ownerDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'flatMapJavaStaticSupertypesScopes' @ [78:40] ==> private final fun <R> flatMapJavaStaticSupertypesScopes(root: ClassDescriptor, result: MutableSet<PropertyDescriptor>, onJavaStaticScope: (MemberScope) -> Collection<PropertyDescriptor>): Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> PropertyDescriptor

'ownerDescriptor' @ [78:74] ==> protected open val ownerDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'mutableSetOf' @ [78:91] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'it' @ [79:13] ==> value-parameter it: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties.<anonymous>[ValueParameterDescriptorImpl]

'getContributedVariables' @ [79:16] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [79:40] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'WHEN_GET_SUPER_MEMBERS' @ [79:63] ==> enum entry WHEN_GET_SUPER_MEMBERS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'if (result.isNotEmpty()) {
            result.addAll(resolveOverridesForStaticMembers(
                    name, propertiesFromSupertypes, result, ownerDescriptor, c.components.errorReporter
            ))
        }
        else {
            result.addAll(propertiesFromSupertypes.groupBy {
                it.realOriginal
            }.flatMap {
                resolveOverridesForStaticMembers(name, it.value, result, ownerDescriptor, c.components.errorReporter)
            })
        }' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'result' @ [82:13] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'isNotEmpty' @ [82:20] ==> @InlineOnly public inline fun <T> Collection<PropertyDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'result' @ [83:13] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'addAll' @ [83:20] ==> public abstract fun addAll(elements: Collection<PropertyDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'resolveOverridesForStaticMembers' @ [83:27] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> resolveOverridesForStaticMembers(@NotNull name: Name, @NotNull membersFromSupertypes: (MutableCollection<(PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>), @NotNull membersFromCurrent: (MutableCollection<(PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>), @NotNull classDescriptor: ClassDescriptor, @NotNull errorReporter: ErrorReporter): (MutableCollection<(PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>) defined in org.jetbrains.kotlin.load.java.components.DescriptorResolverUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'name' @ [84:21] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'propertiesFromSupertypes' @ [84:27] ==> val propertiesFromSupertypes: Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[LocalVariableDescriptor]

'result' @ [84:53] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [84:61] ==> protected open val ownerDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'c' @ [84:78] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'components' @ [84:80] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'errorReporter' @ [84:91] ==> public final val errorReporter: ErrorReporter defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'result' @ [88:13] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'addAll' @ [88:20] ==> public abstract fun addAll(elements: Collection<PropertyDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'propertiesFromSupertypes' @ [88:27] ==> val propertiesFromSupertypes: Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[LocalVariableDescriptor]

'groupBy' @ [88:52] ==> public inline fun <T, K> Iterable<PropertyDescriptor>.groupBy(keySelector: (PropertyDescriptor) -> PropertyDescriptor): Map<PropertyDescriptor, List<PropertyDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <K> -> PropertyDescriptor

'it' @ [89:17] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties.<anonymous>[ValueParameterDescriptorImpl]

'realOriginal' @ [89:20] ==> private final val PropertyDescriptor.realOriginal: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'flatMap' @ [90:15] ==> public inline fun <K, V, R> Map<out PropertyDescriptor, List<PropertyDescriptor>>.flatMap(transform: (Map.Entry<PropertyDescriptor, List<PropertyDescriptor>>) -> Iterable<(PropertyDescriptor..PropertyDescriptor?)>): List<(PropertyDescriptor..PropertyDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PropertyDescriptor
    <V> -> List<PropertyDescriptor>
    <R> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'resolveOverridesForStaticMembers' @ [91:17] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> resolveOverridesForStaticMembers(@NotNull name: Name, @NotNull membersFromSupertypes: (MutableCollection<(PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>), @NotNull membersFromCurrent: (MutableCollection<(PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>), @NotNull classDescriptor: ClassDescriptor, @NotNull errorReporter: ErrorReporter): (MutableCollection<(PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>) defined in org.jetbrains.kotlin.load.java.components.DescriptorResolverUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'name' @ [91:50] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'it' @ [91:56] ==> value-parameter it: Map.Entry<PropertyDescriptor, List<PropertyDescriptor>> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [91:59] ==> public abstract val value: List<PropertyDescriptor> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'result' @ [91:66] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [91:74] ==> protected open val ownerDescriptor: LazyJavaClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'c' @ [91:91] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'components' @ [91:93] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'errorReporter' @ [91:104] ==> public final val errorReporter: ErrorReporter defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'descriptor' @ [97:27] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.getStaticFunctionsFromJavaSuperClasses[ValueParameterDescriptorImpl]

'getParentJavaStaticClassScope' @ [97:38] ==> public fun ClassDescriptor.getParentJavaStaticClassScope(): LazyJavaStaticClassScope? defined in org.jetbrains.kotlin.load.java.descriptors in file util.kt[SimpleFunctionDescriptorImpl]

'emptySet' @ [97:80] ==> public fun <T> emptySet(): Set<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'staticScope' @ [98:16] ==> val staticScope: LazyJavaStaticClassScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.getStaticFunctionsFromJavaSuperClasses[LocalVariableDescriptor]

'getContributedFunctions' @ [98:28] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[SimpleFunctionDescriptorImpl]

'name' @ [98:52] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.getStaticFunctionsFromJavaSuperClasses[ValueParameterDescriptorImpl]

'WHEN_GET_SUPER_MEMBERS' @ [98:75] ==> enum entry WHEN_GET_SUPER_MEMBERS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'toSet' @ [98:99] ==> public fun <T> Iterable<SimpleFunctionDescriptor>.toSet(): Set<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'dfs' @ [106:13] ==> public final fun <N : (Any..Any?), R : (Any..Any?)> dfs(@NotNull p0: (MutableCollection<(ClassDescriptor..ClassDescriptor?)>..Collection<(ClassDescriptor..ClassDescriptor?)>), @NotNull p1: ((ClassDescriptor..ClassDescriptor?)) -> (MutableIterable<(ClassDescriptor..ClassDescriptor?)>..Iterable<(ClassDescriptor..ClassDescriptor?)>), @NotNull p2: DFS.NodeHandler<(ClassDescriptor..ClassDescriptor?), (Unit..Unit?)>): (Unit..Unit?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)
    <R : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'listOf' @ [106:17] ==> public fun <T> listOf(element: ClassDescriptor): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'root' @ [106:24] ==> value-parameter root: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes[ValueParameterDescriptorImpl]

'it' @ [108:21] ==> value-parameter it: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.<anonymous>[ValueParameterDescriptorImpl]

'typeConstructor' @ [108:24] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [108:40] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'asSequence' @ [108:51] ==> public fun <T> Iterable<(KotlinType..KotlinType?)>.asSequence(): Sequence<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'mapNotNull' @ [108:64] ==> public fun <T, R : Any> Sequence<(KotlinType..KotlinType?)>.mapNotNull(transform: ((KotlinType..KotlinType?)) -> ClassDescriptor?): Sequence<ClassDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R : Any> -> ClassDescriptor

'supertype' @ [109:38] ==> value-parameter supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [109:48] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [109:60] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'asIterable' @ [110:23] ==> public fun <T> Sequence<ClassDescriptor>.asIterable(): Iterable<ClassDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'DFS.AbstractNodeHandler<ClassDescriptor, Unit>' @ [112:26] ==> public constructor AbstractNodeHandler<N : (Any..Any?), R : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.DFS.AbstractNodeHandler[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> ClassDescriptor
    <R : (Any..Any?)> -> Unit

'current' @ [114:29] ==> value-parameter current: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.<no name provided>.beforeChildren[ValueParameterDescriptorImpl]

'root' @ [114:41] ==> value-parameter root: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes[ValueParameterDescriptorImpl]

'current' @ [115:43] ==> value-parameter current: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.<no name provided>.beforeChildren[ValueParameterDescriptorImpl]

'staticScope' @ [115:51] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'staticScope' @ [117:29] ==> val staticScope: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.<no name provided>.beforeChildren[LocalVariableDescriptor]

'result' @ [118:29] ==> value-parameter result: MutableSet<R> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes[ValueParameterDescriptorImpl]

'addAll' @ [118:36] ==> public abstract fun addAll(elements: Collection<R>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'invoke' @ [118:43] ==> public abstract operator fun invoke(p1: MemberScope): Collection<R> defined in kotlin.Function1[FunctionInvokeDescriptor]

'staticScope' @ [118:61] ==> val staticScope: MemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.<no name provided>.beforeChildren[LocalVariableDescriptor]

'result' @ [128:16] ==> value-parameter result: MutableSet<R> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes[ValueParameterDescriptorImpl]

'this' @ [133:17] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.realOriginal[ReceiverParameterDescriptorImpl]

'kind' @ [133:22] ==> public final val PropertyDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [133:27] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'this' @ [133:42] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.realOriginal[ReceiverParameterDescriptorImpl]

'this' @ [135:20] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.realOriginal[ReceiverParameterDescriptorImpl]

'overriddenDescriptors' @ [135:25] ==> public final var PropertyDescriptor.overriddenDescriptors: (MutableCollection<out (PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>)[MyPropertyDescriptor]

'map' @ [135:47] ==> public inline fun <T, R> Iterable<(PropertyDescriptor..PropertyDescriptor?)>.map(transform: ((PropertyDescriptor..PropertyDescriptor?)) -> PropertyDescriptor): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)
    <R> -> PropertyDescriptor

'it' @ [135:53] ==> value-parameter it: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope.<get-realOriginal>.<anonymous>[ValueParameterDescriptorImpl]

'realOriginal' @ [135:56] ==> private final val PropertyDescriptor.realOriginal: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[PropertyDescriptorImpl]

'distinct' @ [135:71] ==> public fun <T> Iterable<PropertyDescriptor>.distinct(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'single' @ [135:82] ==> public fun <T> List<PropertyDescriptor>.single(): PropertyDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

