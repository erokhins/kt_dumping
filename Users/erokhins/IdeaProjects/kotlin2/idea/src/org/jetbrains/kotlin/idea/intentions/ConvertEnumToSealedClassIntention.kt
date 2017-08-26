'SelfTargetingRangeIntention<KtClass>' @ [30:43] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtClass>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtClass

'java' @ [30:95] ==> public val <T> KClass<KtClass>.java: Class<KtClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClass

'element' @ [32:30] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applicabilityRange[ValueParameterDescriptorImpl]

'nameIdentifier' @ [32:38] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'element' @ [33:27] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applicabilityRange[ValueParameterDescriptorImpl]

'modifierList' @ [33:35] ==> public final val KtClass.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [33:49] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'ENUM_KEYWORD' @ [33:70] ==> public final val ENUM_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'TextRange' @ [34:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'enumKeyword' @ [34:26] ==> val enumKeyword: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applicabilityRange[LocalVariableDescriptor]

'startOffset' @ [34:38] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'nameIdentifier' @ [34:51] ==> val nameIdentifier: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applicabilityRange[LocalVariableDescriptor]

'endOffset' @ [34:66] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [38:9] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[ValueParameterDescriptorImpl]

'removeModifier' @ [38:17] ==> public open fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'ENUM_KEYWORD' @ [38:41] ==> public final val ENUM_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [39:9] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[ValueParameterDescriptorImpl]

'addModifier' @ [39:17] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'SEALED_KEYWORD' @ [39:38] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KtPsiFactory' @ [41:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [41:39] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [43:24] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[ValueParameterDescriptorImpl]

'declarations' @ [43:32] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'member' @ [44:17] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'psiFactory' @ [46:23] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'createDeclaration' @ [46:34] ==> public final fun <TDeclaration : KtDeclaration> createDeclaration(text: String): KtObjectDeclaration defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtObjectDeclaration

'member' @ [46:83] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'name' @ [46:90] ==> public final val KtEnumEntry.name: String?[MyPropertyDescriptor]

'member' @ [48:32] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'initializerList' @ [48:39] ==> public final val KtEnumEntry.initializerList: KtInitializerList?[MyPropertyDescriptor]

'initializers' @ [48:56] ==> public final val KtInitializerList.initializers: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>)[MyPropertyDescriptor]

'emptyList' @ [48:72] ==> public fun <T> emptyList(): List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtSuperTypeListEntry..org.jetbrains.kotlin.psi.KtSuperTypeListEntry?)

'if (initializers.isNotEmpty()) {
                initializers.forEach { obj.addSuperTypeListEntry(psiFactory.createSuperTypeCallEntry("${element.name}${it.text}")) }
            }
            else {
                obj.addSuperTypeListEntry(psiFactory.createSuperTypeCallEntry("${element.name}()"))
            }' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'initializers' @ [49:17] ==> val initializers: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'isNotEmpty' @ [49:30] ==> @InlineOnly public inline fun <T> Collection<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtSuperTypeListEntry..org.jetbrains.kotlin.psi.KtSuperTypeListEntry?)

'initializers' @ [50:17] ==> val initializers: (MutableList<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>..List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>) defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'forEach' @ [50:30] ==> @HidesMembers public inline fun <T> Iterable<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>.forEach(action: ((KtSuperTypeListEntry..KtSuperTypeListEntry?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtSuperTypeListEntry..org.jetbrains.kotlin.psi.KtSuperTypeListEntry?)

'obj' @ [50:40] ==> val obj: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'addSuperTypeListEntry' @ [50:44] ==> public final fun addSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [50:66] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'createSuperTypeCallEntry' @ [50:77] ==> public final fun createSuperTypeCallEntry(text: String): KtSuperTypeCallEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [50:105] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[ValueParameterDescriptorImpl]

'name' @ [50:113] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'it' @ [50:120] ==> value-parameter it: (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [50:123] ==> public final val KtSuperTypeListEntry.text: (String..String?)[MyPropertyDescriptor]

'obj' @ [53:17] ==> val obj: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'addSuperTypeListEntry' @ [53:21] ==> public final fun addSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [53:43] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'createSuperTypeCallEntry' @ [53:54] ==> public final fun createSuperTypeCallEntry(text: String): KtSuperTypeCallEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [53:82] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[ValueParameterDescriptorImpl]

'name' @ [53:90] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'member' @ [56:13] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'getBody' @ [56:20] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtEnumEntry[DeserializedSimpleFunctionDescriptor]

'let' @ [56:31] ==> @InlineOnly public inline fun <T, R> KtClassBody.let(block: (KtClassBody) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassBody
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'obj' @ [56:45] ==> val obj: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'add' @ [56:49] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[JavaMethodDescriptor]

'body' @ [56:53] ==> value-parameter body: KtClassBody defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [58:13] ==> val member: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'delete' @ [58:20] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'element' @ [59:13] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[ValueParameterDescriptorImpl]

'addDeclaration' @ [59:21] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: KtObjectDeclaration): KtObjectDeclaration defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtObjectDeclaration

'obj' @ [59:36] ==> val obj: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[LocalVariableDescriptor]

'element' @ [62:9] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[ValueParameterDescriptorImpl]

'getBody' @ [62:17] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'let' @ [62:28] ==> @InlineOnly public inline fun <T, R> KtClassBody.let(block: (KtClassBody) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassBody
    <R> -> Unit

'body' @ [63:29] ==> value-parameter body: KtClassBody defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'allChildren' @ [64:22] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [65:22] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [65:34] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [66:22] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [66:36] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [66:39] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [66:44] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'SEMICOLON' @ [66:68] ==> public final val SEMICOLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'semicolon' @ [67:17] ==> val semicolon: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'semicolon' @ [68:39] ==> val semicolon: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'siblings' @ [68:49] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [68:94] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [68:108] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [69:17] ==> value-parameter body: KtClassBody defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'deleteChildRange' @ [69:22] ==> public open fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'semicolon' @ [69:39] ==> val semicolon: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'nonWhiteSibling' @ [69:50] ==> val nonWhiteSibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'prevSibling' @ [69:67] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'semicolon' @ [69:82] ==> val semicolon: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'nonWhiteSibling' @ [70:21] ==> val nonWhiteSibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [71:38] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'element' @ [71:50] ==> value-parameter element: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [71:58] ==> public final val KtClass.project: Project[MyPropertyDescriptor]

'reformat' @ [71:67] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'nonWhiteSibling' @ [71:76] ==> val nonWhiteSibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'firstChild' @ [71:92] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nonWhiteSibling' @ [71:106] ==> val nonWhiteSibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertEnumToSealedClassIntention.applyTo.<anonymous>[LocalVariableDescriptor]

