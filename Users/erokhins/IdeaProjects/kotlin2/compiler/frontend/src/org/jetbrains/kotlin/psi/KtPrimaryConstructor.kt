'super' @ [28:34] ==> protected constructor KtConstructor<T : KtConstructor<KtPrimaryConstructor>>(node: ASTNode) defined in org.jetbrains.kotlin.psi.KtConstructor[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtConstructor<T>> -> KtPrimaryConstructor

'node' @ [28:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.<init>[ValueParameterDescriptorImpl]

'super' @ [29:70] ==> protected constructor KtConstructor<T : KtConstructor<KtPrimaryConstructor>>(stub: KotlinPlaceHolderStub<KtPrimaryConstructor>, nodeType: KtPlaceHolderStubElementType<KtPrimaryConstructor>) defined in org.jetbrains.kotlin.psi.KtConstructor[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtConstructor<T>> -> KtPrimaryConstructor

'stub' @ [29:76] ==> value-parameter stub: KotlinPlaceHolderStub<KtPrimaryConstructor> defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.<init>[ValueParameterDescriptorImpl]

'PRIMARY_CONSTRUCTOR' @ [29:101] ==> public final val PRIMARY_CONSTRUCTOR: (KtPlaceHolderStubElementType<(KtPrimaryConstructor..KtPrimaryConstructor?)>..KtPlaceHolderStubElementType<(KtPrimaryConstructor..KtPrimaryConstructor?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'visitor' @ [31:69] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.accept[ValueParameterDescriptorImpl]

'visitPrimaryConstructor' @ [31:77] ==> public open fun visitPrimaryConstructor(@NotNull constructor: KtPrimaryConstructor, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [31:101] ==> <this> defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[LazyClassReceiverParameterDescriptor]

'data' @ [31:107] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.accept[ValueParameterDescriptorImpl]

'parent' @ [33:49] ==> public final val KtPrimaryConstructor.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getConstructorKeyword' @ [36:16] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[SimpleFunctionDescriptorImpl]

'addBefore' @ [36:43] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[JavaMethodDescriptor]

'KtPsiFactory' @ [36:53] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'this' @ [36:66] ==> <this> defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[LazyClassReceiverParameterDescriptor]

'createConstructorKeyword' @ [36:72] ==> public final fun createConstructorKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'valueParameterList' @ [36:100] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'modifierList' @ [40:28] ==> public final val KtPrimaryConstructor.modifierList: KtModifierList?[MyPropertyDescriptor]

'if (modifierList != null) {
            addModifier(modifierList, modifier)
            if (this.modifierList == null) {
                getConstructorKeyword()?.delete()
            }
        }
        else {
            if (modifier == KtTokens.PUBLIC_KEYWORD) return
            val newModifierList = KtPsiFactory(this).createModifierList(modifier)
            addBefore(newModifierList, getOrCreateConstructorKeyword())
        }' @ [41:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'modifierList' @ [41:13] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addModifier[LocalVariableDescriptor]

'addModifier' @ [42:13] ==> internal fun addModifier(modifierList: KtModifierList, modifier: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.addRemoveModifier in file addRemoveModifier.kt[SimpleFunctionDescriptorImpl]

'modifierList' @ [42:25] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addModifier[LocalVariableDescriptor]

'modifier' @ [42:39] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addModifier[ValueParameterDescriptorImpl]

'this' @ [43:17] ==> <this> defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[LazyClassReceiverParameterDescriptor]

'modifierList' @ [43:22] ==> public final val KtPrimaryConstructor.modifierList: KtModifierList?[MyPropertyDescriptor]

'getConstructorKeyword' @ [44:17] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[SimpleFunctionDescriptorImpl]

'delete' @ [44:42] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'modifier' @ [48:17] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addModifier[ValueParameterDescriptorImpl]

'PUBLIC_KEYWORD' @ [48:38] ==> public final val PUBLIC_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KtPsiFactory' @ [49:35] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi in file KtPsiFactory.kt[SimpleFunctionDescriptorImpl]

'this' @ [49:48] ==> <this> defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[LazyClassReceiverParameterDescriptor]

'createModifierList' @ [49:54] ==> public final fun createModifierList(modifier: KtModifierKeywordToken): KtModifierList defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'modifier' @ [49:73] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addModifier[ValueParameterDescriptorImpl]

'addBefore' @ [50:13] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[JavaMethodDescriptor]

'newModifierList' @ [50:23] ==> val newModifierList: KtModifierList defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addModifier[LocalVariableDescriptor]

'getOrCreateConstructorKeyword' @ [50:40] ==> private final fun getOrCreateConstructorKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[SimpleFunctionDescriptorImpl]

'super' @ [55:9] ==> <this> defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[LazyClassReceiverParameterDescriptor]

'removeModifier' @ [55:15] ==> @Override public open fun removeModifier(@NotNull modifier: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtConstructor[JavaMethodDescriptor]

'modifier' @ [55:30] ==> value-parameter modifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.removeModifier[ValueParameterDescriptorImpl]

'modifierList' @ [56:13] ==> public final val KtPrimaryConstructor.modifierList: KtModifierList?[MyPropertyDescriptor]

'getConstructorKeyword' @ [57:13] ==> public open fun getConstructorKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[SimpleFunctionDescriptorImpl]

'delete' @ [57:38] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'modifierList' @ [62:28] ==> public final val KtPrimaryConstructor.modifierList: KtModifierList?[MyPropertyDescriptor]

'if (modifierList != null) {
            modifierList.addBefore(annotationEntry, modifierList.firstChild) as KtAnnotationEntry
        }
        else {
            val parameterList = valueParameterList!!
            val newModifierList = KtPsiFactory(project).createModifierList(annotationEntry.text)
            (addBefore(newModifierList, parameterList) as KtModifierList).annotationEntries.first()
        }' @ [63:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtAnnotationEntry, elseBranch: KtAnnotationEntry): KtAnnotationEntry[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtAnnotationEntry

'modifierList' @ [63:20] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addAnnotationEntry[LocalVariableDescriptor]

'modifierList' @ [64:13] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addAnnotationEntry[LocalVariableDescriptor]

'addBefore' @ [64:26] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'annotationEntry' @ [64:36] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addAnnotationEntry[ValueParameterDescriptorImpl]

'modifierList' @ [64:53] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addAnnotationEntry[LocalVariableDescriptor]

'firstChild' @ [64:66] ==> public final val KtModifierList.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'valueParameterList' @ [67:33] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'KtPsiFactory' @ [68:35] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[ClassConstructorDescriptorImpl]

'project' @ [68:48] ==> public final val KtPrimaryConstructor.project: Project[MyPropertyDescriptor]

'createModifierList' @ [68:57] ==> public final fun createModifierList(text: String): KtModifierList defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'annotationEntry' @ [68:76] ==> value-parameter annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addAnnotationEntry[ValueParameterDescriptorImpl]

'text' @ [68:92] ==> public final val KtAnnotationEntry.text: (String..String?)[MyPropertyDescriptor]

'addBefore' @ [69:14] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[JavaMethodDescriptor]

'newModifierList' @ [69:24] ==> val newModifierList: KtModifierList defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addAnnotationEntry[LocalVariableDescriptor]

'parameterList' @ [69:41] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor.addAnnotationEntry[LocalVariableDescriptor]

'annotationEntries' @ [69:75] ==> public final val KtModifierList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'first' @ [69:93] ==> public fun <T> List<(KtAnnotationEntry..KtAnnotationEntry?)>.first(): (KtAnnotationEntry..KtAnnotationEntry?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

