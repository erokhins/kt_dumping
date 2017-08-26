'ReadWriteAccessDetector' @ [30:39] ==> public constructor ReadWriteAccessDetector() defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector[JavaClassConstructorDescriptor]

'KotlinReadWriteAccessDetector' @ [32:24] ==> public constructor KotlinReadWriteAccessDetector() defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector[ClassConstructorDescriptorImpl]

'element' @ [35:63] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.isReadWriteAccessible[ValueParameterDescriptorImpl]

'element' @ [35:99] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.isReadWriteAccessible[ValueParameterDescriptorImpl]

'isReadWriteAccessible' @ [37:66] ==> public open fun isReadWriteAccessible(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector[SimpleFunctionDescriptorImpl]

'element' @ [37:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.isDeclarationWriteAccess[ValueParameterDescriptorImpl]

'!' @ [40:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReadWriteAccessible' @ [40:14] ==> public open fun isReadWriteAccessible(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector[SimpleFunctionDescriptorImpl]

'referencedElement' @ [40:36] ==> value-parameter referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[ValueParameterDescriptorImpl]

'Read' @ [41:51] ==> enum entry Read defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'reference' @ [44:25] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[ValueParameterDescriptorImpl]

'resolve' @ [44:35] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'refTarget' @ [45:13] ==> val refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[LocalVariableDescriptor]

'refTarget' @ [46:26] ==> val refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[LocalVariableDescriptor]

'kotlinOrigin' @ [46:36] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'when (origin) {
                is KtPropertyAccessor -> origin.getNonStrictParentOfType<KtProperty>()
                is KtProperty, is KtParameter -> origin as KtNamedDeclaration
                else -> null
            }' @ [47:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtNamedDeclaration?, entry1: KtNamedDeclaration?, entry2: KtNamedDeclaration?): KtNamedDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtNamedDeclaration?

'origin' @ [47:57] ==> val origin: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[LocalVariableDescriptor]

'origin' @ [48:42] ==> val origin: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [48:49] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'origin' @ [49:50] ==> val origin: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[LocalVariableDescriptor]

'ReadWrite' @ [51:56] ==> enum entry ReadWrite defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'when (refTarget.name) {
                JvmAbi.getterName(declaration.name!!) -> return ReadWriteAccessDetector.Access.Read
                JvmAbi.setterName(declaration.name!!) -> return ReadWriteAccessDetector.Access.Write
                else -> ReadWriteAccessDetector.Access.ReadWrite
            }' @ [53:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReadWriteAccessDetector.Access, entry1: ReadWriteAccessDetector.Access, entry2: ReadWriteAccessDetector.Access): ReadWriteAccessDetector.Access[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Access

'refTarget' @ [53:26] ==> val refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[LocalVariableDescriptor]

'name' @ [53:36] ==> public final var KtLightMethod.name: String[MyPropertyDescriptor]

'getterName' @ [54:24] ==> @NotNull public open fun getterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'declaration' @ [54:35] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[LocalVariableDescriptor]

'name' @ [54:47] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'Read' @ [54:96] ==> enum entry Read defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'setterName' @ [55:24] ==> @NotNull public open fun setterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'declaration' @ [55:35] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[LocalVariableDescriptor]

'name' @ [55:47] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'Write' @ [55:96] ==> enum entry Write defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'ReadWrite' @ [56:56] ==> enum entry ReadWrite defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'getExpressionAccess' @ [60:16] ==> public open fun getExpressionAccess(expression: PsiElement): ReadWriteAccessDetector.Access defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector[SimpleFunctionDescriptorImpl]

'reference' @ [60:36] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getReferenceAccess[ValueParameterDescriptorImpl]

'element' @ [60:46] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [64:13] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getExpressionAccess[ValueParameterDescriptorImpl]

'JavaReadWriteAccessDetector' @ [65:20] ==> public constructor JavaReadWriteAccessDetector() defined in com.intellij.codeInsight.highlighting.JavaReadWriteAccessDetector[JavaClassConstructorDescriptor]

'getExpressionAccess' @ [65:50] ==> @NotNull public open fun getExpressionAccess(@NotNull p0: PsiElement): ReadWriteAccessDetector.Access defined in com.intellij.codeInsight.highlighting.JavaReadWriteAccessDetector[JavaMethodDescriptor]

'expression' @ [65:70] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getExpressionAccess[ValueParameterDescriptorImpl]

'when (expression.readWriteAccess(useResolveForReadWrite = true)) {
            ReferenceAccess.READ -> ReadWriteAccessDetector.Access.Read
            ReferenceAccess.WRITE -> ReadWriteAccessDetector.Access.Write
            ReferenceAccess.READ_WRITE -> ReadWriteAccessDetector.Access.ReadWrite
        }' @ [68:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReadWriteAccessDetector.Access, entry1: ReadWriteAccessDetector.Access, entry2: ReadWriteAccessDetector.Access): ReadWriteAccessDetector.Access[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Access

'expression' @ [68:22] ==> value-parameter expression: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReadWriteAccessDetector.getExpressionAccess[ValueParameterDescriptorImpl]

'readWriteAccess' @ [68:33] ==> public fun KtExpression.readWriteAccess(useResolveForReadWrite: Boolean): ReferenceAccess defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'READ' @ [69:29] ==> enum entry READ defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'Read' @ [69:68] ==> enum entry Read defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'WRITE' @ [70:29] ==> enum entry WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'Write' @ [70:69] ==> enum entry Write defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

'READ_WRITE' @ [71:29] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'ReadWrite' @ [71:74] ==> enum entry ReadWrite defined in com.intellij.codeInsight.highlighting.ReadWriteAccessDetector.Access[FakeCallableDescriptorForObject]

