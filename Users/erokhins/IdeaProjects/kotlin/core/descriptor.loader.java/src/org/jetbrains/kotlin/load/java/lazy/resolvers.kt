'typeParameterOwner' @ [40:63] ==> value-parameter typeParameterOwner: JavaTypeParameterListOwner defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver.<init>[ValueParameterDescriptorImpl]

'typeParameters' @ [40:82] ==> public abstract val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.JavaTypeParameterListOwner[PropertyDescriptorImpl]

'mapToIndex' @ [40:97] ==> public fun <K> Iterable<JavaTypeParameter>.mapToIndex(): Map<JavaTypeParameter, Int> defined in org.jetbrains.kotlin.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> JavaTypeParameter

'c' @ [42:27] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver[PropertyDescriptorImpl]

'storageManager' @ [42:29] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [42:44] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (JavaTypeParameter) -> LazyJavaTypeParameterDescriptor?): MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> JavaTypeParameter
    <V : Any> -> LazyJavaTypeParameterDescriptor

'typeParameters' @ [44:9] ==> private final val typeParameters: Map<JavaTypeParameter, Int> defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver[PropertyDescriptorImpl]

'typeParameter' @ [44:24] ==> value-parameter typeParameter: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver.resolve.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [44:40] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> LazyJavaTypeParameterDescriptor): LazyJavaTypeParameterDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> LazyJavaTypeParameterDescriptor

'LazyJavaTypeParameterDescriptor' @ [45:13] ==> public constructor LazyJavaTypeParameterDescriptor(c: LazyJavaResolverContext, javaTypeParameter: JavaTypeParameter, index: Int, containingDeclaration: DeclarationDescriptor) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor[ClassConstructorDescriptorImpl]

'c' @ [45:45] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver[PropertyDescriptorImpl]

'child' @ [45:47] ==> public fun LazyJavaResolverContext.child(typeParameterResolver: TypeParameterResolver): LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy in file context.kt[SimpleFunctionDescriptorImpl]

'this' @ [45:53] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver[LazyClassReceiverParameterDescriptor]

'typeParameter' @ [45:60] ==> value-parameter typeParameter: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver.resolve.<anonymous>[ValueParameterDescriptorImpl]

'typeParametersIndexOffset' @ [45:75] ==> private final val typeParametersIndexOffset: Int defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver[PropertyDescriptorImpl]

'index' @ [45:103] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver.resolve.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [45:110] ==> private final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver[PropertyDescriptorImpl]

'invoke' @ [50:16] ==> public abstract fun invoke(p1: JavaTypeParameter): LazyJavaTypeParameterDescriptor? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'javaTypeParameter' @ [50:24] ==> value-parameter javaTypeParameter: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver.resolveTypeParameter[ValueParameterDescriptorImpl]

'c' @ [50:46] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver[PropertyDescriptorImpl]

'typeParameterResolver' @ [50:48] ==> public final val typeParameterResolver: TypeParameterResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'resolveTypeParameter' @ [50:70] ==> public abstract fun resolveTypeParameter(javaTypeParameter: JavaTypeParameter): TypeParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.TypeParameterResolver[SimpleFunctionDescriptorImpl]

'javaTypeParameter' @ [50:91] ==> value-parameter javaTypeParameter: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaTypeParameterResolver.resolveTypeParameter[ValueParameterDescriptorImpl]

