'TreeBasedElement<JCTree.JCClassDecl>' @ [40:5] ==> public constructor TreeBasedElement<out T : JCTree>(tree: JCTree.JCClassDecl, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedElement[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCClassDecl

'tree' @ [40:42] ==> value-parameter tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'treePath' @ [40:48] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'javac' @ [40:58] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'identifier' @ [43:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'tree' @ [43:33] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'simpleName' @ [43:38] ==> public final val JCTree.JCClassDecl.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [43:49] ==> public open fun toString(): String defined in com.sun.tools.javac.util.Name[JavaMethodDescriptor]

'getValue' @ [45:61] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'tree' @ [46:9] ==> value-parameter tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'annotations' @ [46:14] ==> internal fun JCTree.annotations(): Collection<JCTree.JCAnnotation> defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[SimpleFunctionDescriptorImpl]

'map' @ [46:28] ==> public inline fun <T, R> Iterable<JCTree.JCAnnotation>.map(transform: (JCTree.JCAnnotation) -> TreeBasedAnnotation): List<TreeBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCAnnotation
    <R> -> TreeBasedAnnotation

'TreeBasedAnnotation' @ [46:48] ==> public constructor TreeBasedAnnotation(annotation: JCTree.JCAnnotation, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[ClassConstructorDescriptorImpl]

'annotation' @ [46:68] ==> value-parameter annotation: JCTree.JCAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.annotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'treePath' @ [46:80] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'javac' @ [46:90] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'annotations' @ [50:13] ==> public open val annotations: Collection<JavaAnnotation> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'find' @ [50:25] ==> @InlineOnly public inline fun <T> Iterable<JavaAnnotation>.find(predicate: (JavaAnnotation) -> Boolean): JavaAnnotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation

'it' @ [50:32] ==> value-parameter it: JavaAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [50:35] ==> public abstract val classId: ClassId? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotation[DeserializedPropertyDescriptor]

'asSingleFqName' @ [50:44] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'fqName' @ [50:64] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.findAnnotation[ValueParameterDescriptorImpl]

'tree' @ [56:17] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'modifiers' @ [56:22] ==> public final val JCTree.JCClassDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'isAbstract' @ [56:32] ==> internal val JCTree.JCModifiers.isAbstract: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'isAnnotationType' @ [56:47] ==> public open val isAnnotationType: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'methods' @ [56:67] ==> public open val methods: Collection<JavaMethod> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'any' @ [56:75] ==> public inline fun <T> Iterable<JavaMethod>.any(predicate: (JavaMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'it' @ [56:81] ==> value-parameter it: JavaMethod defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-isAbstract>.<anonymous>[ValueParameterDescriptorImpl]

'isAbstract' @ [56:84] ==> public abstract val isAbstract: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[DeserializedPropertyDescriptor]

'outerClass' @ [59:18] ==> public open val outerClass: JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'isInterface' @ [59:30] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'tree' @ [59:55] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'modifiers' @ [59:60] ==> public final val JCTree.JCClassDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'isStatic' @ [59:70] ==> internal val JCTree.JCModifiers.isStatic: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'tree' @ [62:17] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'modifiers' @ [62:22] ==> public final val JCTree.JCClassDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'isFinal' @ [62:32] ==> internal val JCTree.JCModifiers.isFinal: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'if (outerClass?.isInterface ?: false) PUBLIC else tree.modifiers.visibility' @ [65:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Visibility, elseBranch: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Visibility

'outerClass' @ [65:21] ==> public open val outerClass: JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'isInterface' @ [65:33] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'PUBLIC' @ [65:55] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'tree' @ [65:67] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'modifiers' @ [65:72] ==> public final val JCTree.JCClassDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'visibility' @ [65:82] ==> internal val JCTree.JCModifiers.visibility: Visibility defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'tree' @ [68:17] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'typeParameters' @ [68:22] ==> public final val JCTree.JCClassDecl.typeParameters: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?)[MyPropertyDescriptor]

'map' @ [68:37] ==> public inline fun <T, R> Iterable<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>.map(transform: ((JCTree.JCTypeParameter..JCTree.JCTypeParameter?)) -> TreeBasedTypeParameter): List<TreeBasedTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCTypeParameter..com.sun.tools.javac.tree.JCTree.JCTypeParameter?)
    <R> -> TreeBasedTypeParameter

'TreeBasedTypeParameter' @ [69:13] ==> public constructor TreeBasedTypeParameter(tree: JCTree.JCTypeParameter, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[ClassConstructorDescriptorImpl]

'parameter' @ [69:36] ==> value-parameter parameter: (JCTree.JCTypeParameter..JCTree.JCTypeParameter?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-typeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [69:47] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [69:56] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'parameter' @ [69:66] ==> value-parameter parameter: (JCTree.JCTypeParameter..JCTree.JCTypeParameter?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-typeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [69:78] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'treePath' @ [73:13] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'reversed' @ [73:22] ==> public fun <T> Iterable<(Tree..Tree?)>.reversed(): List<(Tree..Tree?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.source.tree.Tree..com.sun.source.tree.Tree?)

'filterIsInstance' @ [74:22] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<JCTree.JCClassDecl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> JCClassDecl

'joinToString' @ [75:22] ==> public fun <T> Iterable<JCTree.JCClassDecl>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((JCTree.JCClassDecl) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCClassDecl

'treePath' @ [77:41] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'compilationUnit' @ [77:50] ==> public final val TreePath.compilationUnit: (CompilationUnitTree..CompilationUnitTree?)[MyPropertyDescriptor]

'packageName' @ [77:66] ==> public final val CompilationUnitTree.packageName: (ExpressionTree..ExpressionTree?)[MyPropertyDescriptor]

'JCClassDecl' @ [78:48] ==> protected/*protected and package*/ constructor JCClassDecl(p0: (JCTree.JCModifiers..JCTree.JCModifiers?), p1: (Name..Name?), p2: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?), p3: (JCTree.JCExpression..JCTree.JCExpression?), p4: (List<(JCTree.JCExpression..JCTree.JCExpression?)>..List<(JCTree.JCExpression..JCTree.JCExpression?)>?), p5: (List<(JCTree..JCTree?)>..List<(JCTree..JCTree?)>?), p6: (Symbol.ClassSymbol..Symbol.ClassSymbol?)) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaClassConstructorDescriptor]

'name' @ [78:61] ==> public final var name: (Name..Name?) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaPropertyDescriptor]

'let' @ [80:22] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'FqName' @ [80:28] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'arrayListOf' @ [83:17] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<JavaClassifierType> /* = ArrayList<JavaClassifierType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClassifierType

'apply' @ [83:51] ==> @InlineOnly public inline fun <T> ArrayList<JavaClassifierType> /* = ArrayList<JavaClassifierType> */.apply(block: ArrayList<JavaClassifierType> /* = ArrayList<JavaClassifierType> */.() -> Unit): ArrayList<JavaClassifierType> /* = ArrayList<JavaClassifierType> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<JavaClassifierType>

'when {
                this is JCTree.JCTypeApply -> TreeBasedGenericClassifierType(this, TreePath(treePath, this), javac)
                this is JCTree.JCExpression -> TreeBasedNonGenericClassifierType(this, TreePath(treePath, this), javac)
                else -> null
            }' @ [84:52] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TreeBasedClassifierType<JCTree.JCExpression>?, entry1: TreeBasedClassifierType<JCTree.JCExpression>?, entry2: TreeBasedClassifierType<JCTree.JCExpression>?): TreeBasedClassifierType<JCTree.JCExpression>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TreeBasedClassifierType<JCExpression>?

'this' @ [85:17] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>.mapToJavaClassifierType[ReceiverParameterDescriptorImpl]

'TreeBasedGenericClassifierType' @ [85:47] ==> public constructor TreeBasedGenericClassifierType(tree: JCTree.JCTypeApply, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType[ClassConstructorDescriptorImpl]

'this' @ [85:78] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>.mapToJavaClassifierType[ReceiverParameterDescriptorImpl]

'TreePath' @ [85:84] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [85:93] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'this' @ [85:103] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>.mapToJavaClassifierType[ReceiverParameterDescriptorImpl]

'javac' @ [85:110] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'this' @ [86:17] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>.mapToJavaClassifierType[ReceiverParameterDescriptorImpl]

'TreeBasedNonGenericClassifierType' @ [86:48] ==> public constructor TreeBasedNonGenericClassifierType(tree: JCTree.JCExpression, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedNonGenericClassifierType[ClassConstructorDescriptorImpl]

'this' @ [86:82] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>.mapToJavaClassifierType[ReceiverParameterDescriptorImpl]

'TreePath' @ [86:88] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [86:97] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'this' @ [86:107] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>.mapToJavaClassifierType[ReceiverParameterDescriptorImpl]

'javac' @ [86:114] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'if (isEnum) {
                javac.JAVA_LANG_ENUM?.let(this::add)
            } else if (isAnnotationType) {
                javac.JAVA_LANG_ANNOTATION_ANNOTATION?.let(this::add)
            }' @ [90:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'isEnum' @ [90:17] ==> public open val isEnum: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'javac' @ [91:17] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'JAVA_LANG_ENUM' @ [91:23] ==> public final val JAVA_LANG_ENUM: SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>? defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'let' @ [91:39] ==> @InlineOnly public inline fun <T, R> SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>.let(block: (SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>
    <R> -> Boolean

'this' @ [91:43] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>[ReceiverParameterDescriptorImpl]

'add' @ [91:49] ==> public open fun add(element: JavaClassifierType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'isAnnotationType' @ [92:24] ==> public open val isAnnotationType: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'javac' @ [93:17] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'JAVA_LANG_ANNOTATION_ANNOTATION' @ [93:23] ==> public final val JAVA_LANG_ANNOTATION_ANNOTATION: SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>? defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'let' @ [93:56] ==> @InlineOnly public inline fun <T, R> SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>.let(block: (SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>
    <R> -> Boolean

'this' @ [93:60] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>[ReceiverParameterDescriptorImpl]

'add' @ [93:66] ==> public open fun add(element: JavaClassifierType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'tree' @ [96:13] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'implementing' @ [96:18] ==> public final var implementing: (List<(JCTree.JCExpression..JCTree.JCExpression?)>..List<(JCTree.JCExpression..JCTree.JCExpression?)>?) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaPropertyDescriptor]

'mapNotNull' @ [96:32] ==> public inline fun <T, R : Any> Iterable<(JCTree.JCExpression..JCTree.JCExpression?)>.mapNotNull(transform: ((JCTree.JCExpression..JCTree.JCExpression?)) -> TreeBasedClassifierType<JCTree.JCExpression>?): List<TreeBasedClassifierType<JCTree.JCExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCExpression..com.sun.tools.javac.tree.JCTree.JCExpression?)
    <R : Any> -> TreeBasedClassifierType<JCExpression>

'it' @ [96:45] ==> value-parameter it: (JCTree.JCExpression..JCTree.JCExpression?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mapToJavaClassifierType' @ [96:48] ==> local final fun JCTree.mapToJavaClassifierType(): TreeBasedClassifierType<JCTree.JCExpression>? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>[SimpleFunctionDescriptorImpl]

'let' @ [96:77] ==> @InlineOnly public inline fun <T, R> List<TreeBasedClassifierType<JCTree.JCExpression>>.let(block: (List<TreeBasedClassifierType<JCTree.JCExpression>>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TreeBasedClassifierType<JCExpression>>
    <R> -> Boolean

'this' @ [96:81] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>[ReceiverParameterDescriptorImpl]

'addAll' @ [96:87] ==> public open fun addAll(elements: Collection<JavaClassifierType>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'tree' @ [97:13] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'extending' @ [97:18] ==> public final var extending: (JCTree.JCExpression..JCTree.JCExpression?) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaPropertyDescriptor]

'let' @ [97:29] ==> @InlineOnly public inline fun <T, R> JCTree.JCExpression.let(block: (JCTree.JCExpression) -> Boolean?): Boolean? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCExpression
    <R> -> Boolean?

'it' @ [97:35] ==> value-parameter it: JCTree.JCExpression defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mapToJavaClassifierType' @ [97:38] ==> local final fun JCTree.mapToJavaClassifierType(): TreeBasedClassifierType<JCTree.JCExpression>? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>[SimpleFunctionDescriptorImpl]

'let' @ [97:65] ==> @InlineOnly public inline fun <T, R> TreeBasedClassifierType<JCTree.JCExpression>.let(block: (TreeBasedClassifierType<JCTree.JCExpression>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedClassifierType<JCExpression>
    <R> -> Boolean

'this' @ [97:69] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>[ReceiverParameterDescriptorImpl]

'add' @ [97:75] ==> public open fun add(element: JavaClassifierType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'isEmpty' @ [99:17] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'javac' @ [100:17] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'JAVA_LANG_OBJECT' @ [100:23] ==> public final val JAVA_LANG_OBJECT: SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>? defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'let' @ [100:41] ==> @InlineOnly public inline fun <T, R> SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>.let(block: (SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>
    <R> -> Boolean

'this' @ [100:45] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-supertypes>.<anonymous>[ReceiverParameterDescriptorImpl]

'add' @ [100:51] ==> public open fun add(element: JavaClassifierType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'getValue' @ [104:52] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'tree' @ [105:9] ==> value-parameter tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'members' @ [105:14] ==> public final val JCTree.JCClassDecl.members: (List<(JCTree..JCTree?)>..List<(JCTree..JCTree?)>?)[MyPropertyDescriptor]

'filterIsInstance' @ [106:18] ==> public fun <R> Iterable<*>.filterIsInstance(klass: Class<JCTree.JCClassDecl>): List<JCTree.JCClassDecl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> JCClassDecl

'JCClassDecl' @ [106:42] ==> protected/*protected and package*/ constructor JCClassDecl(p0: (JCTree.JCModifiers..JCTree.JCModifiers?), p1: (Name..Name?), p2: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?), p3: (JCTree.JCExpression..JCTree.JCExpression?), p4: (List<(JCTree.JCExpression..JCTree.JCExpression?)>..List<(JCTree.JCExpression..JCTree.JCExpression?)>?), p5: (List<(JCTree..JCTree?)>..List<(JCTree..JCTree?)>?), p6: (Symbol.ClassSymbol..Symbol.ClassSymbol?)) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaClassConstructorDescriptor]

'java' @ [106:61] ==> public val <T> KClass<JCTree.JCClassDecl>.java: Class<JCTree.JCClassDecl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JCClassDecl

'map' @ [107:18] ==> public inline fun <T, R> Iterable<JCTree.JCClassDecl>.map(transform: (JCTree.JCClassDecl) -> TreeBasedClass): List<TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCClassDecl
    <R> -> TreeBasedClass

'TreeBasedClass' @ [107:24] ==> public constructor TreeBasedClass(tree: JCTree.JCClassDecl, treePath: TreePath, javac: JavacWrapper, file: JavaFileObject) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[ClassConstructorDescriptorImpl]

'it' @ [107:39] ==> value-parameter it: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.innerClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [107:43] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [107:52] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'it' @ [107:62] ==> value-parameter it: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.innerClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [107:67] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'file' @ [107:74] ==> public final val file: JavaFileObject defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'associateBy' @ [108:18] ==> public inline fun <T, K> Iterable<TreeBasedClass>.associateBy(keySelector: (TreeBasedClass) -> Name): Map<Name, TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedClass
    <K> -> Name

'name' @ [108:41] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'getValue' @ [111:44] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'treePath' @ [112:10] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'parentPath' @ [112:19] ==> public final val TreePath.parentPath: (TreePath..TreePath?)[MyPropertyDescriptor]

'leaf' @ [112:30] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'let' @ [112:60] ==> @InlineOnly public inline fun <T, R> JCTree.JCClassDecl.let(block: (JCTree.JCClassDecl) -> TreeBasedClass): TreeBasedClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCClassDecl
    <R> -> TreeBasedClass

'TreeBasedClass' @ [113:13] ==> public constructor TreeBasedClass(tree: JCTree.JCClassDecl, treePath: TreePath, javac: JavacWrapper, file: JavaFileObject) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[ClassConstructorDescriptorImpl]

'classDecl' @ [113:28] ==> value-parameter classDecl: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.outerClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'treePath' @ [113:39] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'parentPath' @ [113:48] ==> public final val TreePath.parentPath: (TreePath..TreePath?)[MyPropertyDescriptor]

'javac' @ [113:60] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'file' @ [113:67] ==> public final val file: JavaFileObject defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'tree' @ [118:17] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'modifiers' @ [118:22] ==> public final val JCTree.JCClassDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'flags' @ [118:32] ==> public final var flags: Long defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaPropertyDescriptor]

'INTERFACE' @ [118:48] ==> public const final val INTERFACE: Int defined in com.sun.tools.javac.code.Flags[JavaPropertyDescriptor]

'toLong' @ [118:58] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'tree' @ [121:17] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'modifiers' @ [121:22] ==> public final val JCTree.JCClassDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'flags' @ [121:32] ==> public final var flags: Long defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaPropertyDescriptor]

'ANNOTATION' @ [121:48] ==> public const final val ANNOTATION: Int defined in com.sun.tools.javac.code.Flags[JavaPropertyDescriptor]

'toLong' @ [121:59] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'tree' @ [124:17] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'modifiers' @ [124:22] ==> public final val JCTree.JCClassDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'flags' @ [124:32] ==> public final var flags: Long defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaPropertyDescriptor]

'ENUM' @ [124:48] ==> public const final val ENUM: Int defined in com.sun.tools.javac.code.Flags[JavaPropertyDescriptor]

'toLong' @ [124:53] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'tree' @ [130:17] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'members' @ [130:22] ==> public final val JCTree.JCClassDecl.members: (List<(JCTree..JCTree?)>..List<(JCTree..JCTree?)>?)[MyPropertyDescriptor]

'filter' @ [131:18] ==> public inline fun <T> Iterable<(JCTree..JCTree?)>.filter(predicate: ((JCTree..JCTree?)) -> Boolean): List<(JCTree..JCTree?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree..com.sun.tools.javac.tree.JCTree?)

'it' @ [131:27] ==> value-parameter it: (JCTree..JCTree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-methods>.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [131:30] ==> public final val JCTree.kind: (Tree.Kind..Tree.Kind?)[MyPropertyDescriptor]

'METHOD' @ [131:48] ==> enum entry METHOD defined in com.sun.source.tree.Tree.Kind[FakeCallableDescriptorForObject]

'!' @ [131:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isConstructor' @ [131:68] ==> public open fun isConstructor(p0: (JCTree..JCTree?)): Boolean defined in com.sun.tools.javac.tree.TreeInfo[JavaMethodDescriptor]

'it' @ [131:82] ==> value-parameter it: (JCTree..JCTree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-methods>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [132:18] ==> public inline fun <T, R> Iterable<(JCTree..JCTree?)>.map(transform: ((JCTree..JCTree?)) -> TreeBasedMethod): List<TreeBasedMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree..com.sun.tools.javac.tree.JCTree?)
    <R> -> TreeBasedMethod

'TreeBasedMethod' @ [132:24] ==> public constructor TreeBasedMethod(tree: JCTree.JCMethodDecl, treePath: TreePath, containingClass: JavaClass, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[ClassConstructorDescriptorImpl]

'it' @ [132:40] ==> value-parameter it: (JCTree..JCTree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-methods>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [132:67] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [132:76] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'it' @ [132:86] ==> value-parameter it: (JCTree..JCTree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-methods>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [132:91] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[LazyClassReceiverParameterDescriptor]

'javac' @ [132:97] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'tree' @ [135:17] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'members' @ [135:22] ==> public final val JCTree.JCClassDecl.members: (List<(JCTree..JCTree?)>..List<(JCTree..JCTree?)>?)[MyPropertyDescriptor]

'filterIsInstance' @ [136:18] ==> public fun <R> Iterable<*>.filterIsInstance(klass: Class<JCTree.JCVariableDecl>): List<JCTree.JCVariableDecl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> JCVariableDecl

'java' @ [136:64] ==> public val <T> KClass<JCTree.JCVariableDecl>.java: Class<JCTree.JCVariableDecl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JCVariableDecl

'map' @ [137:18] ==> public inline fun <T, R> Iterable<JCTree.JCVariableDecl>.map(transform: (JCTree.JCVariableDecl) -> TreeBasedField): List<TreeBasedField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCVariableDecl
    <R> -> TreeBasedField

'TreeBasedField' @ [137:24] ==> public constructor TreeBasedField(tree: JCTree.JCVariableDecl, treePath: TreePath, containingClass: JavaClass, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[ClassConstructorDescriptorImpl]

'it' @ [137:39] ==> value-parameter it: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-fields>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [137:43] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [137:52] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'it' @ [137:62] ==> value-parameter it: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-fields>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [137:67] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[LazyClassReceiverParameterDescriptor]

'javac' @ [137:73] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'tree' @ [140:17] ==> public final val tree: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'members' @ [140:22] ==> public final val JCTree.JCClassDecl.members: (List<(JCTree..JCTree?)>..List<(JCTree..JCTree?)>?)[MyPropertyDescriptor]

'filter' @ [141:18] ==> public inline fun <T> Iterable<(JCTree..JCTree?)>.filter(predicate: ((JCTree..JCTree?)) -> Boolean): List<(JCTree..JCTree?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree..com.sun.tools.javac.tree.JCTree?)

'isConstructor' @ [141:46] ==> public open fun isConstructor(p0: (JCTree..JCTree?)): Boolean defined in com.sun.tools.javac.tree.TreeInfo[JavaMethodDescriptor]

'member' @ [141:60] ==> value-parameter member: (JCTree..JCTree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-constructors>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [142:18] ==> public inline fun <T, R> Iterable<(JCTree..JCTree?)>.map(transform: ((JCTree..JCTree?)) -> TreeBasedConstructor): List<TreeBasedConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree..com.sun.tools.javac.tree.JCTree?)
    <R> -> TreeBasedConstructor

'TreeBasedConstructor' @ [143:21] ==> public constructor TreeBasedConstructor(tree: JCTree.JCMethodDecl, treePath: TreePath, containingClass: JavaClass, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor[ClassConstructorDescriptorImpl]

'constructor' @ [143:42] ==> value-parameter constructor: (JCTree..JCTree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-constructors>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [143:78] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [143:87] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'constructor' @ [143:97] ==> value-parameter constructor: (JCTree..JCTree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<get-constructors>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [143:111] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[LazyClassReceiverParameterDescriptor]

'javac' @ [143:117] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'innerClasses' @ [147:17] ==> public final val innerClasses: Map<Name, TreeBasedClass> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'keys' @ [147:30] ==> public abstract val keys: Set<Name> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'getValue' @ [149:47] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'javac' @ [150:9] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.<init>[ValueParameterDescriptorImpl]

'toVirtualFile' @ [150:15] ==> public final fun toVirtualFile(javaFileObject: JavaFileObject): VirtualFile? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'file' @ [150:29] ==> public final val file: JavaFileObject defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'innerClasses' @ [155:47] ==> public final val innerClasses: Map<Name, TreeBasedClass> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'name' @ [155:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass.findInnerClass[ValueParameterDescriptorImpl]

