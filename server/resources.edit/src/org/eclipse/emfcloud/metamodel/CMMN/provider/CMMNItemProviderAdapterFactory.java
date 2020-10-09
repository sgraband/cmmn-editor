/**
 */
package org.eclipse.emfcloud.metamodel.CMMN.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.emfcloud.metamodel.CMMN.util.CMMNAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNItemProviderAdapterFactory extends CMMNAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMMNItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMMNDiagramItemProvider cmmnDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.CMMNDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCMMNDiagramAdapter() {
		if (cmmnDiagramItemProvider == null) {
			cmmnDiagramItemProvider = new CMMNDiagramItemProvider(this);
		}

		return cmmnDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.CMMNElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CMMNElementItemProvider cmmnElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.CMMNElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCMMNElementAdapter() {
		if (cmmnElementItemProvider == null) {
			cmmnElementItemProvider = new CMMNElementItemProvider(this);
		}

		return cmmnElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.CaseFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseFileItemProvider caseFileItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.CaseFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCaseFileAdapter() {
		if (caseFileItemProvider == null) {
			caseFileItemProvider = new CaseFileItemProvider(this);
		}

		return caseFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.Case} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseItemProvider caseItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.Case}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCaseAdapter() {
		if (caseItemProvider == null) {
			caseItemProvider = new CaseItemProvider(this);
		}

		return caseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.Stage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageItemProvider stageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStageAdapter() {
		if (stageItemProvider == null) {
			stageItemProvider = new StageItemProvider(this);
		}

		return stageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.EventListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventListenerItemProvider eventListenerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.EventListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventListenerAdapter() {
		if (eventListenerItemProvider == null) {
			eventListenerItemProvider = new EventListenerItemProvider(this);
		}

		return eventListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.Sentry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SentryItemProvider sentryItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.Sentry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSentryAdapter() {
		if (sentryItemProvider == null) {
			sentryItemProvider = new SentryItemProvider(this);
		}

		return sentryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanItemDefinitionItemProvider planItemDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.PlanItemDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanItemDefinitionAdapter() {
		if (planItemDefinitionItemProvider == null) {
			planItemDefinitionItemProvider = new PlanItemDefinitionItemProvider(this);
		}

		return planItemDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.TimerEventListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerEventListenerItemProvider timerEventListenerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.TimerEventListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimerEventListenerAdapter() {
		if (timerEventListenerItemProvider == null) {
			timerEventListenerItemProvider = new TimerEventListenerItemProvider(this);
		}

		return timerEventListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.UserEventListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserEventListenerItemProvider userEventListenerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.UserEventListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserEventListenerAdapter() {
		if (userEventListenerItemProvider == null) {
			userEventListenerItemProvider = new UserEventListenerItemProvider(this);
		}

		return userEventListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.TimerExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerExpressionItemProvider timerExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.TimerExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimerExpressionAdapter() {
		if (timerExpressionItemProvider == null) {
			timerExpressionItemProvider = new TimerExpressionItemProvider(this);
		}

		return timerExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.Decorator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecoratorItemProvider decoratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.Decorator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecoratorAdapter() {
		if (decoratorItemProvider == null) {
			decoratorItemProvider = new DecoratorItemProvider(this);
		}

		return decoratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryDecoratorItemProvider mandatoryDecoratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.MandatoryDecorator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMandatoryDecoratorAdapter() {
		if (mandatoryDecoratorItemProvider == null) {
			mandatoryDecoratorItemProvider = new MandatoryDecoratorItemProvider(this);
		}

		return mandatoryDecoratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPHookDecoratorItemProvider httpHookDecoratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emfcloud.metamodel.CMMN.HTTPHookDecorator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHTTPHookDecoratorAdapter() {
		if (httpHookDecoratorItemProvider == null) {
			httpHookDecoratorItemProvider = new HTTPHookDecoratorItemProvider(this);
		}

		return httpHookDecoratorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cmmnDiagramItemProvider != null) cmmnDiagramItemProvider.dispose();
		if (cmmnElementItemProvider != null) cmmnElementItemProvider.dispose();
		if (caseFileItemProvider != null) caseFileItemProvider.dispose();
		if (caseItemProvider != null) caseItemProvider.dispose();
		if (stageItemProvider != null) stageItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (eventListenerItemProvider != null) eventListenerItemProvider.dispose();
		if (sentryItemProvider != null) sentryItemProvider.dispose();
		if (planItemDefinitionItemProvider != null) planItemDefinitionItemProvider.dispose();
		if (timerEventListenerItemProvider != null) timerEventListenerItemProvider.dispose();
		if (userEventListenerItemProvider != null) userEventListenerItemProvider.dispose();
		if (timerExpressionItemProvider != null) timerExpressionItemProvider.dispose();
		if (decoratorItemProvider != null) decoratorItemProvider.dispose();
		if (mandatoryDecoratorItemProvider != null) mandatoryDecoratorItemProvider.dispose();
		if (httpHookDecoratorItemProvider != null) httpHookDecoratorItemProvider.dispose();
	}

}
