'KtTreeVisitorVoid' @ [31:47] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'allChildren' @ [33:60] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [33:72] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [33:78] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration.containsToken.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [33:81] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [33:86] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'type' @ [33:101] ==> value-parameter type: IElementType defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration.containsToken[ValueParameterDescriptorImpl]

'!' @ [35:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'range' @ [35:14] ==> public final var range: TextRange defined in org.jetbrains.kotlin.idea.formatter.Visitor[PropertyDescriptorImpl]

'contains' @ [35:20] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'declaration' @ [35:29] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[ValueParameterDescriptorImpl]

'textRange' @ [35:41] ==> public final val KtNamedDeclaration.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'declaration' @ [37:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[ValueParameterDescriptorImpl]

'parent' @ [37:37] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'classBody' @ [38:21] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'parent' @ [38:31] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [39:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'klass' @ [39:14] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'isEnum' @ [39:20] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'if (declaration is KtEnumEntry) {
            val comma = KtPsiFactory(klass).createComma()

            val nextEntry = declaration.nextSiblingOfSameType()
            if (nextEntry != null && !declaration.containsToken(KtTokens.COMMA)) {
                declaration.add(comma)
                delta += comma.textLength
            }

            val prevEntry = declaration.prevSiblingOfSameType()
            if (prevEntry != null && !prevEntry.containsToken(KtTokens.COMMA)) {
                prevEntry.add(comma)
                delta += comma.textLength
            }
        }
        else {
            val lastEntry = klass.declarations.lastIsInstanceOrNull<KtEnumEntry>()
            if (lastEntry != null && lastEntry.containsToken(KtTokens.SEMICOLON)) return
            if (lastEntry == null && classBody.containsToken(KtTokens.SEMICOLON)) return

            val semicolon = KtPsiFactory(klass).createSemicolon()
            classBody.addAfter(semicolon, lastEntry)
            delta += semicolon.textLength
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [43:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [44:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'klass' @ [44:38] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'createComma' @ [44:45] ==> public final fun createComma(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'declaration' @ [46:29] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[ValueParameterDescriptorImpl]

'nextSiblingOfSameType' @ [46:41] ==> public inline fun <reified T : PsiElement> KtEnumEntry.nextSiblingOfSameType(): KtEnumEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtEnumEntry

'nextEntry' @ [47:17] ==> val nextEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'!' @ [47:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [47:39] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[ValueParameterDescriptorImpl]

'containsToken' @ [47:51] ==> local final fun PsiElement.containsToken(type: IElementType): Boolean defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[SimpleFunctionDescriptorImpl]

'COMMA' @ [47:74] ==> public final val COMMA: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [48:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[ValueParameterDescriptorImpl]

'add' @ [48:29] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'comma' @ [48:33] ==> val comma: PsiElement defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'delta' @ [49:17] ==> var delta: Int defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'comma' @ [49:26] ==> val comma: PsiElement defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'textLength' @ [49:32] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'declaration' @ [52:29] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[ValueParameterDescriptorImpl]

'prevSiblingOfSameType' @ [52:41] ==> public inline fun <reified T : PsiElement> KtEnumEntry.prevSiblingOfSameType(): KtEnumEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtEnumEntry

'prevEntry' @ [53:17] ==> val prevEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'!' @ [53:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'prevEntry' @ [53:39] ==> val prevEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'containsToken' @ [53:49] ==> local final fun PsiElement.containsToken(type: IElementType): Boolean defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[SimpleFunctionDescriptorImpl]

'COMMA' @ [53:72] ==> public final val COMMA: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'prevEntry' @ [54:17] ==> val prevEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'add' @ [54:27] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtEnumEntry[JavaMethodDescriptor]

'comma' @ [54:31] ==> val comma: PsiElement defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'delta' @ [55:17] ==> var delta: Int defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'comma' @ [55:26] ==> val comma: PsiElement defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'textLength' @ [55:32] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'klass' @ [59:29] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'declarations' @ [59:35] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'lastIsInstanceOrNull' @ [59:48] ==> public inline fun <reified T : Any> Iterable<*>.lastIsInstanceOrNull(): KtEnumEntry? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtEnumEntry

'lastEntry' @ [60:17] ==> val lastEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'lastEntry' @ [60:38] ==> val lastEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'containsToken' @ [60:48] ==> local final fun PsiElement.containsToken(type: IElementType): Boolean defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[SimpleFunctionDescriptorImpl]

'SEMICOLON' @ [60:71] ==> public final val SEMICOLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'lastEntry' @ [61:17] ==> val lastEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'classBody' @ [61:38] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'containsToken' @ [61:48] ==> local final fun PsiElement.containsToken(type: IElementType): Boolean defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[SimpleFunctionDescriptorImpl]

'SEMICOLON' @ [61:71] ==> public final val SEMICOLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KtPsiFactory' @ [63:29] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'klass' @ [63:42] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'createSemicolon' @ [63:49] ==> public final fun createSemicolon(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'classBody' @ [64:13] ==> val classBody: KtClassBody defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'addAfter' @ [64:23] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClassBody[JavaMethodDescriptor]

'semicolon' @ [64:32] ==> val semicolon: PsiElement defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'lastEntry' @ [64:43] ==> val lastEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'delta' @ [65:13] ==> var delta: Int defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'semicolon' @ [65:22] ==> val semicolon: PsiElement defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'textLength' @ [65:32] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'range' @ [68:9] ==> public final var range: TextRange defined in org.jetbrains.kotlin.idea.formatter.Visitor[PropertyDescriptorImpl]

'TextRange' @ [68:17] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'range' @ [68:27] ==> public final var range: TextRange defined in org.jetbrains.kotlin.idea.formatter.Visitor[PropertyDescriptorImpl]

'startOffset' @ [68:33] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'range' @ [68:46] ==> public final var range: TextRange defined in org.jetbrains.kotlin.idea.formatter.Visitor[PropertyDescriptorImpl]

'endOffset' @ [68:52] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'delta' @ [68:64] ==> var delta: Int defined in org.jetbrains.kotlin.idea.formatter.Visitor.visitNamedDeclaration[LocalVariableDescriptor]

'element' @ [74:19] ==> value-parameter element: ASTNode defined in org.jetbrains.kotlin.idea.formatter.KotlinPreFormatProcessor.process[ValueParameterDescriptorImpl]

'psi' @ [74:27] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'range' @ [74:41] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.formatter.KotlinPreFormatProcessor.process[ValueParameterDescriptorImpl]

'!' @ [75:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psi' @ [75:14] ==> val psi: PsiElement defined in org.jetbrains.kotlin.idea.formatter.KotlinPreFormatProcessor.process[LocalVariableDescriptor]

'isValid' @ [75:18] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'range' @ [75:34] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.formatter.KotlinPreFormatProcessor.process[ValueParameterDescriptorImpl]

'psi' @ [76:13] ==> val psi: PsiElement defined in org.jetbrains.kotlin.idea.formatter.KotlinPreFormatProcessor.process[LocalVariableDescriptor]

'containingFile' @ [76:17] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'range' @ [76:51] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.formatter.KotlinPreFormatProcessor.process[ValueParameterDescriptorImpl]

'Visitor' @ [77:16] ==> public constructor Visitor(range: TextRange) defined in org.jetbrains.kotlin.idea.formatter.Visitor[ClassConstructorDescriptorImpl]

'range' @ [77:24] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.idea.formatter.KotlinPreFormatProcessor.process[ValueParameterDescriptorImpl]

'apply' @ [77:31] ==> @InlineOnly public inline fun <T> Visitor.apply(block: Visitor.() -> Unit): Visitor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visitor

'psi' @ [77:39] ==> val psi: PsiElement defined in org.jetbrains.kotlin.idea.formatter.KotlinPreFormatProcessor.process[LocalVariableDescriptor]

'accept' @ [77:43] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'this' @ [77:50] ==> <this> defined in org.jetbrains.kotlin.idea.formatter.KotlinPreFormatProcessor.process.<anonymous>[ReceiverParameterDescriptorImpl]

'range' @ [77:58] ==> public final var range: TextRange defined in org.jetbrains.kotlin.idea.formatter.Visitor[PropertyDescriptorImpl]

