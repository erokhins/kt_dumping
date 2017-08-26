'packageName' @ [26:50] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.j2k.quoteKeywords[ValueParameterDescriptorImpl]

'split' @ [26:62] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'joinToString' @ [26:73] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Identifier' @ [26:93] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'toKotlin' @ [26:104] ==> public final fun toKotlin(name: String): String defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'it' @ [26:113] ==> value-parameter it: String defined in org.jetbrains.kotlin.j2k.quoteKeywords.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [29:13] ==> value-parameter property: Property defined in org.jetbrains.kotlin.j2k.getDefaultInitializer[ValueParameterDescriptorImpl]

'type' @ [29:22] ==> public final val type: Type defined in org.jetbrains.kotlin.j2k.ast.Property[PropertyDescriptorImpl]

'when {
        t.isNullable -> LiteralExpression("null")
        t is PrimitiveType -> when (t.name.name) {
            "Boolean" -> LiteralExpression("false")
            "Char" -> LiteralExpression("' '")
            "Double" -> MethodCallExpression.buildNonNull(LiteralExpression("0").assignNoPrototype(), OperatorConventions.DOUBLE.toString())
            "Float" -> MethodCallExpression.buildNonNull(LiteralExpression("0").assignNoPrototype(), OperatorConventions.FLOAT.toString())
            else -> LiteralExpression("0")
        }
        else -> null
    }' @ [30:18] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Expression?, entry1: Expression?, entry2: Expression?): Expression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Expression?

't' @ [31:9] ==> val t: Type defined in org.jetbrains.kotlin.j2k.getDefaultInitializer[LocalVariableDescriptor]

'isNullable' @ [31:11] ==> public abstract val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Type[PropertyDescriptorImpl]

'LiteralExpression' @ [31:25] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

't' @ [32:9] ==> val t: Type defined in org.jetbrains.kotlin.j2k.getDefaultInitializer[LocalVariableDescriptor]

'when (t.name.name) {
            "Boolean" -> LiteralExpression("false")
            "Char" -> LiteralExpression("' '")
            "Double" -> MethodCallExpression.buildNonNull(LiteralExpression("0").assignNoPrototype(), OperatorConventions.DOUBLE.toString())
            "Float" -> MethodCallExpression.buildNonNull(LiteralExpression("0").assignNoPrototype(), OperatorConventions.FLOAT.toString())
            else -> LiteralExpression("0")
        }' @ [32:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Expression, entry1: Expression, entry2: Expression, entry3: Expression, entry4: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Expression

't' @ [32:37] ==> val t: Type defined in org.jetbrains.kotlin.j2k.getDefaultInitializer[LocalVariableDescriptor]

'name' @ [32:39] ==> public final val name: Identifier defined in org.jetbrains.kotlin.j2k.ast.PrimitiveType[PropertyDescriptorImpl]

'name' @ [32:44] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Identifier[PropertyDescriptorImpl]

'LiteralExpression' @ [33:26] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

'LiteralExpression' @ [34:23] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

'MethodCallExpression' @ [35:25] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[FakeCallableDescriptorForObject]

'buildNonNull' @ [35:46] ==> public final fun buildNonNull(receiver: Expression?, methodName: String, argumentList: ArgumentList = ..., typeArguments: List<Type> = ..., dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'LiteralExpression' @ [35:59] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

'assignNoPrototype' @ [35:82] ==> public fun <TElement : Element> LiteralExpression.assignNoPrototype(): LiteralExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LiteralExpression

'DOUBLE' @ [35:123] ==> public final val DOUBLE: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'toString' @ [35:130] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'MethodCallExpression' @ [36:24] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[FakeCallableDescriptorForObject]

'buildNonNull' @ [36:45] ==> public final fun buildNonNull(receiver: Expression?, methodName: String, argumentList: ArgumentList = ..., typeArguments: List<Type> = ..., dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'LiteralExpression' @ [36:58] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

'assignNoPrototype' @ [36:81] ==> public fun <TElement : Element> LiteralExpression.assignNoPrototype(): LiteralExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LiteralExpression

'FLOAT' @ [36:122] ==> public final val FLOAT: (Name..Name?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'toString' @ [36:128] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'LiteralExpression' @ [37:21] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

'result' @ [41:12] ==> val result: Expression? defined in org.jetbrains.kotlin.j2k.getDefaultInitializer[LocalVariableDescriptor]

'assignNoPrototype' @ [41:20] ==> public fun <TElement : Element> Expression.assignNoPrototype(): Expression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Expression

'field' @ [45:11] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.j2k.shouldGenerateDefaultInitializer[ValueParameterDescriptorImpl]

'initializer' @ [45:17] ==> public final var PsiField.initializer: PsiExpression?[MyPropertyDescriptor]

'field' @ [45:41] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.j2k.shouldGenerateDefaultInitializer[ValueParameterDescriptorImpl]

'isVar' @ [45:47] ==> public fun PsiField.isVar(searcher: ReferenceSearcher): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'searcher' @ [45:53] ==> value-parameter searcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.shouldGenerateDefaultInitializer[ValueParameterDescriptorImpl]

'!' @ [45:66] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'field' @ [45:67] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.j2k.shouldGenerateDefaultInitializer[ValueParameterDescriptorImpl]

'hasWriteAccesses' @ [45:73] ==> public fun PsiVariable.hasWriteAccesses(searcher: ReferenceSearcher, scope: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'searcher' @ [45:90] ==> value-parameter searcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.shouldGenerateDefaultInitializer[ValueParameterDescriptorImpl]

'field' @ [45:100] ==> value-parameter field: PsiField defined in org.jetbrains.kotlin.j2k.shouldGenerateDefaultInitializer[ValueParameterDescriptorImpl]

'containingClass' @ [45:106] ==> public final val PsiField.containingClass: PsiClass?[MyPropertyDescriptor]

'qualifierExpression' @ [48:21] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'qualifier' @ [49:12] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.isQualifierEmptyOrThis[LocalVariableDescriptor]

'qualifier' @ [49:34] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.isQualifierEmptyOrThis[LocalVariableDescriptor]

'qualifier' @ [49:68] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.isQualifierEmptyOrThis[LocalVariableDescriptor]

'qualifier' @ [49:78] ==> public final val PsiThisExpression.qualifier: PsiJavaCodeReferenceElement?[MyPropertyDescriptor]

'qualifierExpression' @ [53:21] ==> public final var PsiReferenceExpression.qualifierExpression: PsiExpression?[MyPropertyDescriptor]

'qualifier' @ [54:12] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.isQualifierEmptyOrClass[LocalVariableDescriptor]

'qualifier' @ [54:34] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.isQualifierEmptyOrClass[LocalVariableDescriptor]

'qualifier' @ [54:73] ==> val qualifier: PsiExpression? defined in org.jetbrains.kotlin.j2k.isQualifierEmptyOrClass[LocalVariableDescriptor]

'isReferenceTo' @ [54:83] ==> public abstract fun isReferenceTo(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'psiClass' @ [54:97] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.isQualifierEmptyOrClass[ValueParameterDescriptorImpl]

'this' @ [58:9] ==> <this> defined in org.jetbrains.kotlin.j2k.isInSingleLine[ReceiverParameterDescriptorImpl]

'text' @ [59:20] ==> public final val PsiWhiteSpace.text: (String..String?)[MyPropertyDescriptor]

'text' @ [60:16] ==> val text: String defined in org.jetbrains.kotlin.j2k.isInSingleLine[LocalVariableDescriptor]

'indexOf' @ [60:21] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [60:42] ==> val text: String defined in org.jetbrains.kotlin.j2k.isInSingleLine[LocalVariableDescriptor]

'indexOf' @ [60:47] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'firstChild' @ [63:17] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [64:12] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.isInSingleLine[LocalVariableDescriptor]

'!' @ [65:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'child' @ [65:14] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.isInSingleLine[LocalVariableDescriptor]

'isInSingleLine' @ [65:20] ==> public fun PsiElement.isInSingleLine(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'child' @ [66:9] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.isInSingleLine[LocalVariableDescriptor]

'child' @ [66:17] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.isInSingleLine[LocalVariableDescriptor]

'nextSibling' @ [66:23] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'context' @ [73:19] ==> public final val PsiElement.context: PsiElement?[MyPropertyDescriptor]

'context' @ [74:12] ==> var context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingMethod[LocalVariableDescriptor]

'context' @ [75:24] ==> var context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingMethod[LocalVariableDescriptor]

'_context' @ [76:13] ==> val _context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingMethod[LocalVariableDescriptor]

'_context' @ [76:43] ==> val _context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingMethod[LocalVariableDescriptor]

'context' @ [77:9] ==> var context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingMethod[LocalVariableDescriptor]

'_context' @ [77:19] ==> val _context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingMethod[LocalVariableDescriptor]

'context' @ [77:28] ==> public final val PsiElement.context: PsiElement?[MyPropertyDescriptor]

'context' @ [83:19] ==> public final val PsiElement.context: PsiElement?[MyPropertyDescriptor]

'context' @ [84:12] ==> var context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingClass[LocalVariableDescriptor]

'context' @ [85:24] ==> var context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingClass[LocalVariableDescriptor]

'_context' @ [86:13] ==> val _context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingClass[LocalVariableDescriptor]

'_context' @ [86:42] ==> val _context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingClass[LocalVariableDescriptor]

'_context' @ [87:13] ==> val _context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingClass[LocalVariableDescriptor]

'_context' @ [87:43] ==> val _context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingClass[LocalVariableDescriptor]

'containingClass' @ [87:52] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'context' @ [88:9] ==> var context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingClass[LocalVariableDescriptor]

'_context' @ [88:19] ==> val _context: PsiElement? defined in org.jetbrains.kotlin.j2k.getContainingClass[LocalVariableDescriptor]

'context' @ [88:28] ==> public final val PsiElement.context: PsiElement?[MyPropertyDescriptor]

'getContainingMethod' @ [94:18] ==> public fun PsiElement.getContainingMethod(): PsiMethod? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'if (method?.isConstructor == true) method else null' @ [95:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiMethod?, elseBranch: PsiMethod?): PsiMethod?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiMethod?

'method' @ [95:16] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.j2k.getContainingConstructor[LocalVariableDescriptor]

'isConstructor' @ [95:24] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'method' @ [95:47] ==> val method: PsiMethod? defined in org.jetbrains.kotlin.j2k.getContainingConstructor[LocalVariableDescriptor]

'this' @ [98:42] ==> <this> defined in org.jetbrains.kotlin.j2k.isConstructor[ReceiverParameterDescriptorImpl]

'this' @ [98:63] ==> <this> defined in org.jetbrains.kotlin.j2k.isConstructor[ReceiverParameterDescriptorImpl]

'isConstructor' @ [98:68] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'when {
    hasModifierProperty(PsiModifier.PUBLIC) -> PsiModifier.PUBLIC
    hasModifierProperty(PsiModifier.PRIVATE) -> PsiModifier.PRIVATE
    hasModifierProperty(PsiModifier.PROTECTED) -> PsiModifier.PROTECTED
    else -> PsiModifier.PACKAGE_LOCAL
}' @ [100:53] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'hasModifierProperty' @ [101:5] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiModifierListOwner[JavaMethodDescriptor]

'PUBLIC' @ [101:37] ==> public const final val PUBLIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PUBLIC' @ [101:60] ==> public const final val PUBLIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'hasModifierProperty' @ [102:5] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiModifierListOwner[JavaMethodDescriptor]

'PRIVATE' @ [102:37] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PRIVATE' @ [102:61] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'hasModifierProperty' @ [103:5] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiModifierListOwner[JavaMethodDescriptor]

'PROTECTED' @ [103:37] ==> public const final val PROTECTED: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PROTECTED' @ [103:63] ==> public const final val PROTECTED: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'PACKAGE_LOCAL' @ [104:25] ==> public const final val PACKAGE_LOCAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'isMainMethod' @ [107:55] ==> public open fun isMainMethod(p0: (PsiMethod..PsiMethod?)): Boolean defined in com.intellij.psi.util.PsiMethodUtil[JavaMethodDescriptor]

'this' @ [107:68] ==> <this> defined in org.jetbrains.kotlin.j2k.isMainMethod[ReceiverParameterDescriptorImpl]

'node' @ [109:49] ==> public final val PsiReferenceExpression.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'findChildByType' @ [109:54] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'DOT' @ [109:84] ==> public final val DOT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'psi' @ [109:90] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'node' @ [110:45] ==> public final val PsiExpressionList.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'findChildByType' @ [110:50] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'LPARENTH' @ [110:80] ==> public final val LPARENTH: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'psi' @ [110:91] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'node' @ [111:45] ==> public final val PsiExpressionList.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'findChildByType' @ [111:50] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'RPARENTH' @ [111:80] ==> public final val RPARENTH: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'psi' @ [111:91] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (this is PsiClass) {
        val fqName = qualifiedName
        val index = fqName?.lastIndexOf('.') ?: -1
        val parentName = if (index >= 0) fqName!!.substring(0, index) else null
        file.importList?.allImportStatements?.any {
            it.importReference?.qualifiedName == (if (it.isOnDemand) parentName else fqName)
        } ?: false
    }
    else {
        containingClass != null && file.importList?.importStaticStatements?.any {
            it.resolveTargetClass() == containingClass && (it.isOnDemand || it.referenceName == name)
        } ?: false
    }' @ [114:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'this' @ [114:16] ==> <this> defined in org.jetbrains.kotlin.j2k.isImported[ReceiverParameterDescriptorImpl]

'qualifiedName' @ [115:22] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'fqName' @ [116:21] ==> val fqName: String? defined in org.jetbrains.kotlin.j2k.isImported[LocalVariableDescriptor]

'lastIndexOf' @ [116:29] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [116:49] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (index >= 0) fqName!!.substring(0, index) else null' @ [117:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'index' @ [117:30] ==> val index: Int defined in org.jetbrains.kotlin.j2k.isImported[LocalVariableDescriptor]

'fqName' @ [117:42] ==> val fqName: String? defined in org.jetbrains.kotlin.j2k.isImported[LocalVariableDescriptor]

'substring' @ [117:51] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [117:64] ==> val index: Int defined in org.jetbrains.kotlin.j2k.isImported[LocalVariableDescriptor]

'file' @ [118:9] ==> value-parameter file: PsiJavaFile defined in org.jetbrains.kotlin.j2k.isImported[ValueParameterDescriptorImpl]

'importList' @ [118:14] ==> public final val PsiJavaFile.importList: PsiImportList?[MyPropertyDescriptor]

'allImportStatements' @ [118:26] ==> public final val PsiImportList.allImportStatements: (Array<(PsiImportStatementBase..PsiImportStatementBase?)>..Array<out (PsiImportStatementBase..PsiImportStatementBase?)>)[MyPropertyDescriptor]

'any' @ [118:47] ==> public inline fun <T> Array<out (PsiImportStatementBase..PsiImportStatementBase?)>.any(predicate: ((PsiImportStatementBase..PsiImportStatementBase?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiImportStatementBase..com.intellij.psi.PsiImportStatementBase?)

'it' @ [119:13] ==> value-parameter it: (PsiImportStatementBase..PsiImportStatementBase?) defined in org.jetbrains.kotlin.j2k.isImported.<anonymous>[ValueParameterDescriptorImpl]

'importReference' @ [119:16] ==> public final val PsiImportStatementBase.importReference: PsiJavaCodeReferenceElement?[MyPropertyDescriptor]

'qualifiedName' @ [119:33] ==> public final val PsiJavaCodeReferenceElement.qualifiedName: (String..String?)[MyPropertyDescriptor]

'if (it.isOnDemand) parentName else fqName' @ [119:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'it' @ [119:55] ==> value-parameter it: (PsiImportStatementBase..PsiImportStatementBase?) defined in org.jetbrains.kotlin.j2k.isImported.<anonymous>[ValueParameterDescriptorImpl]

'isOnDemand' @ [119:58] ==> public final val PsiImportStatementBase.isOnDemand: Boolean[MyPropertyDescriptor]

'parentName' @ [119:70] ==> val parentName: String? defined in org.jetbrains.kotlin.j2k.isImported[LocalVariableDescriptor]

'fqName' @ [119:86] ==> val fqName: String? defined in org.jetbrains.kotlin.j2k.isImported[LocalVariableDescriptor]

'containingClass' @ [123:9] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'file' @ [123:36] ==> value-parameter file: PsiJavaFile defined in org.jetbrains.kotlin.j2k.isImported[ValueParameterDescriptorImpl]

'importList' @ [123:41] ==> public final val PsiJavaFile.importList: PsiImportList?[MyPropertyDescriptor]

'importStaticStatements' @ [123:53] ==> public final val PsiImportList.importStaticStatements: (Array<(PsiImportStaticStatement..PsiImportStaticStatement?)>..Array<out (PsiImportStaticStatement..PsiImportStaticStatement?)>)[MyPropertyDescriptor]

'any' @ [123:77] ==> public inline fun <T> Array<out (PsiImportStaticStatement..PsiImportStaticStatement?)>.any(predicate: ((PsiImportStaticStatement..PsiImportStaticStatement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiImportStaticStatement..com.intellij.psi.PsiImportStaticStatement?)

'it' @ [124:13] ==> value-parameter it: (PsiImportStaticStatement..PsiImportStaticStatement?) defined in org.jetbrains.kotlin.j2k.isImported.<anonymous>[ValueParameterDescriptorImpl]

'resolveTargetClass' @ [124:16] ==> @Nullable public abstract fun resolveTargetClass(): PsiClass? defined in com.intellij.psi.PsiImportStaticStatement[JavaMethodDescriptor]

'containingClass' @ [124:40] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'it' @ [124:60] ==> value-parameter it: (PsiImportStaticStatement..PsiImportStaticStatement?) defined in org.jetbrains.kotlin.j2k.isImported.<anonymous>[ValueParameterDescriptorImpl]

'isOnDemand' @ [124:63] ==> public final val PsiImportStaticStatement.isOnDemand: Boolean[MyPropertyDescriptor]

'it' @ [124:77] ==> value-parameter it: (PsiImportStaticStatement..PsiImportStaticStatement?) defined in org.jetbrains.kotlin.j2k.isImported.<anonymous>[ValueParameterDescriptorImpl]

'referenceName' @ [124:80] ==> public final val PsiImportStaticStatement.referenceName: String?[MyPropertyDescriptor]

'name' @ [124:97] ==> public final val PsiMember.name: String?[MyPropertyDescriptor]

'this' @ [129:37] ==> <this> defined in org.jetbrains.kotlin.j2k.isNullLiteral[ReceiverParameterDescriptorImpl]

'type' @ [129:69] ==> public final val PsiLiteralExpression.type: PsiType?[MyPropertyDescriptor]

'NULL' @ [129:85] ==> public final val NULL: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'element' @ [132:54] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.j2k.isFacadeClassFromLibrary[ValueParameterDescriptorImpl]

'element' @ [132:81] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.j2k.isFacadeClassFromLibrary[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [132:89] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'classQualifiedName' @ [135:9] ==> value-parameter classQualifiedName: String? defined in org.jetbrains.kotlin.j2k.convertToKotlinAnalog[ValueParameterDescriptorImpl]

'?:' @ [136:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String?

'if (mutability.isMutable(settings)) toKotlinMutableTypesMap[classQualifiedName] else null' @ [136:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'mutability' @ [136:17] ==> value-parameter mutability: Mutability defined in org.jetbrains.kotlin.j2k.convertToKotlinAnalog[ValueParameterDescriptorImpl]

'isMutable' @ [136:28] ==> public fun Mutability.isMutable(settings: ConverterSettings): Boolean defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]

'settings' @ [136:38] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'toKotlinMutableTypesMap' @ [136:49] ==> public val toKotlinMutableTypesMap: Map<String, String> defined in org.jetbrains.kotlin.j2k in file Utils.kt[PropertyDescriptorImpl]

'classQualifiedName' @ [136:73] ==> value-parameter classQualifiedName: String? defined in org.jetbrains.kotlin.j2k.convertToKotlinAnalog[ValueParameterDescriptorImpl]

'toKotlinTypesMap' @ [137:15] ==> private val toKotlinTypesMap: Map<String, String> defined in org.jetbrains.kotlin.j2k in file Utils.kt[PropertyDescriptorImpl]

'classQualifiedName' @ [137:32] ==> value-parameter classQualifiedName: String? defined in org.jetbrains.kotlin.j2k.convertToKotlinAnalog[ValueParameterDescriptorImpl]

'convertToKotlinAnalog' @ [141:27] ==> public fun Converter.convertToKotlinAnalog(classQualifiedName: String?, mutability: Mutability): String? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'classQualifiedName' @ [141:49] ==> value-parameter classQualifiedName: String? defined in org.jetbrains.kotlin.j2k.convertToKotlinAnalogIdentifier[ValueParameterDescriptorImpl]

'mutability' @ [141:69] ==> value-parameter mutability: Mutability defined in org.jetbrains.kotlin.j2k.convertToKotlinAnalogIdentifier[ValueParameterDescriptorImpl]

'Identifier' @ [142:12] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'withNoPrototype' @ [142:23] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'kotlinClassName' @ [142:39] ==> val kotlinClassName: String defined in org.jetbrains.kotlin.j2k.convertToKotlinAnalogIdentifier[LocalVariableDescriptor]

'substringAfterLast' @ [142:55] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mapOf' @ [145:53] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [146:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_OBJECT' @ [146:26] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [146:61] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'any' @ [146:70] ==> public final val any: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [146:74] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'to' @ [147:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_BYTE' @ [147:26] ==> @NonNls public const final val JAVA_LANG_BYTE: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [147:59] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'_byte' @ [147:68] ==> public final val _byte: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [147:74] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'to' @ [148:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_CHARACTER' @ [148:26] ==> @NonNls public const final val JAVA_LANG_CHARACTER: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [148:64] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'_char' @ [148:73] ==> public final val _char: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [148:79] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'to' @ [149:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_DOUBLE' @ [149:26] ==> @NonNls public const final val JAVA_LANG_DOUBLE: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [149:61] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'_double' @ [149:70] ==> public final val _double: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [149:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'to' @ [150:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_FLOAT' @ [150:26] ==> @NonNls public const final val JAVA_LANG_FLOAT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [150:60] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'_float' @ [150:69] ==> public final val _float: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [150:76] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'to' @ [151:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_INTEGER' @ [151:26] ==> @NonNls public const final val JAVA_LANG_INTEGER: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [151:62] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'_int' @ [151:71] ==> public final val _int: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [151:76] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'to' @ [152:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_LONG' @ [152:26] ==> @NonNls public const final val JAVA_LANG_LONG: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [152:59] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'_long' @ [152:68] ==> public final val _long: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [152:74] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'to' @ [153:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_SHORT' @ [153:26] ==> @NonNls public const final val JAVA_LANG_SHORT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [153:60] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'_short' @ [153:69] ==> public final val _short: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [153:76] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'to' @ [154:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_BOOLEAN' @ [154:26] ==> @NonNls public const final val JAVA_LANG_BOOLEAN: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [154:62] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'_boolean' @ [154:71] ==> public final val _boolean: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [154:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'to' @ [155:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_LANG_ITERABLE' @ [155:26] ==> @NonNls public const final val JAVA_LANG_ITERABLE: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [155:63] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'iterable' @ [155:72] ==> public final val iterable: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [155:81] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [156:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_ITERATOR' @ [156:26] ==> @NonNls public const final val JAVA_UTIL_ITERATOR: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [156:63] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'iterator' @ [156:72] ==> public final val iterator: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [156:81] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [157:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_LIST' @ [157:26] ==> @NonNls public const final val JAVA_UTIL_LIST: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [157:59] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'list' @ [157:68] ==> public final val list: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [157:73] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [158:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_COLLECTION' @ [158:26] ==> @NonNls public const final val JAVA_UTIL_COLLECTION: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [158:65] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'collection' @ [158:74] ==> public final val collection: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [158:85] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [159:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_SET' @ [159:26] ==> @NonNls public const final val JAVA_UTIL_SET: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [159:58] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'set' @ [159:67] ==> public final val set: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [159:71] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [160:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_MAP' @ [160:26] ==> @NonNls public const final val JAVA_UTIL_MAP: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [160:58] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'map' @ [160:67] ==> public final val map: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [160:71] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [161:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_MAP_ENTRY' @ [161:26] ==> @NonNls public const final val JAVA_UTIL_MAP_ENTRY: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [161:64] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mapEntry' @ [161:73] ==> public final val mapEntry: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [161:82] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [162:9] ==> public infix fun <A, B> (String..String?).to(that: String): Pair<(String..String?), String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (kotlin.String..kotlin.String?)
    <B> -> String

'java' @ [162:39] ==> public val <T> KClass<ListIterator<*>>.java: Class<ListIterator<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ListIterator<*>

'canonicalName' @ [162:44] ==> public final val <T : (Any..Any?)> Class<ListIterator<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ListIterator<*>

'FQ_NAMES' @ [162:76] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'listIterator' @ [162:85] ==> public final val listIterator: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [162:98] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'mapOf' @ [166:52] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [167:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_ITERATOR' @ [167:26] ==> @NonNls public const final val JAVA_UTIL_ITERATOR: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [167:63] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableIterator' @ [167:72] ==> public final val mutableIterator: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [167:88] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [168:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_LIST' @ [168:26] ==> @NonNls public const final val JAVA_UTIL_LIST: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [168:59] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableList' @ [168:68] ==> public final val mutableList: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [168:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [169:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_COLLECTION' @ [169:26] ==> @NonNls public const final val JAVA_UTIL_COLLECTION: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [169:65] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableCollection' @ [169:74] ==> public final val mutableCollection: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [169:92] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [170:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_SET' @ [170:26] ==> @NonNls public const final val JAVA_UTIL_SET: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [170:58] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableSet' @ [170:67] ==> public final val mutableSet: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [170:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [171:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_MAP' @ [171:26] ==> @NonNls public const final val JAVA_UTIL_MAP: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [171:58] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableMap' @ [171:67] ==> public final val mutableMap: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [171:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [172:9] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'JAVA_UTIL_MAP_ENTRY' @ [172:26] ==> @NonNls public const final val JAVA_UTIL_MAP_ENTRY: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'FQ_NAMES' @ [172:64] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableMapEntry' @ [172:73] ==> public final val mutableMapEntry: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [172:89] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'to' @ [173:9] ==> public infix fun <A, B> (String..String?).to(that: String): Pair<(String..String?), String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (kotlin.String..kotlin.String?)
    <B> -> String

'java' @ [173:39] ==> public val <T> KClass<ListIterator<*>>.java: Class<ListIterator<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ListIterator<*>

'canonicalName' @ [173:44] ==> public final val <T : (Any..Any?)> Class<ListIterator<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ListIterator<*>

'FQ_NAMES' @ [173:76] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableListIterator' @ [173:85] ==> public final val mutableListIterator: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [173:105] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

