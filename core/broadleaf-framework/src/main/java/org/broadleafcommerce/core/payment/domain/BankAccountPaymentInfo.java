/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.payment.domain;

public interface BankAccountPaymentInfo extends Referenced {

    /**
     * @return the id
     */
    public Long getId();

    /**
     * @param id the id to set
     */
    public void setId(Long id);

    /**
     * @return the account number
     */
    public String getAccountNumber();

    /**
     * @param account number the account number to set
     */
    public void setAccountNumber(String accountNumber);

    /**
     * @return the routing number
     */
    public String getRoutingNumber();

    /**
     * @param routing number the routing number to set
     */
    public void setRoutingNumber(String routingNumber);

}
