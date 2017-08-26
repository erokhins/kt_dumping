'when (tree) {
            is JCTree.JCPrimitiveTypeTree -> TreeBasedPrimitiveType(tree, TreePath(treePath, tree), javac)
            is JCTree.JCArrayTypeTree -> TreeBasedArrayType(tree, TreePath(treePath, tree), javac)
            is JCTree.JCWildcard -> TreeBasedWildcardType(tree, TreePath(treePath, tree), javac)
            is JCTree.JCTypeApply -> TreeBasedGenericClassifierType(tree, TreePath(treePath, tree), javac)
            is JCTree.JCExpression -> TreeBasedNonGenericClassifierType(tree, TreePath(treePath, tree), javac)
            else -> throw UnsupportedOperationException("Unsupported type: $tree")
        }' @ [37:91] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TreeBasedType<JCTree.JCExpression>, entry1: TreeBasedType<JCTree.JCExpression>, entry2: TreeBasedType<JCTree.JCExpression>, entry3: TreeBasedType<JCTree.JCExpression>, entry4: TreeBasedType<JCTree.JCExpression>, entry5: TreeBasedType<JCTree.JCExpression>): TreeBasedType<JCTree.JCExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TreeBasedType<JCExpression>

'tree' @ [37:97] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreeBasedPrimitiveType' @ [38:46] ==> public constructor TreeBasedPrimitiveType(tree: JCTree.JCPrimitiveTypeTree, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPrimitiveType[ClassConstructorDescriptorImpl]

'tree' @ [38:69] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreePath' @ [38:75] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [38:84] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'tree' @ [38:94] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [38:101] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreeBasedArrayType' @ [39:42] ==> public constructor TreeBasedArrayType(tree: JCTree.JCArrayTypeTree, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedArrayType[ClassConstructorDescriptorImpl]

'tree' @ [39:61] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreePath' @ [39:67] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [39:76] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'tree' @ [39:86] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [39:93] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreeBasedWildcardType' @ [40:37] ==> public constructor TreeBasedWildcardType(tree: JCTree.JCWildcard, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedWildcardType[ClassConstructorDescriptorImpl]

'tree' @ [40:59] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreePath' @ [40:65] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [40:74] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'tree' @ [40:84] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [40:91] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreeBasedGenericClassifierType' @ [41:38] ==> public constructor TreeBasedGenericClassifierType(tree: JCTree.JCTypeApply, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType[ClassConstructorDescriptorImpl]

'tree' @ [41:69] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreePath' @ [41:75] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [41:84] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'tree' @ [41:94] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [41:101] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreeBasedNonGenericClassifierType' @ [42:39] ==> public constructor TreeBasedNonGenericClassifierType(tree: JCTree.JCExpression, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedNonGenericClassifierType[ClassConstructorDescriptorImpl]

'tree' @ [42:73] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'TreePath' @ [42:79] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [42:88] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'tree' @ [42:98] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [42:105] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [43:27] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'tree' @ [43:77] ==> value-parameter tree: Type defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion.create[ValueParameterDescriptorImpl]

'emptyList' @ [48:17] ==> public fun <T> emptyList(): List<JavaAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation

'annotations' @ [53:51] ==> public open val annotations: Collection<JavaAnnotation> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[PropertyDescriptorImpl]

'find' @ [53:63] ==> @InlineOnly public inline fun <T> Iterable<JavaAnnotation>.find(predicate: (JavaAnnotation) -> Boolean): JavaAnnotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation

'it' @ [53:70] ==> value-parameter it: JavaAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [53:73] ==> public abstract val classId: ClassId? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotation[DeserializedPropertyDescriptor]

'asSingleFqName' @ [53:82] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'fqName' @ [53:102] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.findAnnotation[ValueParameterDescriptorImpl]

'==' @ [55:40] ==> public open fun equals(other: Any?): Boolean defined in com.sun.tools.javac.tree.JCTree[DeserializedSimpleFunctionDescriptor]

'other' @ [55:41] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.equals[ValueParameterDescriptorImpl]

'tree' @ [55:70] ==> public final val tree: JCTree defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[PropertyDescriptorImpl]

'tree' @ [55:78] ==> public final val tree: T defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[PropertyDescriptorImpl]

'tree' @ [57:31] ==> public final val tree: T defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[PropertyDescriptorImpl]

'hashCode' @ [57:36] ==> public open fun hashCode(): Int defined in com.sun.tools.javac.tree.JCTree[DeserializedSimpleFunctionDescriptor]

'tree' @ [59:31] ==> public final val tree: T defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[PropertyDescriptorImpl]

'toString' @ [59:36] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree[JavaMethodDescriptor]

'TreeBasedType<JCTree.JCPrimitiveTypeTree>' @ [67:5] ==> public constructor TreeBasedType<out T : JCTree>(tree: JCTree.JCPrimitiveTypeTree, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCPrimitiveTypeTree

'tree' @ [67:47] ==> value-parameter tree: JCTree.JCPrimitiveTypeTree defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPrimitiveType.<init>[ValueParameterDescriptorImpl]

'treePath' @ [67:53] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPrimitiveType.<init>[ValueParameterDescriptorImpl]

'javac' @ [67:63] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPrimitiveType.<init>[ValueParameterDescriptorImpl]

'if (tree.primitiveTypeKind == TypeKind.VOID) {
            null
        }
        else {
            JvmPrimitiveType.get(tree.toString()).primitiveType
        }' @ [70:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PrimitiveType?, elseBranch: PrimitiveType?): PrimitiveType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PrimitiveType?

'tree' @ [70:21] ==> public final val tree: JCTree.JCPrimitiveTypeTree defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPrimitiveType[PropertyDescriptorImpl]

'primitiveTypeKind' @ [70:26] ==> public final val JCTree.JCPrimitiveTypeTree.primitiveTypeKind: (TypeKind..TypeKind?)[MyPropertyDescriptor]

'VOID' @ [70:56] ==> enum entry VOID defined in javax.lang.model.type.TypeKind[FakeCallableDescriptorForObject]

'get' @ [74:30] ==> @NotNull public open fun get(@NotNull p0: String): JvmPrimitiveType defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[JavaMethodDescriptor]

'tree' @ [74:34] ==> public final val tree: JCTree.JCPrimitiveTypeTree defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPrimitiveType[PropertyDescriptorImpl]

'toString' @ [74:39] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree.JCPrimitiveTypeTree[JavaMethodDescriptor]

'primitiveType' @ [74:51] ==> public final val JvmPrimitiveType.primitiveType: PrimitiveType[MyPropertyDescriptor]

'TreeBasedType<JCTree.JCArrayTypeTree>' @ [83:5] ==> public constructor TreeBasedType<out T : JCTree>(tree: JCTree.JCArrayTypeTree, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCArrayTypeTree

'tree' @ [83:43] ==> value-parameter tree: JCTree.JCArrayTypeTree defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedArrayType.<init>[ValueParameterDescriptorImpl]

'treePath' @ [83:49] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedArrayType.<init>[ValueParameterDescriptorImpl]

'javac' @ [83:59] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedArrayType.<init>[ValueParameterDescriptorImpl]

'create' @ [86:17] ==> public final fun <Type : JCTree> create(tree: (JCTree.JCExpression..JCTree.JCExpression?), treePath: TreePath, javac: JavacWrapper): TreeBasedType<JCTree.JCExpression> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <Type : JCTree> -> (com.sun.tools.javac.tree.JCTree.JCExpression..com.sun.tools.javac.tree.JCTree.JCExpression?)

'tree' @ [86:24] ==> public final val tree: JCTree.JCArrayTypeTree defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedArrayType[PropertyDescriptorImpl]

'elemtype' @ [86:29] ==> public final var elemtype: (JCTree.JCExpression..JCTree.JCExpression?) defined in com.sun.tools.javac.tree.JCTree.JCArrayTypeTree[JavaPropertyDescriptor]

'treePath' @ [86:39] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedArrayType[PropertyDescriptorImpl]

'javac' @ [86:49] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedArrayType[PropertyDescriptorImpl]

'TreeBasedType<JCTree.JCWildcard>' @ [94:5] ==> public constructor TreeBasedType<out T : JCTree>(tree: JCTree.JCWildcard, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCWildcard

'tree' @ [94:38] ==> value-parameter tree: JCTree.JCWildcard defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedWildcardType.<init>[ValueParameterDescriptorImpl]

'treePath' @ [94:44] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedWildcardType.<init>[ValueParameterDescriptorImpl]

'javac' @ [94:54] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedWildcardType.<init>[ValueParameterDescriptorImpl]

'tree' @ [97:17] ==> public final val tree: JCTree.JCWildcard defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedWildcardType[PropertyDescriptorImpl]

'bound' @ [97:22] ==> public final val JCTree.JCWildcard.bound: (JCTree..JCTree?)[MyPropertyDescriptor]

'let' @ [97:29] ==> @InlineOnly public inline fun <T, R> JCTree.let(block: (JCTree) -> TreeBasedType<JCTree.JCExpression>): TreeBasedType<JCTree.JCExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCTree
    <R> -> TreeBasedType<JCExpression>

'create' @ [97:35] ==> public final fun <Type : JCTree> create(tree: JCTree, treePath: TreePath, javac: JavacWrapper): TreeBasedType<JCTree.JCExpression> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <Type : JCTree> -> JCTree

'it' @ [97:42] ==> value-parameter it: JCTree defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedWildcardType.<get-bound>.<anonymous>[ValueParameterDescriptorImpl]

'treePath' @ [97:46] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedWildcardType[PropertyDescriptorImpl]

'javac' @ [97:56] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedWildcardType[PropertyDescriptorImpl]

'tree' @ [100:17] ==> public final val tree: JCTree.JCWildcard defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedWildcardType[PropertyDescriptorImpl]

'kind' @ [100:22] ==> public final var kind: (JCTree.TypeBoundKind..JCTree.TypeBoundKind?) defined in com.sun.tools.javac.tree.JCTree.JCWildcard[JavaPropertyDescriptor]

'kind' @ [100:27] ==> public final var kind: (BoundKind..BoundKind?) defined in com.sun.tools.javac.tree.JCTree.TypeBoundKind[JavaPropertyDescriptor]

'EXTENDS' @ [100:45] ==> enum entry EXTENDS defined in com.sun.tools.javac.code.BoundKind[FakeCallableDescriptorForObject]

'TreeBasedType<T>' @ [108:5] ==> public constructor TreeBasedType<out T : JCTree>(tree: T, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> T

'tree' @ [108:22] ==> value-parameter tree: T defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType.<init>[ValueParameterDescriptorImpl]

'treePath' @ [108:28] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType.<init>[ValueParameterDescriptorImpl]

'javac' @ [108:38] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType.<init>[ValueParameterDescriptorImpl]

'javac' @ [111:17] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType[PropertyDescriptorImpl]

'resolve' @ [111:23] ==> public final fun resolve(treePath: TreePath): JavaClassifier? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'treePath' @ [111:31] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType[PropertyDescriptorImpl]

'?:' @ [114:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'classifier' @ [114:18] ==> public open val classifier: JavaClassifier? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType[PropertyDescriptorImpl]

'fqName' @ [114:45] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'asString' @ [114:53] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'treePath' @ [114:67] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType[PropertyDescriptorImpl]

'leaf' @ [114:76] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'toString' @ [114:81] ==> public open fun toString(): String defined in com.sun.source.tree.Tree[DeserializedSimpleFunctionDescriptor]

'classifierQualifiedName' @ [117:17] ==> public open val classifierQualifiedName: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType[PropertyDescriptorImpl]

'treePath' @ [120:17] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType[PropertyDescriptorImpl]

'flatMap' @ [120:26] ==> public inline fun <T, R> Iterable<(Tree..Tree?)>.flatMap(transform: ((Tree..Tree?)) -> Iterable<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>): List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.source.tree.Tree..com.sun.source.tree.Tree?)
    <R> -> (com.sun.tools.javac.tree.JCTree.JCTypeParameter..com.sun.tools.javac.tree.JCTree.JCTypeParameter?)

'when (it) {
                        is JCTree.JCClassDecl -> it.typarams
                        is JCTree.JCMethodDecl -> it.typarams
                        else -> emptyList<JCTree.JCTypeParameter>()
                    }' @ [121:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?), entry1: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?), entry2: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?)): (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.collections.List<(com.sun.tools.javac.tree.JCTree.JCTypeParameter..com.sun.tools.javac.tree.JCTree.JCTypeParameter?)>..kotlin.collections.List<(com.sun.tools.javac.tree.JCTree.JCTypeParameter..com.sun.tools.javac.tree.JCTree.JCTypeParameter?)>?)

'it' @ [121:27] ==> value-parameter it: (Tree..Tree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType.<get-typeParameter>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [122:50] ==> value-parameter it: (Tree..Tree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType.<get-typeParameter>.<anonymous>[ValueParameterDescriptorImpl]

'typarams' @ [122:53] ==> public final var typarams: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaPropertyDescriptor]

'it' @ [123:51] ==> value-parameter it: (Tree..Tree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType.<get-typeParameter>.<anonymous>[ValueParameterDescriptorImpl]

'typarams' @ [123:54] ==> public final var typarams: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?) defined in com.sun.tools.javac.tree.JCTree.JCMethodDecl[JavaPropertyDescriptor]

'emptyList' @ [124:33] ==> public fun <T> emptyList(): List<JCTree.JCTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCTypeParameter

'find' @ [127:18] ==> @InlineOnly public inline fun <T> Iterable<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>.find(predicate: ((JCTree.JCTypeParameter..JCTree.JCTypeParameter?)) -> Boolean): JCTree.JCTypeParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCTypeParameter..com.sun.tools.javac.tree.JCTree.JCTypeParameter?)

'it' @ [127:25] ==> value-parameter it: (JCTree.JCTypeParameter..JCTree.JCTypeParameter?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType.<get-typeParameter>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [127:28] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree.JCTypeParameter[JavaMethodDescriptor]

'substringBefore' @ [127:39] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'treePath' @ [127:63] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType[PropertyDescriptorImpl]

'leaf' @ [127:72] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'toString' @ [127:77] ==> public open fun toString(): String defined in com.sun.source.tree.Tree[DeserializedSimpleFunctionDescriptor]

'TreeBasedClassifierType<JCTree.JCExpression>' @ [135:5] ==> private constructor TreeBasedClassifierType<out T : JCTree>(tree: JCTree.JCExpression, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCExpression

'tree' @ [135:50] ==> value-parameter tree: JCTree.JCExpression defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedNonGenericClassifierType.<init>[ValueParameterDescriptorImpl]

'treePath' @ [135:56] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedNonGenericClassifierType.<init>[ValueParameterDescriptorImpl]

'javac' @ [135:66] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedNonGenericClassifierType.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [138:17] ==> public fun <T> emptyList(): List<JavaType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType

'?:' @ [141:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean?): Boolean?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean?

'classifier' @ [141:18] ==> public open val classifier: JavaClassifier? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedNonGenericClassifierType[PropertyDescriptorImpl]

'hasTypeParameters' @ [141:56] ==> public final val hasTypeParameters: Boolean defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[PropertyDescriptorImpl]

'classifier' @ [142:21] ==> public open val classifier: JavaClassifier? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedNonGenericClassifierType[PropertyDescriptorImpl]

'typeParameters' @ [142:48] ==> public abstract val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'isNotEmpty' @ [142:64] ==> @InlineOnly public inline fun <T> Collection<JavaTypeParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeParameter

'TreeBasedClassifierType<JCTree.JCTypeApply>' @ [151:5] ==> private constructor TreeBasedClassifierType<out T : JCTree>(tree: JCTree.JCTypeApply, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClassifierType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCTypeApply

'tree' @ [151:49] ==> value-parameter tree: JCTree.JCTypeApply defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType.<init>[ValueParameterDescriptorImpl]

'treePath' @ [151:55] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType.<init>[ValueParameterDescriptorImpl]

'javac' @ [151:65] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType.<init>[ValueParameterDescriptorImpl]

'tree' @ [154:17] ==> public final val tree: JCTree.JCTypeApply defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType[PropertyDescriptorImpl]

'arguments' @ [154:22] ==> public final var arguments: (List<(JCTree.JCExpression..JCTree.JCExpression?)>..List<(JCTree.JCExpression..JCTree.JCExpression?)>?) defined in com.sun.tools.javac.tree.JCTree.JCTypeApply[JavaPropertyDescriptor]

'map' @ [154:32] ==> public inline fun <T, R> Iterable<(JCTree.JCExpression..JCTree.JCExpression?)>.map(transform: ((JCTree.JCExpression..JCTree.JCExpression?)) -> TreeBasedType<JCTree.JCExpression>): List<TreeBasedType<JCTree.JCExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCExpression..com.sun.tools.javac.tree.JCTree.JCExpression?)
    <R> -> TreeBasedType<JCExpression>

'create' @ [154:38] ==> public final fun <Type : JCTree> create(tree: (JCTree.JCExpression..JCTree.JCExpression?), treePath: TreePath, javac: JavacWrapper): TreeBasedType<JCTree.JCExpression> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <Type : JCTree> -> (com.sun.tools.javac.tree.JCTree.JCExpression..com.sun.tools.javac.tree.JCTree.JCExpression?)

'it' @ [154:45] ==> value-parameter it: (JCTree.JCExpression..JCTree.JCExpression?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType.<get-typeArguments>.<anonymous>[ValueParameterDescriptorImpl]

'treePath' @ [154:49] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType[PropertyDescriptorImpl]

'javac' @ [154:59] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType[PropertyDescriptorImpl]

