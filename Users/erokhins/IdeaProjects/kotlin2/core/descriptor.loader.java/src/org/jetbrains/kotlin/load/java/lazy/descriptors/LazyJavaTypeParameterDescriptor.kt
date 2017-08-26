'AbstractLazyTypeParameterDescriptor' @ [36:5] ==> public constructor AbstractLazyTypeParameterDescriptor(@NotNull p0: StorageManager, @NotNull p1: DeclarationDescriptor, @NotNull p2: Name, @NotNull p3: Variance, p4: Boolean, p5: Int, @NotNull p6: SourceElement, @NotNull p7: SupertypeLoopChecker) defined in org.jetbrains.kotlin.descriptors.impl.AbstractLazyTypeParameterDescriptor[JavaClassConstructorDescriptor]

'c' @ [37:9] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [37:11] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'containingDeclaration' @ [38:9] ==> value-parameter containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'javaTypeParameter' @ [39:9] ==> value-parameter javaTypeParameter: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'name' @ [39:27] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaTypeParameter[PropertyDescriptorImpl]

'INVARIANT' @ [40:18] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'index' @ [42:9] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'NO_SOURCE' @ [43:23] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'c' @ [43:34] ==> value-parameter c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'components' @ [43:36] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'supertypeLoopChecker' @ [43:47] ==> public final val supertypeLoopChecker: SupertypeLoopChecker defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'LazyJavaAnnotations' @ [45:32] ==> public constructor LazyJavaAnnotations(c: LazyJavaResolverContext, annotationOwner: JavaAnnotationOwner) defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[ClassConstructorDescriptorImpl]

'c' @ [45:52] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor[PropertyDescriptorImpl]

'javaTypeParameter' @ [45:55] ==> public final val javaTypeParameter: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor[PropertyDescriptorImpl]

'javaTypeParameter' @ [48:22] ==> public final val javaTypeParameter: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor[PropertyDescriptorImpl]

'upperBounds' @ [48:40] ==> public abstract val upperBounds: Collection<JavaClassifierType> defined in org.jetbrains.kotlin.load.java.structure.JavaTypeParameter[PropertyDescriptorImpl]

'bounds' @ [49:13] ==> val bounds: Collection<JavaClassifierType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor.resolveUpperBounds[LocalVariableDescriptor]

'isEmpty' @ [49:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'listOf' @ [50:20] ==> public fun <T> listOf(element: UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'flexibleType' @ [50:45] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'c' @ [51:21] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor[PropertyDescriptorImpl]

'module' @ [51:23] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [51:30] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'anyType' @ [51:39] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'c' @ [52:21] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor[PropertyDescriptorImpl]

'module' @ [52:23] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [52:30] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'nullableAnyType' @ [52:39] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'bounds' @ [55:16] ==> val bounds: Collection<JavaClassifierType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor.resolveUpperBounds[LocalVariableDescriptor]

'map' @ [55:23] ==> public inline fun <T, R> Iterable<JavaClassifierType>.map(transform: (JavaClassifierType) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClassifierType
    <R> -> KotlinType

'c' @ [56:13] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor[PropertyDescriptorImpl]

'typeResolver' @ [56:15] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformJavaType' @ [56:28] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'it' @ [56:46] ==> value-parameter it: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor.resolveUpperBounds.<anonymous>[ValueParameterDescriptorImpl]

'toAttributes' @ [56:67] ==> public fun TypeUsage.toAttributes(isForAnnotationParameter: Boolean = ..., upperBoundForTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'this' @ [56:109] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor[LazyClassReceiverParameterDescriptor]

