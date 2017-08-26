'LazyJavaResolverContext' @ [29:21] ==> internal constructor LazyJavaResolverContext(components: JavaResolverComponents, typeParameterResolver: TypeParameterResolver, delegateForDefaultTypeQualifiers: Lazy<JavaTypeQualifiersByElementType?>) defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[ClassConstructorDescriptorImpl]

'components' @ [29:45] ==> value-parameter components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'EMPTY' @ [29:79] ==> public object EMPTY : TypeParameterResolver defined in org.jetbrains.kotlin.load.java.lazy.TypeParameterResolver[FakeCallableDescriptorForObject]

'lazyOf' @ [29:86] ==> public fun <T> lazyOf(value: Nothing?): Lazy<Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing?

'c' @ [32:13] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider[PropertyDescriptorImpl]

'storageManager' @ [32:15] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [32:30] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (FqName) -> LazyJavaPackageFragment?): MemoizedFunctionToNullable<FqName, LazyJavaPackageFragment> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> FqName
    <V : Any> -> LazyJavaPackageFragment

'c' @ [34:32] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider[PropertyDescriptorImpl]

'components' @ [34:34] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'finder' @ [34:45] ==> public final val finder: JavaClassFinder defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findPackage' @ [34:52] ==> @Nullable public abstract fun findPackage(@NotNull fqName: FqName): JavaPackage? defined in org.jetbrains.kotlin.load.java.JavaClassFinder[JavaMethodDescriptor]

'fqName' @ [34:64] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider.packageFragments.<anonymous>[ValueParameterDescriptorImpl]

'if (jPackage != null) {
                    LazyJavaPackageFragment(c, jPackage)
                }
                else null' @ [35:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LazyJavaPackageFragment?, elseBranch: LazyJavaPackageFragment?): LazyJavaPackageFragment?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LazyJavaPackageFragment?

'jPackage' @ [35:21] ==> val jPackage: JavaPackage? defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider.packageFragments.<anonymous>[LocalVariableDescriptor]

'LazyJavaPackageFragment' @ [36:21] ==> public constructor LazyJavaPackageFragment(outerContext: LazyJavaResolverContext, jPackage: JavaPackage) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[ClassConstructorDescriptorImpl]

'c' @ [36:45] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider[PropertyDescriptorImpl]

'jPackage' @ [36:48] ==> val jPackage: JavaPackage? defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider.packageFragments.<anonymous>[LocalVariableDescriptor]

'invoke' @ [41:54] ==> public abstract fun invoke(p1: FqName): LazyJavaPackageFragment? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'fqName' @ [41:71] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider.getPackageFragment[ValueParameterDescriptorImpl]

'listOfNotNull' @ [43:56] ==> public fun <T : Any> listOfNotNull(element: LazyJavaPackageFragment?): List<LazyJavaPackageFragment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LazyJavaPackageFragment

'getPackageFragment' @ [43:70] ==> private final fun getPackageFragment(fqName: FqName): LazyJavaPackageFragment? defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [43:89] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider.getPackageFragments[ValueParameterDescriptorImpl]

'getPackageFragment' @ [46:13] ==> private final fun getPackageFragment(fqName: FqName): LazyJavaPackageFragment? defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [46:32] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider.getSubPackagesOf[ValueParameterDescriptorImpl]

'getSubPackageFqNames' @ [46:41] ==> internal final fun getSubPackageFqNames(): List<FqName> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[SimpleFunctionDescriptorImpl]

'orEmpty' @ [46:64] ==> @InlineOnly public inline fun <T> List<FqName>?.orEmpty(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

