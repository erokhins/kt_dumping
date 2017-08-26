'TreeBasedMember<JCTree.JCVariableDecl>' @ [35:5] ==> public constructor TreeBasedMember<out T : JCTree>(tree: JCTree.JCVariableDecl, treePath: TreePath, containingClass: JavaClass, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCVariableDecl

'tree' @ [35:44] ==> value-parameter tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField.<init>[ValueParameterDescriptorImpl]

'treePath' @ [35:50] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [35:60] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField.<init>[ValueParameterDescriptorImpl]

'javac' @ [35:77] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField.<init>[ValueParameterDescriptorImpl]

'identifier' @ [38:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'tree' @ [38:33] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'name' @ [38:38] ==> public final var name: (Name..Name?) defined in com.sun.tools.javac.tree.JCTree.JCVariableDecl[JavaPropertyDescriptor]

'toString' @ [38:43] ==> public open fun toString(): String defined in com.sun.tools.javac.util.Name[JavaMethodDescriptor]

'tree' @ [41:17] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'modifiers' @ [41:22] ==> public final val JCTree.JCVariableDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'isAbstract' @ [41:32] ==> internal val JCTree.JCModifiers.isAbstract: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'containingClass' @ [44:17] ==> public open val containingClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'isInterface' @ [44:33] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'tree' @ [44:48] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'modifiers' @ [44:53] ==> public final val JCTree.JCVariableDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'isStatic' @ [44:63] ==> internal val JCTree.JCModifiers.isStatic: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'containingClass' @ [47:17] ==> public open val containingClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'isInterface' @ [47:33] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'tree' @ [47:48] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'modifiers' @ [47:53] ==> public final val JCTree.JCVariableDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'isFinal' @ [47:63] ==> internal val JCTree.JCModifiers.isFinal: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'if (containingClass.isInterface) Visibilities.PUBLIC else tree.modifiers.visibility' @ [50:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Visibility, elseBranch: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Visibility

'containingClass' @ [50:21] ==> public open val containingClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'isInterface' @ [50:37] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'PUBLIC' @ [50:63] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'tree' @ [50:75] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'modifiers' @ [50:80] ==> public final val JCTree.JCVariableDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'visibility' @ [50:90] ==> internal val JCTree.JCModifiers.visibility: Visibility defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'tree' @ [53:17] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'modifiers' @ [53:22] ==> public final val JCTree.JCVariableDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'flags' @ [53:32] ==> public final var flags: Long defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaPropertyDescriptor]

'ENUM' @ [53:48] ==> public const final val ENUM: Int defined in com.sun.tools.javac.code.Flags[JavaPropertyDescriptor]

'toLong' @ [53:53] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'TreeBasedType' @ [56:17] ==> public companion object defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[FakeCallableDescriptorForObject]

'create' @ [56:31] ==> public final fun <Type : JCTree> create(tree: (JCTree..JCTree?), treePath: TreePath, javac: JavacWrapper): TreeBasedType<JCTree.JCExpression> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <Type : JCTree> -> (com.sun.tools.javac.tree.JCTree..com.sun.tools.javac.tree.JCTree?)

'tree' @ [56:38] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'getType' @ [56:43] ==> public open fun getType(): (JCTree..JCTree?) defined in com.sun.tools.javac.tree.JCTree.JCVariableDecl[JavaMethodDescriptor]

'treePath' @ [56:54] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'javac' @ [56:64] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'tree' @ [59:17] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'init' @ [59:22] ==> public final var init: (JCTree.JCExpression..JCTree.JCExpression?) defined in com.sun.tools.javac.tree.JCTree.JCVariableDecl[JavaPropertyDescriptor]

'let' @ [59:28] ==> @InlineOnly public inline fun <T, R> JCTree.JCExpression.let(block: (JCTree.JCExpression) -> Any?): Any? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCExpression
    <R> -> Any?

'if (hasConstantNotNullInitializer && initExpr is JCTree.JCLiteral) {
                initExpr.value
            } else {
                null
            }' @ [60:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'hasConstantNotNullInitializer' @ [60:17] ==> public open val hasConstantNotNullInitializer: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'initExpr' @ [60:50] ==> value-parameter initExpr: JCTree.JCExpression defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField.<get-initializerValue>.<anonymous>[ValueParameterDescriptorImpl]

'initExpr' @ [61:17] ==> value-parameter initExpr: JCTree.JCExpression defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField.<get-initializerValue>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [61:26] ==> public final var value: (Any..Any?) defined in com.sun.tools.javac.tree.JCTree.JCLiteral[JavaPropertyDescriptor]

'tree' @ [68:17] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'init' @ [68:22] ==> public final var init: (JCTree.JCExpression..JCTree.JCExpression?) defined in com.sun.tools.javac.tree.JCTree.JCVariableDecl[JavaPropertyDescriptor]

'let' @ [68:28] ==> @InlineOnly public inline fun <T, R> JCTree.JCExpression.let(block: (JCTree.JCExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCExpression
    <R> -> Boolean

'this' @ [69:24] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[LazyClassReceiverParameterDescriptor]

'type' @ [69:29] ==> public open val type: JavaType defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'isFinal' @ [71:13] ==> public open val isFinal: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField[PropertyDescriptorImpl]

'type' @ [71:26] ==> val type: JavaType defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField.<get-hasConstantNotNullInitializer>.<anonymous>[LocalVariableDescriptor]

'type' @ [72:26] ==> val type: JavaType defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField.<get-hasConstantNotNullInitializer>.<anonymous>[LocalVariableDescriptor]

'type' @ [73:26] ==> val type: JavaType defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedField.<get-hasConstantNotNullInitializer>.<anonymous>[LocalVariableDescriptor]

'classifierQualifiedName' @ [73:31] ==> public open val classifierQualifiedName: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedNonGenericClassifierType[PropertyDescriptorImpl]

