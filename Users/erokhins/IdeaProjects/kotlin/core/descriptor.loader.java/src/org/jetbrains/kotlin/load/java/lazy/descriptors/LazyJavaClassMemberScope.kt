'LazyJavaScope' @ [68:5] ==> public constructor LazyJavaScope(c: LazyJavaResolverContext) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[ClassConstructorDescriptorImpl]

'c' @ [68:19] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'ClassDeclaredMemberIndex' @ [70:41] ==> public constructor ClassDeclaredMemberIndex(jClass: JavaClass, memberFilter: (JavaMember) -> Boolean) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.ClassDeclaredMemberIndex[ClassConstructorDescriptorImpl]

'jClass' @ [70:66] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'!' @ [70:76] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [70:77] ==> value-parameter it: JavaMember defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeMemberIndex.<anonymous>[ValueParameterDescriptorImpl]

'isStatic' @ [70:80] ==> public abstract val isStatic: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaMember[PropertyDescriptorImpl]

'ownerDescriptor' @ [73:9] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'typeConstructor' @ [73:25] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [73:41] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'flatMapTo' @ [73:52] ==> public inline fun <T, R, C : MutableCollection<in Name>> Iterable<(KotlinType..KotlinType?)>.flatMapTo(destination: HashSet<Name>, transform: ((KotlinType..KotlinType?)) -> Iterable<Name>): HashSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> Name
    <C : MutableCollection<in R>> -> HashSet<Name>

'HashSet' @ [73:62] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Name

'it' @ [74:13] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeFunctionNames.<anonymous>[ValueParameterDescriptorImpl]

'memberScope' @ [74:16] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'getFunctionNames' @ [74:28] ==> public abstract fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'apply' @ [75:11] ==> @InlineOnly public inline fun <T> HashSet<Name>.apply(block: HashSet<Name>.() -> Unit): HashSet<Name> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HashSet<Name>

'addAll' @ [76:13] ==> public open fun addAll(elements: Collection<Name>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'invoke' @ [76:20] ==> public abstract fun invoke(): DeclaredMemberIndex defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'getMethodNames' @ [76:42] ==> public abstract fun getMethodNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.DeclaredMemberIndex[SimpleFunctionDescriptorImpl]

'addAll' @ [77:13] ==> public open fun addAll(elements: Collection<Name>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'computeClassNames' @ [77:20] ==> protected open fun computeClassNames(kindFilter: DescriptorKindFilter, nameFilter: ((Name) -> Boolean)?): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [77:38] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeFunctionNames[ValueParameterDescriptorImpl]

'nameFilter' @ [77:50] ==> value-parameter nameFilter: ((Name) -> Boolean)? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeFunctionNames[ValueParameterDescriptorImpl]

'c' @ [80:33] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [80:35] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [80:50] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<ClassConstructorDescriptor>): NotNullLazyValue<List<ClassConstructorDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> List<ClassConstructorDescriptor>

'jClass' @ [81:28] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'constructors' @ [81:35] ==> public abstract val constructors: Collection<JavaConstructor> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'ArrayList' @ [82:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JavaClassConstructorDescriptor

'constructors' @ [82:64] ==> val constructors: Collection<JavaConstructor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.constructors.<anonymous>[LocalVariableDescriptor]

'size' @ [82:77] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'constructors' @ [83:29] ==> val constructors: Collection<JavaConstructor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.constructors.<anonymous>[LocalVariableDescriptor]

'resolveConstructor' @ [84:30] ==> private final fun resolveConstructor(constructor: JavaConstructor): JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'constructor' @ [84:49] ==> val constructor: JavaConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.constructors.<anonymous>[LocalVariableDescriptor]

'result' @ [85:13] ==> val result: ArrayList<JavaClassConstructorDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.constructors.<anonymous>[LocalVariableDescriptor]

'add' @ [85:20] ==> public open fun add(element: JavaClassConstructorDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'descriptor' @ [85:24] ==> val descriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.constructors.<anonymous>[LocalVariableDescriptor]

'c' @ [88:9] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'components' @ [88:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'signatureEnhancement' @ [88:22] ==> public final val signatureEnhancement: SignatureEnhancement defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'enhanceSignatures' @ [88:43] ==> public final fun <D : CallableMemberDescriptor> enhanceSignatures(c: LazyJavaResolverContext, platformSignatures: Collection<ClassConstructorDescriptor>): Collection<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> ClassConstructorDescriptor

'c' @ [89:17] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'result' @ [90:17] ==> val result: ArrayList<JavaClassConstructorDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.constructors.<anonymous>[LocalVariableDescriptor]

'ifEmpty' @ [90:24] ==> public inline fun <T, C : Collection<ClassConstructorDescriptor>> List<ClassConstructorDescriptor>.ifEmpty(body: () -> List<ClassConstructorDescriptor>): List<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassConstructorDescriptor
    <C : Collection<T>> -> List<ClassConstructorDescriptor>

'listOfNotNull' @ [90:34] ==> public fun <T : Any> listOfNotNull(element: ClassConstructorDescriptor?): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassConstructorDescriptor

'createDefaultConstructor' @ [90:48] ==> private final fun createDefaultConstructor(): ClassConstructorDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'toList' @ [91:11] ==> public fun <T> Iterable<ClassConstructorDescriptor>.toList(): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor

'jClass' @ [95:13] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'isAnnotationType' @ [95:20] ==> public abstract val isAnnotationType: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'isVisibleAsFunctionInCurrentClass' @ [96:16] ==> private final fun isVisibleAsFunctionInCurrentClass(function: SimpleFunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'this' @ [96:50] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunction[ReceiverParameterDescriptorImpl]

'getPropertyNamesCandidatesByAccessorName' @ [100:13] ==> public fun getPropertyNamesCandidatesByAccessorName(name: Name): List<Name> defined in org.jetbrains.kotlin.load.java[SimpleFunctionDescriptorImpl]

'function' @ [100:54] ==> value-parameter function: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass[ValueParameterDescriptorImpl]

'name' @ [100:63] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'any' @ [100:69] ==> public inline fun <T> Iterable<Name>.any(predicate: (Name) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'getPropertiesFromSupertypes' @ [102:13] ==> private final fun getPropertiesFromSupertypes(name: Name): Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'propertyName' @ [102:41] ==> value-parameter propertyName: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [102:55] ==> public inline fun <T> Iterable<PropertyDescriptor>.any(predicate: (PropertyDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'doesClassOverridesProperty' @ [104:17] ==> private final fun doesClassOverridesProperty(property: PropertyDescriptor, functions: (Name) -> Collection<SimpleFunctionDescriptor>): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'property' @ [104:44] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (function.name == accessorName)
                        listOf(function)
                    else
                        searchMethodsByNameWithoutBuiltinMagic(accessorName) + searchMethodsInSupertypesWithoutBuiltinMagic(accessorName)' @ [109:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<SimpleFunctionDescriptor>, elseBranch: Collection<SimpleFunctionDescriptor>): Collection<SimpleFunctionDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<SimpleFunctionDescriptor>

'function' @ [109:25] ==> value-parameter function: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass[ValueParameterDescriptorImpl]

'name' @ [109:34] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'accessorName' @ [109:42] ==> value-parameter accessorName: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [110:25] ==> public fun <T> listOf(element: SimpleFunctionDescriptor): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'function' @ [110:32] ==> value-parameter function: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass[ValueParameterDescriptorImpl]

'searchMethodsByNameWithoutBuiltinMagic' @ [112:25] ==> private final fun searchMethodsByNameWithoutBuiltinMagic(name: Name): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'accessorName' @ [112:64] ==> value-parameter accessorName: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'searchMethodsInSupertypesWithoutBuiltinMagic' @ [112:80] ==> private final fun searchMethodsInSupertypesWithoutBuiltinMagic(name: Name): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'accessorName' @ [112:125] ==> value-parameter accessorName: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [113:23] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isVar' @ [113:32] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'!' @ [113:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSetterName' @ [113:49] ==> public open fun isSetterName(@NotNull name: String): Boolean defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'function' @ [113:62] ==> value-parameter function: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass[ValueParameterDescriptorImpl]

'name' @ [113:71] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [113:76] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'!' @ [117:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [117:17] ==> value-parameter function: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass[ValueParameterDescriptorImpl]

'doesOverrideRenamedBuiltins' @ [117:26] ==> private final fun SimpleFunctionDescriptor.doesOverrideRenamedBuiltins(): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'!' @ [117:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [117:60] ==> value-parameter function: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.isVisibleAsFunctionInCurrentClass[ValueParameterDescriptorImpl]

'shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters' @ [117:69] ==> private final fun SimpleFunctionDescriptor.shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'!' @ [128:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [128:14] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'sameAsBuiltinMethodWithErasedValueParameters' @ [128:19] ==> public final val Name.sameAsBuiltinMethodWithErasedValueParameters: Boolean defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithSpecialGenericSignature[PropertyImportedFromObject]

'getFunctionsFromSupertypes' @ [130:17] ==> private final fun getFunctionsFromSupertypes(name: Name): Set<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [130:44] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'mapNotNull' @ [130:50] ==> public inline fun <T, R : Any> Iterable<SimpleFunctionDescriptor>.mapNotNull(transform: (SimpleFunctionDescriptor) -> FunctionDescriptor?): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R : Any> -> FunctionDescriptor

'BuiltinMethodsWithSpecialGenericSignature' @ [131:21] ==> public object BuiltinMethodsWithSpecialGenericSignature defined in org.jetbrains.kotlin.load.java in file specialBuiltinMembers.kt[FakeCallableDescriptorForObject]

'getOverriddenBuiltinFunctionWithErasedValueParametersInJava' @ [131:63] ==> @JvmStatic public final fun getOverriddenBuiltinFunctionWithErasedValueParametersInJava(functionDescriptor: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithSpecialGenericSignature[SimpleFunctionDescriptorImpl]

'it' @ [131:123] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'candidatesToOverride' @ [134:16] ==> val candidatesToOverride: List<FunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters[LocalVariableDescriptor]

'any' @ [134:37] ==> public inline fun <T> Iterable<FunctionDescriptor>.any(predicate: (FunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'hasSameJvmDescriptorButDoesNotOverride' @ [136:13] ==> private final fun SimpleFunctionDescriptor.hasSameJvmDescriptorButDoesNotOverride(builtinWithErasedParameters: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'candidate' @ [136:52] ==> value-parameter candidate: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [141:13] ==> public abstract fun invoke(): DeclaredMemberIndex defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'findMethodsByName' @ [141:35] ==> public abstract fun findMethodsByName(name: Name): Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.DeclaredMemberIndex[SimpleFunctionDescriptorImpl]

'name' @ [141:53] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.searchMethodsByNameWithoutBuiltinMagic[ValueParameterDescriptorImpl]

'map' @ [141:59] ==> public inline fun <T, R> Iterable<JavaMethod>.map(transform: (JavaMethod) -> JavaMethodDescriptor): List<JavaMethodDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod
    <R> -> JavaMethodDescriptor

'resolveMethodToFunctionDescriptor' @ [141:65] ==> protected final fun resolveMethodToFunctionDescriptor(method: JavaMethod): JavaMethodDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [141:99] ==> value-parameter it: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.searchMethodsByNameWithoutBuiltinMagic.<anonymous>[ValueParameterDescriptorImpl]

'getFunctionsFromSupertypes' @ [144:13] ==> private final fun getFunctionsFromSupertypes(name: Name): Set<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [144:40] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.searchMethodsInSupertypesWithoutBuiltinMagic[ValueParameterDescriptorImpl]

'filterNot' @ [144:46] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.filterNot(predicate: (SimpleFunctionDescriptor) -> Boolean): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [145:17] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.searchMethodsInSupertypesWithoutBuiltinMagic.<anonymous>[ValueParameterDescriptorImpl]

'doesOverrideBuiltinWithDifferentJvmName' @ [145:20] ==> public fun CallableMemberDescriptor.doesOverrideBuiltinWithDifferentJvmName(): Boolean defined in org.jetbrains.kotlin.load.java in file specialBuiltinMembers.kt[SimpleFunctionDescriptorImpl]

'BuiltinMethodsWithSpecialGenericSignature' @ [146:28] ==> public object BuiltinMethodsWithSpecialGenericSignature defined in org.jetbrains.kotlin.load.java in file specialBuiltinMembers.kt[FakeCallableDescriptorForObject]

'getOverriddenBuiltinFunctionWithErasedValueParametersInJava' @ [146:70] ==> @JvmStatic public final fun getOverriddenBuiltinFunctionWithErasedValueParametersInJava(functionDescriptor: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithSpecialGenericSignature[SimpleFunctionDescriptorImpl]

'it' @ [146:130] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.searchMethodsInSupertypesWithoutBuiltinMagic.<anonymous>[ValueParameterDescriptorImpl]

'BuiltinMethodsWithDifferentJvmName' @ [150:16] ==> public object BuiltinMethodsWithDifferentJvmName defined in org.jetbrains.kotlin.load.java in file specialBuiltinMembers.kt[FakeCallableDescriptorForObject]

'getBuiltinFunctionNamesByJvmName' @ [150:51] ==> public final fun getBuiltinFunctionNamesByJvmName(name: Name): List<Name> defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithDifferentJvmName[SimpleFunctionDescriptorImpl]

'name' @ [150:84] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'any' @ [150:90] ==> public inline fun <T> Iterable<Name>.any(predicate: (Name) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'getFunctionsFromSupertypes' @ [154:21] ==> private final fun getFunctionsFromSupertypes(name: Name): Set<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'builtinName' @ [154:48] ==> value-parameter builtinName: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedBuiltins.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [154:61] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.filter(predicate: (SimpleFunctionDescriptor) -> Boolean): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [154:70] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedBuiltins.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'doesOverrideBuiltinWithDifferentJvmName' @ [154:73] ==> public fun CallableMemberDescriptor.doesOverrideBuiltinWithDifferentJvmName(): Boolean defined in org.jetbrains.kotlin.load.java in file specialBuiltinMembers.kt[SimpleFunctionDescriptorImpl]

'builtinSpecialFromSuperTypes' @ [155:17] ==> val builtinSpecialFromSuperTypes: List<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedBuiltins.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [155:46] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'this' @ [157:36] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedBuiltins[ReceiverParameterDescriptorImpl]

'createRenamedCopy' @ [157:41] ==> private final fun SimpleFunctionDescriptor.createRenamedCopy(builtinName: Name): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'builtinName' @ [157:59] ==> value-parameter builtinName: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedBuiltins.<anonymous>[ValueParameterDescriptorImpl]

'builtinSpecialFromSuperTypes' @ [159:13] ==> val builtinSpecialFromSuperTypes: List<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedBuiltins.<anonymous>[LocalVariableDescriptor]

'any' @ [159:42] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.any(predicate: (SimpleFunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'doesOverrideRenamedDescriptor' @ [159:48] ==> private final fun doesOverrideRenamedDescriptor(superDescriptor: SimpleFunctionDescriptor, subDescriptor: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [159:78] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedBuiltins.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'methodDescriptor' @ [159:82] ==> val methodDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedBuiltins.<anonymous>[LocalVariableDescriptor]

'this' @ [164:13] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createRenamedCopy[ReceiverParameterDescriptorImpl]

'newCopyBuilder' @ [164:18] ==> @NotNull @Override public abstract fun newCopyBuilder(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[JavaMethodDescriptor]

'apply' @ [164:35] ==> @InlineOnly public inline fun <T> FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>.apply(block: (FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>).() -> Unit): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CopyBuilder<out (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)>

'setName' @ [165:17] ==> @Override @NotNull public abstract fun setName(@NotNull name: Name): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'builtinName' @ [165:25] ==> value-parameter builtinName: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createRenamedCopy[ValueParameterDescriptorImpl]

'setSignatureChange' @ [166:17] ==> @NotNull public abstract fun setSignatureChange(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'setPreserveSourceElement' @ [167:17] ==> @NotNull public abstract fun setPreserveSourceElement(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'build' @ [168:15] ==> @Nullable @Override public abstract fun build(): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'if (superDescriptor.isRemoveAtByIndex) subDescriptor.original else subDescriptor' @ [175:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor, elseBranch: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor

'superDescriptor' @ [175:40] ==> value-parameter superDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedDescriptor[ValueParameterDescriptorImpl]

'isRemoveAtByIndex' @ [175:56] ==> public final val SimpleFunctionDescriptor.isRemoveAtByIndex: Boolean defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithDifferentJvmName[PropertyImportedFromObject]

'subDescriptor' @ [175:75] ==> value-parameter subDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedDescriptor[ValueParameterDescriptorImpl]

'original' @ [175:89] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'subDescriptor' @ [175:103] ==> value-parameter subDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedDescriptor[ValueParameterDescriptorImpl]

'subDescriptorToCheck' @ [177:16] ==> val subDescriptorToCheck: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedDescriptor[LocalVariableDescriptor]

'doesOverride' @ [177:37] ==> private final fun CallableDescriptor.doesOverride(superDescriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'superDescriptor' @ [177:50] ==> value-parameter superDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverrideRenamedDescriptor[ValueParameterDescriptorImpl]

'DEFAULT' @ [182:32] ==> public final val DEFAULT: (OverridingUtil..OverridingUtil?) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaPropertyDescriptor]

'isOverridableByWithoutExternalConditions' @ [182:40] ==> @NotNull public open fun isOverridableByWithoutExternalConditions(@NotNull superDescriptor: CallableDescriptor, @NotNull subDescriptor: CallableDescriptor, checkReturnType: Boolean): OverridingUtil.OverrideCompatibilityInfo defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'superDescriptor' @ [182:81] ==> value-parameter superDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverride[ValueParameterDescriptorImpl]

'this' @ [182:98] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverride[ReceiverParameterDescriptorImpl]

'result' @ [182:110] ==> public final val OverridingUtil.OverrideCompatibilityInfo.result: OverridingUtil.OverrideCompatibilityInfo.Result[MyPropertyDescriptor]

'commonOverridabilityResult' @ [184:16] ==> val commonOverridabilityResult: OverridingUtil.OverrideCompatibilityInfo.Result defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverride[LocalVariableDescriptor]

'OVERRIDABLE' @ [184:94] ==> enum entry OVERRIDABLE defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[FakeCallableDescriptorForObject]

'!' @ [185:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'JavaIncompatibilityRulesOverridabilityCondition' @ [185:22] ==> public companion object defined in org.jetbrains.kotlin.load.java.JavaIncompatibilityRulesOverridabilityCondition[FakeCallableDescriptorForObject]

'doesJavaOverrideHaveIncompatibleValueParameterKinds' @ [185:70] ==> public final fun doesJavaOverrideHaveIncompatibleValueParameterKinds(superDescriptor: CallableDescriptor, subDescriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion[SimpleFunctionDescriptorImpl]

'superDescriptor' @ [186:29] ==> value-parameter superDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverride[ValueParameterDescriptorImpl]

'this' @ [186:46] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesOverride[ReceiverParameterDescriptorImpl]

'getter' @ [192:41] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getOverriddenBuiltinWithDifferentJvmName' @ [192:49] ==> @Suppress public fun <T : CallableMemberDescriptor> PropertyGetterDescriptor.getOverriddenBuiltinWithDifferentJvmName(): PropertyGetterDescriptor? defined in org.jetbrains.kotlin.load.java[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CallableMemberDescriptor> -> PropertyGetterDescriptor

'overriddenBuiltinProperty' @ [193:33] ==> val overriddenBuiltinProperty: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterOverride[LocalVariableDescriptor]

'getBuiltinSpecialPropertyGetterName' @ [193:60] ==> public final fun CallableMemberDescriptor.getBuiltinSpecialPropertyGetterName(): String? defined in org.jetbrains.kotlin.load.java.BuiltinSpecialProperties[FunctionImportedFromObject]

'specialGetterName' @ [194:13] ==> val specialGetterName: String? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterOverride[LocalVariableDescriptor]

'!' @ [195:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this@LazyJavaClassMemberScope' @ [195:17] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[LazyClassReceiverParameterDescriptor]

'ownerDescriptor' @ [195:47] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'hasRealKotlinSuperClassWithOverrideOf' @ [195:63] ==> public fun ClassDescriptor.hasRealKotlinSuperClassWithOverrideOf(specialCallableDescriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.load.java in file specialBuiltinMembers.kt[SimpleFunctionDescriptorImpl]

'overriddenBuiltinProperty' @ [195:101] ==> val overriddenBuiltinProperty: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterOverride[LocalVariableDescriptor]

'findGetterByName' @ [197:20] ==> private final fun PropertyDescriptor.findGetterByName(getterName: String, functions: (Name) -> Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'specialGetterName' @ [197:37] ==> val specialGetterName: String? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterOverride[LocalVariableDescriptor]

'functions' @ [197:56] ==> value-parameter functions: (Name) -> Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterOverride[ValueParameterDescriptorImpl]

'findGetterByName' @ [200:16] ==> private final fun PropertyDescriptor.findGetterByName(getterName: String, functions: (Name) -> Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'getterName' @ [200:40] ==> @NotNull public open fun getterName(@NotNull propertyName: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [200:51] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [200:56] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'functions' @ [200:69] ==> value-parameter functions: (Name) -> Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterOverride[ValueParameterDescriptorImpl]

'invoke' @ [207:16] ==> public abstract operator fun invoke(p1: Name): Collection<SimpleFunctionDescriptor> defined in kotlin.Function1[FunctionInvokeDescriptor]

'identifier' @ [207:31] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'getterName' @ [207:42] ==> value-parameter getterName: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterByName[ValueParameterDescriptorImpl]

'firstNotNullResult' @ [207:55] ==> public inline fun <T, R : Any> Iterable<SimpleFunctionDescriptor>.firstNotNullResult(transform: (SimpleFunctionDescriptor) -> SimpleFunctionDescriptor?): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R : Any> -> SimpleFunctionDescriptor

'descriptor' @ [209:17] ==> value-parameter descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterByName.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [209:28] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [209:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'descriptor' @ [211:13] ==> value-parameter descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterByName.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [211:24] ==> @InlineOnly @SinceKotlin public inline fun <T> SimpleFunctionDescriptor.takeIf(predicate: (SimpleFunctionDescriptor) -> Boolean): SimpleFunctionDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'DEFAULT' @ [211:51] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [211:59] ==> public abstract fun isSubtypeOf(@NotNull subtype: KotlinType, @NotNull supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'descriptor' @ [211:71] ==> value-parameter descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findGetterByName.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [211:82] ==> public final val SimpleFunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'type' @ [211:117] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'invoke' @ [218:16] ==> public abstract operator fun invoke(p1: Name): Collection<SimpleFunctionDescriptor> defined in kotlin.Function1[FunctionInvokeDescriptor]

'identifier' @ [218:31] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'setterName' @ [218:49] ==> @NotNull public open fun setterName(@NotNull propertyName: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'name' @ [218:60] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [218:65] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'firstNotNullResult' @ [218:79] ==> public inline fun <T, R : Any> Iterable<SimpleFunctionDescriptor>.firstNotNullResult(transform: (SimpleFunctionDescriptor) -> SimpleFunctionDescriptor?): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R : Any> -> SimpleFunctionDescriptor

'descriptor' @ [220:17] ==> value-parameter descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findSetterOverride.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [220:28] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [220:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'!' @ [222:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [222:33] ==> public open fun isUnit(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'descriptor' @ [222:40] ==> value-parameter descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findSetterOverride.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [222:51] ==> public final val SimpleFunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'descriptor' @ [223:13] ==> value-parameter descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findSetterOverride.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [223:24] ==> @InlineOnly @SinceKotlin public inline fun <T> SimpleFunctionDescriptor.takeIf(predicate: (SimpleFunctionDescriptor) -> Boolean): SimpleFunctionDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'DEFAULT' @ [223:51] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [223:59] ==> public abstract fun equalTypes(@NotNull a: KotlinType, @NotNull b: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'descriptor' @ [223:70] ==> value-parameter descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.findSetterOverride.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [223:81] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'single' @ [223:97] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.single(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [223:106] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'type' @ [223:112] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'property' @ [231:13] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[ValueParameterDescriptorImpl]

'isJavaField' @ [231:22] ==> public val PropertyDescriptor.isJavaField: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors in file JavaDescriptorUtil.kt[PropertyDescriptorImpl]

'property' @ [232:22] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[ValueParameterDescriptorImpl]

'findGetterOverride' @ [232:31] ==> private final fun PropertyDescriptor.findGetterOverride(functions: (Name) -> Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'functions' @ [232:50] ==> value-parameter functions: (Name) -> Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[ValueParameterDescriptorImpl]

'property' @ [233:22] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[ValueParameterDescriptorImpl]

'findSetterOverride' @ [233:31] ==> private final fun PropertyDescriptor.findSetterOverride(functions: (Name) -> Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'functions' @ [233:50] ==> value-parameter functions: (Name) -> Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[ValueParameterDescriptorImpl]

'getter' @ [235:13] ==> val getter: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[LocalVariableDescriptor]

'!' @ [236:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'property' @ [236:14] ==> value-parameter property: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[ValueParameterDescriptorImpl]

'isVar' @ [236:23] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'setter' @ [238:16] ==> val setter: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[LocalVariableDescriptor]

'setter' @ [238:34] ==> val setter: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[LocalVariableDescriptor]

'modality' @ [238:41] ==> public final val SimpleFunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'getter' @ [238:53] ==> val getter: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.doesClassOverridesProperty[LocalVariableDescriptor]

'modality' @ [238:60] ==> public final val SimpleFunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'getFunctionsFromSupertypes' @ [242:39] ==> private final fun getFunctionsFromSupertypes(name: Name): Set<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [242:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'!' @ [244:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [244:14] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'sameAsRenamedInJvmBuiltin' @ [244:19] ==> public final val Name.sameAsRenamedInJvmBuiltin: Boolean defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithDifferentJvmName[PropertyImportedFromObject]

'!' @ [244:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [244:49] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'sameAsBuiltinMethodWithErasedValueParameters' @ [244:54] ==> public final val Name.sameAsBuiltinMethodWithErasedValueParameters: Boolean defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithSpecialGenericSignature[PropertyImportedFromObject]

'addFunctionFromSupertypes' @ [246:13] ==> private final fun addFunctionFromSupertypes(result: MutableCollection<SimpleFunctionDescriptor>, name: Name, functionsFromSupertypes: Collection<SimpleFunctionDescriptor>, isSpecialBuiltinName: Boolean): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'result' @ [247:21] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'name' @ [247:29] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'functionsFromSupertypes' @ [248:21] ==> val functionsFromSupertypes: Set<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[LocalVariableDescriptor]

'filter' @ [248:45] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.filter(predicate: (SimpleFunctionDescriptor) -> Boolean): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'isVisibleAsFunctionInCurrentClass' @ [248:54] ==> private final fun isVisibleAsFunctionInCurrentClass(function: SimpleFunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [248:88] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions.<anonymous>[ValueParameterDescriptorImpl]

'SmartSet' @ [253:45] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [253:54] ==> @JvmStatic public final fun <T> create(): SmartSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'resolveOverridesForNonStaticMembers' @ [256:44] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> resolveOverridesForNonStaticMembers(@NotNull name: Name, @NotNull membersFromSupertypes: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>), @NotNull membersFromCurrent: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>), @NotNull classDescriptor: ClassDescriptor, @NotNull errorReporter: ErrorReporter): (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>) defined in org.jetbrains.kotlin.load.java.components.DescriptorResolverUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> SimpleFunctionDescriptor

'name' @ [257:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'functionsFromSupertypes' @ [257:23] ==> val functionsFromSupertypes: Set<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[LocalVariableDescriptor]

'emptyList' @ [257:48] ==> public fun <T> emptyList(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'ownerDescriptor' @ [257:61] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'DO_NOTHING' @ [257:92] ==> public final val DO_NOTHING: (ErrorReporter..ErrorReporter?) defined in org.jetbrains.kotlin.serialization.deserialization.ErrorReporter[JavaPropertyDescriptor]

'addOverriddenBuiltinMethods' @ [260:9] ==> private final fun addOverriddenBuiltinMethods(name: Name, alreadyDeclaredFunctions: Collection<SimpleFunctionDescriptor>, candidatesForOverride: Collection<SimpleFunctionDescriptor>, result: MutableCollection<SimpleFunctionDescriptor>, functions: (Name) -> Collection<SimpleFunctionDescriptor>): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [261:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'result' @ [261:23] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'mergedFunctionFromSuperTypes' @ [261:31] ==> val mergedFunctionFromSuperTypes: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[LocalVariableDescriptor]

'result' @ [261:61] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'this' @ [262:17] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[LazyClassReceiverParameterDescriptor]

'addOverriddenBuiltinMethods' @ [265:9] ==> private final fun addOverriddenBuiltinMethods(name: Name, alreadyDeclaredFunctions: Collection<SimpleFunctionDescriptor>, candidatesForOverride: Collection<SimpleFunctionDescriptor>, result: MutableCollection<SimpleFunctionDescriptor>, functions: (Name) -> Collection<SimpleFunctionDescriptor>): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [266:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'result' @ [266:23] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'mergedFunctionFromSuperTypes' @ [266:31] ==> val mergedFunctionFromSuperTypes: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[LocalVariableDescriptor]

'specialBuiltinsFromSuperTypes' @ [266:61] ==> val specialBuiltinsFromSuperTypes: SmartSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[LocalVariableDescriptor]

'this' @ [267:17] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[LazyClassReceiverParameterDescriptor]

'functionsFromSupertypes' @ [270:17] ==> val functionsFromSupertypes: Set<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[LocalVariableDescriptor]

'filter' @ [270:41] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.filter(predicate: (SimpleFunctionDescriptor) -> Boolean): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'isVisibleAsFunctionInCurrentClass' @ [270:50] ==> private final fun isVisibleAsFunctionInCurrentClass(function: SimpleFunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [270:84] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions.<anonymous>[ValueParameterDescriptorImpl]

'specialBuiltinsFromSuperTypes' @ [270:92] ==> val specialBuiltinsFromSuperTypes: SmartSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[LocalVariableDescriptor]

'addFunctionFromSupertypes' @ [272:9] ==> private final fun addFunctionFromSupertypes(result: MutableCollection<SimpleFunctionDescriptor>, name: Name, functionsFromSupertypes: Collection<SimpleFunctionDescriptor>, isSpecialBuiltinName: Boolean): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'result' @ [272:35] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'name' @ [272:43] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[ValueParameterDescriptorImpl]

'visibleFunctionsFromSupertypes' @ [272:49] ==> val visibleFunctionsFromSupertypes: List<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredFunctions[LocalVariableDescriptor]

'resolveOverridesForNonStaticMembers' @ [282:35] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> resolveOverridesForNonStaticMembers(@NotNull name: Name, @NotNull membersFromSupertypes: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>), @NotNull membersFromCurrent: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>), @NotNull classDescriptor: ClassDescriptor, @NotNull errorReporter: ErrorReporter): (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>) defined in org.jetbrains.kotlin.load.java.components.DescriptorResolverUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> SimpleFunctionDescriptor

'name' @ [283:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[ValueParameterDescriptorImpl]

'functionsFromSupertypes' @ [283:23] ==> value-parameter functionsFromSupertypes: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[ValueParameterDescriptorImpl]

'result' @ [283:48] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [283:56] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'c' @ [283:73] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'components' @ [283:75] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'errorReporter' @ [283:86] ==> public final val errorReporter: ErrorReporter defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'if (!isSpecialBuiltinName) {
            result.addAll(additionalOverrides)
        }
        else {
            val allDescriptors = result + additionalOverrides
            result.addAll(
                    additionalOverrides.map {
                        resolvedOverride ->
                        val overriddenBuiltin = resolvedOverride.getOverriddenSpecialBuiltin()
                                                ?: return@map resolvedOverride

                        resolvedOverride.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(overriddenBuiltin, allDescriptors)
                    })
        }' @ [286:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [286:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSpecialBuiltinName' @ [286:14] ==> value-parameter isSpecialBuiltinName: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[ValueParameterDescriptorImpl]

'result' @ [287:13] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[ValueParameterDescriptorImpl]

'addAll' @ [287:20] ==> public abstract fun addAll(elements: Collection<SimpleFunctionDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'additionalOverrides' @ [287:27] ==> val additionalOverrides: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[LocalVariableDescriptor]

'result' @ [290:34] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[ValueParameterDescriptorImpl]

'additionalOverrides' @ [290:43] ==> val additionalOverrides: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[LocalVariableDescriptor]

'result' @ [291:13] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[ValueParameterDescriptorImpl]

'addAll' @ [291:20] ==> public abstract fun addAll(elements: Collection<SimpleFunctionDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'additionalOverrides' @ [292:21] ==> val additionalOverrides: (MutableCollection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..Collection<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[LocalVariableDescriptor]

'map' @ [292:41] ==> public inline fun <T, R> Iterable<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>.map(transform: ((SimpleFunctionDescriptor..SimpleFunctionDescriptor?)) -> SimpleFunctionDescriptor): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)
    <R> -> SimpleFunctionDescriptor

'resolvedOverride' @ [294:49] ==> value-parameter resolvedOverride: (SimpleFunctionDescriptor..SimpleFunctionDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'getOverriddenSpecialBuiltin' @ [294:66] ==> @Suppress public fun <T : CallableMemberDescriptor> (SimpleFunctionDescriptor..SimpleFunctionDescriptor?).getOverriddenSpecialBuiltin(): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CallableMemberDescriptor> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'resolvedOverride' @ [295:63] ==> value-parameter resolvedOverride: (SimpleFunctionDescriptor..SimpleFunctionDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'resolvedOverride' @ [297:25] ==> value-parameter resolvedOverride: (SimpleFunctionDescriptor..SimpleFunctionDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden' @ [297:42] ==> private final fun SimpleFunctionDescriptor.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(specialBuiltin: CallableDescriptor, alreadyDeclaredFunctions: Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'overriddenBuiltin' @ [297:97] ==> val overriddenBuiltin: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes.<anonymous>[LocalVariableDescriptor]

'allDescriptors' @ [297:116] ==> val allDescriptors: List<(SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addFunctionFromSupertypes[LocalVariableDescriptor]

'candidatesForOverride' @ [309:28] ==> value-parameter candidatesForOverride: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[ValueParameterDescriptorImpl]

'descriptor' @ [310:37] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'getOverriddenBuiltinWithDifferentJvmName' @ [310:48] ==> @Suppress public fun <T : CallableMemberDescriptor> SimpleFunctionDescriptor.getOverriddenBuiltinWithDifferentJvmName(): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CallableMemberDescriptor> -> SimpleFunctionDescriptor

'getJvmMethodNameIfSpecial' @ [312:30] ==> public fun getJvmMethodNameIfSpecial(callableMemberDescriptor: CallableMemberDescriptor): String? defined in org.jetbrains.kotlin.load.java in file specialBuiltinMembers.kt[SimpleFunctionDescriptorImpl]

'overriddenBuiltin' @ [312:56] ==> val overriddenBuiltin: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'invoke' @ [313:28] ==> public abstract operator fun invoke(p1: Name): Collection<SimpleFunctionDescriptor> defined in kotlin.Function1[FunctionInvokeDescriptor]

'identifier' @ [313:43] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'nameInJava' @ [313:54] ==> val nameInJava: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'method' @ [314:35] ==> val method: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'createRenamedCopy' @ [314:42] ==> private final fun SimpleFunctionDescriptor.createRenamedCopy(builtinName: Name): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [314:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[ValueParameterDescriptorImpl]

'doesOverrideRenamedDescriptor' @ [316:21] ==> private final fun doesOverrideRenamedDescriptor(superDescriptor: SimpleFunctionDescriptor, subDescriptor: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'overriddenBuiltin' @ [316:51] ==> val overriddenBuiltin: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'renamedCopy' @ [316:70] ==> val renamedCopy: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'result' @ [317:21] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[ValueParameterDescriptorImpl]

'add' @ [317:28] ==> public abstract fun add(element: SimpleFunctionDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'renamedCopy' @ [318:29] ==> val renamedCopy: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden' @ [318:41] ==> private final fun SimpleFunctionDescriptor.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(specialBuiltin: CallableDescriptor, alreadyDeclaredFunctions: Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'overriddenBuiltin' @ [318:96] ==> val overriddenBuiltin: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'alreadyDeclaredFunctions' @ [318:115] ==> value-parameter alreadyDeclaredFunctions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[ValueParameterDescriptorImpl]

'candidatesForOverride' @ [324:28] ==> value-parameter candidatesForOverride: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[ValueParameterDescriptorImpl]

'BuiltinMethodsWithSpecialGenericSignature' @ [326:21] ==> public object BuiltinMethodsWithSpecialGenericSignature defined in org.jetbrains.kotlin.load.java in file specialBuiltinMembers.kt[FakeCallableDescriptorForObject]

'getOverriddenBuiltinFunctionWithErasedValueParametersInJava' @ [326:63] ==> @JvmStatic public final fun getOverriddenBuiltinFunctionWithErasedValueParametersInJava(functionDescriptor: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithSpecialGenericSignature[SimpleFunctionDescriptorImpl]

'descriptor' @ [326:123] ==> val descriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'createOverrideForBuiltinFunctionWithErasedParameterIfNeeded' @ [329:13] ==> private final fun createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(overridden: FunctionDescriptor, functions: (Name) -> Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'overriddenBuiltin' @ [329:73] ==> val overriddenBuiltin: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'functions' @ [329:92] ==> value-parameter functions: (Name) -> Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[ValueParameterDescriptorImpl]

'let' @ [329:104] ==> @InlineOnly public inline fun <T, R> SimpleFunctionDescriptor.let(block: (SimpleFunctionDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R> -> Unit

'isVisibleAsFunctionInCurrentClass' @ [331:21] ==> private final fun isVisibleAsFunctionInCurrentClass(function: SimpleFunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'override' @ [331:55] ==> value-parameter override: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [332:21] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[ValueParameterDescriptorImpl]

'add' @ [332:28] ==> public abstract fun add(element: SimpleFunctionDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'override' @ [332:32] ==> value-parameter override: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods.<anonymous>[ValueParameterDescriptorImpl]

'createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden' @ [332:41] ==> private final fun SimpleFunctionDescriptor.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(specialBuiltin: CallableDescriptor, alreadyDeclaredFunctions: Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'overriddenBuiltin' @ [332:96] ==> val overriddenBuiltin: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[LocalVariableDescriptor]

'alreadyDeclaredFunctions' @ [332:115] ==> value-parameter alreadyDeclaredFunctions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addOverriddenBuiltinMethods[ValueParameterDescriptorImpl]

'if (alreadyDeclaredFunctions.none { this != it && it.initialSignatureDescriptor == null && it.doesOverride(specialBuiltin) })
            this
        else
            newCopyBuilder().setHiddenToOvercomeSignatureClash().build()!!' @ [348:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleFunctionDescriptor, elseBranch: SimpleFunctionDescriptor): SimpleFunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleFunctionDescriptor

'alreadyDeclaredFunctions' @ [348:13] ==> value-parameter alreadyDeclaredFunctions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden[ValueParameterDescriptorImpl]

'none' @ [348:38] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.none(predicate: (SimpleFunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'this' @ [348:45] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden[ReceiverParameterDescriptorImpl]

'it' @ [348:53] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [348:59] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden.<anonymous>[ValueParameterDescriptorImpl]

'initialSignatureDescriptor' @ [348:62] ==> public final val SimpleFunctionDescriptor.initialSignatureDescriptor: FunctionDescriptor?[MyPropertyDescriptor]

'it' @ [348:100] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden.<anonymous>[ValueParameterDescriptorImpl]

'doesOverride' @ [348:103] ==> private final fun CallableDescriptor.doesOverride(superDescriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'specialBuiltin' @ [348:116] ==> value-parameter specialBuiltin: CallableDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden[ValueParameterDescriptorImpl]

'this' @ [349:13] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden[ReceiverParameterDescriptorImpl]

'newCopyBuilder' @ [351:13] ==> @NotNull @Override public abstract fun newCopyBuilder(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[JavaMethodDescriptor]

'setHiddenToOvercomeSignatureClash' @ [351:30] ==> @NotNull public abstract fun setHiddenToOvercomeSignatureClash(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'build' @ [351:66] ==> @Nullable @Override public abstract fun build(): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'invoke' @ [357:16] ==> public abstract operator fun invoke(p1: Name): Collection<SimpleFunctionDescriptor> defined in kotlin.Function1[FunctionInvokeDescriptor]

'overridden' @ [357:26] ==> value-parameter overridden: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createOverrideForBuiltinFunctionWithErasedParameterIfNeeded[ValueParameterDescriptorImpl]

'name' @ [357:37] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'firstOrNull' @ [357:43] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.firstOrNull(predicate: (SimpleFunctionDescriptor) -> Boolean): SimpleFunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [358:13] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createOverrideForBuiltinFunctionWithErasedParameterIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'hasSameJvmDescriptorButDoesNotOverride' @ [358:16] ==> private final fun SimpleFunctionDescriptor.hasSameJvmDescriptorButDoesNotOverride(builtinWithErasedParameters: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'overridden' @ [358:55] ==> value-parameter overridden: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createOverrideForBuiltinFunctionWithErasedParameterIfNeeded[ValueParameterDescriptorImpl]

'let' @ [359:12] ==> @InlineOnly public inline fun <T, R> SimpleFunctionDescriptor.let(block: (SimpleFunctionDescriptor) -> SimpleFunctionDescriptor?): SimpleFunctionDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R> -> SimpleFunctionDescriptor?

'override' @ [361:13] ==> value-parameter override: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createOverrideForBuiltinFunctionWithErasedParameterIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'newCopyBuilder' @ [361:22] ==> @NotNull @Override public abstract fun newCopyBuilder(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[JavaMethodDescriptor]

'apply' @ [361:39] ==> @InlineOnly public inline fun <T> FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>.apply(block: (FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>).() -> Unit): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CopyBuilder<out (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)>

'setValueParameters' @ [362:17] ==> @NotNull public abstract fun setValueParameters(@NotNull parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'copyValueParameters' @ [362:36] ==> public fun copyValueParameters(newValueParametersTypes: Collection<KotlinType>, oldValueParameters: Collection<ValueParameterDescriptor>, newOwner: CallableDescriptor): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.descriptors[SimpleFunctionDescriptorImpl]

'overridden' @ [362:56] ==> value-parameter overridden: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createOverrideForBuiltinFunctionWithErasedParameterIfNeeded[ValueParameterDescriptorImpl]

'valueParameters' @ [362:67] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [362:83] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [362:89] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createOverrideForBuiltinFunctionWithErasedParameterIfNeeded.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [362:92] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'override' @ [362:100] ==> value-parameter override: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createOverrideForBuiltinFunctionWithErasedParameterIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [362:109] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'overridden' @ [362:126] ==> value-parameter overridden: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createOverrideForBuiltinFunctionWithErasedParameterIfNeeded[ValueParameterDescriptorImpl]

'setSignatureChange' @ [363:17] ==> @NotNull public abstract fun setSignatureChange(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'setPreserveSourceElement' @ [364:17] ==> @NotNull public abstract fun setPreserveSourceElement(): FunctionDescriptor.CopyBuilder<out (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)> defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'build' @ [365:15] ==> @Nullable @Override public abstract fun build(): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor.CopyBuilder[JavaMethodDescriptor]

'ownerDescriptor' @ [370:16] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'typeConstructor' @ [370:32] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [370:48] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'flatMapTo' @ [370:59] ==> public inline fun <T, R, C : MutableCollection<in SimpleFunctionDescriptor>> Iterable<(KotlinType..KotlinType?)>.flatMapTo(destination: LinkedHashSet<SimpleFunctionDescriptor>, transform: ((KotlinType..KotlinType?)) -> Iterable<SimpleFunctionDescriptor>): LinkedHashSet<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> SimpleFunctionDescriptor
    <C : MutableCollection<in R>> -> LinkedHashSet<SimpleFunctionDescriptor>

'LinkedHashSet' @ [370:69] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SimpleFunctionDescriptor

'it' @ [371:13] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getFunctionsFromSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'memberScope' @ [371:16] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'getContributedFunctions' @ [371:28] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [371:52] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getFunctionsFromSupertypes[ValueParameterDescriptorImpl]

'WHEN_GET_SUPER_MEMBERS' @ [371:75] ==> enum entry WHEN_GET_SUPER_MEMBERS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'jClass' @ [376:13] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'isAnnotationType' @ [376:20] ==> public abstract val isAnnotationType: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'computeAnnotationProperties' @ [377:13] ==> private final fun computeAnnotationProperties(name: Name, result: MutableCollection<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [377:41] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'result' @ [377:47] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'getPropertiesFromSupertypes' @ [380:40] ==> private final fun getPropertiesFromSupertypes(name: Name): Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [380:68] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'propertiesFromSupertypes' @ [381:13] ==> val propertiesFromSupertypes: Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[LocalVariableDescriptor]

'isEmpty' @ [381:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'SmartSet' @ [383:49] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [383:58] ==> @JvmStatic public final fun <T> create(): SmartSet<PropertyDescriptor> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PropertyDescriptor

'addPropertyOverrideByMethod' @ [385:9] ==> private final fun addPropertyOverrideByMethod(propertiesFromSupertypes: Set<PropertyDescriptor>, result: MutableCollection<PropertyDescriptor>, functions: (Name) -> Collection<SimpleFunctionDescriptor>): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'propertiesFromSupertypes' @ [385:37] ==> val propertiesFromSupertypes: Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[LocalVariableDescriptor]

'result' @ [385:63] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'searchMethodsByNameWithoutBuiltinMagic' @ [385:73] ==> private final fun searchMethodsByNameWithoutBuiltinMagic(name: Name): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [385:112] ==> value-parameter it: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties.<anonymous>[ValueParameterDescriptorImpl]

'addPropertyOverrideByMethod' @ [387:9] ==> private final fun addPropertyOverrideByMethod(propertiesFromSupertypes: Set<PropertyDescriptor>, result: MutableCollection<PropertyDescriptor>, functions: (Name) -> Collection<SimpleFunctionDescriptor>): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'propertiesFromSupertypes' @ [387:37] ==> val propertiesFromSupertypes: Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[LocalVariableDescriptor]

'propertiesOverridesFromSuperTypes' @ [387:63] ==> val propertiesOverridesFromSuperTypes: SmartSet<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[LocalVariableDescriptor]

'searchMethodsInSupertypesWithoutBuiltinMagic' @ [388:13] ==> private final fun searchMethodsInSupertypesWithoutBuiltinMagic(name: Name): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [388:58] ==> value-parameter it: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [391:9] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'addAll' @ [391:16] ==> public abstract fun addAll(elements: Collection<PropertyDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'resolveOverridesForNonStaticMembers' @ [391:23] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> resolveOverridesForNonStaticMembers(@NotNull name: Name, @NotNull membersFromSupertypes: (MutableCollection<(PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>), @NotNull membersFromCurrent: (MutableCollection<(PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>), @NotNull classDescriptor: ClassDescriptor, @NotNull errorReporter: ErrorReporter): (MutableCollection<(PropertyDescriptor..PropertyDescriptor?)>..Collection<(PropertyDescriptor..PropertyDescriptor?)>) defined in org.jetbrains.kotlin.load.java.components.DescriptorResolverUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> PropertyDescriptor

'name' @ [392:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'propertiesFromSupertypes' @ [392:23] ==> val propertiesFromSupertypes: Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[LocalVariableDescriptor]

'propertiesOverridesFromSuperTypes' @ [392:50] ==> val propertiesOverridesFromSuperTypes: SmartSet<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[LocalVariableDescriptor]

'result' @ [392:85] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeNonDeclaredProperties[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [392:93] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'c' @ [392:110] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'components' @ [392:112] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'errorReporter' @ [392:123] ==> public final val errorReporter: ErrorReporter defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'propertiesFromSupertypes' @ [400:26] ==> value-parameter propertiesFromSupertypes: Set<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addPropertyOverrideByMethod[ValueParameterDescriptorImpl]

'createPropertyDescriptorByMethods' @ [401:31] ==> private final fun createPropertyDescriptorByMethods(overriddenProperty: PropertyDescriptor, functions: (Name) -> Collection<SimpleFunctionDescriptor>): JavaPropertyDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'property' @ [401:65] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addPropertyOverrideByMethod[LocalVariableDescriptor]

'functions' @ [401:75] ==> value-parameter functions: (Name) -> Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addPropertyOverrideByMethod[ValueParameterDescriptorImpl]

'newProperty' @ [402:17] ==> val newProperty: JavaPropertyDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addPropertyOverrideByMethod[LocalVariableDescriptor]

'result' @ [403:17] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addPropertyOverrideByMethod[ValueParameterDescriptorImpl]

'add' @ [403:24] ==> public abstract fun add(element: PropertyDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'newProperty' @ [403:28] ==> val newProperty: JavaPropertyDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addPropertyOverrideByMethod[LocalVariableDescriptor]

'invoke' @ [410:22] ==> public abstract fun invoke(): DeclaredMemberIndex defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'findMethodsByName' @ [410:44] ==> public abstract fun findMethodsByName(name: Name): Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.DeclaredMemberIndex[SimpleFunctionDescriptorImpl]

'name' @ [410:62] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeAnnotationProperties[ValueParameterDescriptorImpl]

'singleOrNull' @ [410:68] ==> public fun <T> Iterable<JavaMethod>.singleOrNull(): JavaMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'result' @ [411:9] ==> value-parameter result: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeAnnotationProperties[ValueParameterDescriptorImpl]

'add' @ [411:16] ==> public abstract fun add(element: PropertyDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'createPropertyDescriptorWithDefaultGetter' @ [411:20] ==> private final fun createPropertyDescriptorWithDefaultGetter(method: JavaMethod, givenType: KotlinType? = ..., modality: Modality): JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'method' @ [411:62] ==> val method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computeAnnotationProperties[LocalVariableDescriptor]

'Modality' @ [411:81] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [411:90] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'c' @ [417:27] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'resolveAnnotations' @ [417:29] ==> public fun LazyJavaResolverContext.resolveAnnotations(annotationsOwner: JavaAnnotationOwner): Annotations defined in org.jetbrains.kotlin.load.java.lazy in file LazyJavaAnnotations.kt[SimpleFunctionDescriptorImpl]

'method' @ [417:48] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[ValueParameterDescriptorImpl]

'create' @ [419:57] ==> @NotNull public open fun create(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull annotations: Annotations, @NotNull modality: Modality, @NotNull visibility: Visibility, isVar: Boolean, @NotNull name: Name, @NotNull source: SourceElement, isStaticFinal: Boolean): JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.JavaPropertyDescriptor[JavaMethodDescriptor]

'ownerDescriptor' @ [420:17] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'annotations' @ [420:34] ==> val annotations: Annotations defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'modality' @ [420:47] ==> value-parameter modality: Modality defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[ValueParameterDescriptorImpl]

'method' @ [420:57] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[ValueParameterDescriptorImpl]

'visibility' @ [420:64] ==> public abstract val visibility: Visibility defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'method' @ [421:38] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[ValueParameterDescriptorImpl]

'name' @ [421:45] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'c' @ [421:51] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'components' @ [421:53] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [421:64] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [421:85] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'method' @ [421:92] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[ValueParameterDescriptorImpl]

'createDefaultGetter' @ [425:40] ==> @NotNull public open fun createDefaultGetter(@NotNull propertyDescriptor: PropertyDescriptor, @NotNull annotations: Annotations): PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'propertyDescriptor' @ [425:60] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'Annotations' @ [425:80] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [425:92] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'propertyDescriptor' @ [426:9] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'initialize' @ [426:28] ==> public open fun initialize(@Nullable getter: PropertyGetterDescriptorImpl?, @Nullable setter: PropertySetterDescriptor?): Unit defined in org.jetbrains.kotlin.load.java.descriptors.JavaPropertyDescriptor[JavaMethodDescriptor]

'getter' @ [426:39] ==> val getter: PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'givenType' @ [428:26] ==> value-parameter givenType: KotlinType? = ... defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[ValueParameterDescriptorImpl]

'computeMethodReturnType' @ [428:39] ==> protected final fun computeMethodReturnType(method: JavaMethod, c: LazyJavaResolverContext): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'method' @ [428:63] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[ValueParameterDescriptorImpl]

'c' @ [428:71] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'childForMethod' @ [428:73] ==> public fun LazyJavaResolverContext.childForMethod(containingDeclaration: DeclarationDescriptor, typeParameterOwner: JavaTypeParameterListOwner, typeParametersIndexOffset: Int = ...): LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [428:88] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'method' @ [428:108] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [429:9] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'setType' @ [429:28] ==> public open fun setType(@NotNull outType: KotlinType, @ReadOnly @NotNull typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @Nullable dispatchReceiverParameter: ReceiverParameterDescriptor?, @Nullable receiverType: KotlinType?): Unit defined in org.jetbrains.kotlin.load.java.descriptors.JavaPropertyDescriptor[JavaMethodDescriptor]

'returnType' @ [429:36] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'listOf' @ [429:48] ==> @InlineOnly public inline fun <T> listOf(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'getDispatchReceiverParameter' @ [429:58] ==> protected open fun getDispatchReceiverParameter(): ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'getter' @ [430:9] ==> val getter: PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'initialize' @ [430:16] ==> public open fun initialize(returnType: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaMethodDescriptor]

'returnType' @ [430:27] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'propertyDescriptor' @ [432:16] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter[LocalVariableDescriptor]

'!' @ [439:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'doesClassOverridesProperty' @ [439:14] ==> private final fun doesClassOverridesProperty(property: PropertyDescriptor, functions: (Name) -> Collection<SimpleFunctionDescriptor>): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'overriddenProperty' @ [439:41] ==> value-parameter overriddenProperty: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[ValueParameterDescriptorImpl]

'functions' @ [439:61] ==> value-parameter functions: (Name) -> Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[ValueParameterDescriptorImpl]

'overriddenProperty' @ [441:28] ==> value-parameter overriddenProperty: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[ValueParameterDescriptorImpl]

'findGetterOverride' @ [441:47] ==> private final fun PropertyDescriptor.findGetterOverride(functions: (Name) -> Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'functions' @ [441:66] ==> value-parameter functions: (Name) -> Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[ValueParameterDescriptorImpl]

'if (overriddenProperty.isVar)
                    overriddenProperty.findSetterOverride(functions)!!
                else
                    null' @ [443:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleFunctionDescriptor?, elseBranch: SimpleFunctionDescriptor?): SimpleFunctionDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleFunctionDescriptor?

'overriddenProperty' @ [443:21] ==> value-parameter overriddenProperty: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[ValueParameterDescriptorImpl]

'isVar' @ [443:40] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'overriddenProperty' @ [444:21] ==> value-parameter overriddenProperty: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[ValueParameterDescriptorImpl]

'findSetterOverride' @ [444:40] ==> private final fun PropertyDescriptor.findSetterOverride(functions: (Name) -> Collection<SimpleFunctionDescriptor>): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'functions' @ [444:59] ==> value-parameter functions: (Name) -> Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[ValueParameterDescriptorImpl]

'assert' @ [448:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'setterMethod' @ [448:16] ==> val setterMethod: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'let' @ [448:30] ==> @InlineOnly public inline fun <T, R> SimpleFunctionDescriptor.let(block: (SimpleFunctionDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R> -> Boolean

'it' @ [448:36] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [448:39] ==> public final val SimpleFunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'getterMethod' @ [448:51] ==> val getterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'modality' @ [448:64] ==> public final val SimpleFunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'+' @ [449:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'overriddenProperty' @ [449:74] ==> value-parameter overriddenProperty: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [449:97] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'getterMethod' @ [450:30] ==> val getterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'modality' @ [450:43] ==> public final val SimpleFunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'setterMethod' @ [450:74] ==> val setterMethod: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'modality' @ [450:88] ==> public final val SimpleFunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'create' @ [453:57] ==> @NotNull public open fun create(@NotNull containingDeclaration: DeclarationDescriptor, @NotNull annotations: Annotations, @NotNull modality: Modality, @NotNull visibility: Visibility, isVar: Boolean, @NotNull name: Name, @NotNull source: SourceElement, isStaticFinal: Boolean): JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.JavaPropertyDescriptor[JavaMethodDescriptor]

'ownerDescriptor' @ [454:17] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'Annotations' @ [454:34] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [454:46] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'getterMethod' @ [454:53] ==> val getterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'modality' @ [454:66] ==> public final val SimpleFunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'getterMethod' @ [454:76] ==> val getterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'visibility' @ [454:89] ==> public final val SimpleFunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'setterMethod' @ [455:31] ==> val setterMethod: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'overriddenProperty' @ [455:53] ==> value-parameter overriddenProperty: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[ValueParameterDescriptorImpl]

'name' @ [455:72] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'getterMethod' @ [455:78] ==> val getterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'source' @ [455:91] ==> public final val SimpleFunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'propertyDescriptor' @ [459:9] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'setType' @ [459:28] ==> public open fun setType(@NotNull outType: KotlinType, @ReadOnly @NotNull typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @Nullable dispatchReceiverParameter: ReceiverParameterDescriptor?, @Nullable receiverType: KotlinType?): Unit defined in org.jetbrains.kotlin.load.java.descriptors.JavaPropertyDescriptor[JavaMethodDescriptor]

'getterMethod' @ [459:36] ==> val getterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'returnType' @ [459:49] ==> public final val SimpleFunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'listOf' @ [459:63] ==> @InlineOnly public inline fun <T> listOf(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'getDispatchReceiverParameter' @ [459:73] ==> protected open fun getDispatchReceiverParameter(): ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'createGetter' @ [461:40] ==> @NotNull public open fun createGetter(@NotNull propertyDescriptor: PropertyDescriptor, @NotNull annotations: Annotations, isDefault: Boolean, isExternal: Boolean, isInline: Boolean, @NotNull sourceElement: SourceElement): PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'propertyDescriptor' @ [462:17] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'getterMethod' @ [462:37] ==> val getterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'annotations' @ [462:50] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[PropertyDescriptorImpl]

'getterMethod' @ [463:67] ==> val getterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'source' @ [463:80] ==> public final val SimpleFunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'apply' @ [464:11] ==> @InlineOnly public inline fun <T> PropertyGetterDescriptorImpl.apply(block: (PropertyGetterDescriptorImpl).() -> Unit): PropertyGetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptorImpl

'initialSignatureDescriptor' @ [465:13] ==> public final var PropertyGetterDescriptorImpl.initialSignatureDescriptor: FunctionDescriptor?[MyPropertyDescriptor]

'getterMethod' @ [465:42] ==> val getterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'initialize' @ [466:13] ==> public open fun initialize(returnType: (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.descriptors.impl.PropertyGetterDescriptorImpl[JavaMethodDescriptor]

'propertyDescriptor' @ [466:24] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'type' @ [466:43] ==> public final val JavaPropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'setterMethod' @ [469:22] ==> val setterMethod: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'let' @ [469:36] ==> @InlineOnly public inline fun <T, R> SimpleFunctionDescriptor.let(block: (SimpleFunctionDescriptor) -> PropertySetterDescriptorImpl): PropertySetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R> -> PropertySetterDescriptorImpl

'createSetter' @ [470:31] ==> @NotNull public open fun createSetter(@NotNull propertyDescriptor: PropertyDescriptor, @NotNull annotations: Annotations, isDefault: Boolean, isExternal: Boolean, isInline: Boolean, @NotNull visibility: Visibility, @NotNull sourceElement: SourceElement): PropertySetterDescriptorImpl defined in org.jetbrains.kotlin.resolve.DescriptorFactory[JavaMethodDescriptor]

'propertyDescriptor' @ [470:44] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'setterMethod' @ [470:64] ==> value-parameter setterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [470:77] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[PropertyDescriptorImpl]

'setterMethod' @ [471:63] ==> value-parameter setterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [471:76] ==> public final val SimpleFunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'setterMethod' @ [471:88] ==> value-parameter setterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [471:101] ==> public final val SimpleFunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'apply' @ [472:15] ==> @InlineOnly public inline fun <T> PropertySetterDescriptorImpl.apply(block: (PropertySetterDescriptorImpl).() -> Unit): PropertySetterDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySetterDescriptorImpl

'initialSignatureDescriptor' @ [473:17] ==> public final var PropertySetterDescriptorImpl.initialSignatureDescriptor: FunctionDescriptor?[MyPropertyDescriptor]

'setterMethod' @ [473:46] ==> value-parameter setterMethod: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods.<anonymous>[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [477:16] ==> val propertyDescriptor: JavaPropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'apply' @ [477:35] ==> @InlineOnly public inline fun <T> JavaPropertyDescriptor.apply(block: (JavaPropertyDescriptor).() -> Unit): JavaPropertyDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaPropertyDescriptor

'initialize' @ [477:43] ==> public open fun initialize(@Nullable getter: PropertyGetterDescriptorImpl?, @Nullable setter: PropertySetterDescriptor?): Unit defined in org.jetbrains.kotlin.load.java.descriptors.JavaPropertyDescriptor[JavaMethodDescriptor]

'getter' @ [477:54] ==> val getter: PropertyGetterDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'setter' @ [477:62] ==> val setter: PropertySetterDescriptorImpl? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createPropertyDescriptorByMethods[LocalVariableDescriptor]

'ownerDescriptor' @ [481:16] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'typeConstructor' @ [481:32] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [481:48] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'flatMap' @ [481:59] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.flatMap(transform: ((KotlinType..KotlinType?)) -> Iterable<PropertyDescriptor>): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> PropertyDescriptor

'it' @ [482:13] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getPropertiesFromSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'memberScope' @ [482:16] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'getContributedVariables' @ [482:28] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [482:52] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getPropertiesFromSupertypes[ValueParameterDescriptorImpl]

'WHEN_GET_SUPER_MEMBERS' @ [482:75] ==> enum entry WHEN_GET_SUPER_MEMBERS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'map' @ [482:99] ==> public inline fun <T, R> Iterable<PropertyDescriptor>.map(transform: (PropertyDescriptor) -> PropertyDescriptor): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> PropertyDescriptor

'p' @ [482:110] ==> value-parameter p: PropertyDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getPropertiesFromSupertypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [483:11] ==> public fun <T> Iterable<PropertyDescriptor>.toSet(): Set<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'c' @ [490:26] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'components' @ [490:28] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'signaturePropagator' @ [490:39] ==> public final val signaturePropagator: SignaturePropagator defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'resolvePropagatedSignature' @ [490:59] ==> @NotNull public abstract fun resolvePropagatedSignature(@NotNull method: JavaMethod, @NotNull owner: ClassDescriptor, @NotNull returnType: KotlinType, @Nullable receiverType: KotlinType?, @NotNull valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @NotNull typeParameters: (MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>)): SignaturePropagator.PropagatedSignature defined in org.jetbrains.kotlin.load.java.components.SignaturePropagator[JavaMethodDescriptor]

'method' @ [491:17] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [491:25] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'returnType' @ [491:42] ==> value-parameter returnType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[ValueParameterDescriptorImpl]

'valueParameters' @ [491:60] ==> value-parameter valueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[ValueParameterDescriptorImpl]

'methodTypeParameters' @ [491:77] ==> value-parameter methodTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[ValueParameterDescriptorImpl]

'MethodSignatureData' @ [493:30] ==> public constructor MethodSignatureData(returnType: KotlinType, receiverType: KotlinType?, valueParameters: List<ValueParameterDescriptor>, typeParameters: List<TypeParameterDescriptor>, hasStableParameterNames: Boolean, errors: List<String>) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData[ClassConstructorDescriptorImpl]

'propagated' @ [494:17] ==> val propagated: SignaturePropagator.PropagatedSignature defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[LocalVariableDescriptor]

'returnType' @ [494:28] ==> public final val SignaturePropagator.PropagatedSignature.returnType: KotlinType[MyPropertyDescriptor]

'propagated' @ [494:40] ==> val propagated: SignaturePropagator.PropagatedSignature defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[LocalVariableDescriptor]

'receiverType' @ [494:51] ==> public final val SignaturePropagator.PropagatedSignature.receiverType: KotlinType?[MyPropertyDescriptor]

'propagated' @ [494:65] ==> val propagated: SignaturePropagator.PropagatedSignature defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[LocalVariableDescriptor]

'valueParameters' @ [494:76] ==> public final val SignaturePropagator.PropagatedSignature.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'propagated' @ [494:93] ==> val propagated: SignaturePropagator.PropagatedSignature defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[LocalVariableDescriptor]

'typeParameters' @ [494:104] ==> public final val SignaturePropagator.PropagatedSignature.typeParameters: (MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>)[MyPropertyDescriptor]

'propagated' @ [495:17] ==> val propagated: SignaturePropagator.PropagatedSignature defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[LocalVariableDescriptor]

'hasStableParameterNames' @ [495:28] ==> public open fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.load.java.components.SignaturePropagator.PropagatedSignature[JavaMethodDescriptor]

'propagated' @ [495:55] ==> val propagated: SignaturePropagator.PropagatedSignature defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveMethodSignature[LocalVariableDescriptor]

'errors' @ [495:66] ==> public final val SignaturePropagator.PropagatedSignature.errors: (MutableList<(String..String?)>..List<(String..String?)>)[MyPropertyDescriptor]

'computeJvmDescriptor' @ [502:16] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]

'builtinWithErasedParameters' @ [503:24] ==> value-parameter builtinWithErasedParameters: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.hasSameJvmDescriptorButDoesNotOverride[ValueParameterDescriptorImpl]

'original' @ [503:52] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'computeJvmDescriptor' @ [503:61] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin[SimpleFunctionDescriptorImpl]

'!' @ [504:19] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'doesOverride' @ [504:20] ==> private final fun CallableDescriptor.doesOverride(superDescriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'builtinWithErasedParameters' @ [504:33] ==> value-parameter builtinWithErasedParameters: FunctionDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.hasSameJvmDescriptorButDoesNotOverride[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [508:31] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'createJavaConstructor' @ [510:68] ==> @NotNull public open fun createJavaConstructor(@NotNull containingDeclaration: ClassDescriptor, @NotNull annotations: Annotations, isPrimary: Boolean, @NotNull source: SourceElement): JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.JavaClassConstructorDescriptor[JavaMethodDescriptor]

'classDescriptor' @ [511:17] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'c' @ [511:34] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'resolveAnnotations' @ [511:36] ==> public fun LazyJavaResolverContext.resolveAnnotations(annotationsOwner: JavaAnnotationOwner): Annotations defined in org.jetbrains.kotlin.load.java.lazy in file LazyJavaAnnotations.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [511:55] ==> value-parameter constructor: JavaConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[ValueParameterDescriptorImpl]

'c' @ [511:94] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'components' @ [511:96] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [511:107] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [511:128] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'constructor' @ [511:135] ==> value-parameter constructor: JavaConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[ValueParameterDescriptorImpl]

'c' @ [515:17] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'childForMethod' @ [515:19] ==> public fun LazyJavaResolverContext.childForMethod(containingDeclaration: DeclarationDescriptor, typeParameterOwner: JavaTypeParameterListOwner, typeParametersIndexOffset: Int = ...): LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy[SimpleFunctionDescriptorImpl]

'constructorDescriptor' @ [515:34] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'constructor' @ [515:57] ==> value-parameter constructor: JavaConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[ValueParameterDescriptorImpl]

'classDescriptor' @ [515:98] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'declaredTypeParameters' @ [515:114] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [515:137] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'resolveValueParameters' @ [516:31] ==> protected final fun resolveValueParameters(c: LazyJavaResolverContext, function: FunctionDescriptor, jValueParameters: List<JavaValueParameter>): LazyJavaScope.ResolvedValueParameters defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'c' @ [516:54] ==> val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'constructorDescriptor' @ [516:57] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'constructor' @ [516:80] ==> value-parameter constructor: JavaConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[ValueParameterDescriptorImpl]

'valueParameters' @ [516:92] ==> public abstract val valueParameters: List<JavaValueParameter> defined in org.jetbrains.kotlin.load.java.structure.JavaConstructor[PropertyDescriptorImpl]

'classDescriptor' @ [518:17] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'declaredTypeParameters' @ [518:33] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'constructor' @ [519:17] ==> value-parameter constructor: JavaConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[ValueParameterDescriptorImpl]

'typeParameters' @ [519:29] ==> public abstract val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.JavaConstructor[PropertyDescriptorImpl]

'map' @ [519:44] ==> public inline fun <T, R> Iterable<JavaTypeParameter>.map(transform: (JavaTypeParameter) -> TypeParameterDescriptor): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeParameter
    <R> -> TypeParameterDescriptor

'c' @ [519:55] ==> val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'typeParameterResolver' @ [519:57] ==> public final val typeParameterResolver: TypeParameterResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'resolveTypeParameter' @ [519:79] ==> public abstract fun resolveTypeParameter(javaTypeParameter: JavaTypeParameter): TypeParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.TypeParameterResolver[SimpleFunctionDescriptorImpl]

'p' @ [519:100] ==> value-parameter p: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor.<anonymous>[ValueParameterDescriptorImpl]

'constructorDescriptor' @ [521:9] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'initialize' @ [521:31] ==> public open fun initialize(@NotNull unsubstitutedValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @NotNull visibility: Visibility, @NotNull typeParameterDescriptors: (MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>)): (ClassConstructorDescriptorImpl..ClassConstructorDescriptorImpl?) defined in org.jetbrains.kotlin.load.java.descriptors.JavaClassConstructorDescriptor[JavaMethodDescriptor]

'valueParameters' @ [521:42] ==> val valueParameters: LazyJavaScope.ResolvedValueParameters defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'descriptors' @ [521:58] ==> public final val descriptors: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters[PropertyDescriptorImpl]

'constructor' @ [521:71] ==> value-parameter constructor: JavaConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[ValueParameterDescriptorImpl]

'visibility' @ [521:83] ==> public abstract val visibility: Visibility defined in org.jetbrains.kotlin.load.java.structure.JavaConstructor[PropertyDescriptorImpl]

'constructorTypeParameters' @ [521:95] ==> val constructorTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'constructorDescriptor' @ [522:9] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'setHasStableParameterNames' @ [522:31] ==> public open fun setHasStableParameterNames(hasStableParameterNames: Boolean): Unit defined in org.jetbrains.kotlin.load.java.descriptors.JavaClassConstructorDescriptor[JavaMethodDescriptor]

'constructorDescriptor' @ [523:9] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'setHasSynthesizedParameterNames' @ [523:31] ==> public open fun setHasSynthesizedParameterNames(hasSynthesizedParameterNames: Boolean): Unit defined in org.jetbrains.kotlin.load.java.descriptors.JavaClassConstructorDescriptor[JavaMethodDescriptor]

'valueParameters' @ [523:63] ==> val valueParameters: LazyJavaScope.ResolvedValueParameters defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'hasSynthesizedNames' @ [523:79] ==> public final val hasSynthesizedNames: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope.ResolvedValueParameters[PropertyDescriptorImpl]

'constructorDescriptor' @ [525:9] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'returnType' @ [525:31] ==> public final var JavaClassConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'classDescriptor' @ [525:44] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'defaultType' @ [525:60] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'c' @ [527:9] ==> val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'components' @ [527:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'javaResolverCache' @ [527:22] ==> public final val javaResolverCache: JavaResolverCache defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'recordConstructor' @ [527:40] ==> public abstract fun recordConstructor(@NotNull element: JavaElement, @NotNull descriptor: ConstructorDescriptor): Unit defined in org.jetbrains.kotlin.load.java.components.JavaResolverCache[JavaMethodDescriptor]

'constructor' @ [527:58] ==> value-parameter constructor: JavaConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[ValueParameterDescriptorImpl]

'constructorDescriptor' @ [527:71] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'constructorDescriptor' @ [529:16] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.resolveConstructor[LocalVariableDescriptor]

'jClass' @ [533:37] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'isAnnotationType' @ [533:44] ==> public abstract val isAnnotationType: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'jClass' @ [534:13] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'isInterface' @ [534:20] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'!' @ [534:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnnotation' @ [534:36] ==> val isAnnotation: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'ownerDescriptor' @ [537:31] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'createJavaConstructor' @ [538:68] ==> @NotNull public open fun createJavaConstructor(@NotNull containingDeclaration: ClassDescriptor, @NotNull annotations: Annotations, isPrimary: Boolean, @NotNull source: SourceElement): JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.descriptors.JavaClassConstructorDescriptor[JavaMethodDescriptor]

'classDescriptor' @ [539:17] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'Annotations' @ [539:34] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [539:46] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'c' @ [539:77] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'components' @ [539:79] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [539:90] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [539:111] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'jClass' @ [539:118] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'if (isAnnotation) createAnnotationConstructorParameters(constructorDescriptor)
                              else Collections.emptyList<ValueParameterDescriptor>()' @ [541:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (List<ValueParameterDescriptor>..List<ValueParameterDescriptor>?), elseBranch: (List<ValueParameterDescriptor>..List<ValueParameterDescriptor>?)): (List<ValueParameterDescriptor>..List<ValueParameterDescriptor>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.List<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor>..kotlin.collections.List<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor>?)

'isAnnotation' @ [541:35] ==> val isAnnotation: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'createAnnotationConstructorParameters' @ [541:49] ==> private final fun createAnnotationConstructorParameters(constructor: ClassConstructorDescriptorImpl): List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'constructorDescriptor' @ [541:87] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'emptyList' @ [542:48] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ValueParameterDescriptor

'constructorDescriptor' @ [543:9] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'setHasSynthesizedParameterNames' @ [543:31] ==> public open fun setHasSynthesizedParameterNames(hasSynthesizedParameterNames: Boolean): Unit defined in org.jetbrains.kotlin.load.java.descriptors.JavaClassConstructorDescriptor[JavaMethodDescriptor]

'constructorDescriptor' @ [545:9] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'initialize' @ [545:31] ==> public open fun initialize(@NotNull unsubstitutedValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @NotNull visibility: Visibility): (ClassConstructorDescriptorImpl..ClassConstructorDescriptorImpl?) defined in org.jetbrains.kotlin.load.java.descriptors.JavaClassConstructorDescriptor[JavaMethodDescriptor]

'valueParameters' @ [545:42] ==> val valueParameters: (List<ValueParameterDescriptor>..List<ValueParameterDescriptor>?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'getConstructorVisibility' @ [545:59] ==> private final fun getConstructorVisibility(classDescriptor: ClassDescriptor): Visibility defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [545:84] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'constructorDescriptor' @ [546:9] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'setHasStableParameterNames' @ [546:31] ==> public open fun setHasStableParameterNames(hasStableParameterNames: Boolean): Unit defined in org.jetbrains.kotlin.load.java.descriptors.JavaClassConstructorDescriptor[JavaMethodDescriptor]

'constructorDescriptor' @ [547:9] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'returnType' @ [547:31] ==> public final var JavaClassConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'classDescriptor' @ [547:44] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'defaultType' @ [547:60] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'c' @ [548:9] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'components' @ [548:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'javaResolverCache' @ [548:22] ==> public final val javaResolverCache: JavaResolverCache defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'recordConstructor' @ [548:40] ==> public abstract fun recordConstructor(@NotNull element: JavaElement, @NotNull descriptor: ConstructorDescriptor): Unit defined in org.jetbrains.kotlin.load.java.components.JavaResolverCache[JavaMethodDescriptor]

'jClass' @ [548:58] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'constructorDescriptor' @ [548:66] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'constructorDescriptor' @ [549:16] ==> val constructorDescriptor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createDefaultConstructor[LocalVariableDescriptor]

'classDescriptor' @ [553:26] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getConstructorVisibility[ValueParameterDescriptorImpl]

'visibility' @ [553:42] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'visibility' @ [554:13] ==> val visibility: Visibility defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getConstructorVisibility[LocalVariableDescriptor]

'PROTECTED_STATIC_VISIBILITY' @ [554:44] ==> @NotNull public final val PROTECTED_STATIC_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'PROTECTED_AND_PACKAGE' @ [555:37] ==> @NotNull public final val PROTECTED_AND_PACKAGE: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'visibility' @ [557:16] ==> val visibility: Visibility defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getConstructorVisibility[LocalVariableDescriptor]

'jClass' @ [561:23] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'methods' @ [561:30] ==> public abstract val methods: Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'ArrayList' @ [562:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ValueParameterDescriptor

'methods' @ [562:58] ==> val methods: Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'size' @ [562:66] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'toAttributes' @ [564:37] ==> public fun TypeUsage.toAttributes(isForAnnotationParameter: Boolean = ..., upperBoundForTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types[SimpleFunctionDescriptorImpl]

'component1' @ [566:14] ==> public final operator fun component1(): List<JavaMethod> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [566:33] ==> public final operator fun component2(): List<JavaMethod> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'methods' @ [566:49] ==> val methods: Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'partition' @ [567:17] ==> public inline fun <T> Iterable<JavaMethod>.partition(predicate: (JavaMethod) -> Boolean): Pair<List<JavaMethod>, List<JavaMethod>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'it' @ [567:29] ==> value-parameter it: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [567:32] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'DEFAULT_ANNOTATION_MEMBER_NAME' @ [567:59] ==> public final val DEFAULT_ANNOTATION_MEMBER_NAME: (Name..Name?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'assert' @ [569:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'methodsNamedValue' @ [569:16] ==> val methodsNamedValue: List<JavaMethod> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'size' @ [569:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'jClass' @ [569:120] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'methodsNamedValue' @ [570:32] ==> val methodsNamedValue: List<JavaMethod> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'firstOrNull' @ [570:50] ==> public fun <T> List<JavaMethod>.firstOrNull(): JavaMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'methodNamedValue' @ [571:13] ==> val methodNamedValue: JavaMethod? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'methodNamedValue' @ [572:47] ==> val methodNamedValue: JavaMethod? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'returnType' @ [572:64] ==> public abstract val returnType: JavaType defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'component1' @ [573:18] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [573:33] ==> public final operator fun component2(): KotlinType? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (parameterNamedValueJavaType is JavaArrayType)
                        Pair(c.typeResolver.transformArrayType(parameterNamedValueJavaType, attr, isVararg = true),
                             c.typeResolver.transformJavaType(parameterNamedValueJavaType.componentType, attr))
                    else
                        Pair(c.typeResolver.transformJavaType(parameterNamedValueJavaType, attr), null)' @ [574:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<KotlinType, KotlinType?>, elseBranch: Pair<KotlinType, KotlinType?>): Pair<KotlinType, KotlinType?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<KotlinType, KotlinType?>

'parameterNamedValueJavaType' @ [574:25] ==> val parameterNamedValueJavaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'Pair' @ [575:25] ==> public constructor Pair<out A, out B>(first: KotlinType, second: KotlinType) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KotlinType
    <out B> -> KotlinType

'c' @ [575:30] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'typeResolver' @ [575:32] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformArrayType' @ [575:45] ==> public final fun transformArrayType(arrayType: JavaArrayType, attr: JavaTypeAttributes, isVararg: Boolean = ...): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'parameterNamedValueJavaType' @ [575:64] ==> val parameterNamedValueJavaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'attr' @ [575:93] ==> val attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'c' @ [576:30] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'typeResolver' @ [576:32] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformJavaType' @ [576:45] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'parameterNamedValueJavaType' @ [576:63] ==> val parameterNamedValueJavaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'componentType' @ [576:91] ==> public abstract val componentType: JavaType defined in org.jetbrains.kotlin.load.java.structure.JavaArrayType[PropertyDescriptorImpl]

'attr' @ [576:106] ==> val attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'Pair' @ [578:25] ==> public constructor Pair<out A, out B>(first: KotlinType, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KotlinType
    <out B> -> Nothing?

'c' @ [578:30] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'typeResolver' @ [578:32] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformJavaType' @ [578:45] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'parameterNamedValueJavaType' @ [578:63] ==> val parameterNamedValueJavaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'attr' @ [578:92] ==> val attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'result' @ [580:13] ==> val result: ArrayList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'addAnnotationValueParameter' @ [580:20] ==> private final fun MutableList<ValueParameterDescriptor>.addAnnotationValueParameter(constructor: ConstructorDescriptor, index: Int, method: JavaMethod, returnType: KotlinType, varargElementType: KotlinType?): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'constructor' @ [580:48] ==> value-parameter constructor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[ValueParameterDescriptorImpl]

'methodNamedValue' @ [580:64] ==> val methodNamedValue: JavaMethod? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'parameterType' @ [580:82] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'varargType' @ [580:97] ==> val varargType: KotlinType? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'if (methodNamedValue != null) 1 else 0' @ [583:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'methodNamedValue' @ [583:30] ==> val methodNamedValue: JavaMethod? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'component1' @ [584:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [584:22] ==> public final operator fun component2(): JavaMethod defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'otherMethods' @ [584:33] ==> val otherMethods: List<JavaMethod> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'withIndex' @ [584:46] ==> public fun <T> Iterable<JavaMethod>.withIndex(): Iterable<IndexedValue<JavaMethod>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'c' @ [585:33] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'typeResolver' @ [585:35] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformJavaType' @ [585:48] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'method' @ [585:66] ==> val method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'returnType' @ [585:73] ==> public abstract val returnType: JavaType defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'attr' @ [585:85] ==> val attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'result' @ [586:13] ==> val result: ArrayList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'addAnnotationValueParameter' @ [586:20] ==> private final fun MutableList<ValueParameterDescriptor>.addAnnotationValueParameter(constructor: ConstructorDescriptor, index: Int, method: JavaMethod, returnType: KotlinType, varargElementType: KotlinType?): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'constructor' @ [586:48] ==> value-parameter constructor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[ValueParameterDescriptorImpl]

'index' @ [586:61] ==> val index: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'startIndex' @ [586:69] ==> val startIndex: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'method' @ [586:81] ==> val method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'parameterType' @ [586:89] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'result' @ [589:16] ==> val result: ArrayList<ValueParameterDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.createAnnotationConstructorParameters[LocalVariableDescriptor]

'add' @ [599:9] ==> public abstract fun add(element: ValueParameterDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'ValueParameterDescriptorImpl' @ [599:13] ==> public constructor ValueParameterDescriptorImpl(containingDeclaration: CallableDescriptor, original: ValueParameterDescriptor?, index: Int, annotations: Annotations, name: Name, outType: KotlinType, declaresDefaultValue: Boolean, isCrossinline: Boolean, isNoinline: Boolean, varargElementType: KotlinType?, source: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl[ClassConstructorDescriptorImpl]

'constructor' @ [600:17] ==> value-parameter constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addAnnotationValueParameter[ValueParameterDescriptorImpl]

'index' @ [602:17] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addAnnotationValueParameter[ValueParameterDescriptorImpl]

'Annotations' @ [603:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [603:29] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'method' @ [604:17] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addAnnotationValueParameter[ValueParameterDescriptorImpl]

'name' @ [604:24] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'makeNotNullable' @ [606:27] ==> @NotNull public open fun makeNotNullable(@NotNull type: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'returnType' @ [606:43] ==> value-parameter returnType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addAnnotationValueParameter[ValueParameterDescriptorImpl]

'method' @ [607:17] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addAnnotationValueParameter[ValueParameterDescriptorImpl]

'hasAnnotationParameterDefaultValue' @ [607:24] ==> public abstract val hasAnnotationParameterDefaultValue: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'varargElementType' @ [611:17] ==> value-parameter varargElementType: KotlinType? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addAnnotationValueParameter[ValueParameterDescriptorImpl]

'let' @ [611:36] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType

'makeNotNullable' @ [611:52] ==> @NotNull public open fun makeNotNullable(@NotNull type: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'it' @ [611:68] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addAnnotationValueParameter.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [612:17] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'components' @ [612:19] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [612:30] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [612:51] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'method' @ [612:58] ==> value-parameter method: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.addAnnotationValueParameter[ValueParameterDescriptorImpl]

'c' @ [616:36] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [616:38] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [616:53] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Set<Name>): NotNullLazyValue<Set<Name>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Set<Name>

'jClass' @ [617:9] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'innerClassNames' @ [617:16] ==> public abstract val innerClassNames: Collection<Name> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'toSet' @ [617:32] ==> public fun <T> Iterable<Name>.toSet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'c' @ [620:34] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [620:36] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [620:51] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<Name, JavaField>): NotNullLazyValue<Map<Name, JavaField>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Map<Name, JavaField>

'jClass' @ [621:9] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'fields' @ [621:16] ==> public abstract val fields: Collection<JavaField> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'filter' @ [621:23] ==> public inline fun <T> Iterable<JavaField>.filter(predicate: (JavaField) -> Boolean): List<JavaField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaField

'it' @ [621:32] ==> value-parameter it: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.enumEntryIndex.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isEnumEntry' @ [621:35] ==> public abstract val isEnumEntry: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'associateBy' @ [621:49] ==> public inline fun <T, K> Iterable<JavaField>.associateBy(keySelector: (JavaField) -> Name): Map<Name, JavaField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaField
    <K> -> Name

'f' @ [621:68] ==> value-parameter f: JavaField defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.enumEntryIndex.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [621:70] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaField[PropertyDescriptorImpl]

'c' @ [624:33] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [624:35] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [624:50] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (Name) -> ClassDescriptorBase?): MemoizedFunctionToNullable<Name, ClassDescriptorBase> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Name
    <V : Any> -> ClassDescriptorBase

'if (name !in nestedClassIndex()) {
            val field = enumEntryIndex()[name]
            if (field != null) {
                val enumMemberNames: NotNullLazyValue<Set<Name>> = c.storageManager.createLazyValue {
                    getFunctionNames() + getVariableNames()
                }
                EnumEntrySyntheticClassDescriptor.create(
                        c.storageManager, ownerDescriptor, name, enumMemberNames, c.resolveAnnotations(field),
                        c.components.sourceElementFactory.source(field)
                )
            }
            else null
        }
        else {
            c.components.finder.findClass(ownerDescriptor.classId!!.createNestedClassId(name))?.let {
                LazyJavaClassDescriptor(c, ownerDescriptor, it)
            }
        }' @ [626:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptorBase?, elseBranch: ClassDescriptorBase?): ClassDescriptorBase?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptorBase?

'name' @ [626:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.nestedClasses.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [626:22] ==> public abstract fun invoke(): Set<Name> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'invoke' @ [627:25] ==> public abstract fun invoke(): Map<Name, JavaField> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'name' @ [627:42] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.nestedClasses.<anonymous>[ValueParameterDescriptorImpl]

'if (field != null) {
                val enumMemberNames: NotNullLazyValue<Set<Name>> = c.storageManager.createLazyValue {
                    getFunctionNames() + getVariableNames()
                }
                EnumEntrySyntheticClassDescriptor.create(
                        c.storageManager, ownerDescriptor, name, enumMemberNames, c.resolveAnnotations(field),
                        c.components.sourceElementFactory.source(field)
                )
            }
            else null' @ [628:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EnumEntrySyntheticClassDescriptor?, elseBranch: EnumEntrySyntheticClassDescriptor?): EnumEntrySyntheticClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> EnumEntrySyntheticClassDescriptor?

'field' @ [628:17] ==> val field: JavaField? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.nestedClasses.<anonymous>[LocalVariableDescriptor]

'c' @ [629:68] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [629:70] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [629:85] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Set<Name>): NotNullLazyValue<Set<Name>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Set<Name>

'getFunctionNames' @ [630:21] ==> public open fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'getVariableNames' @ [630:42] ==> public open fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'create' @ [632:51] ==> @NotNull public open fun create(@NotNull storageManager: StorageManager, @NotNull enumClass: ClassDescriptor, @NotNull name: Name, @NotNull enumMemberNames: NotNullLazyValue<(MutableSet<(Name..Name?)>..Set<(Name..Name?)>?)>, @NotNull annotations: Annotations, @NotNull source: SourceElement): EnumEntrySyntheticClassDescriptor defined in org.jetbrains.kotlin.descriptors.impl.EnumEntrySyntheticClassDescriptor[JavaMethodDescriptor]

'c' @ [633:25] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [633:27] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'ownerDescriptor' @ [633:43] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'name' @ [633:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.nestedClasses.<anonymous>[ValueParameterDescriptorImpl]

'enumMemberNames' @ [633:66] ==> val enumMemberNames: NotNullLazyValue<Set<Name>> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.nestedClasses.<anonymous>[LocalVariableDescriptor]

'c' @ [633:83] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'resolveAnnotations' @ [633:85] ==> public fun LazyJavaResolverContext.resolveAnnotations(annotationsOwner: JavaAnnotationOwner): Annotations defined in org.jetbrains.kotlin.load.java.lazy in file LazyJavaAnnotations.kt[SimpleFunctionDescriptorImpl]

'field' @ [633:104] ==> val field: JavaField? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.nestedClasses.<anonymous>[LocalVariableDescriptor]

'c' @ [634:25] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'components' @ [634:27] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [634:38] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [634:59] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'field' @ [634:66] ==> val field: JavaField? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.nestedClasses.<anonymous>[LocalVariableDescriptor]

'c' @ [640:13] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'components' @ [640:15] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'finder' @ [640:26] ==> public final val finder: JavaClassFinder defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findClass' @ [640:33] ==> @Nullable public abstract fun findClass(@NotNull classId: ClassId): JavaClass? defined in org.jetbrains.kotlin.load.java.JavaClassFinder[JavaMethodDescriptor]

'ownerDescriptor' @ [640:43] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'classId' @ [640:59] ==> public val ClassifierDescriptorWithTypeParameters.classId: ClassId? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'createNestedClassId' @ [640:69] ==> @NotNull public open fun createNestedClassId(@NotNull name: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'name' @ [640:89] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.nestedClasses.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [640:97] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> LazyJavaClassDescriptor): LazyJavaClassDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> LazyJavaClassDescriptor

'LazyJavaClassDescriptor' @ [641:17] ==> public constructor LazyJavaClassDescriptor(outerContext: LazyJavaResolverContext, containingDeclaration: DeclarationDescriptor, jClass: JavaClass, additionalSupertypeClassDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[ClassConstructorDescriptorImpl]

'c' @ [641:41] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.<init>[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [641:44] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'it' @ [641:61] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.nestedClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getDispatchReceiverParameterIfNeeded' @ [647:29] ==> @Nullable public open fun getDispatchReceiverParameterIfNeeded(@NotNull containingDeclaration: DeclarationDescriptor): ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'ownerDescriptor' @ [647:66] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'recordLookup' @ [650:9] ==> private final fun recordLookup(name: Name, from: LookupLocation): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [650:22] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [650:28] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'invoke' @ [651:16] ==> public abstract fun invoke(p1: Name): ClassDescriptorBase? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'name' @ [651:30] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'recordLookup' @ [655:9] ==> private final fun recordLookup(name: Name, from: LookupLocation): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [655:22] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [655:28] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'super' @ [656:16] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[LazyClassReceiverParameterDescriptor]

'getContributedFunctions' @ [656:22] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'name' @ [656:46] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [656:52] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'recordLookup' @ [660:9] ==> private final fun recordLookup(name: Name, from: LookupLocation): Unit defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [660:22] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [660:28] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'super' @ [661:16] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[LazyClassReceiverParameterDescriptor]

'getContributedVariables' @ [661:22] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaScope[SimpleFunctionDescriptorImpl]

'name' @ [661:46] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [661:52] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'invoke' @ [665:15] ==> public abstract fun invoke(): Set<Name> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'invoke' @ [665:36] ==> public abstract fun invoke(): Map<Name, JavaField> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'keys' @ [665:53] ==> public abstract val keys: Set<Name> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'jClass' @ [668:13] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'isAnnotationType' @ [668:20] ==> public abstract val isAnnotationType: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'getFunctionNames' @ [668:45] ==> public open fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[SimpleFunctionDescriptorImpl]

'LinkedHashSet' @ [669:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (Name..Name?)>..Collection<(Name..Name?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Name

'invoke' @ [669:36] ==> public abstract fun invoke(): DeclaredMemberIndex defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'getFieldNames' @ [669:58] ==> public abstract fun getFieldNames(): Set<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.DeclaredMemberIndex[SimpleFunctionDescriptorImpl]

'ownerDescriptor' @ [670:16] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'typeConstructor' @ [670:32] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [670:48] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'flatMapTo' @ [670:59] ==> public inline fun <T, R, C : MutableCollection<in Name>> Iterable<(KotlinType..KotlinType?)>.flatMapTo(destination: LinkedHashSet<Name>, transform: ((KotlinType..KotlinType?)) -> Iterable<Name>): LinkedHashSet<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> Name
    <C : MutableCollection<in R>> -> LinkedHashSet<Name>

'result' @ [670:69] ==> val result: LinkedHashSet<Name> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computePropertyNames[LocalVariableDescriptor]

'supertype' @ [671:13] ==> value-parameter supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.computePropertyNames.<anonymous>[ValueParameterDescriptorImpl]

'memberScope' @ [671:23] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'getVariableNames' @ [671:35] ==> public abstract fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'c' @ [676:9] ==> protected final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'components' @ [676:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'lookupTracker' @ [676:22] ==> public final val lookupTracker: LookupTracker defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'record' @ [676:36] ==> public fun LookupTracker.record(from: LookupLocation, scopeOwner: ClassDescriptor, name: Name): Unit defined in org.jetbrains.kotlin.incremental in file utils.kt[SimpleFunctionDescriptorImpl]

'from' @ [676:43] ==> value-parameter from: LookupLocation defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.recordLookup[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [676:49] ==> protected open val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'name' @ [676:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope.recordLookup[ValueParameterDescriptorImpl]

'+' @ [679:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'jClass' @ [679:63] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[PropertyDescriptorImpl]

'fqName' @ [679:70] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

