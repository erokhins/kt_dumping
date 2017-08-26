'TreeBasedElement<T>' @ [32:5] ==> public constructor TreeBasedElement<out T : JCTree>(tree: T, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedElement[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> T

'tree' @ [32:25] ==> value-parameter tree: T defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember.<init>[ValueParameterDescriptorImpl]

'treePath' @ [32:31] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember.<init>[ValueParameterDescriptorImpl]

'javac' @ [32:41] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember.<init>[ValueParameterDescriptorImpl]

'getValue' @ [37:61] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'tree' @ [38:9] ==> value-parameter tree: T defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember.<init>[ValueParameterDescriptorImpl]

'annotations' @ [38:14] ==> internal fun JCTree.annotations(): Collection<JCTree.JCAnnotation> defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[SimpleFunctionDescriptorImpl]

'map' @ [38:28] ==> public inline fun <T, R> Iterable<JCTree.JCAnnotation>.map(transform: (JCTree.JCAnnotation) -> TreeBasedAnnotation): List<TreeBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCAnnotation
    <R> -> TreeBasedAnnotation

'TreeBasedAnnotation' @ [38:34] ==> public constructor TreeBasedAnnotation(annotation: JCTree.JCAnnotation, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [38:54] ==> value-parameter it: JCTree.JCAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember.annotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'treePath' @ [38:58] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember.<init>[ValueParameterDescriptorImpl]

'javac' @ [38:68] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember.<init>[ValueParameterDescriptorImpl]

'annotations' @ [42:13] ==> public open val annotations: Collection<JavaAnnotation> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember[PropertyDescriptorImpl]

'find' @ [42:25] ==> @InlineOnly public inline fun <T> Iterable<JavaAnnotation>.find(predicate: (JavaAnnotation) -> Boolean): JavaAnnotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation

'it' @ [42:32] ==> value-parameter it: JavaAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [42:35] ==> public abstract val classId: ClassId? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotation[DeserializedPropertyDescriptor]

'asSingleFqName' @ [42:44] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'fqName' @ [42:64] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember.findAnnotation[ValueParameterDescriptorImpl]

