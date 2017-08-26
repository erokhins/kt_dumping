'PositioningStrategy<T>' @ [34:63] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> T

'element' @ [36:17] ==> value-parameter element: T defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader.isValid[ValueParameterDescriptorImpl]

'element' @ [37:17] ==> value-parameter element: T defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader.isValid[ValueParameterDescriptorImpl]

'element' @ [38:17] ==> value-parameter element: T defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader.isValid[ValueParameterDescriptorImpl]

'element' @ [39:17] ==> value-parameter element: T defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader.isValid[ValueParameterDescriptorImpl]

'element' @ [41:21] ==> value-parameter element: T defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader.isValid[ValueParameterDescriptorImpl]

'nameIdentifier' @ [41:29] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'super' @ [45:20] ==> <this> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader[LazyClassReceiverParameterDescriptor]

'isValid' @ [45:26] ==> public open fun isValid(element: T): Boolean defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [45:34] ==> value-parameter element: T defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader.isValid[ValueParameterDescriptorImpl]

'JvmField' @ [49:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<PsiElement>' @ [49:71] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> PsiElement

'when (element) {
                is KtObjectLiteralExpression -> {
                    val objectDeclaration = element.objectDeclaration
                    val objectKeyword = objectDeclaration.getObjectKeyword()!!
                    val delegationSpecifierList = objectDeclaration.getSuperTypeList()
                    if (delegationSpecifierList == null) {
                        return markElement(objectKeyword)
                    }
                    return markRange(objectKeyword, delegationSpecifierList)
                }
                is KtObjectDeclaration -> {
                    return markRange(
                            element.getObjectKeyword()!!,
                            element.nameIdentifier ?: element.getObjectKeyword()!!
                    )
                }
                is KtConstructorDelegationCall -> {
                    return SECONDARY_CONSTRUCTOR_DELEGATION_CALL.mark(element)
                }
                else -> {
                    return super.mark(element)
                }
            }' @ [51:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'element' @ [51:19] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [53:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'objectDeclaration' @ [53:53] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'objectDeclaration' @ [54:41] ==> val objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[LocalVariableDescriptor]

'getObjectKeyword' @ [54:59] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'objectDeclaration' @ [55:51] ==> val objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[LocalVariableDescriptor]

'getSuperTypeList' @ [55:69] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'delegationSpecifierList' @ [56:25] ==> val delegationSpecifierList: KtSuperTypeList? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[LocalVariableDescriptor]

'markElement' @ [57:32] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'objectKeyword' @ [57:44] ==> val objectKeyword: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[LocalVariableDescriptor]

'markRange' @ [59:28] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'objectKeyword' @ [59:38] ==> val objectKeyword: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[LocalVariableDescriptor]

'delegationSpecifierList' @ [59:53] ==> val delegationSpecifierList: KtSuperTypeList? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[LocalVariableDescriptor]

'markRange' @ [62:28] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [63:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'getObjectKeyword' @ [63:37] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'element' @ [64:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'nameIdentifier' @ [64:37] ==> public final val KtObjectDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'element' @ [64:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'getObjectKeyword' @ [64:63] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'SECONDARY_CONSTRUCTOR_DELEGATION_CALL' @ [68:28] ==> @JvmField public final val SECONDARY_CONSTRUCTOR_DELEGATION_CALL: PositioningStrategy<KtConstructorDelegationCall> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [68:66] ==> public open fun mark(element: KtConstructorDelegationCall): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [68:71] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'super' @ [71:28] ==> <this> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>[LazyClassReceiverParameterDescriptor]

'mark' @ [71:34] ==> public open fun mark(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [71:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [77:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtDeclaration>' @ [77:90] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtDeclaration

'markElement' @ [79:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'getElementToMark' @ [79:32] ==> private final fun getElementToMark(declaration: KtDeclaration): PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>[SimpleFunctionDescriptorImpl]

'element' @ [79:49] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.mark[ValueParameterDescriptorImpl]

'!' @ [83:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasSyntaxErrors' @ [83:21] ==> public fun hasSyntaxErrors(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'getElementToMark' @ [83:37] ==> private final fun getElementToMark(declaration: KtDeclaration): PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>[SimpleFunctionDescriptorImpl]

'element' @ [83:54] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.isValid[ValueParameterDescriptorImpl]

'component1' @ [87:18] ==> public final operator fun component1(): KtTypeReference? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [87:33] ==> public final operator fun component2(): PsiElement? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (declaration) {
                is KtCallableDeclaration -> Pair(declaration.typeReference, declaration.nameIdentifier)
                is KtPropertyAccessor -> Pair(declaration.returnTypeReference, declaration.namePlaceholder)
                else -> Pair(null, null)
            }' @ [87:64] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<KtTypeReference?, PsiElement?>, entry1: Pair<KtTypeReference?, PsiElement?>, entry2: Pair<KtTypeReference?, PsiElement?>): Pair<KtTypeReference?, PsiElement?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<KtTypeReference?, PsiElement?>

'declaration' @ [87:70] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[ValueParameterDescriptorImpl]

'Pair' @ [88:45] ==> public constructor Pair<out A, out B>(first: KtTypeReference?, second: PsiElement?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KtTypeReference?
    <out B> -> PsiElement?

'declaration' @ [88:50] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[ValueParameterDescriptorImpl]

'typeReference' @ [88:62] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'declaration' @ [88:77] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[ValueParameterDescriptorImpl]

'nameIdentifier' @ [88:89] ==> public final val KtCallableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'Pair' @ [89:42] ==> public constructor Pair<out A, out B>(first: KtTypeReference?, second: PsiElement) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KtTypeReference?
    <out B> -> PsiElement

'declaration' @ [89:47] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[ValueParameterDescriptorImpl]

'returnTypeReference' @ [89:59] ==> public final val KtPropertyAccessor.returnTypeReference: KtTypeReference?[MyPropertyDescriptor]

'declaration' @ [89:80] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[ValueParameterDescriptorImpl]

'namePlaceholder' @ [89:92] ==> public final val KtPropertyAccessor.namePlaceholder: PsiElement[MyPropertyDescriptor]

'Pair' @ [90:25] ==> public constructor Pair<out A, out B>(first: Nothing?, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Nothing?
    <out B> -> Nothing?

'returnTypeRef' @ [93:17] ==> val returnTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[LocalVariableDescriptor]

'returnTypeRef' @ [93:47] ==> val returnTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[LocalVariableDescriptor]

'nameIdentifierOrPlaceholder' @ [94:17] ==> val nameIdentifierOrPlaceholder: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[LocalVariableDescriptor]

'nameIdentifierOrPlaceholder' @ [94:61] ==> val nameIdentifierOrPlaceholder: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[LocalVariableDescriptor]

'declaration' @ [95:20] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_RETURN_TYPE.<no name provided>.getElementToMark[ValueParameterDescriptorImpl]

'JvmField' @ [99:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DeclarationHeader<KtNamedDeclaration>' @ [99:88] ==> public constructor DeclarationHeader<T : KtDeclaration>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtDeclaration> -> KtNamedDeclaration

'element' @ [101:34] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[ValueParameterDescriptorImpl]

'nameIdentifier' @ [101:42] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'nameIdentifier' @ [102:17] ==> val nameIdentifier: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [103:21] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [105:29] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[ValueParameterDescriptorImpl]

'getModifierList' @ [105:37] ==> @Nullable public abstract fun getModifierList(): KtModifierList? defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'getModifier' @ [105:56] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'ENUM_KEYWORD' @ [105:77] ==> public final val ENUM_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [106:32] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[ValueParameterDescriptorImpl]

'node' @ [106:40] ==> public final var KtClassOrObject.node: ASTNode[MyPropertyDescriptor]

'findChildByType' @ [106:45] ==> @Nullable public abstract fun findChildByType(@NotNull p0: TokenSet): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'create' @ [106:70] ==> @NotNull public open fun create(@NotNull vararg p0: (IElementType..IElementType?)): TokenSet defined in com.intellij.psi.tree.TokenSet[JavaMethodDescriptor]

'CLASS_KEYWORD' @ [106:86] ==> public final val CLASS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OBJECT_KEYWORD' @ [106:110] ==> public final val OBJECT_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'psi' @ [106:128] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [107:32] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[ValueParameterDescriptorImpl]

'markRange' @ [109:28] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'startElement' @ [109:38] ==> val startElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[LocalVariableDescriptor]

'nameIdentifier' @ [109:52] ==> val nameIdentifier: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[LocalVariableDescriptor]

'markElement' @ [111:24] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'nameIdentifier' @ [111:36] ==> val nameIdentifier: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [113:17] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[ValueParameterDescriptorImpl]

'DECLARATION_SIGNATURE' @ [114:24] ==> @JvmField public final val DECLARATION_SIGNATURE: PositioningStrategy<KtDeclaration> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [114:46] ==> public open fun mark(element: KtDeclaration): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [114:51] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[ValueParameterDescriptorImpl]

'DEFAULT' @ [116:20] ==> @JvmField public final val DEFAULT: PositioningStrategy<PsiElement> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [116:28] ==> public open fun mark(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [116:33] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_NAME.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [120:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DeclarationHeader<KtDeclaration>' @ [120:88] ==> public constructor DeclarationHeader<T : KtDeclaration>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtDeclaration> -> KtDeclaration

'when (element) {
                is KtConstructor<*> -> {
                    val begin = element.getConstructorKeyword() ?: element.getValueParameterList() ?: return markElement(element)
                    val end = element.getValueParameterList() ?: element.getConstructorKeyword() ?: return markElement(element)
                    return markRange(begin, end)
                }
                is KtFunction -> {
                    val endOfSignatureElement =
                            element.typeReference
                            ?: element.valueParameterList
                            ?: element.nameIdentifier
                            ?: element
                    val startElement
                            = if (element is KtFunctionLiteral) {
                                element.getReceiverTypeReference()
                                ?: element.getValueParameterList()
                                ?: element
                            }
                            else element
                    return markRange(startElement, endOfSignatureElement)
                }
                is KtProperty -> {
                    val endOfSignatureElement = element.typeReference ?: element.nameIdentifier ?: element
                    return markRange(element, endOfSignatureElement)
                }
                is KtPropertyAccessor -> {
                    val endOfSignatureElement =
                            element.returnTypeReference
                            ?: element.rightParenthesis?.psi
                            ?: element.namePlaceholder

                    return markRange(element, endOfSignatureElement)
                }
                is KtClass -> {
                    val nameAsDeclaration = element.nameIdentifier ?: return markElement(element)
                    val primaryConstructorParameterList = element.getPrimaryConstructorParameterList() ?: return markElement(nameAsDeclaration)
                    return markRange(nameAsDeclaration, primaryConstructorParameterList)
                }
                is KtObjectDeclaration -> {
                    return DECLARATION_NAME.mark(element)
                }
                is KtClassInitializer -> {
                    return markRange(element.initKeyword.textRange)
                }
            }' @ [122:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing, entry4: Nothing, entry5: Nothing, entry6: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'element' @ [122:19] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [124:33] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'getConstructorKeyword' @ [124:41] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtConstructor[SimpleFunctionDescriptorImpl]

'element' @ [124:68] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'getValueParameterList' @ [124:76] ==> public open fun getValueParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtConstructor[SimpleFunctionDescriptorImpl]

'markElement' @ [124:110] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [124:122] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [125:31] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'getValueParameterList' @ [125:39] ==> public open fun getValueParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtConstructor[SimpleFunctionDescriptorImpl]

'element' @ [125:66] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'getConstructorKeyword' @ [125:74] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtConstructor[SimpleFunctionDescriptorImpl]

'markElement' @ [125:108] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [125:120] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'markRange' @ [126:28] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'begin' @ [126:38] ==> val begin: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'end' @ [126:45] ==> val end: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [130:29] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'typeReference' @ [130:37] ==> public final var KtFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [131:32] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'valueParameterList' @ [131:40] ==> public final val KtFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'element' @ [132:32] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'nameIdentifier' @ [132:40] ==> public final val KtFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'element' @ [133:32] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'if (element is KtFunctionLiteral) {
                                element.getReceiverTypeReference()
                                ?: element.getValueParameterList()
                                ?: element
                            }
                            else element' @ [135:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: NavigatablePsiElement, elseBranch: NavigatablePsiElement): NavigatablePsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> NavigatablePsiElement

'element' @ [135:35] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [136:33] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'getReceiverTypeReference' @ [136:41] ==> @Override @Nullable public open fun getReceiverTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtFunctionLiteral[JavaMethodDescriptor]

'element' @ [137:36] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'getValueParameterList' @ [137:44] ==> @Override @Nullable public open fun getValueParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtFunctionLiteral[JavaMethodDescriptor]

'element' @ [138:36] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [140:34] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'markRange' @ [141:28] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'startElement' @ [141:38] ==> val startElement: NavigatablePsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'endOfSignatureElement' @ [141:52] ==> val endOfSignatureElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [144:49] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'typeReference' @ [144:57] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [144:74] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'nameIdentifier' @ [144:82] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'element' @ [144:100] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'markRange' @ [145:28] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [145:38] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'endOfSignatureElement' @ [145:47] ==> val endOfSignatureElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [149:29] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'returnTypeReference' @ [149:37] ==> public final val KtPropertyAccessor.returnTypeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [150:32] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'rightParenthesis' @ [150:40] ==> public final val KtPropertyAccessor.rightParenthesis: ASTNode?[MyPropertyDescriptor]

'psi' @ [150:58] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [151:32] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'namePlaceholder' @ [151:40] ==> public final val KtPropertyAccessor.namePlaceholder: PsiElement[MyPropertyDescriptor]

'markRange' @ [153:28] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [153:38] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'endOfSignatureElement' @ [153:47] ==> val endOfSignatureElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [156:45] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'nameIdentifier' @ [156:53] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'markElement' @ [156:78] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [156:90] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [157:59] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'getPrimaryConstructorParameterList' @ [157:67] ==> public final fun getPrimaryConstructorParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.KtClass[SimpleFunctionDescriptorImpl]

'markElement' @ [157:114] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'nameAsDeclaration' @ [157:126] ==> val nameAsDeclaration: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'markRange' @ [158:28] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'nameAsDeclaration' @ [158:38] ==> val nameAsDeclaration: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'primaryConstructorParameterList' @ [158:57] ==> val primaryConstructorParameterList: KtParameterList defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'DECLARATION_NAME' @ [161:28] ==> @JvmField public final val DECLARATION_NAME: PositioningStrategy<KtNamedDeclaration> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [161:45] ==> public open fun mark(element: KtNamedDeclaration): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [161:50] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'markRange' @ [164:28] ==> public fun markRange(range: TextRange): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [164:38] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'initKeyword' @ [164:46] ==> public final val initKeyword: PsiElement defined in org.jetbrains.kotlin.psi.KtClassInitializer[PropertyDescriptorImpl]

'textRange' @ [164:58] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'super' @ [167:20] ==> <this> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>[LazyClassReceiverParameterDescriptor]

'mark' @ [167:26] ==> public open fun mark(element: KtDeclaration): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader[SimpleFunctionDescriptorImpl]

'element' @ [167:31] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [171:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<PsiElement>' @ [171:96] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> PsiElement

'if (element is KtDeclaration)
                DECLARATION_SIGNATURE.mark(element)
            else
                DEFAULT.mark(element)' @ [173:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TextRange>, elseBranch: List<TextRange>): List<TextRange>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TextRange>

'element' @ [173:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'DECLARATION_SIGNATURE' @ [174:17] ==> @JvmField public final val DECLARATION_SIGNATURE: PositioningStrategy<KtDeclaration> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [174:39] ==> public open fun mark(element: KtDeclaration): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [174:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'DEFAULT' @ [176:17] ==> @JvmField public final val DEFAULT: PositioningStrategy<PsiElement> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [176:25] ==> public open fun mark(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [176:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT.<no name provided>.mark[ValueParameterDescriptorImpl]

'if (element is KtDeclaration)
                DECLARATION_SIGNATURE.isValid(element)
            else
                DEFAULT.isValid(element)' @ [180:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'element' @ [180:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT.<no name provided>.isValid[ValueParameterDescriptorImpl]

'DECLARATION_SIGNATURE' @ [181:17] ==> @JvmField public final val DECLARATION_SIGNATURE: PositioningStrategy<KtDeclaration> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'isValid' @ [181:39] ==> public open fun isValid(element: KtDeclaration): Boolean defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [181:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT.<no name provided>.isValid[ValueParameterDescriptorImpl]

'DEFAULT' @ [183:17] ==> @JvmField public final val DEFAULT: PositioningStrategy<PsiElement> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'isValid' @ [183:25] ==> public open fun isValid(element: PsiElement): Boolean defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [183:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT.<no name provided>.isValid[ValueParameterDescriptorImpl]

'JvmField' @ [187:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtDeclaration>' @ [187:107] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtDeclaration

'element' @ [189:17] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.TYPE_PARAMETERS_OR_DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [190:44] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.TYPE_PARAMETERS_OR_DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'typeParameterList' @ [190:52] ==> public final val KtTypeParameterListOwner.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'jetTypeParameterList' @ [191:21] ==> val jetTypeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.TYPE_PARAMETERS_OR_DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'markElement' @ [192:28] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'jetTypeParameterList' @ [192:40] ==> val jetTypeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.TYPE_PARAMETERS_OR_DECLARATION_SIGNATURE.<no name provided>.mark[LocalVariableDescriptor]

'DECLARATION_SIGNATURE' @ [195:20] ==> @JvmField public final val DECLARATION_SIGNATURE: PositioningStrategy<KtDeclaration> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [195:42] ==> public open fun mark(element: KtDeclaration): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [195:47] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.TYPE_PARAMETERS_OR_DECLARATION_SIGNATURE.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [199:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'modifierSetPosition' @ [199:81] ==> @JvmStatic public final fun modifierSetPosition(vararg tokens: KtModifierKeywordToken): PositioningStrategy<KtModifierListOwner> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[SimpleFunctionDescriptorImpl]

'ABSTRACT_KEYWORD' @ [199:110] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'JvmField' @ [201:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'modifierSetPosition' @ [201:77] ==> @JvmStatic public final fun modifierSetPosition(vararg tokens: KtModifierKeywordToken): PositioningStrategy<KtModifierListOwner> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[SimpleFunctionDescriptorImpl]

'OPEN_KEYWORD' @ [201:106] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'JvmField' @ [203:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'modifierSetPosition' @ [203:81] ==> @JvmStatic public final fun modifierSetPosition(vararg tokens: KtModifierKeywordToken): PositioningStrategy<KtModifierListOwner> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[SimpleFunctionDescriptorImpl]

'OVERRIDE_KEYWORD' @ [203:110] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'JvmField' @ [205:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'modifierSetPosition' @ [205:80] ==> @JvmStatic public final fun modifierSetPosition(vararg tokens: KtModifierKeywordToken): PositioningStrategy<KtModifierListOwner> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[SimpleFunctionDescriptorImpl]

'PRIVATE_KEYWORD' @ [205:109] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'JvmField' @ [207:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'modifierSetPosition' @ [207:81] ==> @JvmStatic public final fun modifierSetPosition(vararg tokens: KtModifierKeywordToken): PositioningStrategy<KtModifierListOwner> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[SimpleFunctionDescriptorImpl]

'LATEINIT_KEYWORD' @ [207:110] ==> public final val LATEINIT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'JvmField' @ [209:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'modifierSetPosition' @ [209:81] ==> @JvmStatic public final fun modifierSetPosition(vararg tokens: KtModifierKeywordToken): PositioningStrategy<KtModifierListOwner> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[SimpleFunctionDescriptorImpl]

'IN_KEYWORD' @ [209:110] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OUT_KEYWORD' @ [209:131] ==> public final val OUT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'JvmField' @ [211:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<PsiElement>' @ [211:81] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> PsiElement

'when (element) {
                is KtNamedDeclaration -> element.nameIdentifier
                is KtFile -> element.packageDirective!!.nameIdentifier
                else -> null
            }' @ [213:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'element' @ [213:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_REDECLARATION.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [214:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_REDECLARATION.<no name provided>.mark[ValueParameterDescriptorImpl]

'nameIdentifier' @ [214:50] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'element' @ [215:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_REDECLARATION.<no name provided>.mark[ValueParameterDescriptorImpl]

'packageDirective' @ [215:38] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'nameIdentifier' @ [215:57] ==> public final val KtPackageDirective.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'nameIdentifier' @ [219:17] ==> val nameIdentifier: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_REDECLARATION.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [219:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_REDECLARATION.<no name provided>.mark[ValueParameterDescriptorImpl]

'DEFAULT' @ [219:82] ==> @JvmField public final val DEFAULT: PositioningStrategy<PsiElement> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [219:90] ==> public open fun mark(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [219:95] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_REDECLARATION.<no name provided>.mark[ValueParameterDescriptorImpl]

'markElement' @ [221:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'nameIdentifier' @ [221:32] ==> val nameIdentifier: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_REDECLARATION.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [221:50] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_REDECLARATION.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [224:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtReferenceExpression>' @ [224:99] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtReferenceExpression

'element' @ [226:17] ==> value-parameter element: KtReferenceExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_UNRESOLVED_REFERENCE.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [227:30] ==> value-parameter element: KtReferenceExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_UNRESOLVED_REFERENCE.<no name provided>.mark[ValueParameterDescriptorImpl]

'bracketRanges' @ [227:38] ==> public final val KtArrayAccessExpression.bracketRanges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>)[MyPropertyDescriptor]

'!' @ [228:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ranges' @ [228:22] ==> val ranges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>) defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_UNRESOLVED_REFERENCE.<no name provided>.mark[LocalVariableDescriptor]

'isEmpty' @ [228:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'ranges' @ [229:28] ==> val ranges: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>) defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_UNRESOLVED_REFERENCE.<no name provided>.mark[LocalVariableDescriptor]

'listOf' @ [232:20] ==> public fun <T> listOf(element: (TextRange..TextRange?)): List<(TextRange..TextRange?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)

'element' @ [232:27] ==> value-parameter element: KtReferenceExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FOR_UNRESOLVED_REFERENCE.<no name provided>.mark[ValueParameterDescriptorImpl]

'textRange' @ [232:35] ==> public final val KtReferenceExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'JvmStatic' @ [236:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtModifierListOwner>' @ [237:25] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtModifierListOwner

'element' @ [239:36] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.modifierSetPosition.<no name provided>.mark[ValueParameterDescriptorImpl]

'modifierList' @ [239:44] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'sure' @ [239:57] ==> public inline fun <T : Any> KtModifierList?.sure(message: () -> String): KtModifierList defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtModifierList

'tokens' @ [241:31] ==> value-parameter vararg tokens: KtModifierKeywordToken defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.modifierSetPosition[ValueParameterDescriptorImpl]

'modifierList' @ [242:36] ==> val modifierList: KtModifierList defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.modifierSetPosition.<no name provided>.mark[LocalVariableDescriptor]

'getModifier' @ [242:49] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'token' @ [242:61] ==> val token: KtModifierKeywordToken defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.modifierSetPosition.<no name provided>.mark[LocalVariableDescriptor]

'modifier' @ [243:25] ==> val modifier: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.modifierSetPosition.<no name provided>.mark[LocalVariableDescriptor]

'markElement' @ [244:32] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'modifier' @ [244:44] ==> val modifier: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.modifierSetPosition.<no name provided>.mark[LocalVariableDescriptor]

'IllegalStateException' @ [247:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [247:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'listOf' @ [247:82] ==> public fun <T> listOf(vararg elements: KtModifierKeywordToken): List<KtModifierKeywordToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierKeywordToken

'tokens' @ [247:90] ==> value-parameter vararg tokens: KtModifierKeywordToken defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.modifierSetPosition[ValueParameterDescriptorImpl]

'JvmField' @ [252:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtArrayAccessExpression>' @ [252:89] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtArrayAccessExpression

'markElement' @ [254:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [254:32] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.ARRAY_ACCESS.<no name provided>.mark[ValueParameterDescriptorImpl]

'indicesNode' @ [254:40] ==> public final val KtArrayAccessExpression.indicesNode: KtContainerNode[MyPropertyDescriptor]

'JvmField' @ [258:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtModifierListOwner>' @ [258:92] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtModifierListOwner

'listOf' @ [260:36] ==> public fun <T> listOf(vararg elements: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'PRIVATE_KEYWORD' @ [260:52] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROTECTED_KEYWORD' @ [260:78] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PUBLIC_KEYWORD' @ [260:106] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INTERNAL_KEYWORD' @ [260:131] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [261:32] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'modifierList' @ [261:40] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'visibilityTokens' @ [263:26] ==> val visibilityTokens: List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[LocalVariableDescriptor]

'mapNotNull' @ [263:43] ==> public inline fun <T, R : Any> Iterable<(KtModifierKeywordToken..KtModifierKeywordToken?)>.mapNotNull(transform: ((KtModifierKeywordToken..KtModifierKeywordToken?)) -> TextRange?): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)
    <R : Any> -> TextRange

'modifierList' @ [263:56] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[LocalVariableDescriptor]

'getModifier' @ [263:70] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'it' @ [263:82] ==> value-parameter it: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [263:87] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'!' @ [264:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [264:18] ==> val result: List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[LocalVariableDescriptor]

'isEmpty' @ [264:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'result' @ [264:43] ==> val result: List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [267:17] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [268:38] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'nameIdentifier' @ [268:46] ==> public final val PsiNameIdentifierOwner.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'nameIdentifier' @ [269:21] ==> val nameIdentifier: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[LocalVariableDescriptor]

'markElement' @ [270:28] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'nameIdentifier' @ [270:40] ==> val nameIdentifier: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[LocalVariableDescriptor]

'when (element) {
                is KtObjectDeclaration -> element.getObjectKeyword()!!
                is KtPropertyAccessor -> element.namePlaceholder
                is KtAnonymousInitializer -> element
                else -> throw IllegalArgumentException(
                        "Can't find text range for element '${element::class.java.canonicalName}' with the text '${element.text}'")
            }' @ [274:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement, entry1: PsiElement, entry2: PsiElement, entry3: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement

'element' @ [274:39] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [275:43] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'getObjectKeyword' @ [275:51] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'element' @ [276:42] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'namePlaceholder' @ [276:50] ==> public final val KtPropertyAccessor.namePlaceholder: PsiElement[MyPropertyDescriptor]

'element' @ [277:46] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [278:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'element' @ [279:63] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'java' @ [279:78] ==> public val <T> KClass<out KtModifierListOwner>.java: Class<out KtModifierListOwner> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KtModifierListOwner)

'canonicalName' @ [279:83] ==> public final val <T : (Any..Any?)> Class<out KtModifierListOwner>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out KtModifierListOwner)

'element' @ [279:116] ==> value-parameter element: KtModifierListOwner defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'text' @ [279:124] ==> public final val KtModifierListOwner.text: (String..String?)[MyPropertyDescriptor]

'markElement' @ [281:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'elementToMark' @ [281:32] ==> val elementToMark: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VISIBILITY_MODIFIER.<no name provided>.mark[LocalVariableDescriptor]

'JvmField' @ [285:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtTypeProjection>' @ [285:92] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtTypeProjection

'markElement' @ [287:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [287:32] ==> value-parameter element: KtTypeProjection defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VARIANCE_IN_PROJECTION.<no name provided>.mark[ValueParameterDescriptorImpl]

'projectionToken' @ [287:40] ==> public final val KtTypeProjection.projectionToken: PsiElement?[MyPropertyDescriptor]

'JvmField' @ [291:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtParameter>' @ [291:88] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtParameter

'markNode' @ [293:20] ==> public fun markNode(node: ASTNode): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [293:29] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.PARAMETER_DEFAULT_VALUE.<no name provided>.mark[ValueParameterDescriptorImpl]

'defaultValue' @ [293:37] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'node' @ [293:52] ==> public final val KtExpression.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'JvmField' @ [297:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtParameter>' @ [297:90] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtParameter

'element' @ [299:34] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.PARAMETER_VARARG_MODIFIER.<no name provided>.mark[ValueParameterDescriptorImpl]

'modifierList' @ [299:42] ==> public final val KtParameter.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [299:57] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'VARARG_KEYWORD' @ [299:78] ==> public final val VARARG_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'markNode' @ [300:20] ==> public fun markNode(node: ASTNode): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'varargModifier' @ [300:29] ==> val varargModifier: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.PARAMETER_VARARG_MODIFIER.<no name provided>.mark[LocalVariableDescriptor]

'node' @ [300:44] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'JvmField' @ [304:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<PsiElement>' @ [304:76] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> PsiElement

'markElement' @ [306:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'?:' @ [306:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'element' @ [306:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CALL_ELEMENT.<no name provided>.mark[ValueParameterDescriptorImpl]

'calleeExpression' @ [306:61] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [306:81] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CALL_ELEMENT.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [310:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtDeclarationWithBody>' @ [310:96] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtDeclarationWithBody

'element' @ [312:37] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_WITH_BODY.<no name provided>.mark[ValueParameterDescriptorImpl]

'bodyExpression' @ [312:45] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'lastBracketRange' @ [312:84] ==> public final val KtBlockExpression.lastBracketRange: TextRange?[MyPropertyDescriptor]

'if (lastBracketRange != null)
                markRange(lastBracketRange)
            else
                markElement(element)' @ [313:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TextRange>, elseBranch: List<TextRange>): List<TextRange>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TextRange>

'lastBracketRange' @ [313:24] ==> val lastBracketRange: TextRange? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_WITH_BODY.<no name provided>.mark[LocalVariableDescriptor]

'markRange' @ [314:17] ==> public fun markRange(range: TextRange): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'lastBracketRange' @ [314:27] ==> val lastBracketRange: TextRange? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_WITH_BODY.<no name provided>.mark[LocalVariableDescriptor]

'markElement' @ [316:17] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [316:29] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_WITH_BODY.<no name provided>.mark[ValueParameterDescriptorImpl]

'super' @ [320:20] ==> <this> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_WITH_BODY.<no name provided>[LazyClassReceiverParameterDescriptor]

'isValid' @ [320:26] ==> public open fun isValid(element: KtDeclarationWithBody): Boolean defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [320:34] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_WITH_BODY.<no name provided>.isValid[ValueParameterDescriptorImpl]

'!=' @ [320:46] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'element' @ [320:47] ==> value-parameter element: KtDeclarationWithBody defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DECLARATION_WITH_BODY.<no name provided>.isValid[ValueParameterDescriptorImpl]

'bodyExpression' @ [320:55] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'lastBracketRange' @ [320:94] ==> public final val KtBlockExpression.lastBracketRange: TextRange?[MyPropertyDescriptor]

'JvmField' @ [324:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtNamedDeclaration>' @ [324:87] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtNamedDeclaration

'when (element) {
                is KtParameter -> markElement(element.valOrVarKeyword ?: element)
                is KtProperty -> markElement(element.valOrVarKeyword)
                else -> error("Declaration is neither a parameter nor a property: " + element.getElementTextWithContext())
            }' @ [326:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<TextRange>, entry1: List<TextRange>, entry2: List<TextRange>): List<TextRange>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<TextRange>

'element' @ [326:26] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VAL_OR_VAR_NODE.<no name provided>.mark[ValueParameterDescriptorImpl]

'markElement' @ [327:35] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [327:47] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VAL_OR_VAR_NODE.<no name provided>.mark[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [327:55] ==> public final val KtParameter.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'element' @ [327:74] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VAL_OR_VAR_NODE.<no name provided>.mark[ValueParameterDescriptorImpl]

'markElement' @ [328:34] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [328:46] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VAL_OR_VAR_NODE.<no name provided>.mark[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [328:54] ==> public final val KtProperty.valOrVarKeyword: PsiElement[MyPropertyDescriptor]

'error' @ [329:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [329:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [329:87] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VAL_OR_VAR_NODE.<no name provided>.mark[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [329:95] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'JvmField' @ [334:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtWhenEntry>' @ [334:75] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtWhenEntry

'markElement' @ [336:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [336:32] ==> value-parameter element: KtWhenEntry defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.ELSE_ENTRY.<no name provided>.mark[ValueParameterDescriptorImpl]

'elseKeyword' @ [336:40] ==> public final val KtWhenEntry.elseKeyword: PsiElement?[MyPropertyDescriptor]

'JvmField' @ [340:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtWhenExpression>' @ [340:85] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtWhenExpression

'markElement' @ [342:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [342:32] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.WHEN_EXPRESSION.<no name provided>.mark[ValueParameterDescriptorImpl]

'whenKeyword' @ [342:40] ==> public final val KtWhenExpression.whenKeyword: PsiElement[MyPropertyDescriptor]

'JvmField' @ [346:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtWhenConditionInRange>' @ [346:99] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtWhenConditionInRange

'markElement' @ [348:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [348:32] ==> value-parameter element: KtWhenConditionInRange defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.WHEN_CONDITION_IN_RANGE.<no name provided>.mark[ValueParameterDescriptorImpl]

'operationReference' @ [348:40] ==> public final val KtWhenConditionInRange.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'JvmField' @ [352:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtExpression>' @ [352:89] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtExpression

'when (element) {
                    is KtWhenExpression -> markElement(element.whenKeyword)
                    is KtIfExpression -> markElement(element.ifKeyword)
                    is KtOperationExpression -> markElement(element.operationReference)
                    else -> error("Expression is not an if, when or operation expression: ${element.getElementTextWithContext()}")
                }' @ [354:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<TextRange>, entry1: List<TextRange>, entry2: List<TextRange>, entry3: List<TextRange>): List<TextRange>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<TextRange>

'element' @ [354:23] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SPECIAL_CONSTRUCT_TOKEN.<no name provided>.mark[ValueParameterDescriptorImpl]

'markElement' @ [355:44] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [355:56] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SPECIAL_CONSTRUCT_TOKEN.<no name provided>.mark[ValueParameterDescriptorImpl]

'whenKeyword' @ [355:64] ==> public final val KtWhenExpression.whenKeyword: PsiElement[MyPropertyDescriptor]

'markElement' @ [356:42] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [356:54] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SPECIAL_CONSTRUCT_TOKEN.<no name provided>.mark[ValueParameterDescriptorImpl]

'ifKeyword' @ [356:62] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'markElement' @ [357:49] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [357:61] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SPECIAL_CONSTRUCT_TOKEN.<no name provided>.mark[ValueParameterDescriptorImpl]

'operationReference' @ [357:69] ==> public final val KtOperationExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'error' @ [358:29] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [358:93] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SPECIAL_CONSTRUCT_TOKEN.<no name provided>.mark[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [358:101] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'JvmField' @ [362:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtNullableType>' @ [362:81] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtNullableType

'markNode' @ [364:20] ==> public fun markNode(node: ASTNode): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [364:29] ==> value-parameter element: KtNullableType defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.NULLABLE_TYPE.<no name provided>.mark[ValueParameterDescriptorImpl]

'questionMarkNode' @ [364:37] ==> public final val KtNullableType.questionMarkNode: ASTNode[MyPropertyDescriptor]

'JvmField' @ [368:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<PsiElement>' @ [368:79] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> PsiElement

'element' @ [370:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CALL_EXPRESSION.<no name provided>.mark[ValueParameterDescriptorImpl]

'markRange' @ [371:24] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [371:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CALL_EXPRESSION.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [371:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CALL_EXPRESSION.<no name provided>.mark[ValueParameterDescriptorImpl]

'typeArgumentList' @ [371:51] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'element' @ [371:71] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CALL_EXPRESSION.<no name provided>.mark[ValueParameterDescriptorImpl]

'calleeExpression' @ [371:79] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [371:99] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CALL_EXPRESSION.<no name provided>.mark[ValueParameterDescriptorImpl]

'markElement' @ [373:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [373:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CALL_EXPRESSION.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [377:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtElement>' @ [377:78] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtElement

'markElement' @ [379:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'?:' @ [379:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'element' @ [379:33] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VALUE_ARGUMENTS.<no name provided>.mark[ValueParameterDescriptorImpl]

'rightParenthesis' @ [379:67] ==> public final val KtValueArgumentList.rightParenthesis: PsiElement?[MyPropertyDescriptor]

'element' @ [379:87] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.VALUE_ARGUMENTS.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [383:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtFunction>' @ [383:83] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtFunction

'element' @ [385:38] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FUNCTION_PARAMETERS.<no name provided>.mark[ValueParameterDescriptorImpl]

'valueParameterList' @ [385:46] ==> public final val KtFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'valueParameterList' @ [386:17] ==> val valueParameterList: KtParameterList? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FUNCTION_PARAMETERS.<no name provided>.mark[LocalVariableDescriptor]

'markElement' @ [387:24] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'valueParameterList' @ [387:36] ==> val valueParameterList: KtParameterList? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FUNCTION_PARAMETERS.<no name provided>.mark[LocalVariableDescriptor]

'element' @ [389:17] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FUNCTION_PARAMETERS.<no name provided>.mark[ValueParameterDescriptorImpl]

'markNode' @ [390:24] ==> public fun markNode(node: ASTNode): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [390:33] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FUNCTION_PARAMETERS.<no name provided>.mark[ValueParameterDescriptorImpl]

'lBrace' @ [390:41] ==> public final val KtFunctionLiteral.lBrace: PsiElement[MyPropertyDescriptor]

'node' @ [390:48] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'DECLARATION_SIGNATURE_OR_DEFAULT' @ [392:20] ==> @JvmField public final val DECLARATION_SIGNATURE_OR_DEFAULT: PositioningStrategy<PsiElement> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [392:53] ==> public open fun mark(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [392:58] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.FUNCTION_PARAMETERS.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [396:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtElement>' @ [396:78] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtElement

'element' @ [398:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CUT_CHAR_QUOTES.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [399:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CUT_CHAR_QUOTES.<no name provided>.mark[ValueParameterDescriptorImpl]

'node' @ [399:29] ==> public final val KtConstantExpression.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [399:34] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'CHARACTER_CONSTANT' @ [399:61] ==> public final val CHARACTER_CONSTANT: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'element' @ [400:44] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CUT_CHAR_QUOTES.<no name provided>.mark[ValueParameterDescriptorImpl]

'getTextRange' @ [400:52] ==> @Contract public abstract fun getTextRange(): (TextRange..TextRange?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'listOf' @ [401:28] ==> public fun <T> listOf(element: TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'create' @ [401:45] ==> @NotNull public open fun create(p0: Int, p1: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'elementTextRange' @ [401:52] ==> val elementTextRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CUT_CHAR_QUOTES.<no name provided>.mark[LocalVariableDescriptor]

'startOffset' @ [401:69] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'elementTextRange' @ [401:86] ==> val elementTextRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CUT_CHAR_QUOTES.<no name provided>.mark[LocalVariableDescriptor]

'endOffset' @ [401:103] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'markElement' @ [404:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [404:32] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.CUT_CHAR_QUOTES.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [408:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtElement>' @ [408:82] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtElement

'element' @ [410:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.LONG_LITERAL_SUFFIX.<no name provided>.mark[ValueParameterDescriptorImpl]

'element' @ [411:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.LONG_LITERAL_SUFFIX.<no name provided>.mark[ValueParameterDescriptorImpl]

'node' @ [411:29] ==> public final val KtConstantExpression.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [411:34] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'INTEGER_CONSTANT' @ [411:61] ==> public final val INTEGER_CONSTANT: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'element' @ [412:37] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.LONG_LITERAL_SUFFIX.<no name provided>.mark[ValueParameterDescriptorImpl]

'endOffset' @ [412:45] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'listOf' @ [413:28] ==> public fun <T> listOf(element: TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'create' @ [413:45] ==> @NotNull public open fun create(p0: Int, p1: Int): TextRange defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'endOffset' @ [413:52] ==> val endOffset: Int defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.LONG_LITERAL_SUFFIX.<no name provided>.mark[LocalVariableDescriptor]

'endOffset' @ [413:67] ==> val endOffset: Int defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.LONG_LITERAL_SUFFIX.<no name provided>.mark[LocalVariableDescriptor]

'markElement' @ [416:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [416:32] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.LONG_LITERAL_SUFFIX.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [420:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<PsiElement>' @ [420:80] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> PsiElement

'UNREACHABLE_CODE' @ [422:27] ==> public final val UNREACHABLE_CODE: (DiagnosticFactory1<(KtElement..KtElement?), (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?)>..DiagnosticFactory1<(KtElement..KtElement?), (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [422:44] ==> @NotNull public open fun cast(@NotNull diagnostic: Diagnostic): DiagnosticWithParameters1<(KtElement..KtElement?), (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [422:49] ==> value-parameter diagnostic: ParametrizedDiagnostic<out PsiElement> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.UNREACHABLE_CODE.<no name provided>.markDiagnostic[ValueParameterDescriptorImpl]

'a' @ [422:61] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtElement..KtElement?), (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?)>.a: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)
    <A : (Any..Any?)> -> (kotlin.collections.MutableList<(com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)>..kotlin.collections.List<(com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)>?)

'JvmField' @ [426:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtBinaryExpressionWithTypeRHS>' @ [426:90] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtBinaryExpressionWithTypeRHS

'markRange' @ [428:20] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [428:30] ==> value-parameter element: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.AS_TYPE.<no name provided>.mark[ValueParameterDescriptorImpl]

'operationReference' @ [428:38] ==> public final val KtBinaryExpressionWithTypeRHS.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'element' @ [428:58] ==> value-parameter element: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.AS_TYPE.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [432:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtObjectDeclaration>' @ [432:89] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtObjectDeclaration

'element' @ [434:17] ==> value-parameter element: KtObjectDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.COMPANION_OBJECT.<no name provided>.mark[ValueParameterDescriptorImpl]

'hasModifier' @ [434:25] ==> @Override public open fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[JavaMethodDescriptor]

'COMPANION_KEYWORD' @ [434:46] ==> public final val COMPANION_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'modifierSetPosition' @ [435:24] ==> @JvmStatic public final fun modifierSetPosition(vararg tokens: KtModifierKeywordToken): PositioningStrategy<KtModifierListOwner> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[SimpleFunctionDescriptorImpl]

'COMPANION_KEYWORD' @ [435:53] ==> public final val COMPANION_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'mark' @ [435:72] ==> public open fun mark(element: KtModifierListOwner): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [435:77] ==> value-parameter element: KtObjectDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.COMPANION_OBJECT.<no name provided>.mark[ValueParameterDescriptorImpl]

'DEFAULT' @ [437:20] ==> @JvmField public final val DEFAULT: PositioningStrategy<PsiElement> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [437:28] ==> public open fun mark(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [437:33] ==> value-parameter element: KtObjectDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.COMPANION_OBJECT.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [441:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtConstructorDelegationCall>' @ [442:22] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtConstructorDelegationCall

'element' @ [444:25] ==> value-parameter element: KtConstructorDelegationCall defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SECONDARY_CONSTRUCTOR_DELEGATION_CALL.<no name provided>.mark[ValueParameterDescriptorImpl]

'isImplicit' @ [444:33] ==> public final val KtConstructorDelegationCall.isImplicit: Boolean[MyPropertyDescriptor]

'element' @ [445:43] ==> value-parameter element: KtConstructorDelegationCall defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SECONDARY_CONSTRUCTOR_DELEGATION_CALL.<no name provided>.mark[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [445:51] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtSecondaryConstructor? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtSecondaryConstructor

'constructor' @ [446:50] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SECONDARY_CONSTRUCTOR_DELEGATION_CALL.<no name provided>.mark[LocalVariableDescriptor]

'valueParameterList' @ [446:62] ==> public final val KtSecondaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'markElement' @ [446:91] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [446:103] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SECONDARY_CONSTRUCTOR_DELEGATION_CALL.<no name provided>.mark[LocalVariableDescriptor]

'markRange' @ [447:32] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [447:42] ==> val constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SECONDARY_CONSTRUCTOR_DELEGATION_CALL.<no name provided>.mark[LocalVariableDescriptor]

'getConstructorKeyword' @ [447:54] ==> public open fun getConstructorKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[SimpleFunctionDescriptorImpl]

'valueParameterList' @ [447:79] ==> val valueParameterList: KtParameterList defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SECONDARY_CONSTRUCTOR_DELEGATION_CALL.<no name provided>.mark[LocalVariableDescriptor]

'lastChild' @ [447:98] ==> public final val KtParameterList.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'markElement' @ [449:28] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [449:40] ==> value-parameter element: KtConstructorDelegationCall defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SECONDARY_CONSTRUCTOR_DELEGATION_CALL.<no name provided>.mark[ValueParameterDescriptorImpl]

'calleeExpression' @ [449:48] ==> public final val KtConstructorDelegationCall.calleeExpression: KtConstructorDelegationReferenceExpression?[MyPropertyDescriptor]

'element' @ [449:68] ==> value-parameter element: KtConstructorDelegationCall defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.SECONDARY_CONSTRUCTOR_DELEGATION_CALL.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [453:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtEnumEntry>' @ [453:84] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtEnumEntry

'element' @ [455:30] ==> value-parameter element: KtEnumEntry defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DELEGATOR_SUPER_CALL.<no name provided>.mark[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [455:38] ==> public final val KtEnumEntry.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'markElement' @ [456:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'if (specifiers.isEmpty()) element else specifiers[0]' @ [456:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>?)>, elseBranch: KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>?)>): KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..StubElement<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<*>..org.jetbrains.kotlin.psi.KtElementImplStub<*>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<*>..org.jetbrains.kotlin.psi.KtElementImplStub<*>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<*>..org.jetbrains.kotlin.psi.KtElementImplStub<*>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<*>..org.jetbrains.kotlin.psi.KtElementImplStub<*>?)>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<*>..org.jetbrains.kotlin.psi.KtElementImplStub<*>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<*>..org.jetbrains.kotlin.psi.KtElementImplStub<*>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<*>..org.jetbrains.kotlin.psi.KtElementImplStub<*>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<*>..org.jetbrains.kotlin.psi.KtElementImplStub<*>?)>?)>?)>?)>

'specifiers' @ [456:36] ==> val specifiers: List<KtSuperTypeListEntry> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DELEGATOR_SUPER_CALL.<no name provided>.mark[LocalVariableDescriptor]

'isEmpty' @ [456:47] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'element' @ [456:58] ==> value-parameter element: KtEnumEntry defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DELEGATOR_SUPER_CALL.<no name provided>.mark[ValueParameterDescriptorImpl]

'specifiers' @ [456:71] ==> val specifiers: List<KtSuperTypeListEntry> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DELEGATOR_SUPER_CALL.<no name provided>.mark[LocalVariableDescriptor]

'JvmField' @ [460:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtBinaryExpression>' @ [460:83] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtBinaryExpression

'listOf' @ [462:20] ==> public fun <T> listOf(element: TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'TextRange' @ [462:27] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [462:37] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.UNUSED_VALUE.<no name provided>.mark[ValueParameterDescriptorImpl]

'left' @ [462:45] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'startOffset' @ [462:52] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'element' @ [462:65] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.UNUSED_VALUE.<no name provided>.mark[ValueParameterDescriptorImpl]

'operationReference' @ [462:73] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'endOffset' @ [462:92] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'JvmField' @ [466:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtBinaryExpression>' @ [466:84] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtBinaryExpression

'listOf' @ [468:20] ==> public fun <T> listOf(element: TextRange): List<TextRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TextRange

'TextRange' @ [468:27] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [468:37] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.USELESS_ELVIS.<no name provided>.mark[ValueParameterDescriptorImpl]

'operationReference' @ [468:45] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'startOffset' @ [468:64] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'element' @ [468:77] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.USELESS_ELVIS.<no name provided>.mark[ValueParameterDescriptorImpl]

'endOffset' @ [468:85] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'JvmField' @ [472:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtImportDirective>' @ [472:82] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtImportDirective

'element' @ [474:13] ==> value-parameter element: KtImportDirective defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.IMPORT_ALIAS.<no name provided>.mark[ValueParameterDescriptorImpl]

'alias' @ [474:21] ==> public final val KtImportDirective.alias: KtImportAlias?[MyPropertyDescriptor]

'nameIdentifier' @ [474:28] ==> public final val KtImportAlias.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'let' @ [474:44] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Nothing

'markElement' @ [474:57] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'it' @ [474:69] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.IMPORT_ALIAS.<no name provided>.mark.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [475:13] ==> value-parameter element: KtImportDirective defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.IMPORT_ALIAS.<no name provided>.mark[ValueParameterDescriptorImpl]

'importedReference' @ [475:21] ==> public final val KtImportDirective.importedReference: KtExpression?[MyPropertyDescriptor]

'let' @ [475:40] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Nothing

'it' @ [476:21] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.IMPORT_ALIAS.<no name provided>.mark.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [477:21] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.IMPORT_ALIAS.<no name provided>.mark.<anonymous>[ValueParameterDescriptorImpl]

'selectorExpression' @ [477:24] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'let' @ [477:44] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Nothing

'markElement' @ [477:57] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'it' @ [477:69] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.IMPORT_ALIAS.<no name provided>.mark.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'markElement' @ [479:24] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'it' @ [479:36] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.IMPORT_ALIAS.<no name provided>.mark.<anonymous>[ValueParameterDescriptorImpl]

'markElement' @ [481:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [481:32] ==> value-parameter element: KtImportDirective defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.IMPORT_ALIAS.<no name provided>.mark[ValueParameterDescriptorImpl]

'JvmField' @ [485:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'PositioningStrategy<KtReturnExpression>' @ [485:88] ==> public constructor PositioningStrategy<in E : PsiElement>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[ClassConstructorDescriptorImpl]
Inferred types:
    <in E : PsiElement> -> KtReturnExpression

'element' @ [487:37] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.RETURN_WITH_LABEL.<no name provided>.mark[ValueParameterDescriptorImpl]

'labeledExpression' @ [487:45] ==> public final val KtReturnExpression.labeledExpression: PsiElement?[MyPropertyDescriptor]

'labeledExpression' @ [488:17] ==> val labeledExpression: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.RETURN_WITH_LABEL.<no name provided>.mark[LocalVariableDescriptor]

'markRange' @ [489:24] ==> public fun markRange(from: PsiElement, to: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [489:34] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.RETURN_WITH_LABEL.<no name provided>.mark[ValueParameterDescriptorImpl]

'labeledExpression' @ [489:43] ==> val labeledExpression: PsiElement? defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.RETURN_WITH_LABEL.<no name provided>.mark[LocalVariableDescriptor]

'markElement' @ [492:20] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'element' @ [492:32] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.RETURN_WITH_LABEL.<no name provided>.mark[ValueParameterDescriptorImpl]

'returnKeyword' @ [492:40] ==> public final val KtReturnExpression.returnKeyword: PsiElement[MyPropertyDescriptor]

'JvmField' @ [496:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DeclarationHeader<KtCallableDeclaration>' @ [496:83] ==> public constructor DeclarationHeader<T : KtDeclaration>() defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.DeclarationHeader[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtDeclaration> -> KtCallableDeclaration

'element' @ [498:13] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.RECEIVER.<no name provided>.mark[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [498:21] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [498:44] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> Nothing

'markElement' @ [498:57] ==> public fun markElement(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics in file PositioningStrategy.kt[SimpleFunctionDescriptorImpl]

'it' @ [498:69] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.RECEIVER.<no name provided>.mark.<anonymous>[ValueParameterDescriptorImpl]

'DEFAULT' @ [499:20] ==> @JvmField public final val DEFAULT: PositioningStrategy<PsiElement> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies[PropertyDescriptorImpl]

'mark' @ [499:28] ==> public open fun mark(element: PsiElement): List<TextRange> defined in org.jetbrains.kotlin.diagnostics.PositioningStrategy[SimpleFunctionDescriptorImpl]

'element' @ [499:33] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.diagnostics.PositioningStrategies.RECEIVER.<no name provided>.mark[ValueParameterDescriptorImpl]

