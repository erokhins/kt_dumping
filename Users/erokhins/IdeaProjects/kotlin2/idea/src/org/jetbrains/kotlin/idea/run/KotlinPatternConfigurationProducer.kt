'PatternConfigurationProducer' @ [30:44] ==> public constructor PatternConfigurationProducer() defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaClassConstructorDescriptor]

'super' @ [36:16] ==> <this> defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer[LazyClassReceiverParameterDescriptor]

'setupConfigurationFromContext' @ [36:22] ==> protected/*protected and package*/ open fun setupConfigurationFromContext(p0: (JUnitConfiguration..JUnitConfiguration?), p1: (ConfigurationContext..ConfigurationContext?), p2: (Ref<(PsiElement..PsiElement?)>..Ref<(PsiElement..PsiElement?)>?)): Boolean defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaMethodDescriptor]

'configuration' @ [36:52] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'context' @ [36:67] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'sourceElement' @ [36:76] ==> value-parameter sourceElement: Ref<PsiElement> defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'psiElements' @ [45:32] ==> value-parameter psiElements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.collectTestMembers[ValueParameterDescriptorImpl]

'mapNotNull' @ [45:44] ==> public inline fun <T, R : Any> Array<out PsiElement>.mapNotNull(transform: (PsiElement) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R : Any> -> PsiElement

'if (it is KtClassOrObject) it.toLightClass() else it' @ [45:57] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'it' @ [45:61] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.collectTestMembers.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [45:84] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.collectTestMembers.<anonymous>[ValueParameterDescriptorImpl]

'toLightClass' @ [45:87] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'it' @ [45:107] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.collectTestMembers.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [45:112] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'super' @ [46:9] ==> <this> defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer[LazyClassReceiverParameterDescriptor]

'collectTestMembers' @ [46:15] ==> public open fun collectTestMembers(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p1: Boolean, p2: Boolean, p3: (PsiElementProcessor.CollectElements<(PsiElement..PsiElement?)>..PsiElementProcessor.CollectElements<(PsiElement..PsiElement?)>?)): Unit defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaMethodDescriptor]

'adjustedElements' @ [46:34] ==> val adjustedElements: Array<PsiElement> defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.collectTestMembers[LocalVariableDescriptor]

'checkAbstract' @ [46:52] ==> value-parameter checkAbstract: Boolean defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.collectTestMembers[ValueParameterDescriptorImpl]

'checkIsTest' @ [46:67] ==> value-parameter checkIsTest: Boolean defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.collectTestMembers[ValueParameterDescriptorImpl]

'collectingProcessor' @ [46:80] ==> value-parameter collectingProcessor: PsiElementProcessor.CollectElements<PsiElement> defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.collectTestMembers[ValueParameterDescriptorImpl]

'other' @ [50:16] ==> value-parameter other: ConfigurationFromContext defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.shouldReplace[ValueParameterDescriptorImpl]

'isProducedBy' @ [50:22] ==> public open fun isProducedBy(p0: (Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>..Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>?)): Boolean defined in com.intellij.execution.actions.ConfigurationFromContext[JavaMethodDescriptor]

'PatternConfigurationProducer' @ [50:35] ==> public constructor PatternConfigurationProducer() defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaClassConstructorDescriptor]

'java' @ [50:71] ==> public val <T> KClass<PatternConfigurationProducer>.java: Class<PatternConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PatternConfigurationProducer

'other' @ [51:19] ==> value-parameter other: ConfigurationFromContext defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.shouldReplace[ValueParameterDescriptorImpl]

'isProducedBy' @ [51:25] ==> public open fun isProducedBy(p0: (Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>..Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>?)): Boolean defined in com.intellij.execution.actions.ConfigurationFromContext[JavaMethodDescriptor]

'TestClassConfigurationProducer' @ [51:38] ==> public constructor TestClassConfigurationProducer() defined in com.intellij.execution.junit.TestClassConfigurationProducer[JavaClassConstructorDescriptor]

'java' @ [51:76] ==> public val <T> KClass<TestClassConfigurationProducer>.java: Class<TestClassConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TestClassConfigurationProducer

'other' @ [52:19] ==> value-parameter other: ConfigurationFromContext defined in org.jetbrains.kotlin.idea.run.KotlinPatternConfigurationProducer.shouldReplace[ValueParameterDescriptorImpl]

'isProducedBy' @ [52:25] ==> public open fun isProducedBy(p0: (Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>..Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>?)): Boolean defined in com.intellij.execution.actions.ConfigurationFromContext[JavaMethodDescriptor]

'KotlinJUnitRunConfigurationProducer' @ [52:38] ==> public companion object defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer[FakeCallableDescriptorForObject]

'java' @ [52:81] ==> public val <T> KClass<KotlinJUnitRunConfigurationProducer>.java: Class<KotlinJUnitRunConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinJUnitRunConfigurationProducer

